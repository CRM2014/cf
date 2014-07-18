package cf.crm.action.account;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.User;
import cf.crm.service.UserService;
import cf.crm.util.page.Page;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class AccountAction extends BaseAction {

	/**
	 * 
	 */
	private User user;

	private static final long serialVersionUID = -6596365603459446146L;
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;

	public String login() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		User existUser = userService.findByUserName(user.getUsUserName());
		if (existUser == null)
			return "fail";
		if (existUser.getUsPassword() == null)
			return "fail";
		if (user == null)
			return "fail";
		if (user.getUsPassword() == null)
			return "fail";
		if (existUser.getUsPassword().equals(user.getUsPassword())) {
			Map<String, Object> session = ActionContext.getContext()
					.getSession();
			session.put("user.id", user.getUsId());
			System.out.println("登录成功，登录用户名:" + user.getUsUserName());
			return "success";
		} else {
			System.out.println("登录失败，登录用户名：" + user.getUsName());
			return "fail";
		}
	}

	public String user() {
		return "user";
	}

	public String logoutUser() {
		return "user";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
