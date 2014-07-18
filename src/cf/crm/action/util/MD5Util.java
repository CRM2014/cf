package cf.crm.action.util;

public class MD5Util {
	private static final String DEFAULTPASSWORD = "666666";

	public static String getMD5String(String s) {
		if (s == null || "".equals(s))
			s = DEFAULTPASSWORD;
		return s;
	}
}
