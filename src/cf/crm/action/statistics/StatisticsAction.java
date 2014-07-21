package cf.crm.action.statistics;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.util.page.Page;

@Controller
@Scope("prototype")
public class StatisticsAction extends BaseAction {

	/**
	 * 
	 */

	private static final long serialVersionUID = -4301569101201549329L;

	
	public String contribution(){
	 Page	page = new Page();
	 
		return "contribution";
	}
	public String composition(){
		return "composition";
	}
	public String service(){
		return "service";
	}
	public String drain(){
		return "drain";
	}

}
