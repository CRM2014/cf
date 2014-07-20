package cf.crm.action.customer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Customer;
import cf.crm.entity.Orderrecord;
import cf.crm.service.CustomerService;
import cf.crm.service.OrderrecordService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

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
/*	@Autowired
	@Qualifier("customerServiceImpl")
	private CustomerService customerService;
*/
	private Page<Orderrecord> page;
	private Orderrecord condition;
	private Orderrecord orderRecord;
	private Customer customer;

	@Override
	public String execute() throws Exception {
		return "fail";
	}

	@SuppressWarnings("unchecked")
	public String list() {
		// System.out.println("~~~~~~~HistoryAction.list(): " +
		// customer.getCuId());
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = new HashMap<String, Object>();
		// like.put("cuId", customer.getCuId());
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
		orderRecord.getCustomer();
		orderRecord.getOrderrecordproducts();
		// 不会了，怎么从一个set中获取product
		return "view";
	}

	public String deleteUser() {
		orderRecord = orreService.find(orderRecord.getOrreId());
		orreService.remove(orderRecord);

		warn = "Delete Success!";

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
