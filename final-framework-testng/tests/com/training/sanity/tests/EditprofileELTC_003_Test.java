package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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
import com.training.generics.ScreenShot_ELTC_003;
import com.training.pom.RegistrationELTC_001;
import com.training.pom.StudentLoginELTC_002;
import com.training.pom.EditprofileELTC_003;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class EditprofileELTC_003_Test {

	private WebDriver driver;
	private String baseUrl;
	private StudentLoginELTC_002 studentLoginELTC_002;
	private EditprofileELTC_003 editProfile;
	private ScreenShot_ELTC_003 screenShot;
	
	//To verify whether application allows user to change the password in Edit Profile page

	@BeforeClass
	//The url and browser opens up
	public void setUpBeforeClass() throws IOException {
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		studentLoginELTC_002 = new StudentLoginELTC_002(driver);
		editProfile = new EditprofileELTC_003(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_003(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

		
	@AfterClass
	// The browser closes
	public void tearDown() throws Exception {
		Thread.sleep(1000);
	driver.quit();
	}
	
	@Test(priority=1) 
	//The test is performed here and runs 1st
	public void validLoginTest() {
		studentLoginELTC_002.sendUserName("sourik50");
		studentLoginELTC_002.sendPassword("Systane@12");
		studentLoginELTC_002.clickLoginBtn();
		
		screenShot.captureScreenShot("ELTC_003_1");
	}
	
	@Test(priority=2) 
	//The test is performed here and runs 2nd
	public void validChangePassword() throws InterruptedException {
		//Click on Edit profile
		editProfile.editprofile();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Write password in text box
		editProfile.sendPassword1("Systane@12");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write send password in text box
		editProfile.sendNewPassword("Frooti@14");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write send confirm password in text box
		editProfile.sendConfPassword("Frooti@14");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on send button
		editProfile.clickbtn_Save();
		//check for assertion
		editProfile.assertion();
		//Capture screenshot
		screenShot.captureScreenShot("ELTC_003_2");
	}
}
