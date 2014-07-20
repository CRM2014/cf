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
