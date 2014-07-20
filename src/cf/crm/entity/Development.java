package cf.crm.entity;

// Generated 2014-7-12 22:54:45 by Hibernate Tools 3.6.0

import java.util.Date;

/**
 * Development generated by hbm2java
 */
public class Development implements java.io.Serializable {

	/**
	 * 
	 */

	private String deId;
	private Salechance salechance;
	private Date deDate;
	private String dePlan;
	private String deResult;
	private String deStatus;

	public Development() {
	}

	public Development(String deId, Salechance salechance, Date deDate,
			String dePlan) {
		this.deId = deId;
		this.salechance = salechance;
		this.deDate = deDate;
		this.dePlan = dePlan;
	}

	public Development(String deId, Salechance salechance, Date deDate,
			String dePlan, String deResult, String deStatus) {
		this.deId = deId;
		this.salechance = salechance;
		this.deDate = deDate;
		this.dePlan = dePlan;
		this.deResult = deResult;
		this.deStatus = deStatus;
	}

	public String getDeId() {
		return this.deId;
	}

	public void setDeId(String deId) {
		this.deId = deId;
	}

	public Salechance getSalechance() {
		return this.salechance;
	}

	public void setSalechance(Salechance salechance) {
		this.salechance = salechance;
	}

	public Date getDeDate() {
		return this.deDate;
	}

	public void setDeDate(Date deDate) {
		this.deDate = deDate;
	}

	public String getDePlan() {
		return this.dePlan;
	}

	public void setDePlan(String dePlan) {
		this.dePlan = dePlan;
	}

	public String getDeResult() {
		return this.deResult;
	}

	public void setDeResult(String deResult) {
		this.deResult = deResult;
	}

	public String getDeStatus() {
		return this.deStatus;
	}

	public void setDeStatus(String deStatus) {
		this.deStatus = deStatus;
	}

}
