package com.training.pom;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.training.generics.ScreenShot;

public class RegistrationELTC_001 {
	private WebDriver driver;
	private String classname1;
	private String classname2;
	private String classemail;
	private String classconfpwd;
	
	//TO verify whether application allows user to get registered as Student 

	public RegistrationELTC_001(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 
	
	//Click on Signup link
	@FindBy(linkText = "Sign up!")
	private WebElement signup;
    //Click on first name
	@FindBy(id = "registration_firstname")
	private WebElement firstname;
    //Click on last name
	@FindBy(id = "registration_lastname")
	private WebElement lastname;
   //Click on email
	@FindBy(id = "registration_email")
	private WebElement email;
   //click on username
	@FindBy(id = "username")
	private WebElement username;
    //Click on passowrd
	@FindBy(id = "pass1")
	private WebElement password;
    //Click on confirm password
	@FindBy(id = "pass2")
	private WebElement confpassword;
    //Click on phone
	@FindBy(id = "registration_phone")
	private WebElement phone;
   //Click on register button
	@FindBy(how = How.NAME, using = "submit")
	private WebElement btn_Register;
    /*//Check for assert 
	@FindBy(xpath = "//*[@id=\"content-section\"]/div/div[2]/div/div")
	private WebElement AssertonUsernameFailure;
    //Check for assert
	@FindBy(xpath = "//*[@id=\"content-section\"]/div/div[2]/div/div")
	private WebElement AssertInvalidEmail;*/
    //Click on log out button
	@FindBy(xpath = "//*[@id=\"logout_button\"]")
	private WebElement logout;
   // Click on log out arroe
	@FindBy(xpath = "//*[@id=\"menuone\"]/ul[2]/li[2]/a/span[2]")
	private WebElement logoutarrow;

	// ========================================
	
	//Method to click Signup button
	public void clickSignUp() {
		this.signup.click();
	}
	//Method to  pass value to firstname
	public String sendFirstName(String firstname) {
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
		classname1 = this.firstname.getAttribute("value");
		return firstname;
	}
	//Method to pass value to last name
	public String sendLastName(String lastname) {
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
		classname2 = this.lastname.getAttribute("value");
		return lastname;
	}
	//Method to pass value to send email
	public String sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
		classemail = this.email.getAttribute("value");
		return email;
	}
	//Method to pass value to username
	public String senduserName(String username) {
		this.username.clear();
		this.username.sendKeys(username);
		return username;
	}
	//Method to pass value to send paswsord
	public String sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
		return password;
	}
	//Method to pass value to send confpassword
	public String sendConfPassword(String confpassword) {
		this.confpassword.clear();
		this.confpassword.sendKeys(confpassword);
		classconfpwd = this.email.getAttribute("value");
		return confpassword;
	}
	//Method to pass value to send phone
	public void sendPhone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);

	}
	//Method to pass value to click register button
	public void clickbtn_Register() {
		this.btn_Register.click();
	}
	//check for assertion
	public void CheckAssertion1() {

		// div/p[contains(text()[1],'Dear')]

		String before = "//div/p[contains(text(),'Dear ";
		String after = ",')]";
		String classuser = before + classname1 + " " + classname2 + after; // Dear abc8 def7

		String Expected1 = classname1;
		String Actualtext1 = driver.findElement(By.xpath(classuser)).getText();

		Assert.assertTrue(Actualtext1.contains(Expected1));
		System.out.println(Actualtext1);
	}
     //Check for assertion
	/*public void ClickAssertion2() {
		String Expected59 = "rgba(252, 248, 227, 1)";
		String Actualtext59 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/div/div"))
				.getCssValue("background-color");
		//Assert.assertTrue(Actualtext59.contains(Expected59));
		Assert.assertEquals(Actualtext59, Expected59);
		System.out.println(Actualtext59);*/
	
	//Check for assertion
	public void ClickAssertion2() {
		
		String color11 = driver.findElement(By.xpath("//div[@class='alert alert-warning']")).getCssValue("background-color");
		System.out.println(color11);
		String ActualColor1 = Color.fromString(color11).asHex();
		String ExpectedColor1 = "#fcf8e3";
		Assert.assertEquals(ActualColor1,ExpectedColor1);
		System.out.println("Actual Color1 is " +ActualColor1);
				
			} 
	//Check for assertion
	public void ClickAssertion_ELTD_062_ConfPass_Diff() {
		
		String color12 = driver.findElement(By.xpath("//div[@class='alert alert-warning']")).getCssValue("background-color");
		System.out.println(color12);
		String ActualColor2 = Color.fromString(color12).asHex();
		String ExpectedColor2 = "#fcf8e3";
		Assert.assertEquals(ActualColor2,ExpectedColor2);
		System.out.println("Actual Color2 is " +ActualColor2);
				
		
		

	}
}
