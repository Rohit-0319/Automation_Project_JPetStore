package com.JPetStore.Test;

import org.testng.annotations.Test;

import com.JPetStore.base.BaseClass;

public class BillOrder extends BaseClass{
	@Test
	public void FinalTest() throws Exception {
		
		lop.login("Rohitqwe", "admin123rohit@");
		dop.AddDogsToCart();
		bop.AddBirdsToCart();
		fop.AddFishToCart();
		rop.AddReptilesToCart();
		cop.AddCatsToCart();
		bill.Bill();
	
}}

