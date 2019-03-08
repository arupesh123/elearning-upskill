package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.generics.ScreenShot_ELTC_002;
import com.training.generics.ScreenShot_ELTC_005;
import com.training.pom.RegistrationELTC_001;
import com.training.pom.StudentLoginELTC_002;
import com.training.pom.RegisterTeacherELTC_005;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegisterTeacherELTC_005_Test {

	private WebDriver driver;
	private String baseUrl;
	private RegisterTeacherELTC_005 RegisterTeacherELTC_005;
	private static Properties properties;
	private ScreenShot_ELTC_005 screenShot;
	
	//TO verify whether application allows user to get registered as Teacher

	@BeforeClass
	//Open the URl
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	//Open the browser
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		RegisterTeacherELTC_005 = new RegisterTeacherELTC_005(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_005(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	//The browser closes
	public void tearDown() throws Exception {
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.quit();
	}

	@Test
	public void validLoginTest() throws InterruptedException {
		
        //Click on the Sign up link
		RegisterTeacherELTC_005.clickSignUp();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the value to sendfirst name
		RegisterTeacherELTC_005.sendFirstName("Sourik");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the value to lastname 
		RegisterTeacherELTC_005.sendLastName("Mukherjee");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the value to email
		RegisterTeacherELTC_005.sendEmail("dollymuk06@gmail.com");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the value to username 
		RegisterTeacherELTC_005.senduserName("sourik55");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the value to send password
		RegisterTeacherELTC_005.sendPassword("Systane@12");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the value to send conf password
		RegisterTeacherELTC_005.sendConfPassword("Systane@12");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the value to send phone 
		RegisterTeacherELTC_005.sendPhone("9098909876");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on the category
		RegisterTeacherELTC_005.category1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//click on the category2
		RegisterTeacherELTC_005.category2();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on the Button
		RegisterTeacherELTC_005.clickbtn_Button();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on the register button.
		RegisterTeacherELTC_005.clickbtn_Register();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		RegisterTeacherELTC_005.assertion();		
		//capture the screenshot
		screenShot.captureScreenShot("ELTC_005");

	}
}
	