package com.JPetStore.Pages;
 
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.JPetStore.Utility.LoggerUtil;
import com.JPetStore.Utility.WaitUtils;

public class ReptilesOrderPage {
	
	WebDriver driver;
	WaitUtils wait;
	Properties props;
 

	//Locating the Reptile option on homepage
	@FindBy(xpath="//*[@id=\"SidebarContent\"]/a[4]/img")
	WebElement clkReptile;
	
	//Locating Rattlesnake option
	@FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
	WebElement rattlesnake;
	
	//Locating add to cart option
	@FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")
	WebElement addVenomless;
	
	//Locating Update option
	@FindBy(name="updateCartQuantities")
	WebElement updtCart2;
	
	@FindBy(xpath="//*[@id=\"BackLink\"]/a")
	//Locating Returbnn to menu Option
	WebElement retrnMenu2;
	
	@FindBy(xpath="//*[@id=\"SidebarContent\"]/a[4]/img")
	//Locating reptile option
	WebElement clkReptile2;
	
	// Locating Iguana Option 
	@FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
	WebElement Iguana;
	
	//Locating add to cart option
	@FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")
	WebElement addIguana;
	
	//locating Update cart Option
	@FindBy(name="updateCartQuantities")
	WebElement updtCart;
	
	//Locating The return menu option
	@FindBy(xpath="//*[@id=\"BackLink\"]/a")
	WebElement retrnMenu;

	//Using the page factory model
	public ReptilesOrderPage(WebDriver driver, Properties props) {
		this.driver=driver;
		this.props= props;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void AddReptilesToCart() {
		LoggerUtil.info("Testing the reptiles order module");
		LoggerUtil.info("Clicking on Reptile option");
		clkReptile.click();
		
		LoggerUtil.info("Clicking on return to menu to return on home page of the website");
		String ReptilesCurrentUrl = driver.getCurrentUrl();  
		
		LoggerUtil.info("Validating the URl of the module by using Assert");
		Assert.assertEquals(ReptilesCurrentUrl, props.getProperty("ReptilesOriginalUrl")); 
		
		LoggerUtil.info("URL Is matched");
		LoggerUtil.info("Clicking on Rattle snake Option");                                                                                
		rattlesnake.click();
		
		LoggerUtil.info("Clicking on Add to cart Option");
		addVenomless.click();
		
		LoggerUtil.info("Clicking on update to update the cart");
		updtCart2.click();
		
		retrnMenu2.click();
		
		clkReptile2.click();
		
		LoggerUtil.info("Clicking on Igguana Option");        
		Iguana.click();
		
		LoggerUtil.info("Clicking on Add to cart Option");
		addIguana.click();
		
		LoggerUtil.info("Clicking on update to update the cart");
		updtCart.click();
		LoggerUtil.info("Clicking on return to menu to return on home page of the website");
		retrnMenu.click();
		LoggerUtil.info("Reptiles order Module is complete here");
	}


}


