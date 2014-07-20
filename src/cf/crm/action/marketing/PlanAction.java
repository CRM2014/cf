package cf.crm.action.marketing;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Development;
import cf.crm.entity.Salechance;
import cf.crm.entity.User;
import cf.crm.service.DevelopmentService;
import cf.crm.service.SalechanceService;
import cf.crm.service.UserService;
import cf.crm.util.page.Page;

@Controller
@Scope("prototype")
public class PlanAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2534997130378873595L;
	@Autowired
	@Qualifier("developmentServiceImpl")
	private DevelopmentService developmentService;
	private Page<Development> page;
	private Development development;
	private Development condition;

	@Override
	public String execute() throws Exception {
		return "fail";
	}
	public String addDevelopmentPlan() {
		development.setDeDate(new Date());
		development.setDePlan(development.getDePlan());
		developmentService.add(development);
		warn = "添加成功";
		
		return "add-success";
	}
	public String enact(){
		return "enact";
	}
	public String exeDevelopmentPlan(){
		development.setDeResult(development.getDeResult());
		development.setDeStatus(development.getDeStatus());
		warn = "执行成功";
		return "exe-success";
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
