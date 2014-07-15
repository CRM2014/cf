package cf.crm.action.marketing;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;

@Controller
@Scope("prototype")
public class MarketingOpportunitiesAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6256010052756813006L;

	@Override
	public String execute() throws Exception {
		return "fail";
	}
	
	public String found(){
		return "found";
	}
	public String edit(){
		return "edit";
	}
	public String delete(){
		return "delete";
	}
	public String appoint(){
		return "appoint";
	}
	public String init(){
		return "init";
	}
	public String list(){
		return "list";
	}
	public String add(){
		return "add";
	}
	public String assign(){
		return "assign";
	}
}
