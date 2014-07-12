package cf.crm;

// Generated 2014-7-12 15:41:18 by Hibernate Tools 3.6.0

/**
 * OrderrecordproductId generated by hbm2java
 */
public class OrderrecordproductId implements java.io.Serializable {

	private String prId;
	private String orreId;

	public OrderrecordproductId() {
	}

	public OrderrecordproductId(String prId, String orreId) {
		this.prId = prId;
		this.orreId = orreId;
	}

	public String getPrId() {
		return this.prId;
	}

	public void setPrId(String prId) {
		this.prId = prId;
	}

	public String getOrreId() {
		return this.orreId;
	}

	public void setOrreId(String orreId) {
		this.orreId = orreId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderrecordproductId))
			return false;
		OrderrecordproductId castOther = (OrderrecordproductId) other;

		return ((this.getPrId() == castOther.getPrId()) || (this.getPrId() != null
				&& castOther.getPrId() != null && this.getPrId().equals(
				castOther.getPrId())))
				&& ((this.getOrreId() == castOther.getOrreId()) || (this
						.getOrreId() != null && castOther.getOrreId() != null && this
						.getOrreId().equals(castOther.getOrreId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPrId() == null ? 0 : this.getPrId().hashCode());
		result = 37 * result
				+ (getOrreId() == null ? 0 : this.getOrreId().hashCode());
		return result;
	}

}
