package org.shopping.cart.services;

import org.shopping.cart.models.Promo;

public interface PromoService {
	public Promo create(Promo promo);
	public Promo retrieve(Promo promo);
	public Promo retrieveByProductCodes(String[] productCodes);
}
