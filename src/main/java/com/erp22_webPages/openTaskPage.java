package com.erp22_webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp22_utilities.baseClass;

public class openTaskPage {
	@FindBy(linkText="Projects & Customers")
private WebElement projectsAndCutomers;
	
	@FindBy(xpath="//input[@value='Add New Tasks']")
	private WebElement addNewTasks;
	
	@FindBy(className="successmsg")
	private WebElement successMsg;

	public openTaskPage()
	{
		PageFactory.initElements(baseClass.driver,this);
	}
	
	public void clickOnProjectsAndCustomers()
	{
		projectsAndCutomers.click();
	}
	
	public void clickOnAddNewTasks()
	{
		addNewTasks.click();
	}
	
	public  String retriveSuccessMsg()
	{
		String s=successMsg.getText();
		return s;
	}
	
}
