package cf.crm.entity;

// Generated 2014-7-12 22:54:45 by Hibernate Tools 3.6.0

/**
 * Datadictionary generated by hbm2java
 */
public class Datadictionary implements java.io.Serializable {

	private String dadiId;
	private String dadiType;
	private String dadiItem;
	private String dadiValue;
	private boolean dadiEnableEdit;

	public Datadictionary() {
	}

	public Datadictionary(String dadiId, String dadiType, String dadiItem,
			String dadiValue, boolean dadiEnableEdit) {
		this.dadiId = dadiId;
		this.dadiType = dadiType;
		this.dadiItem = dadiItem;
		this.dadiValue = dadiValue;
		this.dadiEnableEdit = dadiEnableEdit;
	}

	public String getDadiId() {
		return this.dadiId;
	}

	public void setDadiId(String dadiId) {
		this.dadiId = dadiId;
	}

	public String getDadiType() {
		return this.dadiType;
	}

	public void setDadiType(String dadiType) {
		this.dadiType = dadiType;
	}

	public String getDadiItem() {
		return this.dadiItem;
	}

	public void setDadiItem(String dadiItem) {
		this.dadiItem = dadiItem;
	}

	public String getDadiValue() {
		return this.dadiValue;
	}

	public void setDadiValue(String dadiValue) {
		this.dadiValue = dadiValue;
	}

	public boolean isDadiEnableEdit() {
		return this.dadiEnableEdit;
	}

	public void setDadiEnableEdit(boolean dadiEnableEdit) {
		this.dadiEnableEdit = dadiEnableEdit;
	}

}
