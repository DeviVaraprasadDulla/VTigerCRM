package com.vtiger.generic.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VendorInformationPage {
	
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