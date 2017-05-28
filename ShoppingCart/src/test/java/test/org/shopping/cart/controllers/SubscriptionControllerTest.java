package test.org.shopping.cart.controllers;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.shopping.cart.controllers.BillingController;
import org.shopping.cart.controllers.SubscriptionController;
import org.shopping.cart.models.Subscription;

public class SubscriptionControllerTest {
	@Mock
	Subscription subscription;
	@Mock
	SubscriptionController subscriptionController;
	@Mock
	BillingController billingController;
	
	@Before
	public void create(){
		initMocks(this);
//		when(subscriptionObject);
	}
}
