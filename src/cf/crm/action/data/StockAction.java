package cf.crm.action.data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;

@Controller
@Scope("prototype")
public class StockAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7092525820960752010L;

	public String list() {
		return "list";
	}

}
