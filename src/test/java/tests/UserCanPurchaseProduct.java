package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckOut_Overview;
import pages.CheckoutInfo;
import pages.LoginPage;
import pages.Products;
import pages.YourCard;

public class UserCanPurchaseProduct extends SetUpDriver {

	LoginPage loginObject;

	String LoginUser = "standard_user";
	String LoginPass = "secret_sauce";

	Products productsPage;
	YourCard cartPage;
	CheckoutInfo checkoutObject;
	CheckOut_Overview checkOutComplete;

	// Test Case to verify user is able to login Successfully
	@Test(priority = 1)
	public void UserCanLoginSuccessfully() throws InterruptedException {
		loginObject = new LoginPage(driver);
		productsPage = new Products(driver);

		loginObject.UserLogin(LoginUser, LoginPass);

		Thread.sleep(1000);

		WebElement Product = driver.findElement(By.xpath(
				"//button[@id='add-to-cart-sauce-labs-bike-light' and @name='add-to-cart-sauce-labs-bike-light']"));
		assertTrue(Product.isDisplayed());

	}

	// Test Case to verify user is able to Purchase Product
	@Test(priority = 2)
	public void UserCanAddProductToShoppingCart() throws InterruptedException {

		productsPage = new Products(driver);
		productsPage.AddProduct1();
		Thread.sleep(1000);

		driver.navigate().to("https://www.saucedemo.com" + "/cart.html");

		cartPage = new YourCard(driver);
		cartPage.openCheckoutPage();

		checkoutObject = new CheckoutInfo(driver);
		checkoutObject.BillingDetails("Khaled", "Mostafa", "12345");

		checkOutComplete = new CheckOut_Overview(driver);
		checkOutComplete.CompletePurchase();

		WebElement Successfull_Message = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));

		assertEquals(Successfull_Message.getText(), "Thank you for your order!");

	}

}
