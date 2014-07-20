package cf.crm.action.marketing;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.action.util.MD5Util;
import cf.crm.entity.Salechance;
import cf.crm.entity.User;
import cf.crm.service.SalechanceService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

@Controller
@Scope("prototype")
public class ChanceAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6256010052756813006L;

	@Autowired
	@Qualifier("salechanceServiceImpl")
	private SalechanceService salechanceService;
	private Page<Salechance> page;
	private Salechance salechance;
	private Salechance condition;
	
	
	public String add(){
		return "add";
	}
	
	public String modify() {  
        salechance = salechanceService.find(salechance.getSachId());
		return "modify";
	}

	@SuppressWarnings("unchecked")
	public String list() {
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = null;
		if (condition != null) {
			like = new HashMap<String, Object>();
			if (condition.getUsCustomerName()!= null
					&& !"".equals(condition.getUsCustomerName()))
				like.put("usCustomerName", condition.getUsCustomerName());
			if (condition.getUsMain()!= null
					&& !"".equals(condition.getUsMain()))
				like.put("usMain", condition.getUsMain());
			if (condition.getUsContanct()!= null
					&& !"".equals(condition.getUsContanct()))
				like.put("usContanct", condition.getUsContanct());
		}
		salechanceService.findByPage(page, like);
		return "list";
	}

	public String addSalechance() {
		
		salechance.setUsOrigin(salechance.getUsOrigin());
		salechance.setUsCustomerName(salechance.getUsCustomerName());
		salechance.setUsProbability(salechance.getUsProbability());
		salechance.setUsMain(salechance.getUsMain());
		salechance.setUsContanct(salechance.getUsContanct());
		salechance.setUsContanctTel(salechance.getUsContanctTel());
		salechance.setUsChanceDescribe(salechance.getUsChanceDescribe());
		salechance.setUsCreateTime(new Date());
		
		salechanceService.add(salechance);

		warn = "Save Success!";

		return "add-success";
	}
	
	public String deleteSalechance() {
		
		salechance = salechanceService.find(salechance.getSachId());
		salechanceService.remove(salechance);
		warn = "Delete Success!";
		
		return "delete-success";
	}
	
    public String modifySalechance() {
		Salechance origSalechance = salechanceService.find(salechance.getSachId());
		origSalechance.setUserByUsDesignationId(origSalechance.getUserByUsDesignationId());
		salechanceService.modify(origSalechance);
		return "modify-success";
	}

	public Salechance getCondition() {
		return condition;
	}

	public void setCondition(Salechance condition) {
		this.condition = condition;
	}

	public Page<Salechance> getPage() {
		return page;
	}

	public void setPage(Page<Salechance> page) {
		this.page = page;
	}

	public Salechance getSalechance() {
		return salechance;
	}

	public void setSalechance(Salechance salechance) {
		this.salechance = salechance;
	}
}
