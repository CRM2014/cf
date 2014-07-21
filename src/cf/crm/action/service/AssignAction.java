package cf.crm.action.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Servicecustomer;
import cf.crm.entity.User;
import cf.crm.service.ServicecustomerService;
import cf.crm.service.UserService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

@Controller
@Scope("prototype")
public class AssignAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5655494816627785760L;
	@Autowired
	@Qualifier("servicecustomerServiceImpl")
	private ServicecustomerService servicecustomerservice;
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	private Page<Servicecustomer> page;
	private Servicecustomer servicecustomer;
	private Servicecustomer condition;
	private List<User> users;
	private String userId;

	public String assign() {
		servicecustomer = servicecustomerservice.find(servicecustomer
				.getSecuId());
		users = userService.findListByRole("客户经理");
		return "assign";
	}

	public String assignService() {
		Servicecustomer origService = servicecustomerservice
				.find(servicecustomer.getSecuId());
		origService.setUserByUsDealId(userService.find(userId));
		servicecustomerservice.modify(origService);
		return "assign-success";
	}

	@SuppressWarnings("unchecked")
	public String list() {
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = null;
		if (condition != null) {
			like = new HashMap<String, Object>();
			/*
			 * if (condition.getCustomer().getCuName() != null &&
			 * !"".equals(condition.getCustomer().getCuName()))
			 * like.put("customer.cuName", condition.getCustomer().getCuName());
			 *//*
				 * if (condition.getService().getSeMain() != null &&
				 * !"".equals(condition.getService().getSeMain()))
				 * like.put("service.seMain",
				 * condition.getService().getSeMain()); if
				 * (condition.getService().getSeType() != null &&
				 * !"".equals(condition.getService().getSeType()))
				 * like.put("service.seType",
				 * condition.getService().getSeType());
				 */
			/*
			 * if (condition.getSecuAllocationTime() != null &&
			 * !"".equals(condition.getSeCreateTime())) like.put("seCreateTime",
			 * condition.getSeCreateTime()); if (condition.getSeCreateTime() !=
			 * null && !"".equals(condition.getSeCreateTime()))
			 * like.put("seCreateTime", condition.getSeCreateTime());
			 */
		}
		servicecustomerservice.findByPage(page, like);
		log.info(page.getList().size());
		return "list";
	}

	public Servicecustomer getCondition() {
		return condition;
	}

	public void setCondition(Servicecustomer condition) {
		this.condition = condition;
	}

	public Page<Servicecustomer> getPage() {
		return page;
	}

	public void setPage(Page<Servicecustomer> page) {
		this.page = page;
	}

	public Servicecustomer getServicecustomer() {
		return servicecustomer;
	}

	public void setServicecustomer(Servicecustomer servicecustomer) {
		this.servicecustomer = servicecustomer;
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

	public void setUserId(String userDealId) {
		this.userId = userDealId;
	}

}
