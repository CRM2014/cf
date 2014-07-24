package cf.crm.action.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Servicecustomer;
import cf.crm.service.ServicecustomerService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

@Controller
@Scope("prototype")
public class FeedbackAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5655494816627785760L;

	@Autowired
	@Qualifier("servicecustomerServiceImpl")
	private ServicecustomerService servicecustomerservice;
	private Page<Servicecustomer> page;
	private Servicecustomer servicecustomer;
	private Servicecustomer condition;

	public String feedback() {
		servicecustomer = servicecustomerservice.find(servicecustomer
				.getSecuId());
		return "feedback";
	}

	public String feedbackService() {

		Servicecustomer origService = servicecustomerservice
				.find(servicecustomer.getSecuId());
		if (servicecustomer.getSecuSatisfy() >= 3) {
			origService.setSecuDealResult(servicecustomer.getSecuDealResult());
			origService.setSecuSatisfy(servicecustomer.getSecuSatisfy());
			warn = "服务已归档";
		} else {
			origService.setSecuDeal(null);
			origService.setSecuDealTime(null);
			warn = "服务重新进行处理";
		}

		servicecustomerservice.modify(origService);
		return "feedback-success";
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
				like.put("customer.cuName", condition.getCustomer().getCuName());

			if (condition.getService().getSeMain() != null
					&& !"".equals(condition.getService().getSeMain()))
				like.put("service.seMain", condition.getService().getSeMain());
			if (condition.getService().getSeType() != null
					&& !"".equals(condition.getService().getSeType()))
				like.put("service.seType", condition.getService().getSeType());
		}
		List<String> empty = new ArrayList<String>();
		empty.add("secuDealResult");
		servicecustomerservice.findFeedbackByPage(page, like);
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
