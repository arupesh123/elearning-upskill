package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//TO verify whether application allows student to recover password in I lost my password page

public class RecoverPasswordELTC_004 {
	private WebDriver driver; 
	
	public RecoverPasswordELTC_004(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
		
	  // Click on Lost my password link
	@FindBy(linkText = "I lost my password")
	private WebElement losyMyPassword; 
	
	// Click on Lost password box
	@FindBy(id="lost_password_user")
	private WebElement usernameBox;
	
	
	//Method to Click on Send message button
	@FindBy(how = How.NAME, using = "submit")
	private WebElement btn_SendMessage ;
	
	//method to Click on Sign up button
	public void clickSignUp() {
		this.losyMyPassword.click(); 
	}	
	
	//Method to send username to text box
	public void sendUserName(String username) {
		this.usernameBox.clear(); 
		this.usernameBox.sendKeys(username); 
	}
	//Method to click on message button
		public void clickbtn_SendMessage() {
			this.btn_SendMessage.click(); 
}
}

