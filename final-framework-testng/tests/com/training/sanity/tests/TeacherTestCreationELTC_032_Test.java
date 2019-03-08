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
import com.training.pom.RegisterTeacherELTC_005;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TeacherTestCreationELTC_032_Test {

	private WebDriver driver;
	private String baseUrl;
	private StudentLoginELTC_002 StudentLoginELTC_002;
	private TeacherTestCreationELTC_032 coursercreation;
	private static Properties properties;
	private ScreenShot_ELTC_001 screenShot;
	
	//To verify whether application allows teacher to create a Test

	@BeforeClass
	// The Chrome browser should open up
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		StudentLoginELTC_002 = new StudentLoginELTC_002(driver);
		coursercreation = new TeacherTestCreationELTC_032(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_001(driver);
		driver.get(baseUrl);
	}

	@AfterClass
	//Chrome driver closes
	public void tearDown() throws Exception {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.quit();
	}

	@Test(priority = 1)
	
	//This test will run first
	
	public void validLoginTest() throws InterruptedException {

		// Give username
		StudentLoginELTC_002.sendUserName("sourik54");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Give Password
		StudentLoginELTC_002.sendPassword("Systane@12");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Click on Login Button
		StudentLoginELTC_002.clickLoginBtn();

	}

	@Test(priority = 2)
	
	//This test will run second

	public void validCoursecreation() throws InterruptedException {
        
		//Click on Click Course link
		coursercreation.clickCourse();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Click Tests icon
		coursercreation.clickTests();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click button Create new test
		coursercreation.clickCreateaNewTest();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write something in Test Name
		coursercreation.sendTestName("Online Quiz3");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on AdvSettng button
		coursercreation.clickAdvSetting();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Frame 
		coursercreation.Frame();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write something in Name Desc text box
		coursercreation.sendTestNameDesc("Quiz3");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on the frame
		coursercreation.Frame2();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Checkbox
		coursercreation.clickCheckBox();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on date Image
		coursercreation.clickDateImage();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Now button
		coursercreation.clickNow();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Done button
		coursercreation.clickDone();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Give values in Pass %
		coursercreation.clickPassPercent("100");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Button Submit Exercise
		coursercreation.btnsubmitExercise();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Click Assert
		coursercreation.ClickAssetion361();
        //Capture screenshot
		screenShot.captureScreenShot("ELTC_032_Excercise Added");
        //Check for Assert
		coursercreation.ClickAssetion362();
        //Capture screenshot
		screenShot.captureScreenShot("ELTC_032_0 Questions");
        //Clcik on Multiple choice.
		coursercreation.clickMultipleChoice();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write something on Questions
		coursercreation.sendQuestionText("Which course your learning");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//click on frame.
		coursercreation.Framei();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write textin frame
		coursercreation.send1text("Selenium");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//come out of frmae
		coursercreation.Frame1out();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on frame2
		coursercreation.Framei2();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write text java in frame2
		coursercreation.send2text("Java");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//come out of frame2
		coursercreation.Frame2out();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on frame3
		coursercreation.Framei3();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Send text C in frame3
		coursercreation.send3text("C");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//come out of frame3
		coursercreation.Frame3out();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on frame4
		coursercreation.Framei4();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Send text C# in frame4
		coursercreation.send4text("C#");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//come out of frame4
		coursercreation.Frame4out();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Enter text 1 in score
		coursercreation.score1_1stQuestion("1");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Enter text 1 in score
		coursercreation.score2_1stQuestion("1");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Enter text 1 in score
		coursercreation.score3_1stQuestion("1");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Enter text 1 in score
		coursercreation.score4_1stQuestion("1");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Clcik on Sub Question button
		coursercreation.btnsubQuestion();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//check for assert
		coursercreation.ClickAssertion44();
        //Capture screenshot
		screenShot.captureScreenShot("ELTC_032_1 Questions");
        // Click on Multiple choice
		coursercreation.MultipleChoice1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write something in Multiple choice Question
		coursercreation.clickMulChoiceQues2("Which language are you using in selenium?");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on the frame1
		coursercreation.Frame1_2ndQuestion1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write something in frame
		coursercreation.send1Text2ndQuestion("Phython");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Come out of frame
		coursercreation.Frame2out2ndQuestion();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on the frame2
		coursercreation.Frame2_2ndQuestion2();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write something in frame
		coursercreation.send2Text2ndQuestion("Java");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Come out of the frame
		coursercreation.Frame2out2ndQuestion();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on frmae3
		coursercreation.Frame3_2ndQuestion3();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write something in frame
		coursercreation.send3Text2ndQuestion("C");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Come out of frame
		coursercreation.Frame3out2ndQuestion();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write something in frame
		coursercreation.Frame4_2ndQuestion4();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write something in frame
		coursercreation.send4Text2ndQuestion("C#");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Come out of frame		
		coursercreation.Frame4out2ndQuestion();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write something in frame
		coursercreation.score1_2ndQuestion("1");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write something in frame
		coursercreation.score2_2ndQuestion("1");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write something in frame
		coursercreation.score3_2ndQuestion("1");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Write something in frame
		coursercreation.score4_2ndQuestion("1");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Radio button
		coursercreation.clickRadioButton();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		coursercreation.clickSub_Ques1();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Check assertions
        coursercreation.ClickAssertion54();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        //Check for the screenshots
		screenShot.captureScreenShot("ELTC_032_2 Questions");
        //Click on the Preview Icon
		coursercreation.clickPreviewIcon();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Start test
		coursercreation.clickStartTest();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Selenium radio button
		coursercreation.clickSelenium();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on next question radio button
		coursercreation.clicknextQuesbutton();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on Java radio button
		coursercreation.clickJava();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Click on End test button
		coursercreation.clickEndTest();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		coursercreation.ClickAssertion58();
        //Capture screenshot.
		screenShot.captureScreenShot("ELTC_032_Score for test");

	}
}
