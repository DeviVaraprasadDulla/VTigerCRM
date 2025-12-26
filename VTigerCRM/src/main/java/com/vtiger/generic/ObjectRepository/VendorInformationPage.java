package com.vtiger.generic.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VendorInformationPage {
	
	   @FindBy(xpath = "//input[@name='vendorname']")
	   WebElement vendorName;
	   
	   @FindBy(xpath = "//input[@title='Save [Alt+S]']")
	   WebElement vendorDetailsSaveBtn;
	   
	   
	   
	   

}