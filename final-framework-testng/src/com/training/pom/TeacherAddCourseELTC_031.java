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

public class TeacherAddCourseELTC_031 {
	private static final String DropdownCategory = null;

	private WebDriver driver;

	public TeacherAddCourseELTC_031(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
	//. Click on Create a Course link
	@FindBy(xpath = "//a[contains(text(),'Create a course')]")
	//div[@class='classic-courses']//div[2]//div[1]//div[1]//div[2]
	private WebElement clickcourse;
    
	
    //Enter valid credential in Course name textbox
	@FindBy(id = "title")
	private WebElement coursename;
    
	//Click on Advanced Settings button
	@FindBy(how = How.ID, using = "advanced_params")
	private WebElement adv_Setting;

	// For clicking on dropdown arrow
	@FindBy(xpath = "//button[@title='none']")
	private WebElement myCategory1;

	// For choosing the value from dropdown
	@FindBy(xpath = "//*[@id=\"advanced_params_options\"]/div[1]/div[1]/div/div/ul/li[3]/a")
	private WebElement mycategory2;
    
	//Enter valid credential in Course code textbox
	@FindBy(xpath = "//input[@id='add_course_wanted_code']")
	private WebElement coursecode;
    
	
	//Click on Create this course button
	@FindBy(how = How.NAME, using = "submit")
	private WebElement btn_AddCourseSubmit;
	
	//click on Add an introduction icon
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
    
	//Click on Course description icon
	@FindBy(xpath = "//div[@class='big_icon']/a/img[@title='Course description']")
	private WebElement CourseDescpIcon;
	
	//Click on Description icon
	@FindBy(xpath = "//div[@class='actions']/a/img[@title='Description']")
	private WebElement DescpIcon;
	
	//Identify the frame
	@FindBy(xpath = "//input[@id='course_description_title']")
	private WebElement DescpTitle;

	// Identifying the Description Content frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, contentDescription']")
	private WebElement DescpContentFrame;

	// Writing text inside the Description Content frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement DescpContentFrametext;
    
	//Click on Save button
	@FindBy(how = How.NAME, using = "submit")
	private WebElement Save;
	
	//Click on Objectives icon
	@FindBy(xpath = "//div[@class='actions']/a/img[@title='Objectives']")
	private WebElement ObjIcon;

	//  Enter valid credentials in Title textbox
	@FindBy(xpath = "//*[@id=\"course_description_title\"]")
	private WebElement ObjDescpTitle;

	// Identifying the Description in Objective Content frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, contentDescription']")
	private WebElement ObjContentFrame;

	// Writing text inside the Description Objective Content frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement ObjContentFrametext;
    
	//Click on Save button
	@FindBy(how = How.NAME, using = "submit")
	private WebElement SaveObj;
	
	// Click on Topics icon
	@FindBy(xpath = "//div[@class='actions']/a/img[@title='Topics']")
	private WebElement TopIcon;

	//Enter valid credentials in Title textbox
	@FindBy(xpath = "//*[@id=\"course_description_title\"]")
	private WebElement TopDescpTitle;

	// Identifying the Description in Topics Content frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, contentDescription']")
	private WebElement TopContentFrame;

	// Writing text inside the Description Topics Content frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement TopContentFrametext;
    
	//Click on Save button
	@FindBy(how = How.NAME, using = "submit")
	private WebElement SaveTop;
	// ==============================================================================

	public void clickCourse() {
		this.clickcourse.click();
	}

	public void sendCourseName(String coursename) {
		this.coursename.clear();
		this.coursename.sendKeys(coursename);
	}

	public void clickAdvSetting() {
		this.adv_Setting.click();
	}

	public void category1() {
		myCategory1.click();
	}

	public void category2() {
		mycategory2.click();
	}

	public void sendCourseCode(String coursecode) {
		this.coursecode.clear();
		this.coursecode.sendKeys(coursecode);
	}

	public void AddCourseSubmit() {
		btn_AddCourseSubmit.click();
	}

	public void AddIntro() {
		AddIntro.click();
	}

	public void Frame() {

		driver.switchTo().frame(AddFrame);
	}

	public void Frame1(String AddFrame1) {
		this.AddFrame1.clear();
		this.AddFrame1.sendKeys(AddFrame1);
	}

	public void Frame2() {

		driver.switchTo().defaultContent();
	}

	public void clickSaveToText() {
		this.Saveintotext.click();
	}
	
	public void clickAssertion121() {
	String Expected121 = "Intro was updated";
	String Actualtext121 = driver.findElement(By.xpath("//div[contains(text(),'Intro was updated')]")).getText();
	Assert.assertEquals(Actualtext121, Expected121);
	System.out.println(Actualtext121);
	}
    
	public void courseDescrpIcon() {
		CourseDescpIcon.click();
	}

	public void DescrpIcon() {
		DescpIcon.click();
	}

	public void sendDescpTitle(String DescpTitle) {
		this.DescpTitle.clear();
		this.DescpTitle.sendKeys(DescpTitle);
	}

	public void DescpContentFrame() {

		driver.switchTo().frame(DescpContentFrame);
	}

	public void DescpContentFrametextFrame(String DescpContentFrametext) {
		this.DescpContentFrametext.clear();
		this.DescpContentFrametext.sendKeys(DescpContentFrametext);
	}

	public void FramedefDescp() {
		driver.switchTo().defaultContent();

	}

	public void ClickSave() {
		this.Save.click();

	}
	
	
	public void clickAssertion17() {
	String Expected17 = "The description has been updated";
	String Actualtext17 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
	Assert.assertEquals(Actualtext17, Expected17);
	System.out.println(Actualtext17);
	}

	public void ObjIcon() {
		ObjIcon.click();
	}

	public void ObjDescpTitle(String ObjDescpTitle) {
		this.ObjDescpTitle.clear();
		this.ObjDescpTitle.sendKeys(ObjDescpTitle);
	}

	public void ObjContentFrame() {

		driver.switchTo().frame(ObjContentFrame);
	}

	public void ObjContentFrameText(String ObjContentFrametext) {
		this.ObjContentFrametext.clear();
		this.ObjContentFrametext.sendKeys(ObjContentFrametext);

	}

	public void FramedefObj() {
		driver.switchTo().defaultContent();
	}

	public void ClickSaveObj() {
		this.SaveObj.click();

	}
	
	
	public void clickAssertion21() {
	String Expected21 = "The description has been updated";
	String Actualtext21 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
	Assert.assertEquals(Actualtext21, Expected21);
	System.out.println(Actualtext21);
	}
	
	public void TopicsIcon() {
		TopIcon.click();
	}
	
	public void TopDescpTitle(String TopDescpTitle) {
		this.TopDescpTitle.clear();
		this.TopDescpTitle.sendKeys(TopDescpTitle);
	}
	
	public void TopContentFrame() {
		driver.switchTo().frame(TopContentFrame);
		
	}
	
	public void TopContentFrame(String TopContentFrametext) {
		this.TopContentFrametext.clear();
		this.TopContentFrametext.sendKeys(TopContentFrametext);
		
	}
	
	public void FramedefTop() {
		driver.switchTo().defaultContent();
	}
	
	public void ClickSaveTop() {
		SaveTop.click();
		
	}
	
	public void clickAssertion25() {
		String Expected25 = "The description has been updated";
		String Actualtext25 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext25, Expected25);
		System.out.println(Actualtext25);
	}
}

	
	
	
	



