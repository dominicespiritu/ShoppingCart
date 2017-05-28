package test.org.shopping.cart.models;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
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
		product1.setTitle("Unlimited 1GB");
		product1.setProductCode("ult_small");
		product1.setPrice(24.90);

		product2.setTitle("Unlimited 2GB");
		product2.setProductCode("ult_medium");
		product2.setPrice(29.90);
		
		product3.setTitle("Unlimited 5GB");
		product3.setProductCode("ult_large");
		product3.setPrice(44.90);
		
		product4.setTitle("1 GB Data-pack");
		product4.setProductCode("1gb");
		product4.setPrice(9.90);
	}
	
	@Test
	public void subscribe1(){
		
		Double total = 94.70;
		Map<Product,String> products = new HashMap<Product,String>();
		products.put(product1, "");
		products.put(product1, "");
		products.put(product1, "");
		products.put(product3,"");
		
		Mockito.when(shoppingCart.getItems()).thenReturn(products);
		Mockito.when(shoppingCart.getTotal()).thenReturn(total);
		
	}
	
	@Test
	public void subscribe2(){
		Double total = 209.40;
		Map<Product,String> products = new HashMap<Product,String>();
		products.put(product1, "");
		products.put(product1, "");
		products.put(product3, "");
		products.put(product3,"");
		products.put(product3, "");
		products.put(product3,"");
		
		Mockito.when(shoppingCart.getItems()).thenReturn(products);
		Mockito.when(shoppingCart.getTotal()).thenReturn(total);
	}
	
	@Test
	public void subscribe3(){
		Double total = 84.70;
		Map<Product,String> products = new HashMap<Product,String>();
		products.put(product1, "");
		products.put(product2, "");
		products.put(product2,"");
		products.put(product4, "");
		products.put(product4,"");
		
		Mockito.when(shoppingCart.getItems()).thenReturn(products);
		Mockito.when(shoppingCart.getTotal()).thenReturn(total);
	}
	
	@Test
	public void subscribe4(){
		Double total = 31.32;
		Map<Product,String> products = new HashMap<Product,String>();
		products.put(product1, "");
		products.put(product4,"");
		
		Mockito.when(shoppingCart.getItems()).thenReturn(products);
		Mockito.when(shoppingCart.getTotal()).thenReturn(total);
	}
}
