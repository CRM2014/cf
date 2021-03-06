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
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private String cuId;
	private User user;
	private String cuName;
	private String cuZone;
	private String cuRelation;
	private String cuLevel;
	private int cuSatisfy;
	private int cuCredit;
	private String cuAddress;
	private String cuPostal;
	private String cuTel;
	private String cuFacsimile;
	private String cuWeb;
	private String cuLegal;
	private String cuBank;
	private String cuBankAccount;
	private Float cuRegisterCapital;
	private int cuTurnover;
	private String cuTurnoverNum;
	private String cuLandTaxNum;
	private String cuNationTaxNum;
	private Set contactpersons = new HashSet(0);
	private Set contactrecords = new HashSet(0);
	private Set orderrecords = new HashSet(0);
	private Set servicecustomers = new HashSet(0);
	private Set outflows = new HashSet(0);

	public Customer() {
	}

	public Customer(String cuId, User user, String cuName, String cuZone,
			String cuRelation, String cuLevel, int cuSatisfy, int cuCredit,
			String cuAddress, String cuPostal, String cuTel,
			String cuFacsimile, String cuWeb, String cuLegal, String cuBank,
			String cuBankAccount, int cuTurnover) {
		this.cuId = cuId;
		this.user = user;
		this.cuName = cuName;
		this.cuZone = cuZone;
		this.cuRelation = cuRelation;
		this.cuLevel = cuLevel;
		this.cuSatisfy = cuSatisfy;
		this.cuCredit = cuCredit;
		this.cuAddress = cuAddress;
		this.cuPostal = cuPostal;
		this.cuTel = cuTel;
		this.cuFacsimile = cuFacsimile;
		this.cuWeb = cuWeb;
		this.cuLegal = cuLegal;
		this.cuBank = cuBank;
		this.cuBankAccount = cuBankAccount;
		this.cuTurnover = cuTurnover;
	}

	public Customer(String cuId, User user, String cuName, String cuZone,
			String cuRelation, String cuLevel, int cuSatisfy, int cuCredit,
			String cuAddress, String cuPostal, String cuTel,
			String cuFacsimile, String cuWeb, String cuLegal, String cuBank,
			String cuBankAccount, Float cuRegisterCapital, int cuTurnover,
			String cuTurnoverNum, String cuLandTaxNum, String cuNationTaxNum,
			Set contactpersons, Set contactrecords, Set orderrecords,
			Set servicecustomers, Set outflows) {
		this.cuId = cuId;
		this.user = user;
		this.cuName = cuName;
		this.cuZone = cuZone;
		this.cuRelation = cuRelation;
		this.cuLevel = cuLevel;
		this.cuSatisfy = cuSatisfy;
		this.cuCredit = cuCredit;
		this.cuAddress = cuAddress;
		this.cuPostal = cuPostal;
		this.cuTel = cuTel;
		this.cuFacsimile = cuFacsimile;
		this.cuWeb = cuWeb;
		this.cuLegal = cuLegal;
		this.cuBank = cuBank;
		this.cuBankAccount = cuBankAccount;
		this.cuRegisterCapital = cuRegisterCapital;
		this.cuTurnover = cuTurnover;
		this.cuTurnoverNum = cuTurnoverNum;
		this.cuLandTaxNum = cuLandTaxNum;
		this.cuNationTaxNum = cuNationTaxNum;
		this.contactpersons = contactpersons;
		this.contactrecords = contactrecords;
		this.orderrecords = orderrecords;
		this.servicecustomers = servicecustomers;
		this.outflows = outflows;
	}

	public String getCuId() {
		return this.cuId;
	}

	public void setCuId(String cuId) {
		this.cuId = cuId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCuName() {
		return this.cuName;
	}

	public void setCuName(String cuName) {
		this.cuName = cuName;
	}

	public String getCuZone() {
		return this.cuZone;
	}

	public void setCuZone(String cuZone) {
		this.cuZone = cuZone;
	}

	public String getCuRelation() {
		return this.cuRelation;
	}

	public void setCuRelation(String cuRelation) {
		this.cuRelation = cuRelation;
	}

	public String getCuLevel() {
		return this.cuLevel;
	}

	public void setCuLevel(String cuLevel) {
		this.cuLevel = cuLevel;
	}

	public int getCuSatisfy() {
		return this.cuSatisfy;
	}

	public void setCuSatisfy(int cuSatisfy) {
		this.cuSatisfy = cuSatisfy;
	}

	public int getCuCredit() {
		return this.cuCredit;
	}

	public void setCuCredit(int cuCredit) {
		this.cuCredit = cuCredit;
	}

	public String getCuAddress() {
		return this.cuAddress;
	}

	public void setCuAddress(String cuAddress) {
		this.cuAddress = cuAddress;
	}

	public String getCuPostal() {
		return this.cuPostal;
	}

	public void setCuPostal(String cuPostal) {
		this.cuPostal = cuPostal;
	}

	public String getCuTel() {
		return this.cuTel;
	}

	public void setCuTel(String cuTel) {
		this.cuTel = cuTel;
	}

	public String getCuFacsimile() {
		return this.cuFacsimile;
	}

	public void setCuFacsimile(String cuFacsimile) {
		this.cuFacsimile = cuFacsimile;
	}

	public String getCuWeb() {
		return this.cuWeb;
	}

	public void setCuWeb(String cuWeb) {
		this.cuWeb = cuWeb;
	}

	public String getCuLegal() {
		return this.cuLegal;
	}

	public void setCuLegal(String cuLegal) {
		this.cuLegal = cuLegal;
	}

	public String getCuBank() {
		return this.cuBank;
	}

	public void setCuBank(String cuBank) {
		this.cuBank = cuBank;
	}

	public String getCuBankAccount() {
		return this.cuBankAccount;
	}

	public void setCuBankAccount(String cuBankAccount) {
		this.cuBankAccount = cuBankAccount;
	}

	public Float getCuRegisterCapital() {
		return this.cuRegisterCapital;
	}

	public void setCuRegisterCapital(Float cuRegisterCapital) {
		this.cuRegisterCapital = cuRegisterCapital;
	}

	public int getCuTurnover() {
		return this.cuTurnover;
	}

	public void setCuTurnover(int cuTurnover) {
		this.cuTurnover = cuTurnover;
	}

	public String getCuTurnoverNum() {
		return this.cuTurnoverNum;
	}

	public void setCuTurnoverNum(String cuTurnoverNum) {
		this.cuTurnoverNum = cuTurnoverNum;
	}

	public String getCuLandTaxNum() {
		return this.cuLandTaxNum;
	}

	public void setCuLandTaxNum(String cuLandTaxNum) {
		this.cuLandTaxNum = cuLandTaxNum;
	}

	public String getCuNationTaxNum() {
		return this.cuNationTaxNum;
	}

	public void setCuNationTaxNum(String cuNationTaxNum) {
		this.cuNationTaxNum = cuNationTaxNum;
	}

	public Set getContactpersons() {
		return this.contactpersons;
	}

	public void setContactpersons(Set contactpersons) {
		this.contactpersons = contactpersons;
	}

	public Set getContactrecords() {
		return this.contactrecords;
	}

	public void setContactrecords(Set contactrecords) {
		this.contactrecords = contactrecords;
	}

	public Set getOrderrecords() {
		return this.orderrecords;
	}

	public void setOrderrecords(Set orderrecords) {
		this.orderrecords = orderrecords;
	}

	public Set getServicecustomers() {
		return this.servicecustomers;
	}

	public void setServicecustomers(Set servicecustomers) {
		this.servicecustomers = servicecustomers;
	}

	public Set getOutflows() {
		return this.outflows;
	}

	public void setOutflows(Set outflows) {
		this.outflows = outflows;
	}

}
