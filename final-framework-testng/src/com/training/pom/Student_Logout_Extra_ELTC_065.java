package com.training.pom;

import org.openqa.selenium.WebDriver;

//here student is tell to log out

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Student_Logout_Extra_ELTC_065 {
	private WebDriver driver; 
	
	public Student_Logout_Extra_ELTC_065(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		
	//Click on Logout Arrow of Student Login
	@FindBy(xpath="//span[@class='caret']")
	private WebElement logoutClickStu; 
	
	//Click on Logout button of Student Login
		@FindBy(xpath="//a[@title='Logout']")
		private WebElement LogoutStu; 
	
	
//=======================================================		
		
	
		
	//Method to Click on Logout Arrow of teacher login
		public void logoutClickStuArrow() {
			this.logoutClickStu.click(); 
		}
		
	//Method to Click on Logout Arrow  of teacher login
		public void clickLogoutStu() {
			this.LogoutStu.click(); 
		}
	
}

