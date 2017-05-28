package org.shopping.cart.models;

import java.util.List;
import java.util.Map;

public class PricingRules {
	private int id;
	private String title;
	private String description;
	
	private Map<String,Double> products;

	public PricingRules(int id, String title, String description, Map<String, Double> products) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.products = products;
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

	public Map<String, Double> getProducts() {
		return products;
	}

	public void setProducts(Map<String, Double> products) {
		this.products = products;
	}
}
