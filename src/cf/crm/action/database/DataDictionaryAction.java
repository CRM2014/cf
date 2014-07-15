package cf.crm.action.database;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;

@Controller
@Scope("prototype")
public class DataDictionaryAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7455431794192088163L;

	@Override
	public String execute() throws Exception {
		return "fail";
	}
	public String add(){
		return "add";
	}
	public String delete(){
		return "delete";
	}
	public String update(){
		return "update";
	}
	public String inquiry(){
		return "inquiry";
	}
	public String init(){
		return "init";
	}

	
}
