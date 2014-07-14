package cf.crm.entity;

// Generated 2014-7-12 22:54:45 by Hibernate Tools 3.6.0

import java.util.Date;

/**
 * Servicecustomer generated by hbm2java
 */
public class Servicecustomer implements java.io.Serializable {

	private String secuId;
	private Customer customer;
	private User userByUsAllocationId;
	private User userByUsDealId;
	private Service service;
	private Date secuAllocationTime;
	private String secuDeal;
	private Date secuDealTime;
	private String secuDealResult;
	private Integer secuSatisfy;

	public Servicecustomer() {
	}

	public Servicecustomer(String secuId, Customer customer, Service service) {
		this.secuId = secuId;
		this.customer = customer;
		this.service = service;
	}

	public Servicecustomer(String secuId, Customer customer,
			User userByUsAllocationId, User userByUsDealId, Service service,
			Date secuAllocationTime, String secuDeal, Date secuDealTime,
			String secuDealResult, Integer secuSatisfy) {
		this.secuId = secuId;
		this.customer = customer;
		this.userByUsAllocationId = userByUsAllocationId;
		this.userByUsDealId = userByUsDealId;
		this.service = service;
		this.secuAllocationTime = secuAllocationTime;
		this.secuDeal = secuDeal;
		this.secuDealTime = secuDealTime;
		this.secuDealResult = secuDealResult;
		this.secuSatisfy = secuSatisfy;
	}

	public String getSecuId() {
		return this.secuId;
	}

	public void setSecuId(String secuId) {
		this.secuId = secuId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public User getUserByUsAllocationId() {
		return this.userByUsAllocationId;
	}

	public void setUserByUsAllocationId(User userByUsAllocationId) {
		this.userByUsAllocationId = userByUsAllocationId;
	}

	public User getUserByUsDealId() {
		return this.userByUsDealId;
	}

	public void setUserByUsDealId(User userByUsDealId) {
		this.userByUsDealId = userByUsDealId;
	}

	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Date getSecuAllocationTime() {
		return this.secuAllocationTime;
	}

	public void setSecuAllocationTime(Date secuAllocationTime) {
		this.secuAllocationTime = secuAllocationTime;
	}

	public String getSecuDeal() {
		return this.secuDeal;
	}

	public void setSecuDeal(String secuDeal) {
		this.secuDeal = secuDeal;
	}

	public Date getSecuDealTime() {
		return this.secuDealTime;
	}

	public void setSecuDealTime(Date secuDealTime) {
		this.secuDealTime = secuDealTime;
	}

	public String getSecuDealResult() {
		return this.secuDealResult;
	}

	public void setSecuDealResult(String secuDealResult) {
		this.secuDealResult = secuDealResult;
	}

	public Integer getSecuSatisfy() {
		return this.secuSatisfy;
	}

	public void setSecuSatisfy(Integer secuSatisfy) {
		this.secuSatisfy = secuSatisfy;
	}

}