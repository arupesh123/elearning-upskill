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
import org.testng.Assert;


//TO verify whether application allows teacher to review the assignment submitted by the student & rate

public class TeacherAssignStudentRateELTC_035 {
	private static final String DropdownCategory = null;

	private WebDriver driver;
	private String name;
	
	public TeacherAssignStudentRateELTC_035(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
	//Click on the course link
	@FindBy(xpath = "//a[@href='http://elearning.upskills.in/courses/TEST54/index.php?id_session=0'][contains(text(),'Selenium255')]")
	private WebElement clickcourse;
	
	//Click on Assignments icon
	@FindBy(xpath = "//div[@class='big_icon']/a/img[@title='Assignments']")
	private WebElement clickAssignments;
    
	//Click on assignment submitted by the student
	@FindBy(xpath = "//td[@class='jqgrid_whitespace']/a")
	private WebElement clickAssignSub;
	
	//click on correct and rate icon
	@FindBy(xpath = "//div[@class='work-action']//following::a/img")
	private WebElement clickCorrectnRate;
	
	//Enter valid credentials in score textbox	
	@FindBy(how = How.NAME, using = "qualification")
	private WebElement Score;
    
	//click on send message button
	@FindBy(how = How.NAME, using = "button")
	private WebElement clickButton;
	
	//click on name containing assignments link
	@FindBy(xpath = "//a[contains(text(),'hands on exercise')]")
	private WebElement clicknameAssignLink;
	
	

	// ==============================================================================
	//Method to click on click courese
	public void clickCourse() {
		this.clickcourse.click();

	}
	//Method to clcik on Assignments
	public void clickAssignments1() {
		this.clickAssignments.click();
	}
	//Method to on Assin button
	public void clickAssignSub1() {
		this.clickAssignSub.click();
	}
	//Method to clcik correction rate
	public void clickCorrectnRate1() {
		this.clickCorrectnRate.click();
	}
	//Method to send value to text to send score
	public void sendScore1(String Score) {
		this.Score.clear();
		this.Score.sendKeys(Score);
	}
	//Method to clcik button
	public void clickbutton1() {
		this.clickButton.click();
	}
	//Method toclick assertions
	public void ClickAssertion1() {
	String Expected2 = "Update successful";
	String Actualtext2 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/div/div[3]"))
			.getText();
	Assert.assertEquals(Actualtext2, Expected2);
	System.out.println(Actualtext2);
	}
	//Method to clcik assignment link
	public void clicknameAssignLink1() {
		this.clicknameAssignLink.click();
	}
	//Method to check for assertion
	public void ClickAssertionRev() {
	String Expected4 = "Revised";
	String Actualtext4 = driver.findElement(By.xpath("//span[contains(text(),'Revised')]")).getText();
	Assert.assertEquals(Actualtext4, Expected4);
	System.out.println(Actualtext4);
	
	String Expected3 = "50.0 / 50";
	String Actualtext3 = driver.findElement(By.xpath("//span[contains(text(),'50.0 / 50')]")).getText();
	Assert.assertEquals(Actualtext3, Expected3);
	System.out.println(Actualtext3);
	}
	
		
}