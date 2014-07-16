package cf.crm.action.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;

@Controller
@Scope("prototype")
public class DealAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5655494816627785760L;

	@Override
	public String execute() throws Exception {
		return "fail";
	}
	public String allot(){
		return "allot";
	}
	public String dispose(){
		return "dispose";
	}
	public String tickling(){
		return "tickling";
	}
	public String filing(){
		return "filing";
	}
	public String assign(){
		return "assign";
	}
	public String feedback(){
		return "feedback";
	}
	public String list(){
		return "list";
	}
	public String deal(){
		return "deal";
	}


}
