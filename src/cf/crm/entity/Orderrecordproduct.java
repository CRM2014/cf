package cf.crm.entity;

// Generated 2014-7-12 22:54:45 by Hibernate Tools 3.6.0

/**
 * Orderrecordproduct generated by hbm2java
 */
public class Orderrecordproduct implements java.io.Serializable {

	private String orreprId;
	private Orderrecord orderrecord;
	private Product product;
	private int orreprNum;

	public Orderrecordproduct() {
	}

	public Orderrecordproduct(String orreprId, Orderrecord orderrecord,
			Product product, int orreprNum) {
		this.orreprId = orreprId;
		this.orderrecord = orderrecord;
		this.product = product;
		this.orreprNum = orreprNum;
	}

	public String getOrreprId() {
		return this.orreprId;
	}

	public void setOrreprId(String orreprId) {
		this.orreprId = orreprId;
	}

	public Orderrecord getOrderrecord() {
		return this.orderrecord;
	}

	public void setOrderrecord(Orderrecord orderrecord) {
		this.orderrecord = orderrecord;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getOrreprNum() {
		return this.orreprNum;
	}

	public void setOrreprNum(int orreprNum) {
		this.orreprNum = orreprNum;
	}

}
