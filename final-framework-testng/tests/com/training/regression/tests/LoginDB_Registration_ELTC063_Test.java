package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.dataproviders.LoginDataProviders_Registration_ELTC063;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RegistrationELTC_001;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginDB_Registration_ELTC063_Test {
	private WebDriver driver;
	private String baseUrl;
	//private LoginPOM loginPOM;
	private RegistrationELTC_001 Registration;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	//TO verify whether registered student details get stored in database
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Registration = new RegistrationELTC_001(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}


	@Test
	
	(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders_Registration_ELTC063.class)
	public void loginDBTest(String First_name, String last_name , String Email , String Username, String Pass, String Confirm_password) throws InterruptedException {  // came from database
		// for demonstration 
//		genericMethods.getElement("login", "id"); 
		
		//For click on registration
		Registration.clickSignUp();
		//Retrieve data from application
		String FIRSTNAME = Registration.sendFirstName("xyz2");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Retrieve data from application
		String LASTNAME =  Registration.sendLastName("xyz2"); 
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Retrieve data from application
		String EMAIL = Registration.sendEmail("xyz2@gmail.com");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Retrieve data from application
		String USERNAME = Registration.senduserName("xyz2");
		//Retrieve data from application
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Retrieve data from application
		String PASSWORD = Registration.sendPassword("xyz2");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Retrieve data from application
		String CONFPASSWORD = Registration.sendConfPassword("xyz2");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Register button	
		Registration.clickbtn_Register();
		
		//Check for assertion
				Assert.assertEquals(First_name, FIRSTNAME);
				Assert.assertEquals(last_name, LASTNAME);
				Assert.assertEquals(Email, EMAIL);
				Assert.assertEquals(Username, USERNAME);
				Assert.assertEquals(Pass, PASSWORD);
				Assert.assertEquals(Confirm_password, CONFPASSWORD);
		
		
		//Print data from Database
		System.out.println("Database Firstname :  " + First_name);
		//Print data from Database
		System.out.println("Database lastname :  " + last_name);
		//Print data from Database
		System.out.println("Database Email :  " + Email);
		//Print data from Database
		System.out.println("Database Username :  " + Username);
		//Print data from Database
		System.out.println("Database Password :  " + Pass);
		//Print data from Database
		System.out.println("Database Confirm Password :  " + Confirm_password);
		
			
		System.out.println("======================================================");
		
		//Print data from Application
		System.out.println("Application Firstname :  " + FIRSTNAME);
		//Print data from Application
		System.out.println("Application lastname :  " + LASTNAME);
		//Print data from Application
		System.out.println("Application Email :  " + EMAIL);
		//Print data from Application
		System.out.println("Application Username :  " + USERNAME);
		System.out.println("Application Password :  " + PASSWORD);
		//Print data from Application
		System.out.println("Application Confirm Password :  " + CONFPASSWORD);
		
		
				 
		//Capture screen shot
		screenShot.captureScreenShot("ELTC_063");

	}

}