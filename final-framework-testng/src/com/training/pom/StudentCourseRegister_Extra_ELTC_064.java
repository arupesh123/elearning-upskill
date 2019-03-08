package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StudentCourseRegister_Extra_ELTC_064 {
	private WebDriver driver;
	private String classname;
	public String classusername;
	public String classname2;


	public StudentCourseRegister_Extra_ELTC_064(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	// Click on the login button
	@FindBy(id = "login")
	private WebElement userName;

	// click on password button
	@FindBy(id = "password")
	private WebElement password;

	// Click on the login button
	@FindBy(id = "formLogin_submitAuth")
	private WebElement loginBtn;

	// Click on course catalog
	@FindBy(xpath = "//li[@class='list-course']/a")
	private WebElement courseCatalog;

	// click on name text box
	@FindBy(name = "search_term")
	private WebElement nameTextbox;

	// Click on Name search text box
	@FindBy(xpath = "//div[@class='input-group-btn']/button")
	private WebElement nameSearch;

	// Click on Subscribe button
	@FindBy(xpath = "//body[contains(@class,'section-catalog')]//div[@class='row']//div[@class='row']//div[1]//div[1]//div[2]//div[4]//div[2]//div[1]//a[1]")
	private WebElement Subscribe;
	
	@FindBy(xpath = "//*[@id=\"content-section\"]/div/div[2]/a")
	private WebElement clickOnCourse;
	
	@FindBy(xpath = "//a[contains(text(),'Course description')]")
	private WebElement clickOnDesc;
	
	
	// =======================================================

	// Method to Click on the login button
	public String sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
		return classusername = this.userName.getAttribute("value");
		
	}
	

	// Method to click on password button
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	// Method to Click on the login button
	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	// Method to Click on the Course catalog link
	public void clickcourseCatalog() {
		this.courseCatalog.click();
	}

	// Click on the login button
	public void sendNameTextbox(String nameTextbox) {
		this.nameTextbox.clear();
		this.nameTextbox.sendKeys(nameTextbox);
		classname2 = this.nameTextbox.getAttribute("value");
	}

	// Method to Click on the Name Search text box
	public void nameSearch() {
		this.nameSearch.click();
	}

	// Method to click on Subscribe button
	public void clickSubscribe() {
		this.Subscribe.click();
	}
	
	//method to click on course
	
	public void clickOnCourse() {
		this.clickOnCourse.click();
	}
	
	//methid to lcikc on course desc
	public void clickOnCourseDesc() {
		this.clickOnDesc.click();
	}
	
	
}
