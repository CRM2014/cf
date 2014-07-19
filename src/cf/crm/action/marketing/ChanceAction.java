package cf.crm.action.marketing;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.action.util.MD5Util;
import cf.crm.entity.Salechance;
import cf.crm.entity.User;
import cf.crm.service.SalechanceService;
import cf.crm.util.page.Page;

@Controller
@Scope("prototype")
public class ChanceAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6256010052756813006L;

	@Autowired
	@Qualifier("salechanceServiceImpl")
	private SalechanceService salechanceService;
	private Page<Salechance> page;
	private Salechance salechance;
	private Salechance condition;
	@Override
	public String execute() throws Exception {
		return "fail";
	}
	public String modify() {  
        salechance = salechanceService.find(salechance.getSachId());
		return "modify";
	}


	public String addSalechance() {
		salechance.setUsCreateTime(new Date());
		salechance.setUsContanct(salechance.getUsContanct());
		salechance.setUsChanceDescribe(salechance.getUsChanceDescribe());
		salechance.setUsCustomerName(salechance.getUsCustomerName());
		salechance.setUsProbability(salechance.getUsProbability());
		salechance.setUsMain(salechance.getUsMain());
		salechance.setUsOrigin(salechance.getUsOrigin());
		salechance.setUsContanctTel(salechance.getUsContanctTel());
	//	salechance.setUsDesignationId(salechance.getUsDesignationId);
		
		salechanceService.add(salechance);

		warn = "添加成功";

		return "add-success";
	}
	public String deleteSalechance() {
		salechance = salechanceService.find(salechance.getSachId());
		salechanceService.remove(salechance);
		return "delete-success";
	}
 /*public String modifySalechance() {
		Salechance origSalechance = salechanceService.find(salechance.getSachId());
		origSalechance.setUsName(origSalechance.getUsName());
		origUser.setUsUserName(user.getUsUserName());
		origUser.setUsRole(user.getUsRole());
		userService.modify(origUser);
		return "modify-success";
	} */
	public String found(){
		return "found";
	}
	public String edit(){
		return "edit";
	}
	public String delete(){
		return "delete";
	}
	public String appoint(){
		return "appoint";
	}
	public String init(){
		return "init";
	}
	public String list(){
		return "list";
	}
	public String add(){
		return "add";
	}
	public String assign(){
		return "assign";
	}
	public Salechance getCondition() {
		return condition;
	}

	public void setCondition(Salechance condition) {
		this.condition = condition;
	}

	public Page<Salechance> getPage() {
		return page;
	}

	public void setPage(Page<Salechance> page) {
		this.page = page;
	}

	public Salechance getSalechance() {
		return salechance;
	}

	public void setSalechance(Salechance salechance) {
		this.salechance = salechance;
	}
}
