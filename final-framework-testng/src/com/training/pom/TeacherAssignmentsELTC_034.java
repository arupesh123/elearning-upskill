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
import com.training.generics.ScreenShot_ELTC_001;

//To Verify whether application allows teacher to add assignments & change default settings

public class TeacherAssignmentsELTC_034 {
	private static final String DropdownCategory = null;

	private WebDriver driver;
	private String name;
	private ScreenShot_ELTC_001 screenShot;

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

	// For choosing the Assignment Settings
	@FindBy(xpath = "//div[@class='actions']//following::a/img")
	private WebElement AssigSettings;

	// For choosing the radiobutton
	@FindBy(xpath = "//div[@class='radio']/label/input[@name='student_delete_own_publication']")
	private WebElement radioButtons;

	// For clciking on save
	@FindBy(how = How.NAME, using = "submit")
	private WebElement Save;

	// ==============================================================================

	// Method to click on course
	public void clickCourse() {
		this.clickcourse.click();

	}

	// Method to click Assignments
	public void clickAssignments1() {
		this.clickAssignments.click();
	}

	// Method to Click create Assignments
	public void clickCreateAssignment1() {
		this.clickCreateAssignment.click();
	}

	// Method to Send Assignment Text
	public void sendAssignNameText(String AssignNameText) {
		this.AssignNameText.clear();
		this.AssignNameText.sendKeys(AssignNameText);
		name = this.AssignNameText.getAttribute("value");
		System.out.println("Name is " + name);
	}

	// Method to click onFrame Desc
	public void FrameDesc() {

		driver.switchTo().frame(AddFrameDesc);
	}

	// Method to send text to frame
	public void sendAddFrameDescText(String AddFrameDescText) {
		this.AddFrameDescText.clear();
		this.AddFrameDescText.sendKeys(AddFrameDescText);
	}

	// Method to click on frame desc
	public void FrameDesce2out() {

		driver.switchTo().defaultContent();
	}

	// Method to click on advance setting
	public void Adv_Setting1() {
		Adv_Setting.click();
	}

	// Method to send text to send max score
	public void SendMaxScore(String MaxScore) {
		this.MaxScore.clear();
		this.MaxScore.sendKeys(MaxScore);
	}

	// Method to click on validate
	public void Validate1() {
		Validate.click();
	}

	// Method to check for assertion
	public void assertiontext() {
		String Expected1 = "Directory created";
		String Actualtext1 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext1, Expected1);
		System.out.println(Actualtext1);
		// screenShot.captureScreenShot("ELTC_032_Saved");

	}
	// Method to click on checkbox

	public void checkBox1() {
		String before = "//tr[.//td='";
		String after = " ']//input";
		// tr[.//td='IBM1']//input
		String xpathname = before + name + after;
		driver.findElement(By.xpath(xpathname)).click();

	}

	// Method to click on adv seting
	public void AssigSettings1() {
		AssigSettings.click();
	}

	// Method to to click on radio button
	public void radioButtons1() {
		radioButtons.click();
	}

	// Method to click on save button
	public void Save1() {
		Save.click();
	}

	// Method to check for assertion
	public void assertiontext1() {
		String Expected2 = "Saved.";
		String Actualtext2 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext2, Expected2);
		System.out.println(Actualtext2);

	}

}