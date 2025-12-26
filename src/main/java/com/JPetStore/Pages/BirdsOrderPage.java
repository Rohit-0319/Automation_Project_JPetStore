package com.JPetStore.Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.JPetStore.Utility.LoggerUtil;
import com.JPetStore.Utility.WaitUtils;


public class BirdsOrderPage{
	
	WebDriver driver;
	WaitUtils wait;
	Properties props;
	
	
	// Locating Bird Option
	@FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[5]/img")
	WebElement Bird;
	
	// Locating Amazon Parrot Option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
	WebElement AmznPrt;
	
	// Locating Add To Cart Option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")
	WebElement addCart;

	// Locationg Finch Option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
	WebElement Finch;

	// Locating Return to menu option
	@FindBy(xpath = "//*[@id=\"BackLink\"]/a")
	WebElement retrnMenu2;
	
	
	// Locating Update option
	@FindBy(xpath = "//*[@name=\"updateCartQuantities\"]")
	WebElement Updt;


	public BirdsOrderPage(WebDriver driver, Properties props) {
		this.driver= driver;
		this.props= props;
		PageFactory.initElements(driver, this);
		wait = new WaitUtils(driver);
	}


	
	public void AddBirdsToCart() {
		
			LoggerUtil.info("Bird Module is Starting here");

		
			LoggerUtil.info("Clicking on Birds");
			wait.waitForClick(Bird);
			Bird.click();
		
			LoggerUtil.info("Getting Current URL of the Birds website");
			String BirdCurrentUrl = driver.getCurrentUrl();
			
			
			LoggerUtil.info("Validating the URL of Birds page by using Assertion ");
			Assert.assertEquals(BirdCurrentUrl, props.getProperty("BirdsOriginalUrl"));
			
			
			LoggerUtil.info("Clicking On Amazon Parrot Link to order That");
			AmznPrt.click();
			
			
			LoggerUtil.info("Clicking on Add to cart Option");
			addCart.click();
			
			
			LoggerUtil.info("Clicking on update to update the cart");
			Updt.click();
			
			
			LoggerUtil.info("Clicking on return to menu to return on home page of the website");
			retrnMenu2.click();
			
			
			LoggerUtil.info("Again Clicking on Bird to Order");
			Bird.click();
			
			
			LoggerUtil.info("Clicking on finch Bird Option");
			Finch.click();
			
			
			LoggerUtil.info("Clicking on Add to cart Option");
			addCart.click();
			
			
			LoggerUtil.info("Clicking on update to update the cart");
			Updt.click();
			
			
			LoggerUtil.info("Clicking on return to menu to return on home page of the website");
			retrnMenu2.click();
			
			LoggerUtil.info("Bird Module is Completed Here");

		}

	}
