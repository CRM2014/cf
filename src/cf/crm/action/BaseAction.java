package cf.crm.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cf.crm.entity.User;
import cf.crm.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public abstract class BaseAction extends ActionSupport implements Preparable {

	private User currentUser;
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	/**
	 * 
	 */
	private static final long serialVersionUID = -6574644047019242270L;

	@Override
	public void prepare() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		Object id = session.get("user.id");

		if (id != null && !"".endsWith(id.toString())) {
			currentUser = userService.find(id.toString());
		}
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

}
