/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.action.ajax;

import java.io.IOException;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAjaxAction;
import cf.crm.service.CustomerService;

@Controller
@Scope("prototype")
public class StatisticsAjaxAction extends BaseAjaxAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5099394096060236434L;
	@Autowired
	@Qualifier("customerServiceImpl")
	private CustomerService customerService;

	public void contribution() throws IOException {
		output(JSONArray.fromObject(customerService.getOrderNumber()));
	}

	public void composition() {
		output(JSONArray.fromObject(customerService.getCustomerNumber()));
	}
}
