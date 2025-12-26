package com.vtiger.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorInformationPage {
	
	
	public WebDriver driver = null;
	public VendorInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Static method
	}
	
	
	    
	   @FindBy(xpath = "//input[@name='vendorname']")
	private   WebElement vendorName;
	   
	   @FindBy(xpath = "//input[@title='Save [Alt+S]']")
	  private WebElement vendorDetailsSaveBtn;

	   public WebElement getVendorName() {
		   return vendorName;
	   }

	   public WebElement getVendorDetailsSaveBtn() {
		   return vendorDetailsSaveBtn;
	   }
	   
	      public void vendorAccount(String k) {
	    	   vendorName.sendKeys(k);
	    	   vendorDetailsSaveBtn.click();
	      }
	   
	   

}