package com.JPetStore.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.JPetStore.Pages.LoginPage;
import com.JPetStore.Utility.Log;
import com.JPetStore.Utility.LoggerUtil;
import com.JPetStore.base.BaseClass;

public class LoginTest extends BaseClass {
	@Test
	public void loginVerify() {

	    Log.startTestCase("Login Test");
	    LoggerUtil.info("Test case Started");

	    lop.login("Rohitqwe", "admin123rohit@");

	    String welcomeText = lop.getWelcomeText();

	    Assert.assertTrue(
	        welcomeText.contains("Welcome"),"Welcome text is not displayed after login");

	    Assert.assertTrue(
	        welcomeText.contains("Rohit"),
	        "Logged in username is not displayed correctly"
	    );

	    Log.endTestCase("Login test ends here..");
	}
}