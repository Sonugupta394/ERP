package com.erp22_customer_Scripts;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class baseClass1 {
public static WebDriver driver;
public static Logger log ;
@Test
public void Openbrowser()
{
	
log = Logger.getLogger("baseClass");
PropertyConfigurator.configure("log4j.properties");
System.setProperty("webdriver.chrome.driver","c://drivers//chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://127.0.0.1:81/login.do");
log.info("****browser is opened*****");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
log.info("****url is opened*****");

	 
}

}
