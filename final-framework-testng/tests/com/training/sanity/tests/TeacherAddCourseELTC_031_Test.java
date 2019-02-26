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

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		StudentLoginELTC_002 = new StudentLoginELTC_002(driver);
		coursercreation = new TeacherAddCourseELTC_031(driver);
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
		coursercreation.sendCourseName("Kolkata11");
		Thread.sleep(1000);
		coursercreation.clickAdvSetting();
		Thread.sleep(1000);
		coursercreation.category1();
		Thread.sleep(1000);
		coursercreation.category2();
		Thread.sleep(1000);
		coursercreation.sendCourseCode("Test11");
		Thread.sleep(1000);
		coursercreation.AddCourseSubmit();
		Thread.sleep(1000);
		coursercreation.AddIntro();
		Thread.sleep(1000);
		coursercreation.Frame();
		Thread.sleep(1000);
		coursercreation.Frame1("This is Selenium");
		Thread.sleep(1000);
		coursercreation.Frame2();
		Thread.sleep(1000);
		coursercreation.clickSaveToText();

		//screenShot.captureScreenShot("ELTC_031_Create Course");
		
		coursercreation.clickAssertion121();
		
		screenShot.captureScreenShot("ELTC_031_Intro was updated");
		screenShot.captureScreenShot("ELTC_031_This is Selenium");

		/*String Expected121 = "Intro was updated";
		String Actualtext121 = driver.findElement(By.xpath("//div[contains(text(),'Intro was updated')]")).getText();
		Assert.assertEquals(Actualtext121, Expected121);
		System.out.println(Actualtext121);

		String Expected122 = "This is Selenium";
		String Actualtext122 = driver.findElement(By.xpath("//p[contains(text(),'This is Selenium')]")).getText();
		Assert.assertEquals(Actualtext122, Expected122);
		System.out.println(Actualtext122);*/

		coursercreation.courseDescrpIcon();
		Thread.sleep(1000);
		coursercreation.DescrpIcon();
		Thread.sleep(1000);
		coursercreation.sendDescpTitle("Selenium Description Title");
		Thread.sleep(1000);
		coursercreation.DescpContentFrame();
		Thread.sleep(1000);
		coursercreation.DescpContentFrametextFrame("This is Description Content ");
		Thread.sleep(1000);
		coursercreation.FramedefDescp();
		Thread.sleep(1000);
		coursercreation.ClickSave();		
		coursercreation.clickAssertion17();

		screenShot.captureScreenShot("ELTC_031_Description");

		/*String Expected17 = "The description has been updated";
		String Actualtext17 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext17, Expected17);
		System.out.println(Actualtext17);*/

		
		coursercreation.ObjIcon();
		Thread.sleep(1000);
		coursercreation.ObjDescpTitle("This is Objective Title ");
		Thread.sleep(1000);
		coursercreation.ObjContentFrame();
		Thread.sleep(1000);
		coursercreation.ObjContentFrameText("This is Objective Content ");
		Thread.sleep(1000);
		coursercreation.FramedefObj();
		Thread.sleep(1000);
		coursercreation.ClickSaveObj();
		coursercreation.clickAssertion21();		
		

		screenShot.captureScreenShot("ELTC_031_Objectives_Description");
/*
		String Expected21 = "The description has been updated";
		String Actualtext21 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext21, Expected21);
		System.out.println(Actualtext21);*/

		
		coursercreation.TopicsIcon();
		Thread.sleep(1000);
		coursercreation.TopDescpTitle("This is Topics Title ");
		Thread.sleep(1000);
		coursercreation.TopContentFrame();
		Thread.sleep(1000);
		coursercreation.TopContentFrame("This is Topic Content");
		Thread.sleep(1000);
		coursercreation.FramedefTop();
		Thread.sleep(1000);
		coursercreation.ClickSaveTop();		
		coursercreation.clickAssertion25();

		/*String Expected25 = "The description has been updated";
		String Actualtext25 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext25, Expected25);
		System.out.println(Actualtext25);
*/
		screenShot.captureScreenShot("ELTC_031_Topics_Description");

	}

}
