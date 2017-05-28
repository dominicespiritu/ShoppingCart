package org.shopping.cart.models;

import java.util.List;
import java.util.Map;

public class ShoppingCart {
	private int id;
	private Subscriber subscriber;
	private Map<Product, String> items;
	private PricingRules pricingRules;
	private double total;
	
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
	}
	
	public ShoppingCart(int id, Subscriber subscriber, Map<Product, String> items, PricingRules pricingRules,
			double total) {
		super();
		this.id = id;
		this.subscriber = subscriber;
		this.items = items;
		this.pricingRules = pricingRules;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public Map<Product, String> getItems() {
		return items;
	}

	public void setItems(Map<Product, String> items) {
		this.items = items;
	}

	public PricingRules getPricingRules() {
		return pricingRules;
	}

	public void setPricingRules(PricingRules pricingRules) {
		this.pricingRules = pricingRules;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Map<Product, String> addItem(Product product, String promo_code){
		try {
			items.put(product, promo_code);
		} catch (Exception e) {
			return null;
		}
		return items;
	}
	
	public Map<Product, String> addItem(Product product){
		try {
			items.put(product, "");
		} catch (Exception e) {
			return null;
		}
		return items;
	}
	
	
}
