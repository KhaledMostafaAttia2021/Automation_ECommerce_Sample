package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Products extends PageBase {

	public Products(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement addItem1;



	public void AddProduct1() throws InterruptedException {

		clickButton(addItem1);
		Thread.sleep(1000);

	}

}
