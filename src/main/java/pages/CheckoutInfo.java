package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutInfo extends PageBase {
	public CheckoutInfo(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input [@id='first-name']")
	private WebElement firstNameTxt;

	@FindBy(xpath = "//input [@id='last-name']")
	private WebElement lastNameTxt;

	@FindBy(xpath = "//input [@id='postal-code']")
	private WebElement zipPostalCodeTxt;

	@FindBy(xpath = "//input [@id='continue']")
	private WebElement continueBtn;

	@FindBy(xpath = "//button[@id='cancel']")
	private WebElement cancelBtn;

	public void BillingDetails(String fName, String lName, String postcode) throws InterruptedException {

		setTextElementText(firstNameTxt, fName);
		setTextElementText(lastNameTxt, lName);
		setTextElementText(zipPostalCodeTxt, postcode);
		clickButton(continueBtn);
		Thread.sleep(1000);
	}

}