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

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class BaseAjaxAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8936085321388810145L;
	protected HttpServletResponse response;
	protected HttpServletRequest request;
	protected final Log log = LogFactory.getLog(getClass());

	@Override
	public void prepare() throws Exception {
		request = ServletActionContext.getRequest();
		response = ServletActionContext.getResponse();

	}

	protected String input(String name) {
		return request.getParameter(name);
	}

	protected void output(Object out) {
		try {
			response.getWriter().println(out);
		} catch (IOException e) {
			log.error("Ajax输出失败，输出内容：" + out);
		}
	}

}
