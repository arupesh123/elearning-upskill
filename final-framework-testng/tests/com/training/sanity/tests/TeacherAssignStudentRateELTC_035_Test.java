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
import com.training.pom.TeacherAssignStudentRateELTC_035;
import com.training.pom.TeacherAssignmentsELTC_034;
import com.training.pom.RegisterTeacherELTC_005;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TeacherAssignStudentRateELTC_035_Test {

	private WebDriver driver;
	private String baseUrl;
	private StudentLoginELTC_002 StudentLoginELTC_002;
	private TeacherAssignStudentRateELTC_035 studentandrate;
	private static Properties properties;
	private ScreenShot_ELTC_001 screenShot;
	
	//TO verify whether application allows teacher to review the assignment submitted by the student & rate
	

	@BeforeClass	
	//Opens the browser
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		StudentLoginELTC_002 = new StudentLoginELTC_002(driver);
		studentandrate = new TeacherAssignStudentRateELTC_035(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_001(driver);
		driver.get(baseUrl);

	}

	@AfterClass
	//closes the browser
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

		//Click on Course link
		studentandrate.clickCourse();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Assignments link
		studentandrate.clickAssignments1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Assisgnments
		studentandrate.clickAssignSub1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
       //capture screenshot
		screenShot.captureScreenShot("ELTC_035_hands on exercise");
       //Click on Correction Rate
		studentandrate.clickCorrectnRate1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Send Score
		studentandrate.sendScore1("50");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on button
		studentandrate.clickbutton1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check for assertions
		studentandrate.ClickAssertion1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        //capture screenshots
		screenShot.captureScreenShot("ELTC_035_UpdateMessage");
       //Click on Name Assignmnet link
		studentandrate.clicknameAssignLink1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on click on Assertion rev		
		studentandrate.ClickAssertionRev();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        //Capture the screenshot
		screenShot.captureScreenShot("ELTC_035_Revised");

	}
}