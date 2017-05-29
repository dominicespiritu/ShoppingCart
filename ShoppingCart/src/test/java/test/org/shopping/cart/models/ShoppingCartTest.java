package test.org.shopping.cart.models;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.shopping.cart.models.PricingRules;
import org.shopping.cart.models.Product;
import org.shopping.cart.models.Promo;
import org.shopping.cart.models.ShoppingCart;
public class ShoppingCartTest {
	@Mock
	ShoppingCart shoppingCart;
	@Mock
	PricingRules pricingRules;
	@Mock
	Promo promo;
	@Mock
	Product product1;
	@Mock
	Product product2;
	@Mock
	Product product3;
	@Mock
	Product product4;
	
	@Before
	public void init(){
		initMocks(this);
		product1 = new Product("Unlimited 1GB","ult_small",24.90);
		product2 = new Product("Unlimited 2GB","ult_medium",29.90);
		product3 = new Product("Unlimited 5GB","ult_large",44.90);
		product4 = new Product("1 GB Data-pack","1gb",9.90);
	}
	
	@Test
	public void subscribe1(){
		Double total = 94.70;
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(product1.getTitle(),product1.getProductCode(),product1.getPrice()));
		products.add(new Product(product1.getTitle(),product1.getProductCode(),product1.getPrice()));
		products.add(new Product(product1.getTitle(),product1.getProductCode(),product1.getPrice()));
		products.add(new Product(product3.getTitle(),product3.getProductCode(),product3.getPrice()));
		
		Mockito.when(shoppingCart.getItems()).thenReturn(products);
		Mockito.when(shoppingCart.getTotal()).thenReturn(total);
		
		
		Assert.assertEquals(94.70, shoppingCart.getTotal(),  0.001);
		Assert.assertEquals("Same", 4, shoppingCart.getItems().size());
		Assert.assertEquals("Same", "Unlimited 1GB", shoppingCart.getItems().get(0).getTitle());
		Assert.assertEquals("Same", "Unlimited 1GB", shoppingCart.getItems().get(1).getTitle());
		Assert.assertEquals("Same", "Unlimited 1GB", shoppingCart.getItems().get(2).getTitle());
		Assert.assertEquals("Same", "Unlimited 5GB", shoppingCart.getItems().get(3).getTitle());
	}
	
	@Test
	public void subscribe2(){

		Double total = 209.40;
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(product1.getTitle(),product1.getProductCode(),product1.getPrice()));
		products.add(new Product(product1.getTitle(),product1.getProductCode(),product1.getPrice()));
		products.add(new Product(product3.getTitle(),product3.getProductCode(),product3.getPrice()));
		products.add(new Product(product3.getTitle(),product3.getProductCode(),product3.getPrice()));
		products.add(new Product(product3.getTitle(),product3.getProductCode(),product3.getPrice()));
		products.add(new Product(product3.getTitle(),product3.getProductCode(),product3.getPrice()));
		
		Mockito.when(shoppingCart.getItems()).thenReturn(products);
		Mockito.when(shoppingCart.getTotal()).thenReturn(total);
		
		Assert.assertEquals(209.40, shoppingCart.getTotal(),  0.001);
		Assert.assertEquals("Same", 6, shoppingCart.getItems().size());

		Assert.assertEquals("Same", "Unlimited 1GB", shoppingCart.getItems().get(0).getTitle());
		Assert.assertEquals("Same", "Unlimited 1GB", shoppingCart.getItems().get(1).getTitle());
		Assert.assertEquals("Same", "Unlimited 5GB", shoppingCart.getItems().get(2).getTitle());
		Assert.assertEquals("Same", "Unlimited 5GB", shoppingCart.getItems().get(3).getTitle());
		Assert.assertEquals("Same", "Unlimited 5GB", shoppingCart.getItems().get(4).getTitle());
		Assert.assertEquals("Same", "Unlimited 5GB", shoppingCart.getItems().get(5).getTitle());
	}
	
	@Test
	public void subscribe3(){
		Double total = 84.70;
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(product1.getTitle(),product1.getProductCode(),product1.getPrice()));
		products.add(new Product(product2.getTitle(),product2.getProductCode(),product2.getPrice()));
		products.add(new Product(product2.getTitle(),product2.getProductCode(),product2.getPrice()));
		products.add(new Product(product4.getTitle(),product4.getProductCode(),product4.getPrice()));
		products.add(new Product(product4.getTitle(),product4.getProductCode(),product4.getPrice()));
		
		Mockito.when(shoppingCart.getItems()).thenReturn(products);
		Mockito.when(shoppingCart.getTotal()).thenReturn(total);
		
		Assert.assertEquals(84.70, shoppingCart.getTotal(),  0.001);
		Assert.assertEquals("Same", 5, shoppingCart.getItems().size());
		
		Assert.assertEquals("Same", "Unlimited 1GB", shoppingCart.getItems().get(0).getTitle());
		Assert.assertEquals("Same", "Unlimited 2GB", shoppingCart.getItems().get(1).getTitle());
		Assert.assertEquals("Same", "Unlimited 2GB", shoppingCart.getItems().get(2).getTitle());
		Assert.assertEquals("Same", "1 GB Data-pack", shoppingCart.getItems().get(3).getTitle());
		Assert.assertEquals("Same", "1 GB Data-pack", shoppingCart.getItems().get(4).getTitle());
	}
	
	@Test
	public void subscribe4(){
		Double total = 31.32;
		List<Product> products = new ArrayList<Product>();
		products.add(product1);
		products.add(product4);
		
		Mockito.when(shoppingCart.getItems()).thenReturn(products);
		Mockito.when(shoppingCart.getTotal()).thenReturn(total);
		
		Assert.assertEquals(31.32, shoppingCart.getTotal(),  0.001);
		Assert.assertEquals("Same", 2, shoppingCart.getItems().size());
		
		Assert.assertEquals("Same", "Unlimited 1GB", shoppingCart.getItems().get(0).getTitle());
		Assert.assertEquals("Same", "1 GB Data-pack", shoppingCart.getItems().get(1).getTitle());
	}
}
