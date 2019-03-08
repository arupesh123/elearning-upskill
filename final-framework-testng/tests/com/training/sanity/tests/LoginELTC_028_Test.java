package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.generics.ScreenShot_ELTC_001;
import com.training.generics.ScreenShot_ELTC_002;
import com.training.pom.LoginELTC_028;
import com.training.pom.StudentLoginELTC_002;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginELTC_028_Test {

	private WebDriver driver;
	private String baseUrl;
	private LoginELTC_028 LoginELTC_028_Test;
	private static Properties properties;
	private ScreenShot_ELTC_001 screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		LoginELTC_028_Test = new LoginELTC_028(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_001(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
	driver.quit();
	}

	@Test
	public void validLoginTest() throws InterruptedException {
        
		// Calling the 028_test for username 
		LoginELTC_028_Test.sendUserName("admin");
		Thread.sleep(1000);
		// Calling the 028_test for passowrd
		LoginELTC_028_Test.sendPassword("admin@123");
		Thread.sleep(1000);
		// Calling the 028_test for click on login button
		LoginELTC_028_Test.clickbtn_Login();
		Thread.sleep(1000);
		// Calling the 028_test for uclcik classes 
		LoginELTC_028_Test.clickClasses();
		Thread.sleep(1000);
		// Calling the 028_test for click sub class to course
		LoginELTC_028_Test.clickSubClassToCourse();
		Thread.sleep(1000);
		// Calling the 028_test for click on AAAA
		LoginELTC_028_Test.clickAAAAA();
		Thread.sleep(1000);
		// Calling the 028_test for click arrow row
		LoginELTC_028_Test.clickArrow();
		Thread.sleep(1000);
		// Calling the 028_test for click button subscribe
		LoginELTC_028_Test.clickbtn_Subscribeclasstocourses();
		Thread.sleep(1000);

		//Checking for assetion 
		String Expected0 = "Update successful";
		String Actualtext0 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext0,Expected0);
		System.out.println(Actualtext0);
		
		//this is for screenshot capture
		screenShot.captureScreenShot("ELTC_028");

	}
}
