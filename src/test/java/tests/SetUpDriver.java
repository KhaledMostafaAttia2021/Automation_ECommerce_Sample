package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Helper;

public class SetUpDriver {
	protected WebDriver driver;

	@BeforeSuite
	@Parameters({ "browser" })
	public void setup() {
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void stopDriver() {
		driver.quit();
	}

	// take screenshot when test case fail and add it in the Screenshot folder
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed!");
			System.out.println("Taking Screenshot....");
			Helper.captureScreenshot(driver, result.getName());
		}
	}
}