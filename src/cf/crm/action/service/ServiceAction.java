package cf.crm.action.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.action.util.MD5Util;
import cf.crm.entity.Service;
import cf.crm.entity.User;
import cf.crm.service.ProductService;
import cf.crm.service.ServiceService;
import cf.crm.service.UserService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

@Controller
@Scope("prototype")
public class ServiceAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5655494816627785760L;

	@Autowired
	@Qualifier("productServiceImpl")
	private ProductService productService;
	@Autowired
	@Qualifier("serviceServiceImpl")
	private ServiceService serviceService;
	private Page<Service> page;
	private Service service;
	private Service condition;
	
	public String add(){
		return "add";
	}
	
	public String addService() {
		service.setProduct(productService.find("1"));
		service.setSeMain(service.getSeMain());
		service.setSeType(service.getSeType());
		service.setUser(currentUser);
		service.setSeCreateTime(new Date());
		serviceService.add(service);

		warn = "添加成功";

		return "add-success";
	}
	
	public Service getCondition() {
		return condition;
	}

	public void setCondition(Service condition) {
		this.condition = condition;
	}

	public Page<Service> getPage() {
		return page;
	}

	public void setPage(Page<Service> page) {
		this.page = page;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}


}
