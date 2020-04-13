package com.erp22_webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp22_utilities.baseClass;

public class addNewCustomerPage {
	@FindBy(name="name")
private WebElement enterCustomerName;

	@FindBy(name="createCustomerSubmit")
private WebElement createCustomer;
	
	public addNewCustomerPage()
	{
		PageFactory.initElements(baseClass.driver,this);
	} 
	
	public void enteCustomerName(String CustomerName)
	{
		enterCustomerName.sendKeys(CustomerName);
	}
	
	public void clickOnCreateCustomer()
	{
		createCustomer.click();
	}

}
