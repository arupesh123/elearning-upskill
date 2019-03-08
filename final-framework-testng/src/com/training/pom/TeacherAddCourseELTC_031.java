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

//To verify whether application allows teacher to create a course, add description, objective & Topics



public class TeacherAddCourseELTC_031 {
	//private static final String DropdownCategory = null;

	private WebDriver driver;
	private String classname;
	private String classname1;
	public static String classname2;

	public TeacherAddCourseELTC_031(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Click on Create a Course link
	@FindBy(xpath = "//a[contains(text(),'Create a course')]")
	// div[@class='classic-courses']//div[2]//div[1]//div[1]//div[2]
	private WebElement clickcourse;

	// Enter valid credential in Course name textbox
	@FindBy(id = "title")
	private WebElement coursename;

	// Click on Advanced Settings button
	@FindBy(how = How.ID, using = "advanced_params")
	private WebElement adv_Setting;

	// For clicking on dropdown arrow
	@FindBy(xpath = "//button[@title='none']")
	private WebElement myCategory1;

	// For choosing the value from dropdown
	@FindBy(xpath = "//*[@id=\"advanced_params_options\"]/div[1]/div[1]/div/div/ul/li[3]/a")
	private WebElement mycategory2;

	// Enter valid credential in Course code textbox
	@FindBy(xpath = "//input[@id='add_course_wanted_code']")
	private WebElement coursecode;

	// Click on Create this course button
	@FindBy(how = How.NAME, using = "submit")
	private WebElement btn_AddCourseSubmit;

	// click on Add an introduction icon
	@FindBy(xpath = "//div[@class='help-course']//a[@title='Add an introduction text']")
	private WebElement AddIntro;

	// Identifying the frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, intro_content']")
	private WebElement AddFrame;

	// Writing text inside the frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrame1;

	// Click on Save intro text
	@FindBy(how = How.NAME, using = "intro_cmdUpdate")
	private WebElement Saveintotext;

	// Click on Course description icon
	@FindBy(xpath = "//div[@class='big_icon']/a/img[@title='Course description']")
	private WebElement CourseDescpIcon;

	// Click on Description icon
	@FindBy(xpath = "//div[@class='actions']/a/img[@title='Description']")
	private WebElement DescpIcon;

	// Identify the frame
	@FindBy(xpath = "//input[@id='course_description_title']")
	private WebElement DescpTitle;

	// Identifying the Description Content frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, contentDescription']")
	private WebElement DescpContentFrame;

	// Writing text inside the Description Content frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement DescpContentFrametext;

	// Click on Save button
	@FindBy(how = How.NAME, using = "submit")
	private WebElement Save;

	// Click on Objectives icon
	@FindBy(xpath = "//div[@class='actions']/a/img[@title='Objectives']")
	private WebElement ObjIcon;

	// Enter valid credentials in Title textbox
	@FindBy(xpath = "//*[@id=\"course_description_title\"]")
	private WebElement ObjDescpTitle;

	// Identifying the Description in Objective Content frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, contentDescription']")
	private WebElement ObjContentFrame;

	// Writing text inside the Description Objective Content frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement ObjContentFrametext;

	// Click on Save button
	@FindBy(how = How.NAME, using = "submit")
	private WebElement SaveObj;

	// Click on Topics icon
	@FindBy(xpath = "//div[@class='actions']/a/img[@title='Topics']")
	private WebElement TopIcon;

	// Enter valid credentials in Title textbox
	@FindBy(xpath = "//*[@id=\"course_description_title\"]")
	private WebElement TopDescpTitle;

	// Identifying the Description in Topics Content frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, contentDescription']")
	private WebElement TopContentFrame;

	// Writing text inside the Description Topics Content frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement TopContentFrametext;

	// Click on Save button
	@FindBy(how = How.NAME, using = "submit")
	private WebElement SaveTop;
	
	
	// ==============================================================================

	// Method to click on Create a Course link
	public void clickCourse() {
		this.clickcourse.click();
	}

	// Method to enter valid credentials in Course name textbox and pass the value to admin search course
	public String sendCourseName(String coursename) {
		this.coursename.clear();
		this.coursename.sendKeys(coursename);
		return classname2 = this.coursename.getAttribute("value");
			}

	// Method to click on Advanced Settings button
	public void clickAdvSetting() {
		this.adv_Setting.click();
	}

	// Method for clicking on dropdown arrow
	public void category1() {
		myCategory1.click();
	}

	// method for choosing the value from dropdown
	public void category2() {
		mycategory2.click();
	}

	// Method for Enter valid credential in Course code textbox
	public void sendCourseCode(String coursecode) {
		this.coursecode.clear();
		this.coursecode.sendKeys(coursecode);
		
	}

	// Method for click on Create this course button
	public void AddCourseSubmit() {
		btn_AddCourseSubmit.click();
	}

	// method to click on Add an introduction icon
	public void AddIntro() {
		AddIntro.click();
	}

	// method to click on Frame
	public void Frame() {

		driver.switchTo().frame(AddFrame);
	}

	// Method to send data to frame
	public void Frame1(String AddFrame1) {
		this.AddFrame1.clear();
		this.AddFrame1.sendKeys(AddFrame1);
		classname1 = this.AddFrame1.getText();
	}
		
	// method to click on Frame2
	public void Frame2() {

		driver.switchTo().defaultContent();
	}
	// method to click to save text

	public void clickSaveToText() {
		this.Saveintotext.click();
	}

	// Method to check for assertion
	public void clickAssertion121() {
		String Expected121 = "Intro was updated";
		String Actualtext121 = driver.findElement(By.xpath("//div[contains(text(),'Intro was updated')]")).getText();
		Assert.assertEquals(Actualtext121, Expected121);
		System.out.println(Actualtext121);
	}

	// Method to click on course desc
	public void courseDescrpIcon() {
		CourseDescpIcon.click();
	}

	// Method to click on desc
	public void DescrpIcon() {
		DescpIcon.click();
	}

	// Method to send Desc title
	public void sendDescpTitle(String DescpTitle) {
		this.DescpTitle.clear();
		this.DescpTitle.sendKeys(DescpTitle);
	}

	// method to click on Frame
	public void DescpContentFrame() {

		driver.switchTo().frame(DescpContentFrame);
	}

	// method to write in frame
	public void DescpContentFrametextFrame(String DescpContentFrametext) {
		this.DescpContentFrametext.clear();
		this.DescpContentFrametext.sendKeys(DescpContentFrametext);
	}

	// method to click on frame desc
	public void FramedefDescp() {
		driver.switchTo().defaultContent();

	}
	// method to click on save

	public void ClickSave() {
		this.Save.click();

	}

	// Check for assertion
	public void clickAssertionDesc() {
		String Expected17 = "The description has been updated";
		String Actualtext17 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext17, Expected17);
		System.out.println(Actualtext17);
	}

	// Method to click on obj Icon
	public void ObjIcon() {
		ObjIcon.click();
	}

	// Method to write in Obj Desc Title
	public void ObjDescpTitle(String ObjDescpTitle) {
		this.ObjDescpTitle.clear();
		this.ObjDescpTitle.sendKeys(ObjDescpTitle);
	}

	// Method to Click on frame
	public void ObjContentFrame() {

		driver.switchTo().frame(ObjContentFrame);
	}

	// Method to write in frame
	public void ObjContentFrameText(String ObjContentFrametext) {
		this.ObjContentFrametext.clear();
		this.ObjContentFrametext.sendKeys(ObjContentFrametext);

	}

	// Method to click in Frame Obj
	public void FramedefObj() {
		driver.switchTo().defaultContent();
	}

	// Method to click save button
	public void ClickSaveObj() {
		this.SaveObj.click();

	}
	// Method to check for assertion

	public void clickAssertionObj() {
		String Expected21 = "The description has been updated";
		String Actualtext21 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext21, Expected21);
		System.out.println(Actualtext21);
	}

	// Method to click on topic icon
	public void TopicsIcon() {
		TopIcon.click();
	}

	// Method to click on Desc Title

	public void TopDescpTitle(String TopDescpTitle) {
		this.TopDescpTitle.clear();
		this.TopDescpTitle.sendKeys(TopDescpTitle);
	}

	// Method to switch to frame
	public void TopContentFrame() {
		driver.switchTo().frame(TopContentFrame);

	}

	// Method to write in frame
	public void TopContentFrame(String TopContentFrametext) {
		this.TopContentFrametext.clear();
		this.TopContentFrametext.sendKeys(TopContentFrametext);

	}

	// Method to click on Frame top
	public void FramedefTop() {
		driver.switchTo().defaultContent();
	}

	// Method to click on save

	public void ClickSaveTop() {
		SaveTop.click();

	}

	// Method to check for assertion
	public void clickAssertionTitle() {
		String Expected21 = "The description has been updated";
		String Actualtext21 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext21, Expected21);
		System.out.println(Actualtext21);
	}

	// Method to check for assertion
	public void clickAssertion25() {

		String before2 = driver.findElement(By.xpath("//*[contains(text(),'You have been registered to course: ')]")).getText();
		System.out.println(before2);
		String ActualText = before2;
		String Expected = "You have been registered to course: "+classname2;
		Assert.assertEquals(ActualText, Expected);
		System.out.println(ActualText);
	}
	
	public void clickAssertionCourseCode() {

		String ActualText = driver.findElement(By.xpath("//div[@class='page-course']/p")).getText();
		System.out.println(ActualText);
		String Expected = this.classname1;
		Assert.assertEquals(ActualText, Expected);
		System.out.println(ActualText);
	
	}
	
		
		
		
		
		
		
		
	
}
