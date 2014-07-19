/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.action;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cf.crm.entity.User;
import cf.crm.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public abstract class BaseAction extends ActionSupport implements Preparable {

	protected User currentUser;

	protected String info;

	protected String warn;

	protected String error;

	protected final Log log = LogFactory.getLog(getClass());
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
		Object id = session.get("USER_ID");
		if (id != null && !"".equals(id)) {
			currentUser = userService.find(id.toString());
			log.info("当前用户：" + currentUser.getUsName());
		} else
			log.info("无用户登录");
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public String getInfo() {
		return info;
	}

	public String getWarn() {
		return warn;
	}

	public String getError() {
		return error;
	}

}
