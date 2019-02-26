package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Mediun_ELTC_049 {
	private WebDriver driver;
	private String classname;
	private String classname1;

	public Mediun_ELTC_049(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "formLogin_submitAuth")
	private WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(),'Classes')]")
	private WebElement classes;

	@FindBy(xpath = "//img[@title='Add classes']")
	private WebElement addclasses;

	@FindBy(id = "usergroup_name")
	private WebElement name;

	@FindBy(id = "usergroup_description")
	private WebElement desc;

	// For clicking on dropdown arrow
	@FindBy(xpath = "//span[@class='bs-caret']//span[@class='caret']")
	private WebElement myCategory1;

	// For choosing the value from dropdown
	@FindBy(xpath = "//li[@data-original-index='0']//a[@tabindex='0']")
	private WebElement mycategory2;

	@FindBy(how = How.NAME, using = "submit")
	private WebElement Add;

	// @FindBy(xpath =
	// "//a[@href='add_users_to_usergroup.php?id=128']//img[@title='Subscribe users
	// to class']")
	// private WebElement subUsersToClass;

	@FindBy(xpath = "//select[@name='elements_not_in_name']")
	private WebElement clickMultiple1;

	@FindBy(xpath = "//div[@class='col-md-2']/div/button/em[@class='fa fa-arrow-right']")
	private WebElement ClickArrow;
     
	
	// this is for button
	@FindBy(xpath = "//button[contains(text(),'Subscribe users to class')]")
	private WebElement ClickSubsUserToClass;
	
	

	// ==================================================

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	public void clickClasses() {
		this.classes.click();
	}

	public void clickaddclasses() {
		this.addclasses.click();
	}

	public void sendName(String name) {
		this.name.clear();
		this.name.sendKeys(name);
		classname = this.name.getAttribute("value");

	}

	public void sendDesc(String desc) {
		this.desc.clear();
		this.desc.sendKeys(desc);
	}

	public void category1() {
		myCategory1.click();
	}

	public void category2() {
		mycategory2.click();
	}

	public void Add1() {
		Add.click();
	}

	public void subUsersToClass1() {
		
		// table/tbody//td[@title='demo7']//following-sibling::td[5]//a/img[@title='Subscribe
		// users to class']

		String before = "//table/tbody//td[@title='";
		String after = "']//following-sibling::td[5]//a/img[@title='Subscribe users to class']";
		String classuser = before + classname + after;

		driver.findElement(By.xpath(classuser)).click();
	}

	public void clickMultiple() throws InterruptedException {		
		
		 Select drpseleniumproject = 
	                new Select(clickMultiple1);
	        if(drpseleniumproject.isMultiple()) {
	            drpseleniumproject.selectByIndex(4);
	            drpseleniumproject.selectByIndex(7);
	            Thread.sleep(2000);
	        }
	}
	        
	        public void clickArrow1() {
	    		ClickArrow.click();
	    	}  
	        
	        public void ClickSubsUserToClass1() {
	        	ClickSubsUserToClass.click();
	    	} 
	        
	                
	       	      
	public void subClassToCourse1() {
				
    	//table/tbody//td[@title='demo7']//following-sibling::td[5]//a/img[@title='Subscribe class to courses']
		
   		String before1 = "//table/tbody//td[@title='";
		String after1 = "']//following-sibling::td[5]//a/img[@title='Subscribe class to courses']";
		String classuser1 = before1+classname+after1;
		
				driver.findElement(By.xpath(classuser1)).click();
	}
	
	public void clickMultiple1() throws InterruptedException {		
		
		 Select drpseleniumproject = 
	                new Select(clickMultiple1);
	        if(drpseleniumproject.isMultiple()) {
	            drpseleniumproject.selectByIndex(3);
	            drpseleniumproject.selectByIndex(6);
	            Thread.sleep(2000);
	        }
	}
		
	}


