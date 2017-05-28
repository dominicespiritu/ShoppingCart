package org.shopping.cart.models;

public class BillingConfig {
	private int id;
	private String title;
	private String description;
	private Subscriber subscriber;
	private int cutOff; //day of cutoff Ex. 5 = 5th day of the month
	private int billingSpan; //length of days before cutoff Ex. value = 30 : cutof is every 30 days from start day of subscription (cutoff); 
	private int issuanceDay; //N days after cutoff to issue billing statement
	private int statementDueDay; //N days after cutoff for settlement deadline
	
	public BillingConfig() {
		// TODO Auto-generated constructor stub
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

	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public int getCutOff() {
		return cutOff;
	}

	public void setCutOff(int cutOff) {
		this.cutOff = cutOff;
	}

	public int getBillingSpan() {
		return billingSpan;
	}

	public void setBillingSpan(int billingSpan) {
		this.billingSpan = billingSpan;
	}

	public int getIssuanceDay() {
		return issuanceDay;
	}

	public void setIssuanceDay(int issuanceDay) {
		this.issuanceDay = issuanceDay;
	}

	public int getStatementDueDay() {
		return statementDueDay;
	}

	public void setStatementDueDay(int statementDueDay) {
		this.statementDueDay = statementDueDay;
	}

	
}
