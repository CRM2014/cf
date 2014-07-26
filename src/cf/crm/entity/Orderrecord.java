/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.entity;

// Generated 2014-7-12 22:54:45 by Hibernate Tools 3.6.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orderrecord generated by hbm2java
 */
public class Orderrecord implements java.io.Serializable {

	private String orreId;
	private Customer customer;
	private Date orreDate;
	private String orrePlace;
	private String orreStatus;
	private Set orderrecordproducts = new HashSet(0);

	public Orderrecord() {
	}

	public Orderrecord(String orreId, Customer customer, Date orreDate,
			String orrePlace, String orreStatus) {
		this.orreId = orreId;
		this.customer = customer;
		this.orreDate = orreDate;
		this.orrePlace = orrePlace;
		this.orreStatus = orreStatus;
	}

	public Orderrecord(String orreId, Customer customer, Date orreDate,
			String orrePlace, String orreStatus, Set orderrecordproducts) {
		this.orreId = orreId;
		this.customer = customer;
		this.orreDate = orreDate;
		this.orrePlace = orrePlace;
		this.orreStatus = orreStatus;
		this.orderrecordproducts = orderrecordproducts;
	}

	public String getOrreId() {
		return this.orreId;
	}

	public void setOrreId(String orreId) {
		this.orreId = orreId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getOrreDate() {
		return this.orreDate;
	}

	public void setOrreDate(Date orreDate) {
		this.orreDate = orreDate;
	}

	public String getOrrePlace() {
		return this.orrePlace;
	}

	public void setOrrePlace(String orrePlace) {
		this.orrePlace = orrePlace;
	}

	public String getOrreStatus() {
		return this.orreStatus;
	}

	public void setOrreStatus(String orreStatus) {
		this.orreStatus = orreStatus;
	}

	public Set getOrderrecordproducts() {
		return this.orderrecordproducts;
	}

	public void setOrderrecordproducts(Set orderrecordproducts) {
		this.orderrecordproducts = orderrecordproducts;
	}

}
