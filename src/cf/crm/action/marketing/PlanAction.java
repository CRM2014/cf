package cf.crm.action.marketing;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Development;
import cf.crm.entity.Salechance;
import cf.crm.service.DevelopmentService;
import cf.crm.service.SalechanceService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

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
	@Autowired
	@Qualifier("salechanceServiceImpl")
	private SalechanceService salechanceService;

	private Page<Development> page;
	private List<Development> developments;
	private Development development;
	private Development condition;
	private Salechance salechance;

	@SuppressWarnings("unchecked")
	public String make() {
		salechance = salechanceService.find(salechance.getSachId());
		developments = new ArrayList<Development>(salechance.getDevelopments());
		return "make";
	}

	public String execute() {
		salechance = salechanceService.find(salechance.getSachId());
		developments = new ArrayList<Development>(salechance.getDevelopments());
		return "execute";
	}

	@SuppressWarnings("unchecked")
	public String list() {
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = null;
		if (condition != null) {
			like = new HashMap<String, Object>();
			if (condition.getSalechance().getUsCustomerName() != null
					&& !"".equals(condition.getSalechance().getUsCustomerName()))
				like.put("usCustomerName", condition.getSalechance()
						.getUsCustomerName());
			if (condition.getSalechance().getUsMain() != null
					&& !"".equals(condition.getSalechance().getUsMain()))
				like.put("usMain", condition.getSalechance().getUsMain());
			if (condition.getSalechance().getUsContanct() != null
					&& !"".equals(condition.getSalechance().getUsContanct()))
				like.put("usContanct", condition.getSalechance()
						.getUsContanct());
		}
		developmentService.findByPage(page, like);
		return "list";
	}

	public String addDevelopment() {
		salechance = salechanceService.find(salechance.getSachId());
		development.setSalechance(salechance);
		development.setDeDate(new Date());
		developmentService.add(development);
		warn = "Save Success!";
		return "make-add-success";
	}

	public String deleteDevelopment() {

		development = developmentService.find(development.getDeId());
		developmentService.remove(development);
		salechance = development.getSalechance();
		warn = "Delete Success!";
		return "make-delete-success";
	}

	public String modifyDevelopment() {
		Development origDevelopment = developmentService.find(development
				.getDeId());
		origDevelopment.setDePlan(origDevelopment.getDePlan());
		developmentService.modify(origDevelopment);

		warn = "modify Success!";
		return "make-modify-success";
	}

	public String modifyDevelopmentExecute() {
		Development origDevelopmentexecute = developmentService
				.find(development.getDeId());
		origDevelopmentexecute
				.setDeResult(origDevelopmentexecute.getDeResult());
		developmentService.modify(origDevelopmentexecute);

		warn = "modify Success!";
		return "modify-execute-success";
	}

	public Development getCondition() {
		return condition;
	}

	public void setCondition(Development condition) {
		this.condition = condition;
	}

	public Page<Development> getPage() {
		return page;
	}

	public void setPage(Page<Development> page) {
		this.page = page;
	}

	public Salechance getSalechance() {
		return salechance;
	}

	public void setSalechance(Salechance salechance) {
		this.salechance = salechance;
	}

	public List<Development> getDevelopments() {
		return developments;
	}

	public void setDevelopments(List<Development> developments) {
		this.developments = developments;
	}

	public Development getDevelopment() {
		return development;
	}

	public void setDevelopment(Development development) {
		this.development = development;
	}

}
