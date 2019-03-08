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
import com.training.pom.TeacherTestCreationELTC_032_Assertion;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Allow_Teacher_To_Author_Test_ELTC_065 {
	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.TeacherTestCreationELTC_032 TeacherTestCreationELTC_032;
	com.training.pom.StudentLoginELTC_002 StudentLoginELTC_002;
	TeacherTestCreationELTC_032_Assertion TeacherTestCreationELTC_032_Assertion_Test;
	private static Properties properties;
	private ScreenShot screenShot;
	
	//To verify whether application allows teacher to author test with multiple questions

	@BeforeClass
	// the browser opens here
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		TeacherTestCreationELTC_032 = new com.training.pom.TeacherTestCreationELTC_032(driver);
		StudentLoginELTC_002 = new com.training.pom.StudentLoginELTC_002(driver);
		TeacherTestCreationELTC_032_Assertion_Test = new TeacherTestCreationELTC_032_Assertion(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterClass
	// The browser closes
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test(priority = 1)
	// This test will run 1st
	public void validLoginTest() throws InterruptedException {

		// Give username
		StudentLoginELTC_002.sendUserName("sourik54");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// Give Password
		StudentLoginELTC_002.sendPassword("Systane@12");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// Click on Login Button
		StudentLoginELTC_002.clickLoginBtn();

	}

	@Test(priority = 2)
	// This test will run 2nd
	public void validCoursecreation() throws InterruptedException {

		// Click on the course
		TeacherTestCreationELTC_032.clickCourse();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Clock on tests
		TeacherTestCreationELTC_032.clickTests();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Click on create New Test button
		TeacherTestCreationELTC_032.clickCreateaNewTest();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Click on send test name
		TeacherTestCreationELTC_032.sendTestName("online quiz1");
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Click on adv setting
		TeacherTestCreationELTC_032.clickAdvSetting();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// click on Frame
		TeacherTestCreationELTC_032.Frame();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// click on send name test desc
		TeacherTestCreationELTC_032.sendTestNameDesc("quiz");
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// click on frame2
		TeacherTestCreationELTC_032.Frame2();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Click on check box
		TeacherTestCreationELTC_032.clickCheckBox();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// click on date image
		TeacherTestCreationELTC_032.clickDateImage();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// click now button
		TeacherTestCreationELTC_032.clickNow();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// click on done
		TeacherTestCreationELTC_032.clickDone();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Pass on 50 in text box
		TeacherTestCreationELTC_032.clickPassPercent("50");
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// click on btn submit exercise
		TeacherTestCreationELTC_032.btnsubmitExercise();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// check for assertions
		TeacherTestCreationELTC_032.ClickAssetion361();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		// click on multiple choice
		TeacherTestCreationELTC_032.clickMultipleChoice();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// This test will run at 3rd step
	@Test(priority = 3, dataProvider = "excel-inputs3", dataProviderClass = LoginDataProviders_complex.class)
	public void AllowteacherToAuthorTest(String question, String AddFramei1, String AddFrameii2, String AddFrameii3,
			String AddFrameii4) throws InterruptedException {

		// Click on the send Question text button
		TeacherTestCreationELTC_032.sendQuestionText(question);
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// click on frame
		TeacherTestCreationELTC_032.Framei();
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// Add text to frame content
		TeacherTestCreationELTC_032.send1text(AddFramei1);
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// Come out of frame
		TeacherTestCreationELTC_032.Frame1out();
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// click on frame
		TeacherTestCreationELTC_032.Framei2();
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// Add text to frame content
		TeacherTestCreationELTC_032.send2text(AddFrameii2);
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// Come out of frame
		TeacherTestCreationELTC_032.Frame2out();
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// click on frame
		TeacherTestCreationELTC_032.Framei3();
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// Add text to frame content
		TeacherTestCreationELTC_032.send3text(AddFrameii3);
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// Come out of frame
		TeacherTestCreationELTC_032.Frame3out();
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// click on frame
		TeacherTestCreationELTC_032.Framei4();
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// Add text to frame content
		TeacherTestCreationELTC_032.send4text(AddFrameii4);
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// Come out of frame
		TeacherTestCreationELTC_032.Frame4out();
		// For keeping pause of script for sometime
		Thread.sleep(2000);

	}

	@Test(priority = 4)
	// This test will run 4th
	public void validCoursecreation2() throws InterruptedException {
		// Click on Sub Question button
		TeacherTestCreationELTC_032.btnsubQuestion();
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// Check for assertion
		TeacherTestCreationELTC_032_Assertion_Test.ClickAssetionItemAdd();
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// Check for assertion
		TeacherTestCreationELTC_032_Assertion_Test.ClickAssetionQuestions();
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// Click on preview icon
		TeacherTestCreationELTC_032.clickPreviewIcon();
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// Check for assertion
		TeacherTestCreationELTC_032_Assertion_Test.ClickAssetionStartTest();
		// For keeping pause of script for sometime
		Thread.sleep(2000);
		// Screenshot capture
		screenShot.captureScreenShot("ELTD_065");
	}

}