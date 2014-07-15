package cf.crm.action.customer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;

@Controller
@Scope("prototype")
public class OrderRecordAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5539655586980962510L;

	@Override
	public String execute() throws Exception {
		return "fail";
	}
	public String init(){
		return "init";
	}
	public String detail(){
		return "detail";
	}

}
