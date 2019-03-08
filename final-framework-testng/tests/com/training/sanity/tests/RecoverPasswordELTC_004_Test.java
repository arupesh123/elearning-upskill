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
import com.training.generics.ScreenShot_ELTC_004;
import com.training.pom.RecoverPasswordELTC_004;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


//TO verify whether application allows student to recover password in I lost my password page


public class RecoverPasswordELTC_004_Test {

	private WebDriver driver;
	private String baseUrl;
	private RecoverPasswordELTC_004 RecoverPasswordELTC_004;
	private static Properties properties;
	private ScreenShot_ELTC_004 screenShot;

	@BeforeClass
	//The URL opens here
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	//The browser opens here
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		RecoverPasswordELTC_004 = new RecoverPasswordELTC_004(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_004(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	//The browser closes
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test
	//The test is performed
	public void validLoginTest() throws InterruptedException {
        
		//Click on the Sign up button
		RecoverPasswordELTC_004.clickSignUp();
		Thread.sleep(1000);
		//Pass the username value to text box
		RecoverPasswordELTC_004.sendUserName("dollymuk06@gmail.com");
		//Clickm on send message button
		RecoverPasswordELTC_004.clickbtn_SendMessage();
		Thread.sleep(1000);
        //capture the screenshot
		screenShot.captureScreenShot("ELTC_004");

	}
}
