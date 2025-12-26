package com.JPetStore.Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.JPetStore.Utility.LoggerUtil;
import com.JPetStore.Utility.WaitUtils;

public class DogOrderPage {

	WebDriver driver;
	WaitUtils wait;
	Properties props;

	// Locating The dog option in homepage
	@FindBy(xpath = "//*[@alt=\"Dogs\"]")
	WebElement DogOptions;

	// Locating the Bull DOg Option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
	WebElement Bulldog;

	// Locationg the Poofdle Dog Option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
	WebElement Poodle;

	// Locating the Dalmation dog option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")
	WebElement Dalmation;

	// Locating GoldenRetriver Option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a")
	WebElement GoldenRetriever;

	// Location the Labrador Dog option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[6]/td[1]/a")
	WebElement LabradorRetriever;

	// Locating the Chihauhua dog option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td[1]/a")
	WebElement Chihuahua;

	// Locating add to cart option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")
	WebElement addCart;

	// Locationg Update option
	@FindBy(xpath = "//*[@name=\"updateCartQuantities\"]")
	WebElement Updt;

	// Location Return to menu Option
	@FindBy(linkText = "Return to Main Menu")
	WebElement ReturnToMenu;

	// Using page Factory model
	public DogOrderPage(WebDriver driver, Properties props) {
		this.driver = driver;
		this.props = props;
		PageFactory.initElements(driver, this);
		wait = new WaitUtils(driver);
	}
	
	
	/*
	public void clickDogMenu() {
		LoggerUtil.info("Testing Dog Order Module");
		LoggerUtil.info("Clicking on Dog Option of the homepage");
		wait.waitForClick(DogOptions);
		DogOptions.click();

		LoggerUtil.info("Getting the curerent Url of the website");
		String DogsCurrentUrl = driver.getCurrentUrl();
		
		LoggerUtil.info("Validating the URl of the module by using Assert");
		Assert.assertEquals(DogsCurrentUrl, props.getProperty("DogsOriginalUrl"));
		LoggerUtil.info("URL Is matched");
		
	}
	
	
	public void addBullDog() throws InterruptedException {
		LoggerUtil.info("Clicking on Bull Dog Option");
		wait.waitForVisibility(Bulldog);
		Bulldog.click();
		LoggerUtil.info("Clicking on Add to cart Option");
		addCart.click();
		LoggerUtil.info("Clicking on update to update the cart");
		Updt.click();
		LoggerUtil.info("Clicking on return to menu to return on home page of the website");
		ReturnToMenu.click();
	}

	
	
	public void addPoodle() throws InterruptedException {
		
		LoggerUtil.info("Clicking on Poodle Dog Option");
		Poodle.click();
		LoggerUtil.info("Clicking on Add to cart Option");
		addCart.click();
		LoggerUtil.info("Clicking on update to update the cart");
		Updt.click();
		LoggerUtil.info("Clicking on return to menu to return on home page of the website");
		ReturnToMenu.click();
		
	}
	
public void addPoodle() throws InterruptedException {
		
		LoggerUtil.info("Clicking on Poodle Dog Option");
		Poodle.click();
		LoggerUtil.info("Clicking on Add to cart Option");
		addCart.click();
		LoggerUtil.info("Clicking on update to update the cart");
		Updt.click();
		LoggerUtil.info("Clicking on return to menu to return on home page of the website");
		ReturnToMenu.click();
		
	}


public void addPoodle() throws InterruptedException {
	
	LoggerUtil.info("Clicking on Poodle Dog Option");
	Poodle.click();
	LoggerUtil.info("Clicking on Add to cart Option");
	addCart.click();
	LoggerUtil.info("Clicking on update to update the cart");
	Updt.click();
	LoggerUtil.info("Clicking on return to menu to return on home page of the website");
	ReturnToMenu.click();
	
}

public void addPoodle() throws InterruptedException {
	
	LoggerUtil.info("Clicking on Poodle Dog Option");
	Poodle.click();
	LoggerUtil.info("Clicking on Add to cart Option");
	addCart.click();
	LoggerUtil.info("Clicking on update to update the cart");
	Updt.click();
	LoggerUtil.info("Clicking on return to menu to return on home page of the website");
	ReturnToMenu.click();
	
}

public void addPoodle() throws InterruptedException {
	
	LoggerUtil.info("Clicking on Poodle Dog Option");
	Poodle.click();
	LoggerUtil.info("Clicking on Add to cart Option");
	addCart.click();
	LoggerUtil.info("Clicking on update to update the cart");
	Updt.click();
	LoggerUtil.info("Clicking on return to menu to return on home page of the website");
	ReturnToMenu.click();
	
}

public void addPoodle() throws InterruptedException {
	
	LoggerUtil.info("Clicking on Poodle Dog Option");
	Poodle.click();
	LoggerUtil.info("Clicking on Add to cart Option");
	addCart.click();
	LoggerUtil.info("Clicking on update to update the cart");
	Updt.click();
	LoggerUtil.info("Clicking on return to menu to return on home page of the website");
	ReturnToMenu.click();
	
}
	*/
	
	
	public void AddDogsToCart() throws InterruptedException {

		
		LoggerUtil.info("Testing Dog Order Module");
		LoggerUtil.info("Clicking on Dog Option of the homepage");
		wait.waitForClick(DogOptions);
		DogOptions.click();

		LoggerUtil.info("Getting the curerent Url of the website");
		String DogsCurrentUrl = driver.getCurrentUrl();


		LoggerUtil.info("Validating the URl of the module by using Assert");
		Assert.assertEquals(DogsCurrentUrl, props.getProperty("DogsOriginalUrl"));
		LoggerUtil.info("URL Is matched");

		LoggerUtil.info("Clicking on Bull Dog Option");
		wait.waitForVisibility(Bulldog);
		Bulldog.click();

		LoggerUtil.info("Clicking on Add to cart Option");
		addCart.click();

		LoggerUtil.info("Clicking on update to update the cart");
		Updt.click();

		LoggerUtil.info("Clicking on return to menu to return on home page of the website");
		ReturnToMenu.click();

		LoggerUtil.info("Clicking on Dog Option of the homepage");
		DogOptions.click();

		LoggerUtil.info("Clicking on Poodle Dog Option");
		Poodle.click();

		LoggerUtil.info("Clicking on Add to cart Option");
		addCart.click();

		LoggerUtil.info("Clicking on update to update the cart");
		Updt.click();

		LoggerUtil.info("Clicking on return to menu to return on home page of the website");
		ReturnToMenu.click();

		LoggerUtil.info("Clicking on Dog Option of the homepage");
		DogOptions.click();

		LoggerUtil.info("Clicking on Dalmation Dog Option");
		Dalmation.click();

		LoggerUtil.info("Clicking on Add to cart Option");
		addCart.click();

		LoggerUtil.info("Clicking on update to update the cart");
		Updt.click();

		LoggerUtil.info("Clicking on return to menu to return on home page of the website");
		ReturnToMenu.click();

		LoggerUtil.info("Clicking on Dog Option of the homepage");
		DogOptions.click();

		LoggerUtil.info("Clicking on Golden Retreiver Dog Option");
		GoldenRetriever.click();

		LoggerUtil.info("Clicking on Add to cart Option");
		addCart.click();

		LoggerUtil.info("Clicking on update to update the cart");
		Updt.click();

		LoggerUtil.info("Clicking on return to menu to return on home page of the website");
		ReturnToMenu.click();

		LoggerUtil.info("Clicking on Dog Option of the homepage");
		DogOptions.click();

		LoggerUtil.info("Clicking on Labrador Dog Option");
		LabradorRetriever.click();

		LoggerUtil.info("Clicking on Add to cart Option");
		addCart.click();

		LoggerUtil.info("Clicking on update to update the cart");

		Updt.click();
		LoggerUtil.info("Clicking on return to menu to return on home page of the website");

		ReturnToMenu.click();
		LoggerUtil.info("Clicking on Dog Option of the homepage");

		DogOptions.click();
		LoggerUtil.info("Clicking on Chihuahua Dog Option");

		Chihuahua.click();
		LoggerUtil.info("Clicking on Add to cart Option");

		addCart.click();
		LoggerUtil.info("Clicking on update to update the cart");

		Updt.click();
		LoggerUtil.info("Clicking on return to menu to return on home page of the website");

		ReturnToMenu.click();
		LoggerUtil.info("Dog Module is completed here");

	}
	
	
	
}
