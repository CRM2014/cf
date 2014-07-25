/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.action.marketing;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Salechance;
import cf.crm.entity.User;
import cf.crm.service.SalechanceService;
import cf.crm.service.UserService;
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
	@Qualifier("userServiceImpl")
	private UserService userService;
	@Autowired
	@Qualifier("salechanceServiceImpl")
	private SalechanceService salechanceService;
	private Page<Salechance> page;
	private Salechance salechance;
	private Salechance condition;
	private List<User> users;
	private String userId;
	
	
	public String add(){
		return "add";
	}
	
	public String assign() {  
        salechance = salechanceService.find(salechance.getSachId());
        users = userService.findListByRole("客户经理");
		return "assign";
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
		
		salechance.setUsCreateTime(new Date());
		salechance.setUserByUsCreateId(currentUser);
		salechanceService.add(salechance);
		warn = "保存成功!";

		return "add-success";
	}
	
	public String deleteSalechance() {
		
		salechance = salechanceService.find(salechance.getSachId());
		salechanceService.remove(salechance);
		warn = "删除成功!";
		
		return "delete-success";
	}
	
    public String modifySalechance() {
		Salechance origSalechance = salechanceService.find(salechance.getSachId());
		origSalechance.setUserByUsDesignationId(userService.find(userId));
		salechanceService.modify(origSalechance);
		
		warn = "Modify Success!";
		return "assign-modify-success";
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
