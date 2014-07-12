package cf.crm.action.account;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.entity.User;
import cf.crm.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller
@Scope("prototype")
public class LoginAction extends ActionSupport {

	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		
		User user = new User();
		if ("root".equals(user.getName())
				&& "root123".equals(user.getPassword())) {
			Map<String, Object> session = ActionContext.getContext()
					.getSession();
			session.put("user.name", user.getName());
			System.out.println("登录成功，登录用户名:" + user.getName());
			return "success";
		}

		System.out.println("登录失败，登录用户名：" + user.getName());
		return "fail";
	}

}
