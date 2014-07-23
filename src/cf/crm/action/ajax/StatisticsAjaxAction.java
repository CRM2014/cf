package cf.crm.action.ajax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

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

	public void conposition() {
		output(JSONArray.fromObject(customerService.getCustomerNumber()));
	}
}
