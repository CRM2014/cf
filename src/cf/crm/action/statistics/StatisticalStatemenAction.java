package cf.crm.action.statistics;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;

@Controller
@Scope("prototype")
public class StatisticalStatemenAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4301569101201549329L;

	@Override
	public String execute() throws Exception {
		return "fail";
	}
	public String contribution(){
		return "contribution";
	}
	public String constitute(){
		return "constitute";
	}
	public String analyze(){
		return "analyze";
	}
	public String drain(){
		return "drain";
	}

}
