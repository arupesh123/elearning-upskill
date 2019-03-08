package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.dataproviders.LoginDataProviders_complex;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RegistrationELTC_001;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginStudent_Registration_Fail__ELTC_062Test {
	private WebDriver driver;
	private String baseUrl;
	private RegistrationELTC_001 RegistrationELTC_001;
	private static Properties properties;
	private ScreenShot screenShot;
	
	//TO verify whether application displays error message upon entering invalid credentials in student registration page

	 @BeforeMethod
	//The browser launches	
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		RegistrationELTC_001 = new RegistrationELTC_001(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	
	@AfterMethod
	//The browser closes
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	//To take the data from excel
	@Test(dataProvider = "excel-inputs2", dataProviderClass = LoginDataProviders_complex.class)
	public void loginStudentRegistrationTest(String firstname, String lastname, String email, String username,
			String password, String confpassword, String phone) throws InterruptedException {
		
		//Click on sign up link
		RegistrationELTC_001.clickSignUp();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass send first name value from excel.
		RegistrationELTC_001.sendFirstName(firstname);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass send last name value from excel.
		RegistrationELTC_001.sendLastName(lastname);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass send email value from excel.
		RegistrationELTC_001.sendEmail(email);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass send user name value from excel.
		RegistrationELTC_001.senduserName(username);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass send password value from excel.
		RegistrationELTC_001.sendPassword(password);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass send conf password value from excel.
		RegistrationELTC_001.sendConfPassword(confpassword);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass send phone value from excel.
		RegistrationELTC_001.sendPhone(phone);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on button to register
		RegistrationELTC_001.clickbtn_Register();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		RegistrationELTC_001.ClickAssertion2();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		RegistrationELTC_001.ClickAssertion_ELTD_062_ConfPass_Diff();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Capture screenshot		
		screenShot.captureScreenShot("ELTD_061");

	}

}