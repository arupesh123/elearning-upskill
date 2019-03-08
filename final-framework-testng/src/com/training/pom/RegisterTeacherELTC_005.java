package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//TO verify whether application allows user to get registered as Teacher

public class RegisterTeacherELTC_005 {
	private static final String DropdownCategory = null;

	private WebDriver driver;

	public RegisterTeacherELTC_005(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
  
	//Click on the sign up link
	@FindBy(linkText = "Sign up!")
	private WebElement signup;
	
	// click on the firstname
	@FindBy(id = "registration_firstname")
	private WebElement firstname;
    
	//Click on the last name
	@FindBy(id = "registration_lastname")
	private WebElement lastname;

	//Click on the email
	@FindBy(id = "registration_email")
	private WebElement email;

	//C;ick on the username
	@FindBy(id = "username")
	private WebElement username;

	//Click on password
	@FindBy(id = "pass1")
	private WebElement password;

	//Click on conf passowrd
	@FindBy(id = "pass2")
	private WebElement confpassword;

	//Click on phone
	@FindBy(id = "registration_phone")
	private WebElement phone;

	// For clicking on dropdown arrow
	@FindBy(xpath = "//span[@class='caret']")
	private WebElement mySelect1;

	// For choosing the value from dropdown
	@FindBy(xpath = "//div[@class='dropdown-menu open']/ul/li[6]")
	private WebElement mySelect2;

	// For choosing the radiobutton
	@FindBy(xpath = "//label[contains(text(),'Teacher (creates courses)')]")
	private WebElement radioButtons;
    
	//Click on Register button
	@FindBy(how = How.NAME, using = "submit")
	private WebElement btn_Register;

	// ==============================================================================
      
	//method to click on sign up button
	public void clickSignUp() {
		this.signup.click();
	}
	//method to write values to firstname text box
	public void sendFirstName(String firstname) {
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
	}
	//method to write values to lastname text box
	public void sendLastName(String lastname) {
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
	}
	//method to write values to email text box
	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	//method to write values to username text box
	public void senduserName(String username) {
		this.username.clear();
		this.username.sendKeys(username);
	}
	//method to write values to password text box
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	//method to write values to confirm password text box
	public void sendConfPassword(String confpassword) {
		this.confpassword.clear();
		this.confpassword.sendKeys(confpassword);
	}
	//method to write values to phone text box
	public void sendPhone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);

	}
	//method to click on category
	public void category1() {
		mySelect1.click();
	}
	//method to click on category2
	public void category2() {
		mySelect2.click();
	}
	//method to click on radio buttons
	public void clickbtn_Button() {
		this.radioButtons.click();
	}
	//method to click on register button
	public void clickbtn_Register() {
		this.btn_Register.click();
	}
	
	//Check for assertions
	public void assertion() {
		String Expected0 = "Dear Sourik Mukherjee,\n" + 
				"\n" + 
				"Your personal settings have been registered.";
		String Actualtext0 = driver.findElement(By.xpath("//body[contains(@class,'section-global')]/div[@class='wrap']/section[@id='content-section']/div[@class='container']/div[@class='row']/div[@class='col-xs-12 col-md-12']/p[1]\r\n" + 
				"")).getText();
		
		Assert.assertEquals(Actualtext0,Expected0);
		System.out.println(Actualtext0);
		
		String Expected2 = "An email has been sent to help you remember your login and password.";
		String Actualtext2 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/div/p[2]")).getText();
		Assert.assertEquals(Actualtext2,Expected2);
		System.out.println(Actualtext2);
	
	}

}
