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


//To verify whether application allows teacher to create a Test ( Assertion Check)


public class TeacherTestCreationELTC_032_Assertion {
	private static final String DropdownCategory = null;

	private WebDriver driver;

	public TeacherTestCreationELTC_032_Assertion(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


    //Check for assertion
	public void ClickAssetionItemAdd() {
		String Expected361 = "Item added";
		String Actualtext361 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext361, Expected361);
		System.out.println(Actualtext361);
	}
	//Check for assertion
	public void ClickAssetionQuestions() {
		String ExpectedQ= "1 questions, for a total score (all questions) of 0.";
		String ActualtextQ = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		Assert.assertEquals(ActualtextQ, ExpectedQ);
		System.out.println(ActualtextQ);
	}
	
	//Check for assertion
	public void ClickAssetionStartTest() {

		String Expected362 = "Start test";
		String Actualtext362 = driver.findElement(By.xpath("//div[@class='exercise_overview_options col-md-12']/a")).getText();
		Assert.assertEquals(Actualtext362, Expected362);
		System.out.println(Actualtext362);

	}
}
