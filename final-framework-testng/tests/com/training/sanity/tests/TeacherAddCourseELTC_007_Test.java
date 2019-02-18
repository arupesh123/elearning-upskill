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
import com.training.generics.ScreenShot_ELTC_002;
import com.training.generics.ScreenShot_ELTC_005;
import com.training.pom.RegistrationELTC_001;
import com.training.pom.TeacherAddCourseELTC_007;
import com.training.pom.StudentLoginELTC_002;
import com.training.pom.RegisterTeacherELTC_005;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TeacherAddCourseELTC_007_Test {

	private WebDriver driver;
	private String baseUrl;
	private StudentLoginELTC_002 StudentLoginELTC_002;
	private TeacherAddCourseELTC_007 coursercreation;
	private static Properties properties;
	private ScreenShot_ELTC_005 screenShot;
	

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		StudentLoginELTC_002 = new StudentLoginELTC_002(driver);
		coursercreation = new TeacherAddCourseELTC_007(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_005(driver);
		// open the browser
		driver.get(baseUrl);
	}

	/*@AfterClass
	public void tearDown() throws Exception {
	Thread.sleep(1000);
	driver.quit();
	}*/

	@Test (priority =1)
	public void validLoginTest() throws InterruptedException {

		
		StudentLoginELTC_002.sendUserName("sourik54");
		Thread.sleep(1000);
		StudentLoginELTC_002.sendPassword("Systane@12");
		Thread.sleep(1000);
		StudentLoginELTC_002.clickLoginBtn();
		Thread.sleep(1000);
		}
		@Test(priority=2) 
				
		public void validCoursecreation() throws InterruptedException {
			
			coursercreation.clickCreateCourse();
			coursercreation.sendCourseName("Selenium255");
			Thread.sleep(1000);
			coursercreation.clickAdvSetting();
			Thread.sleep(1000);
			coursercreation.category1();
			Thread.sleep(1000);
			coursercreation.category2();
			Thread.sleep(1000);
			coursercreation.sendCourseCode("Test43");
			Thread.sleep(1000);
			coursercreation.AddCourseSubmit();
			Thread.sleep(1000);
			coursercreation.AddIntro();
			Thread.sleep(1000);
			coursercreation.Frame();
			Thread.sleep(1000);
			coursercreation.Frame1("this is an selenium course");
			Thread.sleep(1000);
			coursercreation.Frame2();
			Thread.sleep(1000);
			coursercreation.clickSaveToText();
			//System.out.println(Frame0);
		}
		
		/*String Expected0 = "Dear Sourik Mukherjee,\n" + 
				"\n" + 
				"Your personal settings have been registered.";
		String Actualtext0 = driver.findElement(By.xpath("//body[contains(@class,'section-global')]/div[@class='wrap']/section[@id='content-section']/div[@class='container']/div[@class='row']/div[@class='col-xs-12 col-md-12']/p[1]\r\n" + 
				"")).getText();
		
		Assert.assertEquals(Actualtext0,Expected0);
		System.out.println(Actualtext0);
		
		String Expected2 = "An email has been sent to help you remember your login and password.";
		String Actualtext2 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/div/p[2]")).getText();
		Assert.assertEquals(Actualtext2,Expected2);
		System.out.println(Actualtext2);
		
		screenShot.captureScreenShot("ELTC_005");*/

	}

	