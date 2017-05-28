package org.shopping.cart.models;

import java.util.Date;

public class PromoProduct {
	private int id;
	private int promoId;
	private String productCode;
	private double productPromoPrice;
	private Date createdDate;
	private Date updatedDate;
	
	public PromoProduct() {
		// TODO Auto-generated constructor stub
	}

	public PromoProduct(int id, int promoId, String productCode, double productPromoPrice, Date createdDate,
			Date updatedDate) {
		super();
		this.id = id;
		this.promoId = promoId;
		this.productCode = productCode;
		this.productPromoPrice = productPromoPrice;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPromoId() {
		return promoId;
	}

	public void setPromoId(int promoId) {
		this.promoId = promoId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public double getProductPromoPrice() {
		return productPromoPrice;
	}

	public void setProductPromoPrice(double productPromoPrice) {
		this.productPromoPrice = productPromoPrice;
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
}
