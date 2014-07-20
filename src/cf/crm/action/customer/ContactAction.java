package cf.crm.action.customer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Contactperson;
import cf.crm.entity.Customer;
import cf.crm.service.ContactpersonService;
import cf.crm.service.CustomerService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

@Controller
@Scope("prototype")
public class ContactAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5873706180507627202L;
	@Autowired
	@Qualifier("contactpersonServiceImpl")
	private ContactpersonService contactpersonService;
	@Autowired
	@Qualifier("customerServiceImpl")
	private CustomerService customerService;
	private Page page;
	private Contactperson contactperson;
	private Customer customer;
	private Contactperson condition;
	
	public String view(){
		contactperson = contactpersonService.find(contactperson.getCopeId());
		return "view";
	}
	
	public String edit(){
		contactperson = contactpersonService.find(contactperson.getCopeId());
		return "edit";
	}
	
	public String add(){
		customer = customerService.find(customer.getCuId());
		return "add";
	}
	
	public String list() {
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = null;
		if (condition != null) {
			like = new HashMap<String, Object>();
			if (condition.getCopeName() != null
					&& !"".equals(condition.getCopeName()))
				like.put("cuName",  condition.getCopeName() );
			if (condition.getCopePosition() != null
					&& !"".equals(condition.getCopePosition()))
				like.put("cuLevel",  condition.getCopePosition() );
			if (condition.getCopePhone() != null
					&& !"".equals(condition.getCopePhone()))
				like.put("cuLevel",  condition.getCopePhone() );
		}
		
		contactpersonService.findByPage(page, like);
		return "list";
	}
	
	public String save(){
		Contactperson origContact = contactpersonService.find(contactperson.getCopeId());
		origContact.setCopeName(contactperson.getCopeName());
		origContact.setCopeSex(contactperson.getCopeSex());
		origContact.setCopePosition(contactperson.getCopePosition());
		origContact.setCopeTel(contactperson.getCopeTel());
		origContact.setCopePhone(contactperson.getCopePhone());
		origContact.setCopeNote(contactperson.getCopeNote());
		contactpersonService.modify(origContact);
		return "success";
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Contactperson getContactperson() {
		return contactperson;
	}

	public void setContactperson(Contactperson contactperson) {
		this.contactperson = contactperson;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Contactperson getCondition() {
		return condition;
	}

	public void setCondition(Contactperson condition) {
		this.condition = condition;
	}
	
}

