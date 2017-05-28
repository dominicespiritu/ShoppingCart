package org.shopping.cart.services;

import java.util.List;

import org.shopping.cart.models.Subscriber;
import org.shopping.cart.models.Subscription;

public interface SubscriptionService {
	public Subscription subscribe(Subscription subscription);
	public Subscription updateSubscription(Subscription subscription);
	public List<Subscription> retrieveBySubscriber(Subscriber subscriber);
	
}
