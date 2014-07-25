/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.action.service;

import java.util.HashMap;
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
public class ArchiveAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2558708032939778786L;

	@Autowired
	@Qualifier("servicecustomerServiceImpl")
	private ServicecustomerService servicecustomerservice;
	private Page<Servicecustomer> page;
	private Servicecustomer servicecustomer;
	private Servicecustomer condition;

	public String archive() {
		servicecustomer = servicecustomerservice.find(servicecustomer
				.getSecuId());
		return "archive";
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
		servicecustomerservice.findArchiveByPage(page, like);
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
