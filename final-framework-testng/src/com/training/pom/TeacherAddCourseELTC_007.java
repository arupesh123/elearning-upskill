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

public class TeacherAddCourseELTC_007 {
	private static final String DropdownCategory = null;

	private WebDriver driver; 
	
	public TeacherAddCourseELTC_007(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
		
	  	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement createcourse;
	
	@FindBy(id="title")
	private WebElement coursename; 
	
	@FindBy(how = How.ID, using = "advanced_params")
	private WebElement adv_Setting ;
	
	// For clicking on dropdown arrow
		@FindBy(xpath="//button[@title='none']")
		private WebElement myCategory1;

		// For choosing the value from dropdown
		@FindBy(xpath="//*[@id=\"advanced_params_options\"]/div[1]/div[1]/div/div/ul/li[3]/a")
		private WebElement mycategory2;
		
		@FindBy(xpath="//input[@id='add_course_wanted_code']")
		private WebElement coursecode;
		
		
		@FindBy(how = How.NAME, using = "submit")
		private WebElement btn_AddCourseSubmit ;
		
				
		@FindBy(xpath="//div[@class='help-course']//a[@title='Add an introduction text']")
		private WebElement AddIntro ;
		
		//Identifying the frame
		@FindBy(xpath="//*[@id=\"cke_1_contents\"]/iframe")
		private WebElement AddFrame ;
		
		//Writing text inside the frame
		@FindBy(xpath="//body[@contenteditable='true']")
		private WebElement AddFrame1 ;
			
		
		//@FindBy(xpath="//*[@id=\"introduction_text\"]/fieldset")
		//private WebElement AddFrame2 ;
		
		//@FindBy(xpath="//*[@id=\"introduction_text_intro_cmdUpdate\"]")
		//private WebElement Saveintotext ;
		
		@FindBy(how = How.NAME, using = "intro_cmdUpdate")
		private WebElement Saveintotext ;
	//==============================================================================
	
		public void clickCreateCourse() {
			this.createcourse.click(); 
		}	
	
	public void sendCourseName(String coursename) {
		this.coursename.clear(); 
		this.coursename.sendKeys(coursename); 
	}
	
	public void clickAdvSetting() {
		this.adv_Setting.click(); 
	}	
	
		public void category1()  {
			myCategory1.click();
				}
		
		public void category2()  {
			mycategory2.click();
		}
			
		
		public void sendCourseCode(String coursecode) {
			this.coursecode.clear(); 
			this.coursecode.sendKeys(coursecode); 
		}
		
		public void AddCourseSubmit()  {
			btn_AddCourseSubmit.click();
		}
		
		
		public void AddIntro()  {
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

		public void clickSaveToText()  {
			this.Saveintotext.click();
		}
			
}	


		



