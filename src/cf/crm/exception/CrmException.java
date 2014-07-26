/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.exception;

@SuppressWarnings("serial")
public class CrmException extends RuntimeException {

	public CrmException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CrmException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public CrmException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CrmException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CrmException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
