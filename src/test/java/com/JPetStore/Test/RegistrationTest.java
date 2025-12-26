package com.JPetStore.Test;
 
import org.testng.annotations.Test;

import com.JPetStore.Pages.RegisterationPage;
import com.JPetStore.base.BaseClass;
 
public class RegistrationTest extends BaseClass{
	
	@Test
	public void Regis() {
		RegisterationPage registertest = new RegisterationPage(driver);
		
		registertest.registeredPage();
	}
 
}