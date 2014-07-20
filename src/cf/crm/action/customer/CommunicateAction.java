package cf.crm.action.customer;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Contactrecord;
import cf.crm.entity.Customer;
import cf.crm.service.ContactrecordService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

@Controller
@Scope("prototype")
public class CommunicateAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6653078869879460109L;

	@Autowired
	@Qualifier("ContactrecordServiceImpl")
	private ContactrecordService coreService;
	private Page<Contactrecord> page;
	private Contactrecord condition;
	private Contactrecord contactRecord;
	private Customer customer;
	
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
		contactRecord.getCustomer();
		return "view";
	}
	
	@SuppressWarnings("unchecked")
	public String list() {
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = new HashMap<String, Object>();;
		
		//condition中还差一个客户ID
		like.put("cuId", customer.getCuId());
		
		if (condition != null) {
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
	public String modifyUser(){
		Contactrecord origCore = coreService.find(contactRecord.getCoreId());
		origCore.setCorePlace(contactRecord.getCorePlace());
		origCore.setCoreMain(contactRecord.getCoreMain());
		origCore.setCoreDescription(contactRecord.getCoreDescription());
		origCore.setCoreDetail(contactRecord.getCoreDetail());
		coreService.modify(origCore);
		return "modify-success";
	}
	public String deleteUser(){
		contactRecord = coreService.find(contactRecord.getCoreId());
		coreService.remove(contactRecord);
		
		warn = "Delete Success!";
		
		return "delete-success";
	}
	public String init(){
		return "init";
	}

	public Page<Contactrecord> getPage() {
		return page;
	}

	public void setPage(Page<Contactrecord> page) {
		this.page = page;
	}

	public Contactrecord getCondition() {
		return condition;
	}

	public void setCondition(Contactrecord condition) {
		this.condition = condition;
	}

	public Contactrecord getContactRecord() {
		return contactRecord;
	}

	public void setContactRecord(Contactrecord contactRecord) {
		this.contactRecord = contactRecord;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
