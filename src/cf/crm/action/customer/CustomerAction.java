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
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.dao.support.adapter.page.Page;
import cf.crm.dao.support.adapter.page.PageHelper;
import cf.crm.entity.Customer;
import cf.crm.entity.User;
import cf.crm.service.CustomerService;
import cf.crm.service.UserService;
import cf.crm.util.Info.Role;

@Controller
@Scope("prototype")
public class CustomerAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7843189697363605993L;
	@Autowired
	@Qualifier("customerServiceImpl")
	private CustomerService customerService;
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	private Page page;
	private Customer customer;
	private Customer condition;
	private List<User> users;
	private String userId;

	public String view() {
		customer = customerService.find(customer.getCuId());
		users = userService.findListByRole(Role.CUSTOMER);
		return "view";
	}

	public String edit() {
		customer = customerService.find(customer.getCuId());
		users = userService.findListByRole(Role.CUSTOMER);
		return "edit";
	}

	public String list() {
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = null;
		if (condition != null) {
			like = new HashMap<String, Object>();
			if (condition.getCuName() != null
					&& !"".equals(condition.getCuName()))
				like.put("cuName", condition.getCuName());
			if (condition.getCuLevel() != null
					&& !"".equals(condition.getCuLevel()))
				like.put("cuLevel", condition.getCuLevel());

			if (condition.getUser().getUsName() != null
					&& !"".equals(condition.getUser().getUsName()))
				like.put("user.usName", condition.getUser().getUsName());
		}
		customerService.findByPage(page, like);
		return "list";
	}

	public String save() {
		Customer origCustomer = customerService.find(customer.getCuId());
		origCustomer.setCuName(customer.getCuName());
		origCustomer.setCuZone(customer.getCuZone());
		origCustomer.setCuLevel(customer.getCuLevel());
		origCustomer.setUser(userService.find(userId));
		origCustomer.setCuCredit(customer.getCuCredit());
		origCustomer.setCuAddress(customer.getCuAddress());
		origCustomer.setCuPostal(customer.getCuPostal());
		origCustomer.setCuTel(customer.getCuTel());
		origCustomer.setCuFacsimile(customer.getCuFacsimile());
		origCustomer.setCuRelation(customer.getCuRelation());
		origCustomer.setCuLegal(customer.getCuLegal());
		origCustomer.setCuWeb(customer.getCuWeb());
		origCustomer.setCuBank(customer.getCuBank());
		origCustomer.setCuBankAccount(customer.getCuBankAccount());
		origCustomer.setCuRegisterCapital(customer.getCuRegisterCapital());
		origCustomer.setCuTurnover(customer.getCuTurnover());
		origCustomer.setCuTurnoverNum(customer.getCuTurnoverNum());
		origCustomer.setCuLandTaxNum(customer.getCuLandTaxNum());
		origCustomer.setCuNationTaxNum(customer.getCuNationTaxNum());
		origCustomer.setCuSatisfy(customer.getCuSatisfy());
		customerService.modify(origCustomer);
		return "modify-success";
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Customer getCondition() {
		return condition;
	}

	public void setCondition(Customer condition) {
		this.condition = condition;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
