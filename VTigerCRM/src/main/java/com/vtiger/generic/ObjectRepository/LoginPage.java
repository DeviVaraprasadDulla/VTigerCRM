package com.vtiger.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.crm.generic.webDriverUtility.WebDriverUtility;

/**
 * 
 */
public class LoginPage {

	public WebDriver driver = null;
	WebDriverUtility wlib = new WebDriverUtility();

	@FindBy(name = "user_name")
	private WebElement userNameField;

	@FindBy(name = "user_password")
	private WebElement PasswordField;

	@FindBy(id = "submitButton")
	private WebElement loginButton;



//	constructor to initialize the WebElement
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Static method
	}

	// Getter method for single WebElement
	public WebElement getUserNameField() {
		return userNameField;
	}

	public WebElement getUserPasswordField() {
		return PasswordField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}


	public void loginAction(String userName, String password,String url) {
		
		driver.get(url);
		wlib.waitForPageToLoad(driver);
		userNameField.sendKeys(userName);
		PasswordField.sendKeys(password);
		loginButton.click();

	}
}
