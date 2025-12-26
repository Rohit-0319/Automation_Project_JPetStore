package com.JPetStore.Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.JPetStore.Utility.LoggerUtil;
import com.JPetStore.Utility.WaitUtils;

public class CatOrderPage {
	
	WebDriver driver;
	WaitUtils wait;
	Properties props;
	
	
	// Locating Cat option
	@FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]")
	WebElement ClkCat;
	
	
	// Locating Manx Cat option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
	WebElement Manx;
	
	
	// Locating Persian cat Option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
	WebElement Persian;
	
	
	// Locating Add to cart Option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")
	WebElement AddCart1;
	
	
	// Locating Add to cart Option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a")
	WebElement addCart2;
	
	
	// locating Update option to update cart
	@FindBy(xpath = "//*[@name=\"updateCartQuantities\"]")
	WebElement Updt;
	
	
	// Locating return to menu option
	@FindBy(xpath = "//*[@id=\"BackLink\"]/a")
	WebElement Return;
	

	public CatOrderPage(WebDriver driver, Properties props) {
		this.driver= driver;
		this.props=props;
		PageFactory.initElements(driver, this);
		wait = new WaitUtils(driver);
	}
	
	
	

	public void AddCatsToCart() {
	
		
		//et.log(Status.INFO, "Testing the Cat Order Module");
		LoggerUtil.info("Testing Cat Order Module");
		LoggerUtil.info("Clicking on cat Option");
		wait.waitForClick(ClkCat);
		ClkCat.click();
		
		
		LoggerUtil.info("Getting the curerent Url of the website");
		String CatsCurrentUrl = driver.getCurrentUrl();
		
		
		//LoggerUtil.info("Original Url of the module");
		//String OrgUrl ="https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
		
		
		 LoggerUtil.info("Validating the URl of the module by using Assert" );
	    Assert.assertEquals(CatsCurrentUrl, props.getProperty("CatsOriginalUrl"));
	    LoggerUtil.info("URL Is matched");
	    
	    
	    LoggerUtil.info("Clicking on Manx Cat Option");
		Manx.click();
		
		
		LoggerUtil.info("Clicking on Add to cart Option");
		AddCart1.click();
		
		
		LoggerUtil.info("Clicking on update to update the cart");
		Updt.click();
		
		
		LoggerUtil.info("Clicking on cat Option");
		ClkCat.click();
		
		
	    LoggerUtil.info("Clicking on Manx Cat Option");
		Manx.click();
		
		
		LoggerUtil.info("Clicking on Add to cart Option");
		addCart2.click();
		
		
		LoggerUtil.info("Clicking on update to update the cart");
		Updt.click();
		
		
		LoggerUtil.info("Clicking on cat Option");
		ClkCat.click();
		
		
		LoggerUtil.info("Clicking on Persian Cat Option");
		Persian.click();
		
		
		LoggerUtil.info("Clicking on Add to cart Option");
		AddCart1.click();
		
		
		LoggerUtil.info("Clicking on update to update the cart");
		Updt.click();
		
		
		LoggerUtil.info("Clicking on cat Option");
		ClkCat.click();
		
		
		LoggerUtil.info("Clicking on Persian Cat Option");
		Persian.click();
		
		
		LoggerUtil.info("Clicking on Add to cart Option");
		addCart2.click();
		
		
		LoggerUtil.info("Clicking on update to update the cart");
		Updt.click();
		
		
		LoggerUtil.info("Clicking on return to menu to return on home page of the website");
		Return.click();
		
		
		LoggerUtil.info("Cat Module is completed Here");	
	}
	
}