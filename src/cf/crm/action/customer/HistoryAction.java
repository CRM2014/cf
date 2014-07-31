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
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.dao.support.adapter.page.Page;
import cf.crm.dao.support.adapter.page.PageHelper;
import cf.crm.entity.Customer;
import cf.crm.entity.Orderrecord;
import cf.crm.entity.Orderrecordproduct;
import cf.crm.service.CustomerService;
import cf.crm.service.OrderrecordService;
import cf.crm.service.OrderrecordproductService;

@Controller
@Scope("prototype")
public class HistoryAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5539655586980962510L;
	@Autowired
	@Qualifier("orderrecordServiceImpl")
	private OrderrecordService orreService;
	@Autowired
	@Qualifier("customerServiceImpl")
	private CustomerService customerService;
	@Autowired
	@Qualifier("orderrecordproductServiceImpl")
	private OrderrecordproductService orreprService;
	private Page<Orderrecord> page;
	private Orderrecord condition;
	private Orderrecord orderRecord;
	private Customer customer;

	@SuppressWarnings("unchecked")
	public String list() {
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = new HashMap<String, Object>();
		customer = customerService.find(customer.getCuId());
		like.put("customer", customer);
		if (condition != null) {
			if (condition.getOrreDate() != null
					&& !"".equals(condition.getOrreDate()))
				like.put("orreDate", condition.getOrreDate());
			if (condition.getOrreStatus() != null
					&& !"".equals(condition.getOrreStatus()))
				like.put("orreStatus", condition.getOrreStatus());
		}
		orreService.findByPage(page, like);
		return "list";
	}

	public String view() {
		orderRecord = orreService.find(orderRecord.getOrreId());
		customer = orderRecord.getCustomer();
		return "view";
	}

	public String deleteUser() {
		orderRecord = orreService.find(orderRecord.getOrreId());
		customer = orderRecord.getCustomer();
		for (Object o : orderRecord.getOrderrecordproducts()) {
			Orderrecordproduct orp = (Orderrecordproduct) o;
			orreprService.remove(orp);
		}
		orreService.remove(orderRecord);

		warn = "删除成功!";

		return "delete-success";
	}

	public String init() {
		return "init";
	}

	public String detail() {
		return "detail";
	}

	public Page<Orderrecord> getPage() {
		return page;
	}

	public void setPage(Page<Orderrecord> page) {
		this.page = page;
	}

	public Orderrecord getCondition() {
		return condition;
	}

	public void setCondition(Orderrecord condition) {
		this.condition = condition;
	}

	public Orderrecord getOrderRecord() {
		return orderRecord;
	}

	public void setOrderRecord(Orderrecord orderRecord) {
		this.orderRecord = orderRecord;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
