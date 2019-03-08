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

public class LoginStudent_Registration_ELTC_061Test {
	private WebDriver driver;
	private String baseUrl;
	private RegistrationELTC_001 RegistrationELTC_001;
	private static Properties properties;
	private ScreenShot screenShot;

	//TO verify whether application allows multiple users to get registered as Student 
	
	@BeforeMethod
	//The browser opens
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
	//The browser will close
	public void tearDown() throws Exception {
		driver.quit();
	}
    
	// This method will take data from excel.
	
	@Test(dataProvider = "excel-inputs1", dataProviderClass = LoginDataProviders_complex.class)
	public void loginStudentRegistrationTest(String firstname, String lastname , String email , String username
			, String password, String confpassword, String phone) throws InterruptedException {
		
		//Click on Sign up button
		RegistrationELTC_001.clickSignUp();
		//For keeping pause of script for sometime
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the firstname from excel
		RegistrationELTC_001.sendFirstName(firstname);
		//For keeping pause of script for sometime
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the lastname from excel
		RegistrationELTC_001.sendLastName(lastname);
		//For keeping pause of script for sometime
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the email value from excel
		RegistrationELTC_001.sendEmail(email);
		//For keeping pause of script for sometime
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the username from excel
		RegistrationELTC_001.senduserName(username);
		//For keeping pause of script for sometime
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the sendpassword value from excel
		RegistrationELTC_001.sendPassword(password);
		//For keeping pause of script for sometime
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the send conf password value from excel
		RegistrationELTC_001.sendConfPassword(confpassword);
		//For keeping pause of script for sometime
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Pass the send phone value from excel
		RegistrationELTC_001.sendPhone(phone);
		//For keeping pause of script for sometime
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on send button Register
		RegistrationELTC_001.clickbtn_Register();
		//For keeping pause of script for sometime
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//check for assertion
		RegistrationELTC_001.CheckAssertion1();
		//For keeping pause of script for sometime
     	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Screenshot capture
		screenShot.captureScreenShot("ELTD_061");
		

	}

}