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
import com.training.pom.TeacherTestCreationELTC_032_Assertion;
import com.training.pom.StudentLoginELTC_002;
import com.training.pom.RegisterTeacherELTC_005;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TeacherTestCreationELTC_032_Assertion_Test {

	private WebDriver driver;
	private String baseUrl;
	private StudentLoginELTC_002 StudentLoginELTC_002;
	private TeacherTestCreationELTC_032_Assertion coursercreation1;
	private static Properties properties;
	private ScreenShot_ELTC_001 screenShot;

	@BeforeClass
	// The Chrome browser should open up
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		StudentLoginELTC_002 = new StudentLoginELTC_002(driver);
		coursercreation1 = new TeacherTestCreationELTC_032_Assertion(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_001(driver);
		driver.get(baseUrl);
	}

	/*@AfterClass
	//Chrome driver closes
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/

	
	@Test
	
		public void validAssertion() throws InterruptedException {
        
		//Click on Click Course link
		coursercreation1.ClickAssetionItemAdd();
		Thread.sleep(1000);
		coursercreation1.ClickAssetionQuestions();
		Thread.sleep(1000);
		// Click Tests icon
		coursercreation1.ClickAssetionStartTest();
		Thread.sleep(1000);
	}
}