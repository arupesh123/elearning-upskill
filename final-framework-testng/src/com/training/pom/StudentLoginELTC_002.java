package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


//To verify whether application allows student to get logged in by entering valid credentials

public class StudentLoginELTC_002 {
	private WebDriver driver; 
	
	public StudentLoginELTC_002(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Click on the field username
	@FindBy(id="login")
	private WebElement userName; 
	//Click on the field password 
	@FindBy(id="password")
	private WebElement password;
	//Click on login button
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	//====================================================	
	
	
	//Method to send values to username
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	// Method to send value to passowrd
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	// Method to click on Login button
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	//Check for assertion
	public void assertion() {
			boolean Expected = true;
			boolean Actual = driver.findElement(By.xpath("//*[@id=\"homepage-course\"]/div/p[1]")).isDisplayed();
			String Actual1text = driver.findElement(By.xpath("//*[@id=\"homepage-course\"]/div/p[1]")).getText();
			Assert.assertEquals(Actual, Expected);
			System.out.println(Actual1text);
	}
	
}

