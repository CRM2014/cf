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

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.dao.support.adapter.page.Page;
import cf.crm.dao.support.adapter.page.PageHelper;
import cf.crm.entity.Contactrecord;
import cf.crm.entity.Customer;
import cf.crm.service.ContactrecordService;
import cf.crm.service.CustomerService;

@Controller
@Scope("prototype")
public class CommunicateAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6653078869879460109L;

	@Autowired
	@Qualifier("contactrecordServiceImpl")
	private ContactrecordService coreService;
	@Autowired
	@Qualifier("customerServiceImpl")
	private CustomerService customerService;
	private Page<Contactrecord> page;
	private Contactrecord condition;
	private Contactrecord contactRecord;
	private Customer customer;
	private List<Customer> customers;
	private String customerId;

	public String add() {
		customers = customerService.findList();
		return "add";
	}

	public String edit() {
		contactRecord = coreService.find(contactRecord.getCoreId());
		customer = contactRecord.getCustomer();
		return "edit";
	}

	public String view() {
		contactRecord = coreService.find(contactRecord.getCoreId());
		customer = contactRecord.getCustomer();
		return "view";
	}

	@SuppressWarnings("unchecked")
	public String list() {
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = new HashMap<String, Object>();
		customer = customerService.find(customer.getCuId());
		like.put("customer", customer);
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
		contactRecord.setCustomer(customerService.find(customerId));
		contactRecord.setCoreDate(new Date());
		coreService.add(contactRecord);
		customer = contactRecord.getCustomer();

		warn = "添加成功";

		return "add-success";
	}

	public String modifyUser() {

		Contactrecord origCore = coreService.find(contactRecord.getCoreId());
		customer = origCore.getCustomer();
		origCore.setCorePlace(contactRecord.getCorePlace());
		origCore.setCoreMain(contactRecord.getCoreMain());
		origCore.setCoreDescription(contactRecord.getCoreDescription());
		origCore.setCoreDetail(contactRecord.getCoreDetail());
		coreService.modify(origCore);
		return "modify-success";
	}

	public String deleteUser() {
		contactRecord = coreService.find(contactRecord.getCoreId());
		customer = contactRecord.getCustomer();
		coreService.remove(contactRecord);
		warn = "删除成功!";
		return "delete-success";
	}

	public String init() {
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

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
}
