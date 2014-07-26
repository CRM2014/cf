/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.action.account;

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
public class AccountAction extends BaseAction {

	/**
	 * 
	 */
	private User user;
	private String oldPassword;
	private String newPassword;

	private String rePassword;

	private static final long serialVersionUID = -6596365603459446146L;
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;

	public String user() {
		return "user";
	}

	public String passwordModify() {
		if (oldPassword == null || "".equals(oldPassword))
			return "password-fail";

		if (newPassword == null || "".equals(newPassword))
			return "password-fail";

		if (rePassword == null || "".equals(rePassword))
			return "password-fail";

		if (!newPassword.equals(rePassword))
			return "password-fail";

		if (!currentUser.getUsPassword().equals(
				MD5Util.getMD5String(oldPassword)))
			return "password-fail";

		currentUser.setUsPassword(MD5Util.getMD5String(newPassword));
		userService.modify(currentUser);
		return "password-success";
	}

	public String logoutUser() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.remove("USER_ID");
		return "logout-success";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

}
