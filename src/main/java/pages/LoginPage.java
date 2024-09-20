package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="user-name")
	WebElement userNameTxtBox ; 

	@FindBy(id="password")
	WebElement passwordTxtBox ; 

	@FindBy(css="input.submit-button.btn_action")
	WebElement loginBtn ; 
	
	
	public void UserLogin(String user , String password) 
	{
		setTextElementText(userNameTxtBox, user);
		setTextElementText(passwordTxtBox, password);
		clickButton(loginBtn);
		
	}

}
