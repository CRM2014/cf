package cf.crm.action.account;

import java.io.ByteArrayInputStream;
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
import cf.crm.util.SecurityCode;
import cf.crm.util.SecurityImage;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class LoginAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6596365603459446146L;
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	private User user;
	private ByteArrayInputStream imageStream;
	private String securityCode;

	public String login() {
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
			log.info("root用户已存在，修改为默认值！");
		} catch (Exception e) {
			userService.add(user);
			log.info("root用户已添加！");
		}
		return "login";
	}

	public String checkLogin() {
		if (user == null) {
			log.info("用户为空！");
			return "login-fail";
		}
		if (user.getUsUserName() == null) {
			log.info("用户名为空！");
			return "login-fail";
		}
		if (user.getUsPassword() == null) {
			log.info("密码为空！");
			return "login-fail";
		}
		if (securityCode == null) {
			log.info("验证码为空！");
			return "login-fail";
		}
		Map<String, Object> session = ActionContext.getContext().getSession();
		if (!session.get("SECURITY_CODE").toString()
				.equals(securityCode)) {
			log.info("输入验证码：" + securityCode);
			log.info("验证码错误！");
			return "login-fail";
		}
		User existUser = userService.findByUserName(user.getUsUserName());
		if (existUser == null) {
			log.info("用户名不存在！");
			return "login-fail";
		}

		user.setUsPassword(MD5Util.getMD5String(user.getUsPassword()));
		if (!existUser.getUsPassword().equals(user.getUsPassword())) {
			log.info("密码错误！");
			return "login-fail";
		} else {
			session.put("USER_ID", existUser.getUsId());
			existUser.setUsLastLoginTime(existUser.getUsLoginTime());
			existUser.setUsLoginTime(new Date());
			userService.modify(existUser);
			log.info("登录成功！");
			return "login-success";
		}
	}

	public String securityImage() {
		securityCode = SecurityCode.getSecurityCode();
		Map<String, Object> session = ActionContext.getContext().getSession();
		log.info("生成验证码：" + securityCode);
		session.put("SECURITY_CODE", securityCode);
		imageStream = SecurityImage.getImageAsInputStream(securityCode);
		return "security-image";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ByteArrayInputStream getImageStream() {
		return imageStream;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

}
