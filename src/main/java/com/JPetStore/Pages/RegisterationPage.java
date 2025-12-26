
package com.JPetStore.Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import com.JPetStore.Utility.LoggerUtil;
import com.JPetStore.Utility.WaitUtils;


public class RegisterationPage  {
	
	WebDriver driver;
	WaitUtils wait;
	
	// Locating the Sigin Button
	@FindBy(xpath = "//*[@id=\"MenuContent\"]/a[2]")
	WebElement SigninBtn;
	
	
	// Locating the register option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/a")
	WebElement RegisterClk;
	
	// Locating the username textbox
	@FindBy(name = "username")
	WebElement usrname;
	
	
	// locating the password textbox
	@FindBy(xpath = "//*[@name=\"password\"]")
	WebElement passwrd;
	
	// Locating the repeat password textbox
	@FindBy(xpath = "//*[@name=\"repeatedPassword\"]")
	WebElement repasswrd;
	
	
	// Locating the firsname textbox
	@FindBy(name = "account.firstName")
	WebElement frstname;
	
	// Locating the last Name textbox
	@FindBy(name = "account.lastName")
	WebElement lstname;
	
	
	// Locating the email textbox
	@FindBy(name = "account.email")
	WebElement email;
	
	
	// Locating the phome no textbox
	@FindBy(name = "account.phone")
	WebElement phnno;
	
	// Locating the address Line 1 textbox
	@FindBy(name = "account.address1")
	WebElement add1;
	
	
	// Locating the address Line 2 textbox
	@FindBy(name = "account.address2")
	WebElement add2;
	
	
	// Locating the city name textbox
	@FindBy(name = "account.city")
	WebElement city;
	
	
	// Locating the State textbox
	@FindBy(name = "account.state")
	WebElement state;
	
	
	// Locating the zipcode textbox
	@FindBy(name = "account.zip")
	WebElement zipcode;
	
	
	// Locating the country textbox
	@FindBy(name = "account.country")
	WebElement country;
	
	
	// Locating the submit option
	@FindBy(name = "newAccount")
	WebElement submt;

	
	// using the Page factory model
	public RegisterationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WaitUtils(driver);
	}

	
	public void registeredPage() {
		
			LoggerUtil.info("Testing the Registration Module");
			
			LoggerUtil.info("Clicking on signin Button");
			
			wait.waitForClick(SigninBtn);
			SigninBtn.click();
			
			LoggerUtil.info("Clicking on register button");
			RegisterClk.click();
			
			
			LoggerUtil.info("Sending the Usename as Rohit in username textbox");
			usrname.sendKeys("Rohitqwe");

			LoggerUtil.info("Sending the Password as admin123 in RepeatPassword Textbox");
			passwrd.sendKeys("admin123rohit@");
			
			repasswrd.sendKeys("admin123");
			
			LoggerUtil.info("Sending the first name as Rohit");
			frstname.sendKeys("Rohit");
			
			LoggerUtil.info("Sending the last name as Kumar");
			lstname.sendKeys("kumar");
			
			LoggerUtil.info("Sending the email as rohit123@gmail.com");
			email.sendKeys("rohit123@gmail.com");
			
			LoggerUtil.info("Sending the phone no as 893678213");
			phnno.sendKeys("8903678213");
			
			LoggerUtil.info("Sending the Data as Telco Colony in Address Line 1 Textbox");
			add1.sendKeys("Telco colony");
			
			LoggerUtil.info("Sending the Data as House no-23 in Address line 2 Textbox");
			add2.sendKeys("House no-23");
			
			LoggerUtil.info("Sending the data as Jamshedpur in city Textbox");
			city.sendKeys("Jamshedpur");
			
			LoggerUtil.info("Sending the Data as Jharkhand in State Textbox");
			state.sendKeys("Jharkhand");
			
			LoggerUtil.info("Sending the value as 867881 in Zipcode Textbox");
			zipcode.sendKeys("867881");
			
			LoggerUtil.info("Sending the Country as India in Country Textbox");
			country.sendKeys("India");
			
			LoggerUtil.info("Clicking on submit button");
			submt.click();
			

		}

	}
		
		