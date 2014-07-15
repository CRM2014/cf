package cf.crm.action.marketing;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;

@Controller
@Scope("prototype")
public class DevelopmentPlanAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2534997130378873595L;
	
	@Override
	public String execute() throws Exception {
		return "fail";
	}
	
	public String enact(){
		return "enact";
	}
	public String exe(){
		return "exe";
	}
	public String success(){ 
		return "success";
	}
	public String fail(){
		return "fail";
	}
	public String make(){
		return "make";
	}
	public String list(){
		return "list";
	}
	

}
