package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditprofileELTC_003 {
	private WebDriver driver; 
	
	public EditprofileELTC_003(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(name="submitAuth")
	private WebElement loginBtn; */
	
	@FindBy(linkText = "Edit profile")
	private WebElement editprofile; 
	
	@FindBy(id="profile_password0")
	private WebElement pass;
	
	@FindBy(id="password1")
	private WebElement newpwd; 
	
	@FindBy(id="profile_password2")
	private WebElement confpwd;
	
	@FindBy(how = How.NAME, using = "apply_change")
	private WebElement save_setting ;
	
			
/*	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}*/
	
	public void editprofile() {
		this.editprofile.click(); 
	}
	
	public void sendPassword1(String pass) {
		this.pass.clear();
		this.pass.sendKeys(pass);
	}
	
	public void sendNewPassword(String newpwd) {
		this.newpwd.clear();
		this.newpwd.sendKeys(newpwd);
	}
	
	public void sendConfPassword(String confpwd) {
		this.confpwd.clear(); 
		this.confpwd.sendKeys(confpwd); 
	}
	
	public void clickbtn_Save() {
		this.save_setting.click(); 
}
}

