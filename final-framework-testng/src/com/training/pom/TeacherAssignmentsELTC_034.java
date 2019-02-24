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

public class TeacherAssignmentsELTC_034 {
	private static final String DropdownCategory = null;

	private WebDriver driver;
	private String name;
	
	public TeacherAssignmentsELTC_034(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='http://elearning.upskills.in/courses/TEST55/index.php?id_session=0'][contains(text(),'Selenium255')]")
	private WebElement clickcourse;

	@FindBy(xpath = "//div[@class='big_icon']/a/img[@title='Assignments']")
	private WebElement clickAssignments;

	@FindBy(xpath = "//div[@class='actions']/a/img")
	private WebElement clickCreateAssignment;

	@FindBy(how = How.NAME, using = "new_dir")
	private WebElement AssignNameText;

	// Identifying the frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, description']")
	private WebElement AddFrameDesc;

	// Writing text inside the frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrameDescText;

	// Writing text inside the frame
	@FindBy(xpath = "//div[@class='col-sm-10 col-sm-offset-2']/button")
	private WebElement Adv_Setting;

	@FindBy(how = How.ID, using = "form1_qualification")
	private WebElement MaxScore;

	@FindBy(how = How.NAME, using = "submit")
	private WebElement Validate;
    // Need to add counter
	/*@FindBy(xpath = "//tr[.//td='IBM3 ']//input")
	private WebElement checkBox;*/

	// For choosing the Assignment Settings
	@FindBy(xpath = "//div[@class='actions']//following::a/img")
	private WebElement AssigSettings;

	// For choosing the radiobutton
	@FindBy(xpath = "//div[@class='radio']/label/input[@name='student_delete_own_publication']")
	private WebElement radioButtons;

	@FindBy(how = How.NAME, using = "submit")
	private WebElement Save;

	// ==============================================================================

	public void clickCourse() {
		this.clickcourse.click();

	}

	public void clickAssignments1() {
		this.clickAssignments.click();
	}

	public void clickCreateAssignment1() {
		this.clickCreateAssignment.click();
	}

	public void sendAssignNameText(String AssignNameText) {
		this.AssignNameText.clear();
		this.AssignNameText.sendKeys(AssignNameText);
		name=this.AssignNameText.getAttribute("value");
		System.out.println("Name is "+name);
	}

	public void FrameDesc() {

		driver.switchTo().frame(AddFrameDesc);
	}

	public void sendAddFrameDescText(String AddFrameDescText) {
		this.AddFrameDescText.clear();
		this.AddFrameDescText.sendKeys(AddFrameDescText);
	}

	// to come out of frame
	public void FrameDesce2out() {

		driver.switchTo().defaultContent();
	}

	public void Adv_Setting1() {
		Adv_Setting.click();
	}

	public void SendMaxScore(String MaxScore) {
		this.MaxScore.clear();
		this.MaxScore.sendKeys(MaxScore);
	}

	public void Validate1() {
		Validate.click();
	}

	public void checkBox1() {
		String before="//tr[.//td='";
		String after=" ']//input";
		//tr[.//td='IBM1']//input
		String xpathname=before+name+after;
		driver.findElement(By.xpath(xpathname)).click();
		
		//checkBox.click();
	}

	public void AssigSettings1() {
		AssigSettings.click();
	}

	public void radioButtons1() {
		radioButtons.click();
	}

	public void Save1() {
		Save.click();
	}

}