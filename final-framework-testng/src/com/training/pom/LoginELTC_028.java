package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginELTC_028 {
	private WebDriver driver;

	public LoginELTC_028(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(),'Classes')]")
	private WebElement classes;

	@FindBy(xpath = "//a[@href='add_courses_to_usergroup.php?id=91']//img[@title='Subscribe class to courses']")
	private WebElement subclasstocourse;

	@FindBy(xpath = "//option[@value='138']")
	private WebElement AAAAA;

	@FindBy(xpath = "//*[@id=\"content-section\"]/div/form/table/tbody/tr[3]/td[2]/button[1]")
	private WebElement Arrow;

	@FindBy(xpath = "//option[@value='139']")
	private WebElement AAAAAtoCourse;

	@FindBy(xpath = "//*[@id=\"content-section\"]/div/form/table/tbody/tr[4]/td/button")
	private WebElement btnsubclasstocourses;

	public void sendUserName(String username) {
		this.username.clear();
		this.username.sendKeys(username);
	}

	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	public void clickbtn_Login() {
		this.loginBtn.click();
	}

	public void clickClasses() {
		this.classes.click();
	}

	public void clickSubClassToCourse() {
		this.subclasstocourse.click();
	}

	public void clickAAAAA() {
		this.AAAAA.click();
	}

	public void clickArrow() {
		this.Arrow.click();
	}
	public void clickAAAAAtoCourse() {
		this.AAAAAtoCourse.click();
	}

	public void clickbtn_Subscribeclasstocourses() {
		this.btnsubclasstocourses.click();
	}

}
