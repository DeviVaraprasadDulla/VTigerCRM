package com.vtiger.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vendor_InformationValidationPage {
	public WebDriver driver = null;
	public Vendor_InformationValidationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Static method
	}
	
	     @FindBy(className = "lvtHeaderText")
	     WebElement title;
	      
	      
	     

}