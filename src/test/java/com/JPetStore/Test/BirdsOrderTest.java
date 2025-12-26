package com.JPetStore.Test;

import org.testng.annotations.Test;

import com.JPetStore.base.BaseClass;

public class BirdsOrderTest extends BaseClass {

	@Test
	public void verifyBirdTest() {
		lop.login("Rohitqwe","admin123rohit@");
		bop.AddBirdsToCart();

	}
}