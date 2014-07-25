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

/**
 * Outflow generated by hbm2java
 */
public class Outflow implements java.io.Serializable {

	private String ouflId;
	private Customer customer;
	private String ouflStatus;
	private String ouflAction;
	private String ouflReson;
	private Date ouflTime;

	public Outflow() {
	}

	public Outflow(String ouflId, Customer customer, String ouflStatus,
			String ouflAction) {
		this.ouflId = ouflId;
		this.customer = customer;
		this.ouflStatus = ouflStatus;
		this.ouflAction = ouflAction;
	}

	public Outflow(String ouflId, Customer customer, String ouflStatus,
			String ouflAction, String ouflReson, Date ouflTime) {
		this.ouflId = ouflId;
		this.customer = customer;
		this.ouflStatus = ouflStatus;
		this.ouflAction = ouflAction;
		this.ouflReson = ouflReson;
		this.ouflTime = ouflTime;
	}

	public String getOuflId() {
		return this.ouflId;
	}

	public void setOuflId(String ouflId) {
		this.ouflId = ouflId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getOuflStatus() {
		return this.ouflStatus;
	}

	public void setOuflStatus(String ouflStatus) {
		this.ouflStatus = ouflStatus;
	}

	public String getOuflAction() {
		return this.ouflAction;
	}

	public void setOuflAction(String ouflAction) {
		this.ouflAction = ouflAction;
	}

	public String getOuflReson() {
		return this.ouflReson;
	}

	public void setOuflReson(String ouflReson) {
		this.ouflReson = ouflReson;
	}

	public Date getOuflTime() {
		return this.ouflTime;
	}

	public void setOuflTime(Date ouflTime) {
		this.ouflTime = ouflTime;
	}

}
