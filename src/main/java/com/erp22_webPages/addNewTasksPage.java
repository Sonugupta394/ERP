package com.erp22_webPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.erp22_utilities.baseClass;

public class addNewTasksPage {
	
	@FindBy(name="customerId")
private WebElement selectCustomer;

	@FindBy(name="projectId")
private WebElement  selectProject;
	
	@FindBy(name="projectName")
	private WebElement enterProjectName;

	@FindBy(name="task[0].name")
private WebElement enterTasksName;


	@FindBy(name="task[0].billingType")
private WebElement billingType;

	@FindBy(xpath="//input[@value='Create Tasks']")
private WebElement createTasks;
	
	public addNewTasksPage()
	{
		PageFactory.initElements(baseClass.driver,this);
	}
	public void selectCustomer(String customerName)
	{
		WebElement w1 = selectCustomer;
		Select s1=new Select(w1);
		s1.selectByVisibleText(customerName); 
		 
	}
	
	public void selectProject(String projectName)
	{
		WebElement w2 = selectProject;
		Select s2=new Select(w2);
		s2.selectByVisibleText(projectName);		
	}
	
	public void enterNewProjectName(String projectName)
	{
		enterProjectName.sendKeys(projectName);
	}
	public void entertasksNameIntextField(String taskName)
	{
		enterTasksName.sendKeys(taskName);		
	}
	
	public void billingType(String billingTypes)
	{
		WebElement w3 = billingType;
		Select s3=new Select(w3);
		s3.selectByVisibleText(billingTypes);
	}
	public void clickCreateTasks()
	{
		createTasks.click();
	}
	
	
}
