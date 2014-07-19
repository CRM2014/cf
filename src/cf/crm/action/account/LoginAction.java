package cf.crm.action.account;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.action.util.MD5Util;
import cf.crm.entity.User;
import cf.crm.service.UserService;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class LoginAction extends BaseAction {

	/**
	 * 
	 */
	private User user;

	private static final long serialVersionUID = -6596365603459446146L;
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;

	public String login() {

		// 测试阶段代码
		User user = userService.findByUserName("root");
		if (user == null)
			user = new User();
		user.setUsPassword(MD5Util.getMD5String("root"));
		user.setUsCreateTime(new Date());
		user.setUsRole("root");
		user.setUsName("超级管理员");
		user.setUsUserName("root");
		try {
			userService.modify(user);
		} catch (Exception e) {
			userService.add(user);
		}
		return "login";
	}

	public String checkLogin() {
		if (user == null)
			return "login-fail";
		if (user.getUsUserName() == null)
			return "login-fail";
		User existUser = userService.findByUserName(user.getUsUserName());
		if (existUser == null)
			return "login-fail";
		if (existUser.getUsPassword() == null)
			return "login-fail";
		if (user.getUsPassword() == null)
			return "login-fail";
		user.setUsPassword(MD5Util.getMD5String(user.getUsPassword()));
		if (!existUser.getUsPassword().equals(user.getUsPassword())) {
			return "login-fail";
		} else {
			Map<String, Object> session = ActionContext.getContext()
					.getSession();
			session.put("USER_ID", existUser.getUsId());
			existUser.setUsLastLoginTime(existUser.getUsLoginTime());
			existUser.setUsLoginTime(new Date());
			userService.modify(existUser);
			log.info("登录成功！");
			return "login-success";
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
