package com.erp22_customer_Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.erp22_utilities.baseClass;
import com.erp22_utilities.excelOperation;
import com.erp22_webPages.addNewCustomerPage;
import com.erp22_webPages.openTaskPage;
import com.erp22_webPages.projectsAndCustomersPage;

public class createCustomerTC_001 extends baseClass
{
	@Test
public void testcreateCustomerTC_001() throws EncryptedDocumentException, IOException
{
	String customerName=excelOperation.readData("Sheet2", 1,1);
openTaskPage otp=new openTaskPage();
otp.clickOnProjectsAndCustomers();
log.info("******ProjectsAndCustomers are clicked *****");
projectsAndCustomersPage pncp=new projectsAndCustomersPage();
pncp.clickOnAddNewCustomer();
log.info("******AddNewCustomer is clicked *****");
addNewCustomerPage ancp=new addNewCustomerPage();
ancp.enteCustomerName(customerName);
log.info("******CustomerName is entered *****");
ancp.clickOnCreateCustomer();
log.info("******CreateCustomerButton is clicked *****");
String s=pncp.retriveSuccessMsg();
System.out.println(s);
log.info("******SuccesssMsg is retrived *****");
excelOperation.writeData("Sheet2", 1,3, s);

}
}
