package com.erp22_tasks_Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.erp22_utilities.baseClass;
import com.erp22_utilities.excelOperation;
import com.erp22_webPages.addNewTasksPage;
import com.erp22_webPages.openTaskPage;

public class createTasksTC_003 extends baseClass
{
	@Test
public void testCreateTasks() throws EncryptedDocumentException, IOException
{
		String customerName=excelOperation.readData("Sheet2", 1,1);
		log.info("*****Fetch the customer Name from excelSheet*****");
		String projectName=excelOperation.readData("Sheet2", 1, 2);
		log.info("*****Fetch the Project Name from excelSheet*****");
		openTaskPage otp=new openTaskPage();
		otp.clickOnAddNewTasks();
				log.info("*****AddNewTask is Clicked*****");
	addNewTasksPage antp=new addNewTasksPage();
	antp.selectCustomer(customerName);
	log.info("***** customer Name is selected******");
	 antp.selectProject(projectName);
	 log.info("***** project name is selected******");

	//antp.selectProject("-- new project --");
//	antp.enterNewProjectName(projectName);
		
	
	
	antp.entertasksNameIntextField("done");
	log.info("*****task Status is entered*****");
	antp.billingType("Billable");
	log.info("*****billing type is selected******");
	antp.clickCreateTasks();
	log.info("*****create task button is clicked*****");
	String s=otp.retriveSuccessMsg();
	System.out.println(s);
	log.info("*****SuccessMsg is retrived******");
	excelOperation.writeData("Sheet2",1,5,s);
	
}
}


