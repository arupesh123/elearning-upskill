package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.generics.ScreenShot_ELTC_002;
import com.training.generics.ScreenShot_ELTC_005;
import com.training.pom.RegistrationELTC_001;
import com.training.pom.StudentLoginELTC_002;
import com.training.pom.RegisterTeacherELTC_005;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegisterTeacherELTC_005_Test {

	private WebDriver driver;
	private String baseUrl;
	private RegisterTeacherELTC_005 RegisterTeacherELTC_005;
	private static Properties properties;
	private ScreenShot_ELTC_005 screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		RegisterTeacherELTC_005 = new RegisterTeacherELTC_005(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_005(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
	Thread.sleep(1000);
	driver.quit();
	}

	@Test
	public void validLoginTest() throws InterruptedException {

		RegisterTeacherELTC_005.clickSignUp();
		Thread.sleep(1000);
		RegisterTeacherELTC_005.sendFirstName("Sourik");
		Thread.sleep(1000);
		RegisterTeacherELTC_005.sendLastName("Mukherjee");
		Thread.sleep(1000);
		RegisterTeacherELTC_005.sendEmail("dollymuk06@gmail.com");
		Thread.sleep(1000);
		RegisterTeacherELTC_005.senduserName("sourik54");
		Thread.sleep(1000);
		RegisterTeacherELTC_005.sendPassword("Systane@12");
		Thread.sleep(1000);
		RegisterTeacherELTC_005.sendConfPassword("Systane@12");
		Thread.sleep(1000);
		RegisterTeacherELTC_005.sendPhone("9098909876");
		Thread.sleep(1000);
		RegisterTeacherELTC_005.category1();
		Thread.sleep(1000);
		RegisterTeacherELTC_005.category2();
		Thread.sleep(1000);
		RegisterTeacherELTC_005.clickbtn_Button();
		Thread.sleep(1000);
		RegisterTeacherELTC_005.clickbtn_Register();
		Thread.sleep(1000);

		
		String Expected0 = "Dear Sourik Mukherjee,\n" + 
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
		
		screenShot.captureScreenShot("ELTC_005");

	}
}
	