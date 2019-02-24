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

public class TeacherAttachCertificateELTC_033 {
	private static final String DropdownCategory = null;

	private WebDriver driver;

	public TeacherAttachCertificateELTC_033(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h4[@class='course-items-title']/a")
	//a[@href='http://elearning.upskills.in/courses/TEST55/index.php?id_session=0'][contains(text(),'Selenium255')
	private WebElement clickcourse;

	@FindBy(xpath = "//div[@class='big_icon']/a/img[@title='Assessments']")
	private WebElement clickAssessment;

	@FindBy(xpath = "//div[@class='col-sm-6']//following::a[2]/img")
	private WebElement clickAddOnlineActivity;

	// For clicking on dropdown arrow
	@FindBy(xpath = "//span[@class='bs-caret']/span")
	private WebElement mySelect1;

	// For choosing the value from dropdown
	@FindBy(xpath = "//ul[@class='dropdown-menu inner']/li[2]/a")
	private WebElement mySelect2;

	@FindBy(how = How.ID, using = "weight_mask")
	private WebElement weight;

	@FindBy(how = How.NAME, using = "submit")
	private WebElement btn_LearningActivity;

	// For choosing the checkbox
	@FindBy(xpath = "//table//tbody/tr[2]/td/input")
	private WebElement checkBox;
	
	@FindBy(xpath = "//table//tbody/tr[2]/td[6]/a/img")
	private WebElement Edit;
	
	@FindBy(how = How.NAME, using = "submit")
	private WebElement btn_EditLink;
	
	@FindBy(xpath = "//div[@class='col-sm-6 text-right']//following::a/img")
	private WebElement attachCert;
	
		
	// ==============================================================================

	public void clickCourse() {
		this.clickcourse.click();

	}

	public void clickAssessment() {
		this.clickAssessment.click();
	}

	public void clickAddonLineActivity() {
		this.clickAddOnlineActivity.click();
	}

	public void category1() {
		mySelect1.click();
	}

	public void category2() {
		mySelect2.click();
	}

	public void sendWeightText(String weight) {
		this.weight.clear();
		this.weight.sendKeys(weight);
	}

	public void btn_LearningActivity() {
		btn_LearningActivity.click();
	}
	
	public void checkbox() {
		checkBox.click();
	}
	
	public void clickEdit() {
		Edit.click();
	}
	public void clickEditLink() {
		btn_EditLink.click();
	}
	public void clickAttachCert() {
		attachCert.click();
	}


}