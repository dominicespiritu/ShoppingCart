package org.shopping.cart.models;

import java.util.List;

public class BillingFacade {
	private Subscriber subscriber;
	private BillingInformation billingInformation;
	private List<BillingDetails> listBillingDetails;
	
	public BillingFacade() {
		// TODO Auto-generated constructor stub
	}

	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public BillingInformation getBillingInformation() {
		return billingInformation;
	}

	public void setBillingInformation(BillingInformation billingInformation) {
		this.billingInformation = billingInformation;
	}

	public List<BillingDetails> getListBillingDetails() {
		return listBillingDetails;
	}

	public void setListBillingDetails(List<BillingDetails> listBillingDetails) {
		this.listBillingDetails = listBillingDetails;
	}
}
