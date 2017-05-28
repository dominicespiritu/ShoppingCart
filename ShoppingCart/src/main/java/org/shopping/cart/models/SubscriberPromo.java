package org.shopping.cart.models;

import java.util.Date;

public class SubscriberPromo {
	private int id;
	private int userId;
	private int promoId;
	private Date createdDate;
	private Date updatedDate;
	
	public SubscriberPromo() {
		// TODO Auto-generated constructor stub
	}

	public SubscriberPromo(int id, int userId, int promoId, Date createdDate, Date updatedDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.promoId = promoId;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPromoId() {
		return promoId;
	}

	public void setPromoId(int promoId) {
		this.promoId = promoId;
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
