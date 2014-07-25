/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.util.Info;

import java.util.ArrayList;
import java.util.List;

public class Permission {
	private String role;
	private List<String> operation;
	private List<String> open;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<String> getOperation() {
		return operation;
	}

	public void setOperation(List<String> operation) {
		this.operation = operation;
	}

	public List<String> getOpen() {
		if (open == null)
			open = new ArrayList<String>();
		return open;
	}

	public void setOpen(List<String> open) {
		this.open = open;
	}
}
