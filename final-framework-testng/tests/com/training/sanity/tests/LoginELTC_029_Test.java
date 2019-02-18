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
import com.training.generics.ScreenShot_ELTC_003;
import com.training.pom.LoginELTC_028;
import com.training.pom.LoginELTC_029;
import com.training.pom.StudentLoginELTC_002;
import com.training.pom.EditprofileELTC_003;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginELTC_029_Test {

	private  WebDriver driver;
	private  String baseUrl;
	private  LoginELTC_028 LoginELTC_028;
	private  LoginELTC_029 delprofile;
	private  ScreenShot_ELTC_003 screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		Properties properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		LoginELTC_028 = new LoginELTC_028(driver);
		delprofile = new LoginELTC_029(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot_ELTC_003(driver); 
		// open the browser 
		driver.get(baseUrl);
	}


	//@AfterClass
//	public void tearDown() throws Exception {
		//Thread.sleep(1000);
		//driver.quit();
	//}

	@Test (priority =1)
	public void validLoginTest() throws InterruptedException {
	
		LoginELTC_028.sendUserName("admin");
		Thread.sleep(1000);
		LoginELTC_028.sendPassword("admin@123");
		Thread.sleep(1000);
		LoginELTC_028.clickbtn_Login();
		Thread.sleep(1000);
		LoginELTC_028.clickClasses();
		Thread.sleep(1000);
	}
		
		@Test (priority = 2)
		public void validDelTest() throws InterruptedException {			
		delprofile.clickdelbutton();
		Thread.sleep(3000);
		delprofile.Alert1();
		Thread.sleep(2000);
		delprofile.logoutdropdown();
		Thread.sleep(2000);
		delprofile.logoutbtn();
		
		
				
		/*String Expected0 = "Update successful";
		String Actualtext0 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext0,Expected0);
		System.out.println(Actualtext0);*/
		
		
		screenShot.captureScreenShot("ELTC_029");

}
}

