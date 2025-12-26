package com.JPetStore.Test;

import org.testng.annotations.Test;

import com.JPetStore.base.BaseClass;

public class CatsOrderTest extends BaseClass {

	@Test
	public void verifyCat() {

		// DogOrderPage dop = new DogOrderPage(driver,props);

		lop.login("Rohitqwe", "admin123rohit@");

		cop.AddCatsToCart();
	}
}