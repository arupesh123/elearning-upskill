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

public class TeacherAddCourseELTC_031 {
	private static final String DropdownCategory = null;

	private WebDriver driver;

	public TeacherAddCourseELTC_031(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Create a course')]")
	//div[@class='classic-courses']//div[2]//div[1]//div[1]//div[2]
	private WebElement clickcourse;

	@FindBy(id = "title")
	private WebElement coursename;

	@FindBy(how = How.ID, using = "advanced_params")
	private WebElement adv_Setting;

	// For clicking on dropdown arrow
	@FindBy(xpath = "//button[@title='none']")
	private WebElement myCategory1;

	// For choosing the value from dropdown
	@FindBy(xpath = "//*[@id=\"advanced_params_options\"]/div[1]/div[1]/div/div/ul/li[3]/a")
	private WebElement mycategory2;

	@FindBy(xpath = "//input[@id='add_course_wanted_code']")
	private WebElement coursecode;

	@FindBy(how = How.NAME, using = "submit")
	private WebElement btn_AddCourseSubmit;

	@FindBy(xpath = "//div[@class='help-course']//a[@title='Add an introduction text']")
	private WebElement AddIntro;

	// Identifying the frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, intro_content']")
	private WebElement AddFrame;

	// Writing text inside the frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrame1;

	@FindBy(how = How.NAME, using = "intro_cmdUpdate")
	private WebElement Saveintotext;

	@FindBy(xpath = "//div[@class='big_icon']/a/img[@title='Course description']")
	private WebElement CourseDescpIcon;

	@FindBy(xpath = "//div[@class='actions']/a/img[@title='Description']")
	private WebElement DescpIcon;

	@FindBy(xpath = "//input[@id='course_description_title']")
	private WebElement DescpTitle;

	// Identifying the Description Content frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, contentDescription']")
	private WebElement DescpContentFrame;

	// Writing text inside the Description Content frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement DescpContentFrametext;

	@FindBy(how = How.NAME, using = "submit")
	private WebElement Save;

	@FindBy(xpath = "//div[@class='actions']/a/img[@title='Objectives']")
	private WebElement ObjIcon;

	// Object
	@FindBy(xpath = "//*[@id=\"course_description_title\"]")
	private WebElement ObjDescpTitle;

	// Identifying the Description in Objective Content frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, contentDescription']")
	private WebElement ObjContentFrame;

	// Writing text inside the Description Objective Content frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement ObjContentFrametext;

	@FindBy(how = How.NAME, using = "submit")
	private WebElement SaveObj;
	
	// Topics
	@FindBy(xpath = "//div[@class='actions']/a/img[@title='Topics']")
	private WebElement TopIcon;

	
	@FindBy(xpath = "//*[@id=\"course_description_title\"]")
	private WebElement TopDescpTitle;

	// Identifying the Description in Topics Content frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, contentDescription']")
	private WebElement TopContentFrame;

	// Writing text inside the Description Topics Content frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement TopContentFrametext;

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
}

	
	
	
	



