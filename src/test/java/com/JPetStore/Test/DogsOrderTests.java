package com.JPetStore.Test;

import org.testng.annotations.Test;

import com.JPetStore.base.BaseClass;

public class DogsOrderTests extends BaseClass {

	@Test
	public void verifyDog() throws InterruptedException {


	lop.login("Rohitqwe", "admin123rohit@");
	
	
	dop.AddDogsToCart();
	

	}
}