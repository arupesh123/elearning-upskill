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

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		StudentLoginELTC_002 = new StudentLoginELTC_002(driver);
		assigncreation = new TeacherAssignmentsELTC_034(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_001(driver);
		// open the browser
		driver.get(baseUrl);
		
	}

	/*
	 * @AfterClass public void tearDown() throws Exception { Thread.sleep(1000);
	 * driver.quit(); }
	 */

	@Test(priority = 1)
	public void validLoginTest() throws InterruptedException {

		StudentLoginELTC_002.sendUserName("sourik54");
		// Thread.sleep(1000);
		StudentLoginELTC_002.sendPassword("Systane@12");
		// Thread.sleep(1000);
		StudentLoginELTC_002.clickLoginBtn();

	}

	@Test(priority = 2)

	public void validCoursecreation() throws InterruptedException {

		assigncreation.clickCourse();
		Thread.sleep(1000);
		assigncreation.clickAssignments1();
		Thread.sleep(1000);
		assigncreation.clickCreateAssignment1();
		Thread.sleep(1000);
		assigncreation.sendAssignNameText("IBM6");
		Thread.sleep(1000);
		assigncreation.FrameDesc();
		Thread.sleep(1000);
		assigncreation.sendAddFrameDescText("Exercise");
		Thread.sleep(1000);
		assigncreation.FrameDesce2out();
		Thread.sleep(1000);
		assigncreation.Adv_Setting1();
		Thread.sleep(1000);
		assigncreation.SendMaxScore("50");
		Thread.sleep(1000);
		assigncreation.Validate1();
		Thread.sleep(1000);
		
		String Expected1 = "Directory created";
		String Actualtext1 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext1, Expected1);
		System.out.println(Actualtext1);
		
		screenShot.captureScreenShot("ELTC_032_Directory Created");

		
		assigncreation.checkBox1();
		Thread.sleep(1000);
		assigncreation.AssigSettings1();
		Thread.sleep(1000);
		assigncreation.radioButtons1();
		Thread.sleep(1000);
		assigncreation.Save1();
		Thread.sleep(1000);
		
		
		String Expected2 = "Saved.";
		String Actualtext2 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext2, Expected2);
		System.out.println(Actualtext2);
			

		screenShot.captureScreenShot("ELTC_032_Saved");

	}
}
