package cf.crm.action.customer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Orderrecord;
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

	private Page<Orderrecord> page;
	private Orderrecord condition;
	private OrderrecordService orreService;
	private Orderrecord orderRecord;
	
	@Override
	public String execute() throws Exception {
		return "fail";
	}
	@SuppressWarnings("unchecked")
	public String list() {
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = null;
		if (condition != null) {
			like = new HashMap<String, Object>();
			if (condition.getOrreDate() != null
					&& !"".equals(condition.getOrreDate()))
				like.put("orreDate", condition.getOrreDate());
			if (condition.getOrreStatus() != null && !"".equals(condition.getOrreStatus()))
				like.put("orreStatus", condition.getOrreStatus());
		}
		orreService.findByPage(page, like);
		return "list";
	}
	public String view(){
		orderRecord = orreService.find(orderRecord.getOrreId());
		orderRecord.getCustomer();
		orderRecord.getOrderrecordproducts();
		//不会了，怎么从一个set中获取product
		return "view";
	}
	public String init(){
		return "init";
	}
	public String detail(){
		return "detail";
	}
}
