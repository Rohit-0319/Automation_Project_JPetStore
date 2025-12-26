
package com.JPetStore.Pages;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JPetStore.Utility.ExtentLogger;
import com.JPetStore.Utility.Log;
import com.JPetStore.Utility.LoggerUtil;
import com.JPetStore.Utility.WaitUtils;


public class LoginPage  {
	WebDriver driver;
	WaitUtils wait;
	Properties props;
	
	
	@FindBy(xpath = "//*[@id=\"MenuContent\"]/a[2]")
	WebElement SigninBtn;
	

	@FindBy(xpath = "//*[@name=\"username\"]")
	WebElement user;

	
	@FindBy(xpath = "//*[@id=\"Catalog\"]/form/p[2]/input[2]")
	WebElement pass;

	
	@FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
	WebElement login;
	
	@FindBy(xpath = "//*[@id=\"WelcomeContent\"]")
	WebElement MyAccount;

	public LoginPage(WebDriver driver, Properties props) {
		this.driver = driver;
		this.props = props;
		PageFactory.initElements(driver, this);
		 wait = new WaitUtils(driver);
	}
	
	
	public String getWelcomeText() {
	    wait.waitForVisibility(MyAccount);
	    return MyAccount.getText();
	}

	
	public void login(String username ,String password) {
		
		LoggerUtil.info("Testing the Login Module");
		Log.info("Click on Signin Button..");
		ExtentLogger.info("Click on signin Button");
		wait.waitForClick(SigninBtn);
		SigninBtn.click();
		
	/**
	 * Through using LoggerUtil object we can takes log for both log4j and extent report
	 * because we have implemented it's logic in LoggerUtil.java class
	 * 
	 */
		LoggerUtil.info("Entering username through loggerUtil");
		
		wait.waitForVisibility(user);
		user.clear();
		user.sendKeys(username);
		
		ExtentLogger.info("Entering password");
		Log.info("Entering password");
		pass.clear();
		pass.sendKeys(password);
		
		ExtentLogger.info("Clicking on login button");
		Log.info("Clicking on Login Butoon");
		login.click();
		
	
		
	}

}