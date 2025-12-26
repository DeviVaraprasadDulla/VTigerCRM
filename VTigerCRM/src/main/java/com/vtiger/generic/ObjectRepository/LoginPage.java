package com.vtiger.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Venkatesh
 */
public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	private WebElement usernameEdit;
	
	@FindBy(name="user_password")
	private WebElement passwordEdit;
	
	@FindBy(id="submitButton")
	private WebElement submitButton;
	
	public WebElement getUsernameEdit() {
		return usernameEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 */
	public void loginTOApp(String username , String password) {
		driver.manage().window().maximize();
		usernameEdit.sendKeys(username);
		passwordEdit.sendKeys(password);
		submitButton.click();
	}
}
