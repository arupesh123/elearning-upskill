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
import com.training.pom.TeacherAddCourseELTC_031;
import com.training.pom.StudentLoginELTC_002;
import com.training.pom.RegisterTeacherELTC_005;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TeacherAddCourseELTC_031_Test {

	private WebDriver driver;
	private String baseUrl;
	private StudentLoginELTC_002 StudentLoginELTC_002;
	private TeacherAddCourseELTC_031 coursercreation;
	private static Properties properties;
	private ScreenShot_ELTC_001 screenShot;
	
	//To verify whether application allows teacher to create a course, add description, objective & Topics

	@BeforeClass
	
	// Chrome driver will open
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		StudentLoginELTC_002 = new StudentLoginELTC_002(driver);
		coursercreation = new TeacherAddCourseELTC_031(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_001(driver);
		driver.get(baseUrl);
	}

	@AfterClass
	
	// The instance will get closed
	public void tearDown() throws Exception {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.quit();
	}

	@Test(priority = 1)
	
	// This Test will run first
	public void validLoginTest() throws InterruptedException {
        
		
		// Give username
		StudentLoginELTC_002.sendUserName("sourik54");
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    //Give Password
	  	StudentLoginELTC_002.sendPassword("Systane@12");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Login Button
		StudentLoginELTC_002.clickLoginBtn();

	}

	@Test(priority = 2)
	
	//This test will run second

	public void validCoursecreation() throws InterruptedException {
         
		//Click on Course Link
		coursercreation.clickCourse();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Click on Course creation
		coursercreation.sendCourseName("Kolkata11");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Advance Setting
		coursercreation.clickAdvSetting();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Dropdown arrow
		coursercreation.category1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Choose the desired from dropdown
		coursercreation.category2();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Pass values in Course code
		coursercreation.sendCourseCode("Test11");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Click on Course Submit button
		coursercreation.AddCourseSubmit();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Add Intro button
		coursercreation.AddIntro();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);		
		//Click on the frame
		coursercreation.Frame();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write Selenium in frame
		coursercreation.Frame1("This is Selenium");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Come out of frame
		coursercreation.Frame2();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click Save to text button
		coursercreation.clickSaveToText();
        //Click on Assert
		coursercreation.clickAssertion121();
		//Capturing assest screenshots
		screenShot.captureScreenShot("ELTC_031_Intro was updated");
		screenShot.captureScreenShot("ELTC_031_This is Selenium");
		//Click on Course Description
		coursercreation.courseDescrpIcon();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Description
		coursercreation.DescrpIcon();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Selenium Desc Title
		coursercreation.sendDescpTitle("Selenium Description Title");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Click on the frame
		coursercreation.DescpContentFrame();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write comments in frame
		coursercreation.DescpContentFrametextFrame("This is Description Content ");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Come out of frame
		coursercreation.FramedefDescp();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on save button
		coursercreation.ClickSave();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check for Assert message
		coursercreation.clickAssertionDesc();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Capturing screenshot
		screenShot.captureScreenShot("ELTC_031_Description");
		// click on object Icon
		coursercreation.ObjIcon();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// click on Obj Desc title
		coursercreation.ObjDescpTitle("This is Objective Title ");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Obj Content Frame
		coursercreation.ObjContentFrame();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write comments in frame
		coursercreation.ObjContentFrameText("This is Objective Content ");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Come out of Obj Frame
		coursercreation.FramedefObj();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Save Object
		coursercreation.ClickSaveObj();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check for the Assert message
		coursercreation.clickAssertionObj();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Capture the screenshot
		screenShot.captureScreenShot("ELTC_031_Objectives_Description");
		//Click on Topics Icon
		coursercreation.TopicsIcon();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write comments in frame
		coursercreation.TopDescpTitle("This is Topics Title ");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click On frame
		coursercreation.TopContentFrame();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write comments in frame
		coursercreation.TopContentFrame("This is Topic Content");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Come out of topic frame
		coursercreation.FramedefTop();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on save for top frame
		coursercreation.ClickSaveTop();	
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check for Assert message
		coursercreation.clickAssertionTitle();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Capture screenshot
		screenShot.captureScreenShot("ELTC_031_Topics_Description");

	}

}
