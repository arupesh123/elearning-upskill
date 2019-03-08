package com.training.pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.training.generics.ScreenShot;
import com.training.regression.tests.TeacherCourse_Student_Register_ELTC_064_Test;

// here the Admin logins to application


public class AdminLogin_Extra_ELTC_064 {
	public String coursername;
	private WebDriver driver; 
	private ScreenShot screenShot;

	public AdminLogin_Extra_ELTC_064(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Click on the field username
	@FindBy(id="login")
	private WebElement userName; 
	//Click on the field password 
	@FindBy(id="password")
	private WebElement password;
	//Click on form login submit button
	@FindBy(id="formLogin_submitAuth")
	//Click on login button
	private WebElement loginBtn; 
	//Click on Reporting Link
	@FindBy(linkText ="Reporting")
	//Click on main menu
	private WebElement mainMenu;
	//Click on Followed Student Link	
	@FindBy(linkText ="Followed students")
	private WebElement mainMenu1;
	//Click on Name keyword	
	@FindBy(name = "keyword")
	private WebElement nameKeyword; 
	//Click on Submit button
	@FindBy(name = "submit")
	//click on search buttonm
	private WebElement search;
	//click on double arrow
	
	@FindBy(xpath ="//tbody/tr[2]/td[5]/a[2]/img")
	private WebElement Doublearrow;
	
	//====================================================	
	
	
	//Method to send values to username
	public void sendAdminUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	// Method to send value to passowrd
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	// Method to click on Login button
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	// Method to click on Report Link
	public void Reportclick() {
	Actions actions = new Actions(driver);
	actions.moveToElement(mainMenu);
	actions.click().build().perform();
	}
	
	// Method to click on Followed Student Class
	public void FollowedStuClass() {
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(mainMenu1);
		actions1.click().build().perform();
		}
	// Method to write text in send keyword
	public void sendKeyword(String nameKeyword) {
		this.nameKeyword.clear();
		this.nameKeyword.sendKeys(nameKeyword);
	}
	// Method to click on send Admin keyword
		
		public void sendAdminkeyword(String username) {
			this.nameKeyword.sendKeys(username);
		}
		// Method to click on search  button
		public void Searchbutton() {
			this.search.click();
		}
		// Method to click on click arrow  button
		public void ClickDoublearrow() {
			this.Doublearrow.click();
		}
		// Method to click on click double arrow button
		public void ClickDoubleArrowCourseAtlast() {
			
			//TeacherAddCourseELTC_031 obj = new TeacherAddCourseELTC_031(driver);
			System.out.println(TeacherAddCourseELTC_031.classname2);
			//table[@class='table table-striped table-hover courses-tracking']//child::tbody/tr[1]/td[1]//*[contains (text(),'Chemistry1')]/following::td[6]/a/img
			
			//table[@class='table table-striped table-hover courses-tracking']//child::tbody/tr/td[1]//*[contains (text(),'Maths8')]/following::td[6]/a/img

			String before = "//table[@class='table table-striped table-hover courses-tracking']//child::tbody/tr/td[1]//*[contains (text(),'";
			String after = "')]/following::td[6]/a/img";
			String classuser = before+TeacherAddCourseELTC_031.classname2+after;
			Robot robot = null;
			try {
				robot=new Robot();
				
				robot.keyPress (KeyEvent.VK_CONTROL);
				robot.keyPress (KeyEvent.VK_END);
				
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_END);
				//Thread.sleep(15000);
			}catch(Exception ex) {
				
			}
			
			
			driver.findElement(By.xpath(classuser)).click();
			
			
		// Screenshot capture
				screenShot.captureScreenShot("ELTD_064");
		}
		
	
}

