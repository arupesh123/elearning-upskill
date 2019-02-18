package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginELTC_029 {
	private WebDriver driver;

	public LoginELTC_029(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//tr[@id='103']//img[@title='Delete']")
	private WebElement delete;
	
	@FindBy(xpath = "//a[contains(@class,'dropdown-toggle')]")
	private WebElement logoutdrpdown;
	
	@FindBy(xpath = "//a[@id='logout_button']")
	private WebElement logoutbtn;
	
	
	public void clickdelbutton() {
		this.delete.click();
	}
	
	public void Alert1() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void logoutdropdown() {
		this.logoutdrpdown.click();
	}
	
	public void logoutbtn() {
		this.logoutbtn.click();
	}


}