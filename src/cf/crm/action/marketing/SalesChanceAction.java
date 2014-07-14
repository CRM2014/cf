package cf.crm.action.marketing;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;

@Controller
@Scope("prototype")
public class SalesChanceAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6189064005140132125L;

	@Override
	public String execute() throws Exception {
		return "fail";
	}

	public String add() {
		return "add";
	}
}
