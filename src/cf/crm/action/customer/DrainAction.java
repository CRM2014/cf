/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.action.customer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Outflow;
import cf.crm.service.OutflowService;
import cf.crm.service.CustomerService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;
@Controller
@Scope("prototype")
public class DrainAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1452512885255618539L;

	@Autowired
	@Qualifier("outflowServiceImpl")
	private OutflowService OutflowService;
	private Page<Outflow> page;
	@Autowired
	@Qualifier("customerServiceImpl")
	private CustomerService CustomerService;

	private Outflow outflow;
	private Outflow condition;
	private String cuID;
	
	@Override
	public String execute() throws Exception {
		return "fail";
	}
	public String init(){
		return "init";
	}
	public String add(){
		Outflow outf = new Outflow();
		outf.setCustomer(CustomerService.find(cuID));
		outf.setOuflStatus("暂缓流失");
		outf.setOuflAction("");
		OutflowService.add(outf);
		return "add";
	}
	
	public String reprieve(){
		outflow = OutflowService.find(outflow.getOuflId());
		return "reprieve";
	}
	public String confirm(){
		outflow = OutflowService.find(outflow.getOuflId());
		return "confirm";
	}
	public String list(){
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = null;
		if (condition != null) {
			like = new HashMap<String, Object>();
		}
		OutflowService.findByPage(page, like);
		return "list";
	}
	
	public String reprieveAdd(){
		Outflow origOutFl = OutflowService.find(outflow.getOuflId());
		origOutFl.setOuflAction(outflow.getOuflAction());
		origOutFl.setOuflStatus("暂缓流失");
		OutflowService.modify(origOutFl);

		warn = " Success!";
		return "reprieve-success";
	}
	
	public String confirmAdd(){
		Outflow origOutFl = OutflowService.find(outflow.getOuflId());
		origOutFl.setOuflReson(outflow.getOuflReson());
		origOutFl.setOuflStatus("确认流失");
		OutflowService.modify(origOutFl);

		warn = " Success!";
		return "confirm-success";
	}
	
	public String delete(){
		outflow = OutflowService.find(outflow.getOuflId());
		OutflowService.remove(outflow);
		
		warn = "删除成功!";
		return "delete-success";
	}
	
	
	public Outflow getCondition() {
		return condition;
	}

	public void setCondition(Outflow condition) {
		this.condition = condition;
	}

	public Page<Outflow> getPage() {
		return page;
	}

	public void setPage(Page<Outflow> page) {
		this.page = page;
	}

	public Outflow getOutflow() {
		return outflow;
	}

	public void setOutflow(Outflow outflow) {
		this.outflow = outflow;
	}
	public String getCuID() {
		return cuID;
	}
	public void setCuID(String cuID) {
		this.cuID = cuID;
	}
	
	
}
