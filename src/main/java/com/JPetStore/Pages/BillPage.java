package com.JPetStore.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillPage {
	// Locating Cart option of the website
	@FindBy(xpath = "//*[@id=\"MenuContent\"]/a[1]")
	WebElement Cart;
	// Locating proceed to checkout option
	@FindBy(xpath = "//*[@id=\"Cart\"]/a")
	WebElement proceedtoCheckout;
	// Locating Continue option
	@FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
	WebElement Continue;
	// Locating COnfirm Button
	@FindBy(xpath = "//*[@id=\"Catalog\"]/a")
	WebElement confirm;
	// Locating SubmitText
	@FindBy(xpath = "//*[@id=\"Content\"]/ul/li")
	WebElement submitText;
	// Locating returnMenu option
	@FindBy(xpath = "//*[@id=\"BackLink\"]/a")
	WebElement retrnMenu2;
	// Locating my account option in homepage
	@FindBy(xpath = "//*[@id=\"MenuContent\"]/a[3]")
	WebElement MyAcc;

	// Locating My orders
	@FindBy(xpath = "//*[@id=\"Catalog\"]/a")
	WebElement orders;

	// Using Page factory Model for calling Driver
	public BillPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Bill() {
		// Clicking on cart
		Cart.click();
		// Clicking on proceed to checkout
		proceedtoCheckout.click();
		// Clicking on Continue option
		Continue.click();
		// Clicking On COnfirm option
		confirm.click();
		// Checking whther the SUbmit text is present or not!
		submitText.isDisplayed();
		// Printing the present submit text
		System.out.println(submitText.getText());
		// Clicking on return menu
		retrnMenu2.click();
		// Clicking on my account
		MyAcc.click();
		// Clicking on orders to see order
		orders.click();

	}

}
