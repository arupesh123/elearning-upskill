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
import com.training.generics.ScreenShot_ELTC_001;
import com.training.generics.ScreenShot_ELTC_002;
import com.training.pom.RegistrationELTC_001;
import com.training.pom.StudentLoginELTC_002;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

//TO verify whether application allows user to get registered as Student 

public class RegistartionELTC_001_Test {

	private WebDriver driver;
	private String baseUrl;
	private RegistrationELTC_001 LoginELTC_001_Test;
	private static Properties properties;
	private ScreenShot_ELTC_001 screenShot;

	@BeforeClass
	//Fetches the URL
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	//opens the browser
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		LoginELTC_001_Test = new RegistrationELTC_001(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_001(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	//Closes the browser
	public void tearDown() throws Exception {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.quit();
	}
    // This runs at first run
	@Test ( priority = 1)
	public void validLoginTest() throws InterruptedException {
        // Click on sign up button
		LoginELTC_001_Test.clickSignUp();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Pass the firstname in textbox
		LoginELTC_001_Test.sendFirstName("Sourik");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the lastname in textbox
		LoginELTC_001_Test.sendLastName("Mukherjee");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the email in textbox
		LoginELTC_001_Test.sendEmail("dollymuk06@gmail.com");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the username in text box
		LoginELTC_001_Test.senduserName("sourik50");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the send passowrd in text box
		LoginELTC_001_Test.sendPassword("Systane@12");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//pass the send confirm password in text box
		LoginELTC_001_Test.sendConfPassword("Systane@12");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the send phone in text box
		LoginELTC_001_Test.sendPhone("9098909876");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on button Register
		LoginELTC_001_Test.clickbtn_Register();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check for assertion
		LoginELTC_001_Test.CheckAssertion1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//LoginELTC_001_Test.ClickAssertion2();
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//check for assertion
		LoginELTC_001_Test.ClickAssertion_ELTD_062_ConfPass_Diff();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check for screenshot taken		
		screenShot.captureScreenShot("ELTC_001");

	}
}

	


