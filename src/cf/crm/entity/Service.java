package cf.crm.entity;

// Generated 2014-7-12 16:42:52 by Hibernate Tools 3.6.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Service generated by hbm2java
 */
public class Service implements java.io.Serializable {

	private String seId;
	private Product product;
	private User user;
	private String seType;
	private String seMain;
	private Date seCreateTime;
	private Set servicecustomers = new HashSet(0);

	public Service() {
	}

	public Service(String seId, Product product, User user, String seType,
			String seMain, Date seCreateTime) {
		this.seId = seId;
		this.product = product;
		this.user = user;
		this.seType = seType;
		this.seMain = seMain;
		this.seCreateTime = seCreateTime;
	}

	public Service(String seId, Product product, User user, String seType,
			String seMain, Date seCreateTime, Set servicecustomers) {
		this.seId = seId;
		this.product = product;
		this.user = user;
		this.seType = seType;
		this.seMain = seMain;
		this.seCreateTime = seCreateTime;
		this.servicecustomers = servicecustomers;
	}

	public String getSeId() {
		return this.seId;
	}

	public void setSeId(String seId) {
		this.seId = seId;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSeType() {
		return this.seType;
	}

	public void setSeType(String seType) {
		this.seType = seType;
	}

	public String getSeMain() {
		return this.seMain;
	}

	public void setSeMain(String seMain) {
		this.seMain = seMain;
	}

	public Date getSeCreateTime() {
		return this.seCreateTime;
	}

	public void setSeCreateTime(Date seCreateTime) {
		this.seCreateTime = seCreateTime;
	}

	public Set getServicecustomers() {
		return this.servicecustomers;
	}

	public void setServicecustomers(Set servicecustomers) {
		this.servicecustomers = servicecustomers;
	}

}
