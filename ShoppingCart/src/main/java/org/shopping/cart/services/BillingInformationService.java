package org.shopping.cart.services;

import org.shopping.cart.models.BillingInformation;
import org.shopping.cart.models.Subscriber;

public interface BillingInformationService {
	public BillingInformation create(BillingInformation billingInformation);
	public BillingInformation generate(Subscriber subscriber);
	public BillingInformation retrieveBySubscriber(BillingInformation billingInformation);
}
