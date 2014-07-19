package cf.crm.interceptor;

import java.util.Map;

import cf.crm.action.account.LoginAction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class CheckLogin implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("------CheckLogin.destroy------");
	}

	@Override
	public void init() {
		System.out.println("------CheckLogin.init------");

	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {

		System.out.println("------CheckLogin.intercept------");
		// 对LoginAction不做该项拦截
		Object action = actionInvocation.getAction();
		if (action instanceof LoginAction) {
			return actionInvocation.invoke();
		}
		// 对已登录用户不做该项拦截
		Map<String, Object> session = ActionContext.getContext().getSession();
		Object id = session.get("USER_ID");
		if (id != null && !"".equals(id)) {
			return actionInvocation.invoke();
		}
		return "checkLoginFail";
	}
}
