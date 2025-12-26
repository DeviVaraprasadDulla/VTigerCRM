package com.vtiger.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPage {
	  
	
	public WebDriver driver = null;
	public VendorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Static method
	}
	
	    @FindBy(xpath = "//img[@alt='Create Vendor...']")
	    WebElement plusbtn;
	    
	    
	    
	    

}