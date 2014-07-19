package cf.crm.util.page;

public class Between {
	private String pro;
	private String from;
	private String to;
	public Between(String pro, String from, String to) {
		super();
		this.pro = pro;
		this.from = from;
		this.to = to;
	}
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
}
