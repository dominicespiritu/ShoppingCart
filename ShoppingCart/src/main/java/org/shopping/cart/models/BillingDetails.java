package org.shopping.cart.models;

public class BillingDetails {
	private int id;
	private String title;
	private String description;
	private int billingInformationId;
	
	public BillingDetails() {
		// TODO Auto-generated constructor stub
	}

	public BillingDetails(int id, String title, String description, int billingInformationId) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.billingInformationId = billingInformationId;
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

	public int getBillingInformationId() {
		return billingInformationId;
	}

	public void setBillingInformationId(int billingInformationId) {
		this.billingInformationId = billingInformationId;
	}
}
