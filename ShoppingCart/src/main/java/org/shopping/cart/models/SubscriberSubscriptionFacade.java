package org.shopping.cart.models;

import java.util.List;

public class SubscriberSubscriptionFacade {
	private Subscriber subscriber;
	private List<Subscription> listSubscription;
	private Promo promo;
	
	public SubscriberSubscriptionFacade() {
		// TODO Auto-generated constructor stub
	}

	public SubscriberSubscriptionFacade(Subscriber subscriber, List<Subscription> listSubscription, Promo promo) {
		super();
		this.subscriber = subscriber;
		this.listSubscription = listSubscription;
		this.promo = promo;
	}

	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public List<Subscription> getListSubscription() {
		return listSubscription;
	}

	public void setListSubscription(List<Subscription> listSubscription) {
		this.listSubscription = listSubscription;
	}

	public Promo getPromo() {
		return promo;
	}

	public void setPromo(Promo promo) {
		this.promo = promo;
	}
}
