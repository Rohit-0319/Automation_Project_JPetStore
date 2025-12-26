package com.JPetStore.Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.JPetStore.Utility.LoggerUtil;
import com.JPetStore.Utility.WaitUtils;


public class FishOrderPage {
	WebDriver driver;
	WaitUtils wait;
	Properties props;
	
	//Locating the fish option from home page
	@FindBy(xpath="//*[@id=\"QuickLinks\"]/a[1]")
	WebElement clkFish;
	
	// Location g AFish Option
	@FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
	WebElement AFish;
	
	//Locating Add to carT Option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")
	WebElement AddCart;
	
	//Locating Update option
	@FindBy(xpath = "//*[@name=\"updateCartQuantities\"]")
	WebElement Update;
	
	//Locating Add to cart Option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a")
	WebElement AddCart2;
	
	//Locating Tigershark Option
	@FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
	WebElement TigerShark;
	
	//Locating Koi Option
	@FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")
	WebElement koi;
	
	//Locating GoldenFish option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a")
	WebElement GoldenFish;
	
	//Locating Return To Menu option;
	@FindBy(xpath="//*[@id=\"BackLink\"]/a")
	WebElement retrnMenu2;
	
	//Using Page factory model Here
	public FishOrderPage(WebDriver driver, Properties props) {
		this.driver=driver;
		this.props= props;
		PageFactory.initElements(driver, this);
		wait = new WaitUtils(driver);
	}

	public void AddFishToCart() {
		
			LoggerUtil.info("Testing the Fish Order Module");
			LoggerUtil.info("Clicking on Fish Option of the homepage");
			wait.waitForClick(clkFish);
			clkFish.click();
			
			LoggerUtil.info("Getting the curerent Url of the website");
			String FishCurrentUrl = driver.getCurrentUrl();
			
			LoggerUtil.info("Validating the URl of the module by using Assert");
		    Assert.assertEquals(FishCurrentUrl, props.getProperty("FishOriginalUrl"));
		    LoggerUtil.info("URL Is matched");
		    
			LoggerUtil.info("Clicking on A-FISH Option");
			AFish.click();
			
			LoggerUtil.info("Clicking on Add to cart Option");
			AddCart.click();
			
			LoggerUtil.info("Clicking on update to update the cart");
			Update.click();
			
			LoggerUtil.info("Clicking on Fish Option of the homepage");
			clkFish.click();
			
			LoggerUtil.info("Clicking on A-FISH Option");
			AFish.click();
			
			LoggerUtil.info("Clicking on Add to cart Option");
			AddCart2.click();
			
			LoggerUtil.info("Clicking on update to update the cart");
			Update.click();
			
			LoggerUtil.info("Clicking on Fish Option of the homepage");
			clkFish.click();
			
			LoggerUtil.info("Clicking on Tiger Shark Option");
			TigerShark.click();
			
			LoggerUtil.info("Clicking on Add to cart Option");
			AddCart.click();
			
			LoggerUtil.info("Clicking on update to update the cart");
			Update.click();
			
			LoggerUtil.info("Clicking on Fish Option of the homepage");
			clkFish.click();
			
			LoggerUtil.info("Clicking on KOI-FISH Option");
			koi.click();
			
			LoggerUtil.info("Clicking on Add to cart Option");
			AddCart.click();
			
			LoggerUtil.info("Clicking on update to update the cart");
			Update.click();
			
			LoggerUtil.info("Clicking on Fish Option of the homepage");
			clkFish.click();
			
			LoggerUtil.info("Clicking on KOI-FISH Option");
			koi.click();
			
			LoggerUtil.info("Clicking on Add to cart Option");
			AddCart2.click();
			
			LoggerUtil.info("Clicking on update to update the cart");
			Update.click();
			
			LoggerUtil.info("Clicking on Fish Option of the homepage");
			clkFish.click();
			
			LoggerUtil.info("Clicking on Golden FISH Option");
			GoldenFish.click();
			
			LoggerUtil.info("Clicking on Add to cart Option");
			AddCart.click();
			
			LoggerUtil.info("Clicking on update to update the cart");
			Update.click();
			
			LoggerUtil.info("Clicking on Fish Option of the homepage");
			clkFish.click();
			
			LoggerUtil.info("Clicking on Golden FISH Option");
			GoldenFish.click();
			
			LoggerUtil.info("Clicking on Add to cart Option");
			AddCart2.click();
			
			LoggerUtil.info("Clicking on update to update the cart");
			Update.click();
			
			LoggerUtil.info("Clicking on return to menu to return on home page of the website");
			retrnMenu2.click();
			
			LoggerUtil.info("Fish Order Module is completed Here");
	}
	
}
