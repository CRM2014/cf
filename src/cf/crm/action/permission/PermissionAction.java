package cf.crm.action.permission;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;

@Controller
@Scope("prototype")
public class PermissionAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -246868296415802375L;

	@Override
	public String execute() throws Exception {
		return "fail";
	}

	public String add() {
		return "add";
	}

	public String modify() {
		return "modify";
	}

	public String delete() {
		return "delete";
	}

	public String init() {
		return "init";
	}

	public String list() {
		return "list";
	}
}
