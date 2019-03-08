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
import com.training.pom.TeacherAssignmentsELTC_034;
import com.training.pom.RegisterTeacherELTC_005;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TeacherAssignmentsLTC_034_Test {

	private WebDriver driver;
	private String baseUrl;
	private StudentLoginELTC_002 StudentLoginELTC_002;
	private TeacherAssignmentsELTC_034 assigncreation;
	private static Properties properties;
	private ScreenShot_ELTC_001 screenShot;
	
	//To Verify whether application allows teacher to add assignments & change default settings

	@BeforeClass
	//browser will open
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		StudentLoginELTC_002 = new StudentLoginELTC_002(driver);
		assigncreation = new TeacherAssignmentsELTC_034(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_001(driver);
    	driver.get(baseUrl);
		
	}

	
	  @AfterClass 
	  //browser will close
	  public void tearDown() throws Exception { driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  driver.quit(); }
	 

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

		
		//Click on the Click course link
		assigncreation.clickCourse();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Assignments
		assigncreation.clickAssignments1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Create Assignments
		assigncreation.clickCreateAssignment1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write in send Assignments text
		assigncreation.sendAssignNameText("IBM11");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//click on frame1
		assigncreation.FrameDesc();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Add text in frame1
		assigncreation.sendAddFrameDescText("Exercise");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Come out of frame
		assigncreation.FrameDesce2out();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//click on Advance Setting
		assigncreation.Adv_Setting1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write in some data for send max score
		assigncreation.SendMaxScore("50");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//click on Validate button
		assigncreation.Validate1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check for assertion text
		assigncreation.assertiontext();
		//Capture screenshot
		screenShot.captureScreenShot("ELTC_034_Directory Created1");
		// Click on Check box
		assigncreation.checkBox1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Assign Settings
		assigncreation.AssigSettings1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on radio button
		assigncreation.radioButtons1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//click on save button
		assigncreation.Save1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check for assertions
		assigncreation.assertiontext1();
		//Caprture screenshots
		screenShot.captureScreenShot("ELTC_034_Saved1");

	}
}
