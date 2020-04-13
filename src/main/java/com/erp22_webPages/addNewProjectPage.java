package com.erp22_webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.erp22_utilities.baseClass;

public class addNewProjectPage {
	@FindBy(name="customerId")
private WebElement selectCustomerName;

	@FindBy(name="name")
private WebElement enterProjectName;

	@FindBy(name="createProjectSubmit")
private WebElement createProjct;

	public addNewProjectPage()
	{
		PageFactory.initElements(baseClass.driver,this);
	}
	
	public void selectCustomerName(String customerName)
	{
		Select s1=new Select(selectCustomerName);
		s1.selectByVisibleText(customerName);
	}
	
	public void enterProjectName(String projectName)
	{
		enterProjectName.sendKeys(projectName);
	}
	
	public void clickOnCreateProject()
	{
		createProjct.click();
	}
}
