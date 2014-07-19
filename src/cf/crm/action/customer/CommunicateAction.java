package cf.crm.action.customer;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.action.util.MD5Util;
import cf.crm.entity.Contactrecord;
import cf.crm.entity.User;
import cf.crm.service.ContactrecordService;
import cf.crm.service.CustomerService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

@Controller
@Scope("prototype")
public class CommunicateAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6653078869879460109L;

	private Page<Contactrecord> page;
	private Contactrecord condition;
	private ContactrecordService coreService;
	private Contactrecord contactRecord;
	
	@Override
	public String execute() throws Exception {
		return "fail";
	}
	
	public String add(){
		return "add";
	}
	public String edit(){
		contactRecord = coreService.find(contactRecord.getCoreId());
		contactRecord.getCustomer();
		return "edit";
	}
	public String view(){
		contactRecord = coreService.find(contactRecord.getCoreId());
		return "view";
	}
	
	@SuppressWarnings("unchecked")
	public String list() {
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = null;
		
		//condition中还差一个客户ID
		
		if (condition != null) {
			like = new HashMap<String, Object>();
			if (condition.getCoreDate() != null
					&& !"".equals(condition.getCoreDate()))
				like.put("coreDate", condition.getCoreDate());
			if (condition.getCorePlace() != null
					&& !"".equals(condition.getCorePlace()))
				like.put("corePlace", condition.getCorePlace());
		}
		coreService.findByPage(page, like);
		return "list";
	}
	public String addUser() {
		contactRecord.setCoreDate(new Date());
		coreService.add(contactRecord);

		warn = "添加成功";

		return "add-success";
	}
	public String update(){
		Contactrecord origCore = coreService.find(contactRecord.getCoreId());
		origCore.setCoreMain(contactRecord.getCoreMain());
		origCore.setCoreDescription(contactRecord.getCoreDescription());
		origCore.setCoreDetail(contactRecord.getCoreDetail());
		coreService.modify(origCore);
		return "modify-success";
	}
	public String delete(){
		return "delete";
	}
	public String init(){
		return "init";
	}
}
