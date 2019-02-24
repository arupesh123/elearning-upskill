package com.training.pom;

import java.awt.Frame;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TeacherAssignStudentRateELTC_035 {
	private static final String DropdownCategory = null;

	private WebDriver driver;
	private String name;
	
	public TeacherAssignStudentRateELTC_035(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='http://elearning.upskills.in/courses/TEST55/index.php?id_session=0'][contains(text(),'Selenium255')]")
	private WebElement clickcourse;

	@FindBy(xpath = "//div[@class='big_icon']/a/img[@title='Assignments']")
	private WebElement clickAssignments;

	@FindBy(xpath = "//td[@class='jqgrid_whitespace']/a")
	private WebElement clickAssignSub;
	
	
	//click on correct and rate icon
	@FindBy(xpath = "//div[@class='work-action']//following::a/img")
	private WebElement clickCorrectnRate;
	
	@FindBy(how = How.NAME, using = "qualification")
	private WebElement Score;

	@FindBy(how = How.NAME, using = "button")
	private WebElement clickButton;
	
	@FindBy(xpath = "//a[contains(text(),'hands on exercise')]")
	private WebElement clicknameAssignLink;
	
	
	
	
	
	

	// ==============================================================================

	public void clickCourse() {
		this.clickcourse.click();

	}

	public void clickAssignments1() {
		this.clickAssignments.click();
	}

	public void clickAssignSub1() {
		this.clickAssignSub.click();
	}
	public void clickCorrectnRate1() {
		this.clickCorrectnRate.click();
	}
	public void sendScore1(String Score) {
		this.Score.clear();
		this.Score.sendKeys(Score);
	}
	public void clickbutton1() {
		this.clickButton.click();
	}

	public void clicknameAssignLink1() {
		this.clicknameAssignLink.click();
	}
	
	
		
}