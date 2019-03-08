package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	public String sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
		return userName;
	}
	
	public String sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
		return password;
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}
