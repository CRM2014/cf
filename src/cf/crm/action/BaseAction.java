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

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cf.crm.entity.User;
import cf.crm.service.UserService;
import cf.crm.util.Info.Permission;
import cf.crm.util.Info.PermissionInfo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public abstract class BaseAction extends ActionSupport implements Preparable {

	protected User currentUser;

	protected String info;

	protected String warn;

	protected String error;

	private List<Permission> permissions;

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
		permissions = new PermissionInfo().getPermissions();
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public String getInfo() {
		return info;
	}

	public String getWarn() throws UnsupportedEncodingException {
		if (warn != null)
			warn = URLDecoder.decode(warn, "UTF-8");
		return warn;
	}

	public String getError() {
		return error;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setWarn(String warn) {
		this.warn = warn;
	}

	public void setError(String error) {
		this.error = error;
	}

	

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
}
