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
import com.training.generics.ScreenShot;
import com.training.pom.AdminLogin_Extra_ELTC_064;
import com.training.pom.LoginPOM;
import com.training.pom.RegistrationELTC_001;
import com.training.pom.StudentCourseRegister_Extra_ELTC_064;
import com.training.pom.TeacherAddCourseELTC_031;
import com.training.pom.Teacher_Logout_Extra_ELTC_065;
import com.training.sanity.tests.TeacherAddCourseELTC_031_Test;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TeacherCourse_Student_Register_ELTC_064_Test {
	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.TeacherAddCourseELTC_031 coursecreation1;
	com.training.pom.StudentLoginELTC_002 StudentLoginELTC_002;
	com.training.pom.StudentCourseRegister_Extra_ELTC_064 courseregister1;
	com.training.pom.Teacher_Logout_Extra_ELTC_065 TeacherLogout;
	com.training.pom.Student_Logout_Extra_ELTC_065 StudentLogout;
	AdminLogin_Extra_ELTC_064 AdminLogin;
	private static Properties properties;
	private ScreenShot screenShot;
	private String username;
	//public String coursename;

	//To verify whether application allows teacher to create a course with objective description & topics, student to get register for the course take the test & admin to report

	@BeforeClass
	// The browser opens
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		coursecreation1 = new TeacherAddCourseELTC_031(driver);   //geog
		StudentLoginELTC_002 = new com.training.pom.StudentLoginELTC_002(driver);
		courseregister1 = new com.training.pom.StudentCourseRegister_Extra_ELTC_064(driver);  //assertion
		TeacherLogout = new com.training.pom.Teacher_Logout_Extra_ELTC_065(driver);
		StudentLogout = new com.training.pom.Student_Logout_Extra_ELTC_065(driver);
		AdminLogin = new AdminLogin_Extra_ELTC_064(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}
	

	@AfterClass
	// The browser will close
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test(priority = 1)
	// This Test will run first
	public void validLoginTeacherTest() throws InterruptedException {
		// Give username
		StudentLoginELTC_002.sendUserName("sourik55");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Give Password
		StudentLoginELTC_002.sendPassword("Systane@12");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Click on Login Button
		StudentLoginELTC_002.clickLoginBtn();

	}

	@Test(priority = 2)
	// This test will run second
	public void TracherCoursecreation1() throws InterruptedException {

		// Click on Course Link
		coursecreation1.clickCourse();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Click on Course creation
		coursecreation1.sendCourseName("BBA");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Click on Advance Setting
		coursecreation1.clickAdvSetting();
		// Click on Dropdown arrow
		coursecreation1.category1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Choose the desired from dropdown
		coursecreation1.category2();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Pass values in Course code;
		coursecreation1.sendCourseCode("BBA");
		// Click on Course Submit button
		coursecreation1.AddCourseSubmit();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Click on Add Intro button
		coursecreation1.AddIntro();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Click on the frame
		coursecreation1.Frame();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Write Selenium in frame
		coursecreation1.Frame1("This is BBA Course");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Come out of frame
		coursecreation1.Frame2();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Click Save to text button
		coursecreation1.clickSaveToText();
		//Click on Assert
		coursecreation1.clickAssertion121();
		//Click on Course Description Link
		coursecreation1.courseDescrpIcon();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Description
		coursecreation1.DescrpIcon();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Selenium Desc Title
		coursecreation1.sendDescpTitle("Selenium Description Title");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Click on the frame
		coursecreation1.DescpContentFrame();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write comments in frame
		coursecreation1.DescpContentFrametextFrame("This is Description Content ");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Come out of frame
		coursecreation1.FramedefDescp();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on save button
		coursecreation1.ClickSave();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check for Assert message
		coursecreation1.clickAssertionDesc();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Capturing screenshot
		screenShot.captureScreenShot("ELTC_064_Description");
		// click on object Icon
		coursecreation1.ObjIcon();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// click on Obj Desc title
		coursecreation1.ObjDescpTitle("This is Objective Title ");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Obj Content Frame
		coursecreation1.ObjContentFrame();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write comments in frame
		coursecreation1.ObjContentFrameText("This is Objective Content ");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Come out of Obj Frame
		coursecreation1.FramedefObj();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Save Object
		coursecreation1.ClickSaveObj();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check for the Assert message
		coursecreation1.clickAssertionObj();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Capture the screenshot
		screenShot.captureScreenShot("ELTC_064_Objectives_Description");
		//Click on Topics Icon
		coursecreation1.TopicsIcon();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write comments in frame
		coursecreation1.TopDescpTitle("This is Topics Title ");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click On frame
		coursecreation1.TopContentFrame();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write comments in frame
		coursecreation1.TopContentFrame("This is Topic Content");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Come out of topic frame
		coursecreation1.FramedefTop();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on save for top frame
		coursecreation1.ClickSaveTop();	
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		coursecreation1.clickAssertionTitle();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Capture screenshot
		screenShot.captureScreenShot("ELTC_064_Topics_Description");
		Thread.sleep(2000);;
		//Click on logout frame
		TeacherLogout.clickLogoutArrow();
		Thread.sleep(2000);
		//Click on Log out button
		TeacherLogout.clickLogout();
		Thread.sleep(2000);		
	}
       
		@Test(priority = 3)
		// This test will run third
		public void StudentCourseRegister() throws InterruptedException {
			// Click on Course Link
			username = courseregister1.sendUserName("sourik50");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);			
			// Click on Course creation
			courseregister1.sendPassword("Frooti@14");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			//Click on Login button
			courseregister1.clickLoginBtn();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			//Click on course catalog
			courseregister1.clickcourseCatalog();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			//write something in send name text box
			courseregister1.sendNameTextbox("BBA");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			//Click on name search
			courseregister1.nameSearch();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			//Click on subscribe button
			courseregister1.clickSubscribe();
			Thread.sleep(2000);
			//check for assertion
			coursecreation1.clickAssertion25();
	       //Capture screenshot
			screenShot.captureScreenShot("ELTC_064_Topics_Description");
			//Click on course Link
			courseregister1.clickOnCourse();
			//Click on Assertion course code
			coursecreation1.clickAssertionCourseCode();
			//Click on course desc
			courseregister1.clickOnCourseDesc();
			//Click on Logout dropdown
			StudentLogout.logoutClickStuArrow();
			//Click on Logout
			StudentLogout.clickLogoutStu();
		}
		
			@Test(priority = 4)
			// This test will run fourth
			public void AdminloginView() throws InterruptedException {
				// Click on Course Link
				AdminLogin.sendAdminUserName("admin");
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				//click on password
				AdminLogin.sendPassword("admin@1234");
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				//Click on log in button
				AdminLogin.clickLoginBtn();
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				//Click on Report click
				AdminLogin.Reportclick();
				Thread.sleep(2000);
				//Click on Followed Styudent class
				AdminLogin.FollowedStuClass();
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				//Pass some values in Username
			    AdminLogin.sendAdminkeyword(username);
			    //click on Search button
				AdminLogin.Searchbutton();
				//click on Double Arrow
				AdminLogin.ClickDoublearrow();
				//Click on Doubl Arrow course at last 
	            AdminLogin.ClickDoubleArrowCourseAtlast();
				
			}

}