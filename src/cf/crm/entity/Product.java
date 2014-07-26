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

import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {

	private String prId;
	private Storage storage;
	private String prName;
	private String prModel;
	private String prLevel;
	private String prUnit;
	private int prPrice;
	private String prPosition;
	private int prNumber;
	private String prRemark;
	private Set orderrecordproducts = new HashSet(0);
	private Set services = new HashSet(0);

	public Product() {
	}

	public Product(String prId, Storage storage, String prName, String prModel,
			String prLevel, String prUnit, int prPrice, String prPosition,
			int prNumber) {
		this.prId = prId;
		this.storage = storage;
		this.prName = prName;
		this.prModel = prModel;
		this.prLevel = prLevel;
		this.prUnit = prUnit;
		this.prPrice = prPrice;
		this.prPosition = prPosition;
		this.prNumber = prNumber;
	}

	public Product(String prId, Storage storage, String prName, String prModel,
			String prLevel, String prUnit, int prPrice, String prPosition,
			int prNumber, String prRemark, Set orderrecordproducts, Set services) {
		this.prId = prId;
		this.storage = storage;
		this.prName = prName;
		this.prModel = prModel;
		this.prLevel = prLevel;
		this.prUnit = prUnit;
		this.prPrice = prPrice;
		this.prPosition = prPosition;
		this.prNumber = prNumber;
		this.prRemark = prRemark;
		this.orderrecordproducts = orderrecordproducts;
		this.services = services;
	}

	public String getPrId() {
		return this.prId;
	}

	public void setPrId(String prId) {
		this.prId = prId;
	}

	public Storage getStorage() {
		return this.storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public String getPrName() {
		return this.prName;
	}

	public void setPrName(String prName) {
		this.prName = prName;
	}

	public String getPrModel() {
		return this.prModel;
	}

	public void setPrModel(String prModel) {
		this.prModel = prModel;
	}

	public String getPrLevel() {
		return this.prLevel;
	}

	public void setPrLevel(String prLevel) {
		this.prLevel = prLevel;
	}

	public String getPrUnit() {
		return this.prUnit;
	}

	public void setPrUnit(String prUnit) {
		this.prUnit = prUnit;
	}

	public int getPrPrice() {
		return this.prPrice;
	}

	public void setPrPrice(int prPrice) {
		this.prPrice = prPrice;
	}

	public String getPrPosition() {
		return this.prPosition;
	}

	public void setPrPosition(String prPosition) {
		this.prPosition = prPosition;
	}

	public int getPrNumber() {
		return this.prNumber;
	}

	public void setPrNumber(int prNumber) {
		this.prNumber = prNumber;
	}

	public String getPrRemark() {
		return this.prRemark;
	}

	public void setPrRemark(String prRemark) {
		this.prRemark = prRemark;
	}

	public Set getOrderrecordproducts() {
		return this.orderrecordproducts;
	}

	public void setOrderrecordproducts(Set orderrecordproducts) {
		this.orderrecordproducts = orderrecordproducts;
	}

	public Set getServices() {
		return this.services;
	}

	public void setServices(Set services) {
		this.services = services;
	}

}
