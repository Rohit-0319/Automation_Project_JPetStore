package com.JPetStore.Test;
 
 
import org.testng.annotations.Test;

import com.JPetStore.base.BaseClass;
 
public class ReptileOrderTest extends BaseClass{
	@Test
	public void verifyReptiles() {

		// DogOrderPage dop = new DogOrderPage(driver,props);

		lop.login("Rohitqwe", "admin123rohit@");

		rop.AddReptilesToCart();
	}
}