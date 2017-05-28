package org.shopping.cart.services;

import java.util.List;

import org.shopping.cart.models.Product;

public interface ProductService {
	public Product getProduct();
	public List<Product> retrieveProducts();
}
