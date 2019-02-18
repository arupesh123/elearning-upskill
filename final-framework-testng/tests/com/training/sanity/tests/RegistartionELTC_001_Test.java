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
import com.training.generics.ScreenShot_ELTC_001;
import com.training.generics.ScreenShot_ELTC_002;
import com.training.pom.RegistrationELTC_001;
import com.training.pom.StudentLoginELTC_002;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegistartionELTC_001_Test {

	private WebDriver driver;
	private String baseUrl;
	private RegistrationELTC_001 LoginELTC_001_Test;
	private static Properties properties;
	private ScreenShot_ELTC_001 screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		LoginELTC_001_Test = new RegistrationELTC_001(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_001(driver);
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

		LoginELTC_001_Test.clickSignUp();
		Thread.sleep(1000);
		LoginELTC_001_Test.sendFirstName("Sourik");
		Thread.sleep(1000);
		LoginELTC_001_Test.sendLastName("Mukherjee");
		Thread.sleep(1000);
		LoginELTC_001_Test.sendEmail("dollymuk06@gmail.com");
		Thread.sleep(1000);
		LoginELTC_001_Test.senduserName("sourik50");
		Thread.sleep(1000);
		LoginELTC_001_Test.sendPassword("Systane@12");
		Thread.sleep(1000);
		LoginELTC_001_Test.sendConfPassword("Systane@12");
		Thread.sleep(1000);
		LoginELTC_001_Test.sendPhone("9098909876");
		Thread.sleep(1000);
		LoginELTC_001_Test.clickbtn_Register();
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
		
				
		String Expected3 = "You can now select, in the list, the course you want access to.";
		String Actualtext3 = driver.findElement(By.xpath("//*[@id=\"form_register\"]/fieldset/p")).getText();
		Assert.assertEquals(Actualtext3,Expected3);
		System.out.println(Actualtext3);
		
		screenShot.captureScreenShot("ELTC_001");

	}
}
