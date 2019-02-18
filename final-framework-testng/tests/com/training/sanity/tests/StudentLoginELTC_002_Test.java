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
import com.training.pom.StudentLoginELTC_002;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class StudentLoginELTC_002_Test {

	private WebDriver driver;
	private String baseUrl;
	private StudentLoginELTC_002 StudentLoginELTC_002_Test;
	private static Properties properties;
	private ScreenShot_ELTC_002 screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		StudentLoginELTC_002_Test = new StudentLoginELTC_002(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_002(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

		
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void validLoginTest() {
		StudentLoginELTC_002_Test.sendUserName("sourik50");
		StudentLoginELTC_002_Test.sendPassword("Frooti@14");
		StudentLoginELTC_002_Test.clickLoginBtn(); 
		
		boolean Expected = true;
		boolean Actual = driver.findElement(By.xpath("//*[@id=\"homepage-course\"]/div/p[1]")).isDisplayed();
		String Actual1text = driver.findElement(By.xpath("//*[@id=\"homepage-course\"]/div/p[1]")).getText();
		Assert.assertEquals(Actual, Expected);
		System.out.println(Actual1text);
		
		screenShot.captureScreenShot("ELTC_002");
	}
	
		

}
	

