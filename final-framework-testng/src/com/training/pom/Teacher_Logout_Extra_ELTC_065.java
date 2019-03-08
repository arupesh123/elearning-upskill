package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


// Here this script teacher to log out

public class Teacher_Logout_Extra_ELTC_065 {
	private WebDriver driver; 
	
	public Teacher_Logout_Extra_ELTC_065(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Click on Logout Arrow of teacher login
	@FindBy(xpath="//li[@class='dropdown avatar-user']/a")
	private WebElement logoutClick; 
	
	//Click on Logout button of Teacher Login
	@FindBy(xpath="//li[@class='user-body'][3]/a")
	private WebElement Logout; 
	
	
	//Click on Logout Arrow of Student Login
	@FindBy(xpath="//span[@class='caret']")
	private WebElement logoutClickStu; 
	
	//Click on Logout button of Student Login
		@FindBy(xpath="//a[@title='Logout']")
		private WebElement LogoutStu; 
	
	
//=======================================================		
		
	
	//Method to Click on Logout Arrow of teacher login
	public void clickLogoutArrow() {
		this.logoutClick.click(); 
	}
	//Method to Click on Logout Arrow  of teacher login
	public void clickLogout() {
		this.Logout.click(); 
	}
	
	
	//Method to Click on Logout Arrow of teacher login
		public void logoutClickStuArrow() {
			this.logoutClickStu.click(); 
		}
		
	//Method to Click on Logout Arrow  of teacher login
		public void clickLogoutStu() {
			this.LogoutStu.click(); 
		}
	
}

