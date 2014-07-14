package cf.crm.interceptor;

import java.util.Map;

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

		Map<String, Object> session = ActionContext.getContext().getSession();

		if (session.get("user.id") != null) {
			return actionInvocation.invoke();
		}

		return "checkLoginFail";
	}
}
