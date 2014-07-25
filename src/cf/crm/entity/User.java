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
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private String usId;
	private String usUserName;
	private String usPassword;
	private String usName;
	private String usRole;
	private Date usLoginTime;
	private Date usLastLoginTime;
	private Date usCreateTime;
	private Set customers = new HashSet(0);
	private Set salechancesForUsDesignationId = new HashSet(0);
	private Set servicecustomersForUsDealId = new HashSet(0);
	private Set services = new HashSet(0);
	private Set servicecustomersForUsAllocationId = new HashSet(0);
	private Set salechancesForUsCreateId = new HashSet(0);

	public User() {
	}

	public User(String usId, String usUserName, String usPassword,
			String usName, String usRole, Date usCreateTime) {
		this.usId = usId;
		this.usUserName = usUserName;
		this.usPassword = usPassword;
		this.usName = usName;
		this.usRole = usRole;
		this.usCreateTime = usCreateTime;
	}

	public User(String usId, String usUserName, String usPassword,
			String usName, String usRole, Date usLoginTime,
			Date usLastLoginTime, Date usCreateTime, Set customers,
			Set salechancesForUsDesignationId, Set servicecustomersForUsDealId,
			Set services, Set servicecustomersForUsAllocationId,
			Set salechancesForUsCreateId) {
		this.usId = usId;
		this.usUserName = usUserName;
		this.usPassword = usPassword;
		this.usName = usName;
		this.usRole = usRole;
		this.usLoginTime = usLoginTime;
		this.usLastLoginTime = usLastLoginTime;
		this.usCreateTime = usCreateTime;
		this.customers = customers;
		this.salechancesForUsDesignationId = salechancesForUsDesignationId;
		this.servicecustomersForUsDealId = servicecustomersForUsDealId;
		this.services = services;
		this.servicecustomersForUsAllocationId = servicecustomersForUsAllocationId;
		this.salechancesForUsCreateId = salechancesForUsCreateId;
	}

	public String getUsId() {
		return this.usId;
	}

	public void setUsId(String usId) {
		this.usId = usId;
	}

	public String getUsUserName() {
		return this.usUserName;
	}

	public void setUsUserName(String usUserName) {
		this.usUserName = usUserName;
	}

	public String getUsPassword() {
		return this.usPassword;
	}

	public void setUsPassword(String usPassword) {
		this.usPassword = usPassword;
	}

	public String getUsName() {
		return this.usName;
	}

	public void setUsName(String usName) {
		this.usName = usName;
	}

	public String getUsRole() {
		return this.usRole;
	}

	public void setUsRole(String usRole) {
		this.usRole = usRole;
	}

	public Date getUsLoginTime() {
		return this.usLoginTime;
	}

	public void setUsLoginTime(Date usLoginTime) {
		this.usLoginTime = usLoginTime;
	}

	public Date getUsLastLoginTime() {
		return this.usLastLoginTime;
	}

	public void setUsLastLoginTime(Date usLastLoginTime) {
		this.usLastLoginTime = usLastLoginTime;
	}

	public Date getUsCreateTime() {
		return this.usCreateTime;
	}

	public void setUsCreateTime(Date usCreateTime) {
		this.usCreateTime = usCreateTime;
	}

	public Set getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set customers) {
		this.customers = customers;
	}

	public Set getSalechancesForUsDesignationId() {
		return this.salechancesForUsDesignationId;
	}

	public void setSalechancesForUsDesignationId(
			Set salechancesForUsDesignationId) {
		this.salechancesForUsDesignationId = salechancesForUsDesignationId;
	}

	public Set getServicecustomersForUsDealId() {
		return this.servicecustomersForUsDealId;
	}

	public void setServicecustomersForUsDealId(Set servicecustomersForUsDealId) {
		this.servicecustomersForUsDealId = servicecustomersForUsDealId;
	}

	public Set getServices() {
		return this.services;
	}

	public void setServices(Set services) {
		this.services = services;
	}

	public Set getServicecustomersForUsAllocationId() {
		return this.servicecustomersForUsAllocationId;
	}

	public void setServicecustomersForUsAllocationId(
			Set servicecustomersForUsAllocationId) {
		this.servicecustomersForUsAllocationId = servicecustomersForUsAllocationId;
	}

	public Set getSalechancesForUsCreateId() {
		return this.salechancesForUsCreateId;
	}

	public void setSalechancesForUsCreateId(Set salechancesForUsCreateId) {
		this.salechancesForUsCreateId = salechancesForUsCreateId;
	}

}
