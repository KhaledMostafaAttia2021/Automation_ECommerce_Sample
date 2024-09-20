package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CheckOut_Overview extends PageBase {

	public CheckOut_Overview(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		action = new Actions(driver);
	}

	@FindBy(id = "finish")
	WebElement finishBtn;

	@FindBy(id = "cancel")
	WebElement cancelBtn;

	public void CompletePurchase() {
		clickButton(finishBtn);
	}

}