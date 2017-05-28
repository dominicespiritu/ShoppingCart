package test.org.shopping.cart.service;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.shopping.cart.models.BillingInformation;
import org.shopping.cart.models.Subscriber;
import org.shopping.cart.services.BillingInformationService;

public class BillingInformationServiceTest {
	@Mock
	BillingInformationService _service;
	@Mock
	Subscriber subscriber;
	@Mock
	BillingInformation billingInformation;
	
	
	@Test
	public void create(){
		initMocks(this);
		when(_service.generate(subscriber)).thenAnswer(new Answer(){

			@Override
			public Object answer(InvocationOnMock invocation) throws Throwable {
				// TODO Auto-generated method stub
				return billingInformation;
			}
			
		});
		
	}
}
