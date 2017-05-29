package org.shopping.cart.models;

import java.util.List;
import java.util.Map;

public class ShoppingCart {
	private int id;
	private Subscriber subscriber;
	private List<Product> items;
	private PricingRules pricingRules;
	private double total;
	
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
	}

	public ShoppingCart(int id, Subscriber subscriber, List<Product> items, PricingRules pricingRules, double total) {
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

	public List<Product> getItems() {
		return items;
	}

	public void setItems(List<Product> items) {
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

	public List<Product> addItem(Product product, String promo_code){
		try {
			items.add(product);
		} catch (Exception e) {
			return null;
		}
		return items;
	}
	
	public List<Product> addItem(Product product){
		try {
			items.add(product);
		} catch (Exception e) {
			return null;
		}
		return items;
	}
	
	
}
