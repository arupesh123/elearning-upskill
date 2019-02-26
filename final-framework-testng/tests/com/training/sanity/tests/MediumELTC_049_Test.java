package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.generics.ScreenShot_ELTC_002;
import com.training.pom.Mediun_ELTC_049;
import com.training.pom.StudentLoginELTC_002;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MediumELTC_049_Test {

	private WebDriver driver;
	private String baseUrl;
	private Mediun_ELTC_049 MediumELTC_049_Test;
	private static Properties properties;
	private ScreenShot_ELTC_002 screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		MediumELTC_049_Test = new Mediun_ELTC_049(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_002(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

		
	/*@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/
	
	@Test
	public void validLoginTest() throws InterruptedException {
		MediumELTC_049_Test.sendUserName("admin");
		MediumELTC_049_Test.sendPassword("admin@1234");
		MediumELTC_049_Test.clickLoginBtn(); 
		
		MediumELTC_049_Test.clickClasses(); 
		Thread.sleep(1000);
		MediumELTC_049_Test.clickaddclasses(); 
		Thread.sleep(1000);
		MediumELTC_049_Test.sendName("demo10"); 
		Thread.sleep(1000);
		MediumELTC_049_Test.sendDesc("demo4"); 
		Thread.sleep(1000);
		MediumELTC_049_Test.category1(); 
		Thread.sleep(1000);
		MediumELTC_049_Test.category2(); 
		Thread.sleep(1000);
		MediumELTC_049_Test.Add1(); 
		Thread.sleep(1000);
		MediumELTC_049_Test.subUsersToClass1(); 
		Thread.sleep(1000);
		MediumELTC_049_Test.clickMultiple(); 
		Thread.sleep(1000);
		MediumELTC_049_Test.clickArrow1();
		Thread.sleep(1000);
		MediumELTC_049_Test.ClickSubsUserToClass1();
		Thread.sleep(1000);		
		MediumELTC_049_Test.subClassToCourse1(); 
		Thread.sleep(1000);
		MediumELTC_049_Test.clickMultiple1(); 
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		screenShot.captureScreenShot("ELTC_002");
	}
	
		

}
	

