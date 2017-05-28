package org.shopping.cart.services.impl;

import org.shopping.cart.models.BillingInformation;
import org.shopping.cart.models.Subscriber;
import org.shopping.cart.services.BillingInformationService;

public class BillingInformationServiceImpl implements BillingInformationService {

	@Override
	public BillingInformation create(BillingInformation billingInformation) {
		// TODO Auto-generated method stub
		return billingInformation;
	}

	@Override
	public BillingInformation retrieveBySubscriber(BillingInformation billingInformation) {
		// TODO Auto-generated method stub
		return billingInformation;
	}

	@Override
	public BillingInformation generate(Subscriber subscriber) {
		// TODO Auto-generated method stub
		BillingInformation billingInformation;
		try {
			billingInformation = new BillingInformation();
		} catch (Exception e) {
			billingInformation = null;
		}
		
		return billingInformation;
	}

}
