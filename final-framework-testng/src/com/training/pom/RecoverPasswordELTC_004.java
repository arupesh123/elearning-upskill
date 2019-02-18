package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RecoverPasswordELTC_004 {
	private WebDriver driver; 
	
	public RecoverPasswordELTC_004(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
		
	  
	@FindBy(linkText = "I lost my password")
	private WebElement losyMyPassword; 
	
	@FindBy(id="lost_password_user")
	private WebElement usernameBox;
	
	@FindBy(how = How.NAME, using = "submit")
	private WebElement btn_SendMessage ;
	
	
	public void clickSignUp() {
		this.losyMyPassword.click(); 
	}	
	
	public void sendUserName(String username) {
		this.usernameBox.clear(); 
		this.usernameBox.sendKeys(username); 
	}
	
		public void clickbtn_SendMessage() {
			this.btn_SendMessage.click(); 
}
}

