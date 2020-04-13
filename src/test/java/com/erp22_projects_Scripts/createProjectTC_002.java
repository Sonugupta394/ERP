package com.erp22_projects_Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.erp22_utilities.baseClass;
import com.erp22_utilities.excelOperation;
import com.erp22_webPages.addNewProjectPage;
import com.erp22_webPages.openTaskPage;
import com.erp22_webPages.projectsAndCustomersPage;

public class createProjectTC_002 extends baseClass
{
	@Test
public void testcreateproject() throws EncryptedDocumentException, IOException
{
	String customerName=excelOperation.readData("Sheet2", 1,1);
	String projectName=excelOperation.readData("Sheet2", 1,2);
	openTaskPage otp=new openTaskPage();
	otp.clickOnProjectsAndCustomers();
	log.info("******ProjectsAndCustomersLink is clicked *****");
	projectsAndCustomersPage pncp=new projectsAndCustomersPage();
	pncp.clickOnAddNewProject();
	log.info("******AddNewProject is clicked *****");
	addNewProjectPage anpp=new addNewProjectPage();
	anpp.selectCustomerName(customerName);
	log.info("******CustomerName is selected *****");
	anpp.enterProjectName(projectName);
	log.info("******ProjectName is entered *****");
	anpp.clickOnCreateProject();
	log.info("******CreateProjectButon is clicked *****");
	String pMsg=pncp.retriveSuccessMsg();
	System.out.println(pMsg);
	log.info("******Successful is retrived *****");
	excelOperation.writeData("Sheet2",1,4, pMsg);
	
}
}
