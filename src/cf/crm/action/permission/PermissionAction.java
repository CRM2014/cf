package cf.crm.action.permission;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cf.crm.action.BaseAction;
import cf.crm.entity.User;
import cf.crm.service.UserService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

@Controller
@Scope("prototype")
public class PermissionAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -246868296415802375L;
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	private Page page;
	private User user;
	private User condition;

	public String add() {
		return "add";
	}

	public String modify() {
		user = userService.find(user.getUsId());
		return "modify";
	}

	public String list() {
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = null;
		if (condition != null) {
			like = new HashMap<String, Object>();
			if (condition.getUsRole() != null
					&& !"".equals(condition.getUsRole()))
				like.put("usRole",  condition.getUsRole() );
			if (condition.getUsUserName() != null
					&& !"".equals(condition.getUsUserName()))
				like.put("usUserName", condition.getUsUserName());
		}
		userService.findByPage(page, like);
		return "list";
	}

	public String modifyUser() {
		User origUser = userService.find(user.getUsId());
		origUser.setUsName(user.getUsName());
		origUser.setUsUserName(user.getUsUserName());
		origUser.setUsRole(user.getUsRole());
		userService.modify(origUser);
		return "modify-success";
	}

	public String addUser() {
		user.setUsCreateTime(new Date());
		user.setUsPassword("666666");
		userService.add(user);
		return "add-success";
	}

	public String deleteUser() {
		user = userService.find(user.getUsId());
		userService.remove(user);
		return "delete-success";
	}

	public User getCondition() {
		return condition;
	}

	public void setCondition(User condition) {
		this.condition = condition;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}