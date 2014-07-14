package cf.crm.action.database;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;

@Controller
@Scope("prototype")
public class DataInquiryAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7092525820960752010L;

	@Override
	public String execute() throws Exception {
		return "fail";
	}
	public String product(){
		return "product";
	}
	public String depot(){
		return "depot";
	}
	public String init(){
		return "init";
	}

}
