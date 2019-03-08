package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EditprofileELTC_003 {
	private WebDriver driver; 
	
	//To verify whether application allows user to change the password in Edit Profile pag
	
	public EditprofileELTC_003(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Click on Editprofile
	@FindBy(linkText = "Edit profile")
	private WebElement editprofile; 
	
	//Click on password
	@FindBy(id="profile_password0")
	private WebElement pass;
	
	//Click on new password
	@FindBy(id="password1")
	private WebElement newpwd; 
	
	//Click on conf password
	@FindBy(id="profile_password2")
	private WebElement confpwd;
	
	//Click on save button
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
	//Method to click on Edit profile
	public void editprofile() {
		this.editprofile.click(); 
	}
	//Method to send password to text box
	public void sendPassword1(String pass) {
		this.pass.clear();
		this.pass.sendKeys(pass);
	}
	//Method to send new passowrd to text box
	public void sendNewPassword(String newpwd) {
		this.newpwd.clear();
		this.newpwd.sendKeys(newpwd);
	}
	//Method to send confpassowrd to text box
	public void sendConfPassword(String confpwd) {
		this.confpwd.clear(); 
		this.confpwd.sendKeys(confpwd); 
	}
	////Method to click on save button
	public void clickbtn_Save() {
		this.save_setting.click(); 
}     
	//check for assertion 
	 public void assertion() {
		 String Expected = "Your new profile has been saved";
			String Actualtext = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/div/div[1]")).getText();
			Assert.assertEquals(Actualtext,Expected);
			System.out.println(Actualtext);
	 }
	 
}

