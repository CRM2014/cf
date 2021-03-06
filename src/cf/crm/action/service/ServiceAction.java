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

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Datadictionary;
import cf.crm.entity.Orderrecordproduct;
import cf.crm.entity.Product;
import cf.crm.entity.Service;
import cf.crm.entity.Servicecustomer;
import cf.crm.service.DatadictionaryService;
import cf.crm.service.OrderrecordproductService;
import cf.crm.service.ProductService;
import cf.crm.service.ServiceService;
import cf.crm.service.ServicecustomerService;
import cf.crm.util.page.Page;

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
	@Qualifier("orderrecordproductServiceImpl")
	private OrderrecordproductService orderrecordproductService;
	@Autowired
	@Qualifier("serviceServiceImpl")
	private ServiceService serviceService;
	@Autowired
	@Qualifier("servicecustomerServiceImpl")
	private ServicecustomerService servicecustomerService;
	@Autowired
	@Qualifier("datadictionaryServiceImpl")
	private DatadictionaryService datadictionaryService;
	private Page<Service> page;
	private Service service;
	private Service condition;
	private List<Product> products;
	private String productId;
	private List<Datadictionary> dictionarys;

	public String add() {
		dictionarys = datadictionaryService.findServiceList();
		products = productService.findList();
		return "add";
	}

	public String addService() {
		service.setProduct(productService.find(productId));
		service.setSeMain(service.getSeMain());
		service.setSeType(service.getSeType());
		service.setUser(currentUser);
		service.setSeCreateTime(new Date());
		serviceService.add(service);
		for (Orderrecordproduct orderrecordproduct : orderrecordproductService
				.findListByProduct(service.getProduct())) {
			Servicecustomer servicecustomer = new Servicecustomer();
			servicecustomer.setCustomer(orderrecordproduct.getOrderrecord()
					.getCustomer());
			servicecustomer.setService(service);
			servicecustomerService.add(servicecustomer);
		}
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

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public List<Datadictionary> getDictionarys() {
		return dictionarys;
	}

	public void setDictionarys(List<Datadictionary> dictionarys) {
		this.dictionarys = dictionarys;
	}

}
