package cf.crm.action.marketing;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller
@Scope("prototype")
public class SalesChanceAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		return "fail";
	}

	public String add() {
		return "add";
	}
}
