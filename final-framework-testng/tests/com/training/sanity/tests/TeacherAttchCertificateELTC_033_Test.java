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

	@BeforeClass
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

		attachcreation.clickCourse();
		Thread.sleep(1000);
		attachcreation.clickAssessment();
		Thread.sleep(1000);
		attachcreation.clickAddonLineActivity();
		Thread.sleep(1000);
		attachcreation.category1();
		Thread.sleep(1000);
		attachcreation.category2();
		Thread.sleep(1000);
		attachcreation.sendWeightText("1");
		Thread.sleep(1000);
		attachcreation.btn_LearningActivity();
		Thread.sleep(1000);
		attachcreation.clickAssertionLinkAdd();
		Thread.sleep(1000);

		screenShot.captureScreenShot("ELTC_033_Link Added");

		attachcreation.checkbox();
		Thread.sleep(1000);
		attachcreation.clickEdit();
		Thread.sleep(1000);
		attachcreation.clickEditLink();
		Thread.sleep(1000);

		attachcreation.clickAssertionEdit();
		Thread.sleep(1000);

		screenShot.captureScreenShot("ELTC_033_Assessment Edited");

		attachcreation.clickAttachCert();
		Thread.sleep(1000);
		attachcreation.clickAssertionAttach();
		Thread.sleep(1000);

		screenShot.captureScreenShot("ELTC_033_Default Certificate");

	}
}