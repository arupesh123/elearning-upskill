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

public class TeacherAttachCertificateELTC_033 {
	private static final String DropdownCategory = null;

	private WebDriver driver;

	public TeacherAttachCertificateELTC_033(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
	//Click on the Course Link
	@FindBy(xpath = "//h4[@class='course-items-title']/a")
	private WebElement clickcourse;
	
	//Click on Assessment icon
	@FindBy(xpath = "//div[@class='big_icon']/a/img[@title='Assessments']")
	private WebElement clickAssessment;
	
	//click on Add Online activity icon
	@FindBy(xpath = "//div[@class='col-sm-6']//following::a[2]/img")
	private WebElement clickAddOnlineActivity;

	// For clicking on dropdown arrow
	@FindBy(xpath = "//span[@class='bs-caret']/span")
	private WebElement mySelect1;

	// For choosing the value Tests from dropdown
	@FindBy(xpath = "//ul[@class='dropdown-menu inner']/li[2]/a")
	private WebElement mySelect2;
    
	//Enter valid credentials in weightage textbox i.e 1 
	@FindBy(how = How.ID, using = "weight_mask")
	private WebElement weight;
	
	//Click on Add this learning activity to the assessment button
	@FindBy(how = How.NAME, using = "submit")
	private WebElement btn_LearningActivity;

	// For choosing the checkbox
	@FindBy(xpath = "//table//tbody/tr[2]/td/input")
	private WebElement checkBox;
	
	//click on Edit icon of created assessment	
	@FindBy(xpath = "//table//tbody/tr[2]/td[6]/a/img")
	private WebElement Edit;
	
	//click on edit this link button	
	@FindBy(how = How.NAME, using = "submit")
	private WebElement btn_EditLink;
	
	//Click on Attach certificate icon
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
	
	public void clickAssertionLinkAdd() {
	String Expected1 = "The link has been added.";
	String Actualtext1 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
	Assert.assertEquals(Actualtext1, Expected1);
	System.out.println(Actualtext1);
	
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
	
	public void clickAssertionEdit() {
	String Expected2= "Assessment edited";
	String Actualtext2 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
	Assert.assertEquals(Actualtext2, Expected2);
	System.out.println(Actualtext2);
	}
	
	public void clickAttachCert() {
		attachCert.click();
	}
	
	public void clickAssertionAttach() {
		String Expected3= "Default certificate";
		String Actualtext3 = driver.findElement(By.xpath("//tr[@class='row_even']/td[2]/a")).getText();
		Assert.assertEquals(Actualtext3, Expected3);
		System.out.println(Actualtext3);
	}

}