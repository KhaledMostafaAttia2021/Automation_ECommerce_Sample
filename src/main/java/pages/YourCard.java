package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCard extends PageBase {
	public YourCard(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "shopping_cart_link")
	WebElement shoppingCard;

	@FindBy(xpath = "//button [@id='remove-sauce-labs-bike-light']")
	WebElement removeItem;

	@FindBy(xpath = "//button [@id='continue-shopping']")
	WebElement continueShopping;

	@FindBy(xpath = "//button [@id='checkout']")
	WebElement checkoutBtn;

	
	public void openCheckoutPage() {
		clickButton(checkoutBtn);
	}

	public void RemoveProductFromCart() {
		clickButton(removeItem);
		clickButton(continueShopping);
	}


}
