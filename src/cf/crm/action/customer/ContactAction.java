package cf.crm.action.customer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;

@Controller
@Scope("prototype")
public class ContactAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5873706180507627202L;
	
	@Override
	public String execute() throws Exception {
		return "fail";
	}
	
	public String add(){
		return "add";
	}
	public String update(){
		return "update";
	}
	public String delete(){
		return "delete";
	}
	public String init(){
		return "init";
	}
}
