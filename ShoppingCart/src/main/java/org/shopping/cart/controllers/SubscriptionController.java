package org.shopping.cart.controllers;

import org.shopping.cart.models.Product;
import org.shopping.cart.models.Promo;
import org.shopping.cart.models.Subscription;
import org.shopping.cart.services.PromoService;
import org.shopping.cart.services.SubscriptionService;
import org.shopping.cart.services.impl.PromoServiceImpl;
import org.shopping.cart.services.impl.SubscriptionServiceImpl;

public class SubscriptionController {
	
	private SubscriptionService subscriptionService = new SubscriptionServiceImpl();
	private PromoService promoService = new PromoServiceImpl();
	
	public void subscribe(Product product){
		Subscription subscription = new Subscription();
	}
	
	private Promo checkPromotion(String[] productCode){
		Promo promo = new Promo();
		
		return null;
	}
}
