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

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		StudentLoginELTC_002 = new StudentLoginELTC_002(driver);
		coursercreation = new TeacherTestCreationELTC_032(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_001(driver);
		// open the browser
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

		coursercreation.clickCourse();
		Thread.sleep(1000);
		coursercreation.clickTests();
		Thread.sleep(1000);
		coursercreation.clickCreateaNewTest();
		Thread.sleep(1000);
		coursercreation.sendTestName("Online Quiz3");
		Thread.sleep(1000);
		coursercreation.clickAdvSetting();
		Thread.sleep(1000);
		coursercreation.Frame();
		Thread.sleep(1000);
		coursercreation.sendTestNameDesc("Quiz3");
		Thread.sleep(1000);
		coursercreation.Frame2();
		Thread.sleep(1000);
		coursercreation.clickCheckBox();
		Thread.sleep(1000);
		coursercreation.clickDateImage();
		Thread.sleep(1000);
		coursercreation.clickNow();
		Thread.sleep(1000);
		coursercreation.clickDone();
		Thread.sleep(1000);
		coursercreation.clickPassPercent("100");
		Thread.sleep(1000);
		coursercreation.btnsubmitExercise();
		Thread.sleep(1000);
		coursercreation.ClickAssetion361();
		
		screenShot.captureScreenShot("ELTC_032_Excercise Added");
		
		coursercreation.ClickAssetion362();

		screenShot.captureScreenShot("ELTC_032_0 Questions");
		
		
		coursercreation.clickMultipleChoice();
		Thread.sleep(1000);
		coursercreation.sendQuestionText("Which course your learning");
		Thread.sleep(1000);
		coursercreation.Framei();
		Thread.sleep(1000);
		coursercreation.send1text("Selenium");
		Thread.sleep(1000);
		coursercreation.Frame1out();
		Thread.sleep(1000);
		coursercreation.Framei2();
		Thread.sleep(1000);
		coursercreation.send2text("Java");
		Thread.sleep(1000);
		coursercreation.Frame2out();
		Thread.sleep(1000);
		coursercreation.Framei3();
		Thread.sleep(1000);
		coursercreation.send3text("C");
		Thread.sleep(1000);
		coursercreation.Frame3out();
		Thread.sleep(1000);
		coursercreation.Framei4();
		Thread.sleep(1000);
		coursercreation.send4text("C#");
		Thread.sleep(1000);
		coursercreation.Frame4out();
		Thread.sleep(1000);
		coursercreation.score1_1stQuestion("1");
		Thread.sleep(1000);
		coursercreation.score2_1stQuestion("1");
		Thread.sleep(1000);
		coursercreation.score3_1stQuestion("1");
		Thread.sleep(1000);
		coursercreation.score4_1stQuestion("1");
		Thread.sleep(1000);
		coursercreation.btnsubQuestion();
		Thread.sleep(1000);
		coursercreation.ClickAssertion44();
		
		
		screenShot.captureScreenShot("ELTC_032_1 Questions");
		
		coursercreation.MultipleChoice1();
		Thread.sleep(1000);
		coursercreation.clickMulChoiceQues2("Which language are you using in selenium?");
		Thread.sleep(1000);
		coursercreation.Frame1_2ndQuestion1();
		Thread.sleep(1000);
		coursercreation.send1Text2ndQuestion("Phython");
		Thread.sleep(1000);
		coursercreation.Frame2out2ndQuestion();
		Thread.sleep(1000);
		coursercreation.Frame2_2ndQuestion2();
		Thread.sleep(1000);
		coursercreation.send2Text2ndQuestion("Java");
		Thread.sleep(1000);
		coursercreation.Frame2out2ndQuestion();
		Thread.sleep(1000);
		coursercreation.Frame3_2ndQuestion3();
		Thread.sleep(1000);
		coursercreation.send3Text2ndQuestion("C");
		Thread.sleep(1000);
		coursercreation.Frame3out2ndQuestion();
		Thread.sleep(1000);
		coursercreation.Frame4_2ndQuestion4();
		Thread.sleep(1000);
		coursercreation.send4Text2ndQuestion("C#");
		Thread.sleep(1000);
		coursercreation.Frame4out2ndQuestion();
		Thread.sleep(1000);
		
		coursercreation.score1_2ndQuestion("1");
		Thread.sleep(1000);
		coursercreation.score2_2ndQuestion("1");
		Thread.sleep(1000);
		coursercreation.score3_2ndQuestion("1");
		Thread.sleep(1000);
		coursercreation.score4_2ndQuestion("1");
		
		coursercreation.clickRadioButton();
		Thread.sleep(1000);
		coursercreation.clickSub_Ques1();
		Thread.sleep(1000);
		
		coursercreation.ClickAssertion54();
		Thread.sleep(1000);
		
		screenShot.captureScreenShot("ELTC_032_2 Questions");
		
		coursercreation.clickPreviewIcon();
		Thread.sleep(1000);
		coursercreation.clickStartTest();
		Thread.sleep(1000);
		coursercreation.clickSelenium();
		Thread.sleep(1000);
		coursercreation.clicknextQuesbutton();
		Thread.sleep(1000);
		coursercreation.clickJava();
		Thread.sleep(1000);
		coursercreation.clickEndTest();
		Thread.sleep(1000);
		coursercreation.ClickAssertion58();
			
		screenShot.captureScreenShot("ELTC_032_Score for test");
		
		
		
		
}
}
