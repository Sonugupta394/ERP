package com.erp22_webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp22_utilities.baseClass;

public class projectsAndCustomersPage
{
@FindBy(xpath="//input[@value='Add New Customer']")
private WebElement addNewCustomer;

@FindBy(className="successmsg")
private WebElement successMsg;

@FindBy(xpath="//input[@value='Add New Project']")
private WebElement addNewProject;

public projectsAndCustomersPage()
{
PageFactory.initElements(baseClass.driver,this);	
}
public void clickOnAddNewCustomer()
{
	
	 addNewCustomer.click();
}

public void clickOnAddNewProject()
{
	addNewProject.click();
}


public String retriveSuccessMsg()
{
	String s=successMsg.getText();
	return s;
}
}

