package cf.crm.entity;

// Generated 2014-7-12 22:54:45 by Hibernate Tools 3.6.0

import java.util.Date;

/**
 * Contactrecord generated by hbm2java
 */
public class Contactrecord implements java.io.Serializable {

	private String coreId;
	private Customer customer;
	private Date coreDate;
	private String corePlace;
	private String coreMain;
	private String coreDescription;
	private String coreDetail;

	public Contactrecord() {
	}

	public Contactrecord(String coreId, Customer customer, Date coreDate,
			String corePlace, String coreMain) {
		this.coreId = coreId;
		this.customer = customer;
		this.coreDate = coreDate;
		this.corePlace = corePlace;
		this.coreMain = coreMain;
	}

	public Contactrecord(String coreId, Customer customer, Date coreDate,
			String corePlace, String coreMain, String coreDescription,
			String coreDetail) {
		this.coreId = coreId;
		this.customer = customer;
		this.coreDate = coreDate;
		this.corePlace = corePlace;
		this.coreMain = coreMain;
		this.coreDescription = coreDescription;
		this.coreDetail = coreDetail;
	}

	public String getCoreId() {
		return this.coreId;
	}

	public void setCoreId(String coreId) {
		this.coreId = coreId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getCoreDate() {
		return this.coreDate;
	}

	public void setCoreDate(Date coreDate) {
		this.coreDate = coreDate;
	}

	public String getCorePlace() {
		return this.corePlace;
	}

	public void setCorePlace(String corePlace) {
		this.corePlace = corePlace;
	}

	public String getCoreMain() {
		return this.coreMain;
	}

	public void setCoreMain(String coreMain) {
		this.coreMain = coreMain;
	}

	public String getCoreDescription() {
		return this.coreDescription;
	}

	public void setCoreDescription(String coreDescription) {
		this.coreDescription = coreDescription;
	}

	public String getCoreDetail() {
		return this.coreDetail;
	}

	public void setCoreDetail(String coreDetail) {
		this.coreDetail = coreDetail;
	}

}