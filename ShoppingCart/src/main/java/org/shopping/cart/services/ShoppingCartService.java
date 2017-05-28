package org.shopping.cart.services;

import org.shopping.cart.models.Product;
import org.shopping.cart.models.ShoppingCart;
import org.shopping.cart.models.Subscriber;

public interface ShoppingCartService {
	public ShoppingCart create(ShoppingCart shoppingCart);
	public ShoppingCart retrieve(Subscriber subscriber);
}
