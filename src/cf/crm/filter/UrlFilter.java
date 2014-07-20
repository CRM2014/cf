package cf.crm.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cf.crm.action.util.MD5Util;
import cf.crm.entity.User;
import cf.crm.service.UserService;

public class UrlFilter implements Filter {
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	protected final Log log = LogFactory.getLog(getClass());

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;

		String url = httpRequest.getRequestURI();
		if (url.endsWith("jsp")) {
			System.out.println(url);
			HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
			httpResponse.sendRedirect(httpRequest.getContextPath()
					+ "/404.action");
		}
		filterChain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// 测试阶段代码
		/*User user = userService.findByUserName("root");
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
		}*/
	}

}
