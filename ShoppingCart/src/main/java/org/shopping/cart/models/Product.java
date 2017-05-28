package org.shopping.cart.models;

import java.util.Date;

public class Product {

	private int id;
	private String title;
	private String description;
	private String currency;
	private String productCode;
	private Date createdDate;
	private Date updatedDate;
	private Boolean active;
	private double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String title, String description, String currency, String productCode, Date createdDate,
			Date updatedDate, Boolean active, double price) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.currency = currency;
		this.productCode = productCode;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.active = active;
		this.price = price;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
