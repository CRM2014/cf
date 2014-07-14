package cf.crm.action.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;

@Controller
@Scope("prototype")
public class ServiceAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2558708032939778786L;

	@Override
	public String execute() throws Exception {
		return "fail";
	}
	public String found(){
		return "found";
	}
	public String init(){
		return "init";
	}

}
