package cf.crm.action.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Service;
import cf.crm.entity.Servicecustomer;
import cf.crm.entity.User;
import cf.crm.service.ServiceService;
import cf.crm.service.ServicecustomerService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

@Controller
@Scope("prototype")
public class AssignAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5655494816627785760L;

	private ServicecustomerService servicecustomerservice;
	private Page<Servicecustomer> page;
	private Servicecustomer servicecustomer;
	private Servicecustomer condition;
	
	
	public String assign(){
		servicecustomer = servicecustomerservice.find(servicecustomer.getSecuId());
		return "assign";
	}
	
	public String assignService() {
		Servicecustomer origService = servicecustomerservice.find(servicecustomer.getSecuId());
		origService.setUserByUsDealId(servicecustomer.getUserByUsDealId());
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
			if (condition.getCustomer().getCuName() != null
					&& !"".equals(condition.getCustomer().getCuName()))
				like.put("customerName", condition.getCustomer().getCuName());
			if (condition.getService().getSeMain() != null
					&& !"".equals(condition.getService().getSeMain()));
				like.put("seMain", condition.getService().getSeMain());
			if (condition.getService().getSeType() != null
					&& !"".equals(condition.getService().getSeType()))
				like.put("seType", condition.getService().getSeType());
			if (condition.getSecuAllocationTime() != null
					&& !"".equals(condition.getSeCreateTime()))
				like.put("seCreateTime", condition.getSeCreateTime());
			if (condition.getSeCreateTime() != null
					&& !"".equals(condition.getSeCreateTime()))
				like.put("seCreateTime", condition.getSeCreateTime());
		}
		servicecustomerservice.findByPage(page, like);
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

}
