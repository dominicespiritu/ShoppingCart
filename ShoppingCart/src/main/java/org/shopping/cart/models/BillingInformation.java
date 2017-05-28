package org.shopping.cart.models;

import java.util.Date;

public class BillingInformation {
	private int id;
	private String title;
	private String description;
	private int subscriberId;
	private int subscriptionId;
	private Date dueDate;
	private Date cutoffDate;
	private Date createdDate;
	private double amoungDue;
	
	public BillingInformation() {
		// TODO Auto-generated constructor stub
	}

	public BillingInformation(int id, String title, String description, int subscriberId, int subscriptionId,
			Date dueDate, Date cutoffDate, Date createdDate, double amoungDue) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.subscriberId = subscriberId;
		this.subscriptionId = subscriptionId;
		this.dueDate = dueDate;
		this.cutoffDate = cutoffDate;
		this.createdDate = createdDate;
		this.amoungDue = amoungDue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(int subscriberId) {
		this.subscriberId = subscriberId;
	}

	public int getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getCutoffDate() {
		return cutoffDate;
	}

	public void setCutoffDate(Date cutoffDate) {
		this.cutoffDate = cutoffDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public double getAmoungDue() {
		return amoungDue;
	}

	public void setAmoungDue(double amoungDue) {
		this.amoungDue = amoungDue;
	}
}
