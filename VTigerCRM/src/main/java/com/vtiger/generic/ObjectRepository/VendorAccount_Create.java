package com.vtiger.generic.ObjectRepository;

import org.testng.annotations.Test;

import com.vtiger.crm.baseclass.BaseClass;

public class VendorAccount_Create extends BaseClass{
	   @Test
	   public void vendorAccountCraete() {
		   
		       HomePage h=new HomePage(driver);
		       h.getMoreLink().click();
		       h.getVendor().click();
		       VendorPage vp=new VendorPage(driver);
		       vp.plusbtn.click();
		       VendorInformationPage vip=new VendorInformationPage(driver);
		         vip.vendorAccount("sai111");
		         
		   
		   
		   
		   
	   }

}
