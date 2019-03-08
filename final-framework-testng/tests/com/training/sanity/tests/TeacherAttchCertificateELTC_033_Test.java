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
import com.training.generics.ScreenShot_ELTC_001;
import com.training.generics.ScreenShot_ELTC_002;
import com.training.generics.ScreenShot_ELTC_005;
import com.training.pom.RegistrationELTC_001;
import com.training.pom.TeacherTestCreationELTC_032;
import com.training.pom.StudentLoginELTC_002;
import com.training.pom.TeacherAttachCertificateELTC_033;
import com.training.pom.RegisterTeacherELTC_005;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TeacherAttchCertificateELTC_033_Test {

	private WebDriver driver;
	private String baseUrl;
	private StudentLoginELTC_002 StudentLoginELTC_002;
	private TeacherAttachCertificateELTC_033 attachcreation;
	private static Properties properties;
	private ScreenShot_ELTC_001 screenShot;
	
	//TO verify whether application allows teacher to add assessment as online activity & Attach certificate

	@BeforeClass
	//Open the browser
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		StudentLoginELTC_002 = new StudentLoginELTC_002(driver);
		attachcreation = new TeacherAttachCertificateELTC_033(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_001(driver);
		driver.get(baseUrl);
	}

	@AfterClass
	//Closes the browser
	public void tearDown() throws Exception {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.quit();
	}

	@Test(priority = 1)
	//This test will run first
	public void validLoginTest() throws InterruptedException {

		StudentLoginELTC_002.sendUserName("sourik54");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		StudentLoginELTC_002.sendPassword("Systane@12");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		StudentLoginELTC_002.clickLoginBtn();

	}

	@Test(priority = 2)
	
	//This test will run second

	public void validCoursecreation() throws InterruptedException {
        
		//Click on the course link
		attachcreation.clickCourse();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on the Assessment button
		attachcreation.clickAssessment();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Add icon Line Activity
		attachcreation.clickAddonLineActivity();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Dropdown
		attachcreation.category1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Slecet value from dropdown
		attachcreation.category2();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write values in Send Weight Text
		attachcreation.sendWeightText("1");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on button Learning activity
		attachcreation.btn_LearningActivity();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check for assert
		attachcreation.clickAssertionLinkAdd();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Capture screenshots
		screenShot.captureScreenShot("ELTC_033_Link Added");
        //Click on the chekbox  
		attachcreation.checkbox();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on the edit Icon
		attachcreation.clickEdit();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Edit link button
		attachcreation.clickEditLink();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check for assert
		attachcreation.clickAssertionEdit();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        //Capture screenshot
		screenShot.captureScreenShot("ELTC_033_Assessment Edited");
        //Click for attaching cert
		attachcreation.clickAttachCert();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check for assertion
		attachcreation.clickAssertionAttach();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Capture screenshot
		screenShot.captureScreenShot("ELTC_033_Default Certificate");

	}
}