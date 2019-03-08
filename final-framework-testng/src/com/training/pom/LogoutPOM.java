package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOM {
	private WebDriver driver; 
	
	
	public LogoutPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"logout_button\"]")
	private WebElement logout; 
	
	
	public void clickLogoutBtn() {
		this.logout.click(); 
	}
}
