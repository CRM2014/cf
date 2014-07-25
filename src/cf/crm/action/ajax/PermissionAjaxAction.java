/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.action.ajax;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAjaxAction;
import cf.crm.entity.User;
import cf.crm.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class PermissionAjaxAction extends BaseAjaxAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9141116946243429749L;
	@Qualifier("userServiceImpl")
	private UserService userService;

	public void checkExistUserName() {
		String userName = input("userName");
		userService.findByUserName(userName);
		output(false);
	}

}
