package com.JPetStore.Test;

import org.testng.annotations.Test;

import com.JPetStore.base.BaseClass;

public class FishOrderTest extends BaseClass {
	@Test
	public void verifyFish() {


		lop.login("Rohitqwe", "admin123rohit@");

		fop.AddFishToCart();

	}
}