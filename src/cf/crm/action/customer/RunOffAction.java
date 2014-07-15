package cf.crm.action.customer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
@Controller
@Scope("prototype")
public class RunOffAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1452512885255618539L;

	@Override
	public String execute() throws Exception {
		return "fail";
	}
	public String init(){
		return "init";
	}
	public String reprieve(){
		return "reprieve";
	}
	public String confirm(){
		return "confirm";
	}

}
