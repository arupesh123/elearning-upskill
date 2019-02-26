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

	@BeforeClass
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
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test(priority = 1)
	public void validLoginTest() throws InterruptedException {

		StudentLoginELTC_002.sendUserName("sourik54");
		Thread.sleep(1000);
		StudentLoginELTC_002.sendPassword("Systane@12");
		Thread.sleep(1000);
		StudentLoginELTC_002.clickLoginBtn();

	}

	@Test(priority = 2)

	public void validCoursecreation() throws InterruptedException {

		studentandrate.clickCourse();
		Thread.sleep(1000);
		studentandrate.clickAssignments1();
		Thread.sleep(1000);
		studentandrate.clickAssignSub1();
		Thread.sleep(1000);

		screenShot.captureScreenShot("ELTC_035_hands on exercise");

		studentandrate.clickCorrectnRate1();
		Thread.sleep(1000);
		studentandrate.sendScore1("50");
		Thread.sleep(1000);
		studentandrate.clickbutton1();
		Thread.sleep(1000);
		
		studentandrate.ClickAssertion1();
		Thread.sleep(1000);

		screenShot.captureScreenShot("ELTC_035_UpdateMessage");

		studentandrate.clicknameAssignLink1();
		Thread.sleep(1000);
				
		studentandrate.ClickAssertionRev();
		Thread.sleep(1000);

		screenShot.captureScreenShot("ELTC_035_Revised");

	}
}