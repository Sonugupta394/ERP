package com.erp22_utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


import com.erp22_utilities.baseClass;


public class baseClass {
	public static WebDriver driver;
	FileInputStream fis;
	Properties p1;
	public static Logger log;
	@BeforeTest
	public void openBrowser() throws IOException
	{
		log=Logger.getLogger(baseClass.class);
		PropertyConfigurator.configure("log4j.properties");
		
		fis=new FileInputStream(System.getProperty("user.dir")+"//App.properties");
		p1=new Properties();
		p1.load(fis);
		
		String browser="chrome";
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();	
			log.info("******Chrome Browser lunched******");
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
			log.info("******Firefox Browser lunched******");
		}
		else
		{
			System.out.println("browser is invalid");
			log.info("****** Browser is invalid******");
		}
	}
	@AfterTest
	public void browserClose()
	{
		driver.close();
		log.info("******Browser is Closed******");
	}
	@BeforeClass
	public void login()
	{
		driver.get(p1.getProperty("URL"));
		log.info("******URL is entered******");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(p1.getProperty("username"));
		
		driver.findElement(By.name("pwd")).sendKeys(p1.getProperty("password"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		log.info("******Login successfully******");
		
	}
	@AfterClass
	public void logout()
	{
		driver.findElement(By.className("logoutImg")).click();
		log.info("******LogOut Successfully******");
	}

}
