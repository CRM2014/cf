package cf.crm.util.Info;

import java.util.ArrayList;
import java.util.List;

public class PermissionInfo {
	private List<Permission> permissions;

	public PermissionInfo() {
		permissions = new ArrayList<Permission>();
		Permission permission = null;
		permission = new Permission();
		permission.setRole(Role.SYSTEM);
		permission.getOpen().add("5");
		permission.getOpen().add("6");
		permissions.add(permission);

		permission = new Permission();
		permission.setRole(Role.SENIOR);
		permission.getOpen().add("4");
		permissions.add(permission);

		permission = new Permission();
		permission.setRole(Role.SALES);
		permission.getOpen().add("3");
		permission.getOpen().add("2");
		permission.getOpen().add("1");
		permission.getOpen().add("4");
		permissions.add(permission);

		permission = new Permission();
		permission.setRole(Role.CUSTOMER);
		permission.getOpen().add("3");
		permission.getOpen().add("2");
		permission.getOpen().add("1");
		permissions.add(permission);

		permission = new Permission();
		permission.setRole(Role.ROOT);
		permission.getOpen().add("5");
		permission.getOpen().add("6");
		permissions.add(permission);
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
}
