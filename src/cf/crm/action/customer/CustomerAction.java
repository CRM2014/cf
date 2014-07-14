package cf.crm.action.customer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;

@Controller
@Scope("prototype")
public class CustomerAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7843189697363605993L;
	
	@Override
	public String execute() throws Exception {
		return "fail";
	}
	
	public String edit(){
		return "edit";
	}
	
	public String init(){
		return "init";
	}

}
