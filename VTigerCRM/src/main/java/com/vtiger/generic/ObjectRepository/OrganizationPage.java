package com.vtiger.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	WebDriver driver;
	public OrganizationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement newOrganizationCreatingLink;

	@FindBy(name = "search_text")
	private WebElement OrganizationSearchInput;
	
	@FindBy(name = "search_field")
	private WebElement OrganizationSearchType;
	
	@FindBy(name = "submit")
	private WebElement searchBtn;
	
	
	public WebElement getSearchInput() {
		return OrganizationSearchInput;
	}


	public WebElement getSearchType() {
		return OrganizationSearchType;
	}


	public WebElement getSearchBtn() {
		return searchBtn;
	}


	public WebElement getNewOrgLink() {
		return newOrganizationCreatingLink;
	}
}
