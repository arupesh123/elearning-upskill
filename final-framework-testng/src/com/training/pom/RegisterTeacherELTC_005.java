package com.training.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterTeacherELTC_005 {
	private static final String DropdownCategory = null;

	private WebDriver driver;

	public RegisterTeacherELTC_005(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Sign up!")
	private WebElement signup;

	@FindBy(id = "registration_firstname")
	private WebElement firstname;

	@FindBy(id = "registration_lastname")
	private WebElement lastname;

	@FindBy(id = "registration_email")
	private WebElement email;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "pass1")
	private WebElement password;

	@FindBy(id = "pass2")
	private WebElement confpassword;

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

	@FindBy(how = How.NAME, using = "submit")
	private WebElement btn_Register;

	// ==============================================================================

	public void clickSignUp() {
		this.signup.click();
	}

	public void sendFirstName(String firstname) {
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
	}

	public void sendLastName(String lastname) {
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
	}

	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}

	public void senduserName(String username) {
		this.username.clear();
		this.username.sendKeys(username);
	}

	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	public void sendConfPassword(String confpassword) {
		this.confpassword.clear();
		this.confpassword.sendKeys(confpassword);
	}

	public void sendPhone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);

	}

	public void category1() {
		mySelect1.click();
	}

	public void category2() {
		mySelect2.click();
	}

	public void clickbtn_Button() {
		this.radioButtons.click();
	}

	public void clickbtn_Register() {
		this.btn_Register.click();
	}

}
