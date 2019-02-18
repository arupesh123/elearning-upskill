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
import com.training.generics.ScreenShot_ELTC_003;
import com.training.pom.RegistrationELTC_001;
import com.training.pom.StudentLoginELTC_002;
import com.training.pom.EditprofileELTC_003;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class EditprofileELTC_003_Test {

	private WebDriver driver;
	private String baseUrl;
	private StudentLoginELTC_002 studentLoginELTC_002;
	private EditprofileELTC_003 editProfile;
	private ScreenShot_ELTC_003 screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		studentLoginELTC_002 = new StudentLoginELTC_002(driver);
		editProfile = new EditprofileELTC_003(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_003(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

		
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
	driver.quit();
	}
	
	@Test(priority=1) 
	public void validLoginTest() {
		studentLoginELTC_002.sendUserName("sourik50");
		studentLoginELTC_002.sendPassword("Systane@12");
		studentLoginELTC_002.clickLoginBtn();
		
		screenShot.captureScreenShot("ELTC_003_1");
	}
	
	@Test(priority=2) 
	
	public void validChangePassword() throws InterruptedException {
		editProfile.editprofile();
		Thread.sleep(3000);
		editProfile.sendPassword1("Systane@12");
		Thread.sleep(3000);
		editProfile.sendNewPassword("Frooti@14");
		Thread.sleep(3000);
		editProfile.sendConfPassword("Frooti@14");
		Thread.sleep(3000);
		editProfile.clickbtn_Save();
		
				
		String Expected = "Your new profile has been saved";
		String Actualtext = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/div/div[1]")).getText();
		Assert.assertEquals(Actualtext,Expected);
		System.out.println(Actualtext);
		
	screenShot.captureScreenShot("ELTC_003_2");
	}
}
