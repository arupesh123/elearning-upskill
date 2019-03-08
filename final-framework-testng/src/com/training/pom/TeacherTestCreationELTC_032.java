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

//To verify whether application allows teacher to create a Test

public class TeacherTestCreationELTC_032 {
	private static final String DropdownCategory = null;

	private WebDriver driver;

	public TeacherTestCreationELTC_032(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Click on Click Course link
	@FindBy(xpath = "//a[contains(text(),'Kolkata1')]")
	private WebElement clickcourse;

	// Click on Tests icon
	@FindBy(xpath = "//div[@class='big_icon']/a/img[@title='Tests']")
	private WebElement clickTests;

	// Click on Create a new test button
	@FindBy(xpath = "//div[@class='controls']/a")
	private WebElement clickbtnCreNewTest;

	// Enter valid credentials in Test name textbox
	@FindBy(id = "exercise_title")
	private WebElement clickTestName;

	// click on advanced setting button
	@FindBy(how = How.ID, using = "advanced_params")
	private WebElement adv_Setting;

	// Identifying the frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, exerciseDescription']")	
	private WebElement AddFrame;

	// Writing text inside the frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrame1;

	// click on Enable start time checkbox
	@FindBy(xpath = "//label[contains(text(),'Enable start time')]")
	private WebElement checkBox;

	// For selecting the datefield
	@FindBy(xpath = "//div[@class='input-group']/span/img[@title='Select date']")
	private WebElement dateImage;

	// Click on Now button
	@FindBy(xpath = "//div[@class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']//div//following::div[8]/button[1]")
	private WebElement clickNow;

	// Click on Done button
	@FindBy(xpath = "//div[@class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']//div//following::div[8]/button[2]")
	private WebElement clickDone;

	// Enter valid numeric values in Pass percentage textbox
	@FindBy(id = "pass_percentage")
	private WebElement passPercent;

	// Click on Proceed to questions button
	@FindBy(how = How.NAME, using = "submitExercise")
	private WebElement btn_submitExercise;

	// . Click on Multiple Choice icon
	@FindBy(xpath = "//div[@class='well']/ul/li//div/a/img")
	private WebElement clickMultipleChoice;

	// Enter valid credentials in Questions textbox
	@FindBy(how = How.ID, using = "question_admin_form_questionName")
	private WebElement question;

	// Identifying the frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[1]']")
	private WebElement AddFramei;

	// Writing text inside the frame1
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFramei1;

	// Identifying the frame2
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[2]']")
	private WebElement AddFrameii;

	// Writing text inside the frame2
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrameii2;

	// Identifying the frame3
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[3]']")
	private WebElement AddFrameiii;

	// Writing text inside the frame3
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrameii3;

	// Identifying the frame4
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[4]']")
	private WebElement AddFrameiiii;

	// Writing text inside the frame4
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrameii4;

	// Writing score inside the frame1 of quizQuestion 1st
	@FindBy(name = "weighting[1]")
	private WebElement Addscore1_1stQuestion;

	// Writing score beside frame2 of quizQuestion 1st
	@FindBy(name = "weighting[2]")
	private WebElement Addscore2_1stQuestion;

	// Writing score beside frame3 of quizQuestion 1st
	@FindBy(name = "weighting[3]")
	private WebElement Addscore3_1stQuestion;

	// Writing score beside frame4 of quizQuestion 1st
	@FindBy(name = "weighting[4]")
	private WebElement Addscore4_1stQuestion;

	// For clicking the button Submit Question
	@FindBy(how = How.ID, using = "submit-question")
	private WebElement clicksub_question;

	// Click on Multiple Choice icon
	@FindBy(xpath = "//div[@class='well']/ul/li//div/a/img")
	private WebElement clickMultipleChoice1;

	// Enter valid credentials in Questions textbox
	@FindBy(id = "question_admin_form_questionName")
	private WebElement clickMulChoice2ndQues;

	// Identifying the frame1 of quizQuestion 2nd
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[1]']")
	private WebElement AddFrame1_2ndQuestion1;

	// Writing text inside the frame1 of quizQuestion 2nd
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrame1_2ndQuestion1Text;

	// Identifying the frame2 of quizQuestion 2nd
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[2]']")
	private WebElement AddFrame2_2ndQuestion2;

	// Writing text inside the frame2 of quizQuestion 2nd
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrame2_2ndQuestion2Text;

	// Identifying the frame3 of quizQuestion 2nd
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[3]']")
	private WebElement AddFrame3_2ndQuestion3;

	// Writing text inside the frame3 of quizQuestion 2nd
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrame3_2ndQuestion3Text;

	// Identifying the frame4 of quizQuestion 2nd
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[4]']")
	private WebElement AddFrame4_2ndQuestion4;

	// Writing text inside the frame4 of quizQuestion 2nd
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrame4_2ndQuestion4Text;

	// Writing score inside the frame1 of quizQuestion 2nd
	@FindBy(name = "weighting[1]")
	private WebElement Addscore1_2ndQuestion;

	// Writing score beside frame2 of quizQuestion 2nd
	@FindBy(name = "weighting[2]")
	private WebElement Addscore2_2ndQuestion;

	// Writing score beside frame3 of quizQuestion 2nd
	@FindBy(name = "weighting[3]")
	private WebElement Addscore3_2ndQuestion;

	// Writing score beside frame4 of quizQuestion 2nd
	@FindBy(name = "weighting[4]")
	private WebElement Addscore4_2ndQuestion;

	// For choosing the Radiobutton
	@FindBy(xpath = "//tbody/tr[2]/td[2]//input[@name='correct']")
	private WebElement Radiobutton;

	// For clicking the button ( "Add this Question to test")
	@FindBy(how = How.ID, using = "submit-question")
	private WebElement clicksub_question1;

	// For clicking on the preview icon
	@FindBy(xpath = "//div[@class='actions']/a//following::a/img")
	private WebElement clickPreviewIcon;

	// Clicking on Start test button
	@FindBy(xpath = "//div[@class='exercise_overview_options col-md-12']/a")
	private WebElement clickStartTest;

	// Clicking on Selenium radio button
	@FindBy(xpath = "//div[@class='main-question ']//following::div[@class='question_options']/child::label[1]/input")
	private WebElement clickSelenium;

	// Clicking on next Question button
	@FindBy(xpath = "//div[@class='form-actions']/button")
	private WebElement clickNextQuesbutton;

	// Clicking on Java radio button
	@FindBy(xpath = "//div[@class='question_options']/child::label[2]/input")
	private WebElement clickJava;

	// Clicking on End test button
	@FindBy(xpath = "//div[@class='form-actions']//button[@class='btn btn-warning question-validate-btn']")
	private WebElement clickEndTest;

	// ==============================================================================
   //Method to call Click course
	public void clickCourse() {
		this.clickcourse.click();

	}
	//Method to click test
	public void clickTests() {
		this.clickTests.click();
	}
	//Method to click create new test case
	public void clickCreateaNewTest() {
		this.clickbtnCreNewTest.click();
	}
	//Method to send Test name
	public void sendTestName(String clickTestName) {
		this.clickTestName.clear();
		this.clickTestName.sendKeys(clickTestName);
	}
	//Method to click Adv Setting
	public void clickAdvSetting() {
		this.adv_Setting.click();
	}
	//Method to click on frame
	public void Frame() {

		driver.switchTo().frame(AddFrame);
	}
	//Method to send values to Frame1
	public void sendTestNameDesc(String AddFrame1) {
		this.AddFrame1.clear();
		this.AddFrame1.sendKeys(AddFrame1);
	}

	//Method to switch to frame
	public void Frame2() {

		driver.switchTo().defaultContent();
	}
	//Method to clcik on check box
	public void clickCheckBox() {
		this.checkBox.click();
	}
	//Method to click Date Range
	public void clickDateImage() {
		this.dateImage.click();
	}
	//Method to Click on Now
	public void clickNow() {
		this.clickNow.click();
	}
	//Method to on click done
	public void clickDone() {
		this.clickDone.click();
	}
	//Method to  click on pass percentage
	public void clickPassPercent(String passPercent) {
		this.passPercent.clear();
		this.passPercent.sendKeys(passPercent);
	}
	//Method to click on submit exercise
	public void btnsubmitExercise() {
		this.btn_submitExercise.click();
	}
	//Method to click on assertions
	public void ClickAssetion361() {
		String Expected361 = "Exercise added";
		String Actualtext361 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
		Assert.assertEquals(Actualtext361, Expected361);
		System.out.println(Actualtext361);
	}
	//Method to click on assertions
	public void ClickAssetion362() {

		String Expected362 = "0 questions, for a total score (all questions) of 0.";
		String Actualtext362 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[4]")).getText();
		Assert.assertEquals(Actualtext362, Expected362);
		System.out.println(Actualtext362);

	}
	//Method to click multiple choice
	public void clickMultipleChoice() {
		this.clickMultipleChoice.click();
	}
	//Method to send questions
	public void sendQuestionText(String question) {
		this.question.clear();
		this.question.sendKeys(question);
	}
	//Method to  clic on frame
	public void Framei() {
           
		driver.switchTo().frame(AddFramei);
	}
	
	//Method to  to click on send text to frame
	public void send1text(String AddFramei1) {
		this.AddFramei1.clear();
		this.AddFramei1.sendKeys(AddFramei1);
	}

	//Method to to come out of frame
	public void Frame1out() {

		driver.switchTo().defaultContent();
	}
	//Method to click on frame
	public void Framei2() {

		driver.switchTo().frame(AddFrameii);
	}
	
	//Method to  dend text to frame
	public void send2text(String AddFrameii2) {
		this.AddFrameii2.clear();
		this.AddFrameii2.sendKeys(AddFrameii2);
	}
	//Method to  come out of frame
	public void Frame2out() {

		driver.switchTo().defaultContent();
	}
	//Method to click on frame
	public void Framei3() {

		driver.switchTo().frame(AddFrameiii);
	}
	//Method to  send text to frame
	public void send3text(String AddFrameii3) {
		this.AddFrameii3.clear();
		this.AddFrameii3.sendKeys(AddFrameii3);
	}

	// mrthod to come out of frame
	public void Frame3out() {

		driver.switchTo().defaultContent();
	}
	//Method to  get into frame
	public void Framei4() {

		driver.switchTo().frame(AddFrameiiii);
	}
	//Method to  send text in frame
	public void send4text(String AddFrameii4) {
		this.AddFrameii4.clear();
		this.AddFrameii4.sendKeys(AddFrameii4);
	}
	//Method to  click on frame	
	public void Frame4out() {

		driver.switchTo().defaultContent();
	}
	//Method to click on score of 1st question
	public void score1_1stQuestion(String Addscore1_1stQuestion) {
		this.Addscore1_1stQuestion.clear();
		this.Addscore1_1stQuestion.sendKeys(Addscore1_1stQuestion);
	}
	//Method to click on score2 of 1st question
	public void score2_1stQuestion(String Addscore2_1stQuestion) {
		this.Addscore2_1stQuestion.clear();
		this.Addscore2_1stQuestion.sendKeys(Addscore2_1stQuestion);
	}
	//Method to click score3 of 1st question
	public void score3_1stQuestion(String Addscore3_1stQuestion) {
		this.Addscore3_1stQuestion.clear();
		this.Addscore3_1stQuestion.sendKeys(Addscore3_1stQuestion);
	}
	//Method to click score4 of 1st question
	public void score4_1stQuestion(String Addscore4_1stQuestion) {
		this.Addscore4_1stQuestion.clear();
		this.Addscore4_1stQuestion.sendKeys(Addscore4_1stQuestion);
	}
	//Method to  to click button submit
	public void btnsubQuestion() {
		this.clicksub_question.click();
	}
	//Method to  click on assertion
	public void ClickAssertion44() {
		String Expected44 = "1 questions, for a total score (all questions) of 1.";
		String Actualtext44 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[4]")).getText();
		Assert.assertEquals(Actualtext44, Expected44);
		System.out.println(Actualtext44);

	}
	//Method to  to click on multiple choice
	public void MultipleChoice1() {
		this.clickMultipleChoice1.click();
	}
	//Method to send text to multiple choice
	public void clickMulChoiceQues2(String clickMulChoice2ndQues) {
		this.clickMulChoice2ndQues.clear();
		this.clickMulChoice2ndQues.sendKeys(clickMulChoice2ndQues);
	}
	//Method to  click on frame 2nd question
	public void Frame1_2ndQuestion1() {

		driver.switchTo().frame(AddFrame1_2ndQuestion1);
	}
	//Method to send text 2nd question
	public void send1Text2ndQuestion(String AddFrame1_2ndQuestion1Text) {
		this.AddFrame1_2ndQuestion1Text.clear();
		this.AddFrame1_2ndQuestion1Text.sendKeys(AddFrame1_2ndQuestion1Text);
	}

	// //Method to come out of frame1
	public void Frame1out2ndQuestion() {

		driver.switchTo().defaultContent();
	}
	//Method to frame2 of 2nd Question
	public void Frame2_2ndQuestion2() {

		driver.switchTo().frame(AddFrame2_2ndQuestion2);
	}
	//Method to  switch to frame 2nd question
	public void send2Text2ndQuestion(String AddFrame2_2ndQuestion2Text) {
		this.AddFrame2_2ndQuestion2Text.clear();
		this.AddFrame2_2ndQuestion2Text.sendKeys(AddFrame2_2ndQuestion2Text);
	}
	//Method to come out of frame
	
	public void Frame2out2ndQuestion() {

		driver.switchTo().defaultContent();
	}
	//Method to come into frame 3 question

	public void Frame3_2ndQuestion3() {

		driver.switchTo().frame(AddFrame3_2ndQuestion3);
	}
	
	//Method to send text to 2nd question
	public void send3Text2ndQuestion(String AddFrame3_2ndQuestion3Text) {
		this.AddFrame3_2ndQuestion3Text.clear();
		this.AddFrame3_2ndQuestion3Text.sendKeys(AddFrame3_2ndQuestion3Text);
	}
	//Method to come out of frame3	
	public void Frame3out2ndQuestion() {

		driver.switchTo().defaultContent();
	}
	//Method to  go into frame4 2nd question
	public void Frame4_2ndQuestion4() {

		driver.switchTo().frame(AddFrame4_2ndQuestion4);
	}
	//Method to send text for 2nd question
	public void send4Text2ndQuestion(String AddFrame4_2ndQuestion4Text) {
		this.AddFrame4_2ndQuestion4Text.clear();
		this.AddFrame4_2ndQuestion4Text.sendKeys(AddFrame4_2ndQuestion4Text);
	}

	//Method to gointo frame4 2nd question
	public void Frame4out2ndQuestion() {

		driver.switchTo().defaultContent();
	}
	
	//Method to  write score in 2nd question

	public void score1_2ndQuestion(String Addscore1_2ndQuestion) {
		this.Addscore1_2ndQuestion.clear();
		this.Addscore1_2ndQuestion.sendKeys(Addscore1_2ndQuestion);
	}
	//Method to  write score in 2nd question
	public void score2_2ndQuestion(String Addscore2_2ndQuestion) {
		this.Addscore2_2ndQuestion.clear();
		this.Addscore2_2ndQuestion.sendKeys(Addscore2_2ndQuestion);
	}
	//Method to  write score in 2nd question
	public void score3_2ndQuestion(String Addscore3_2ndQuestion) {
		this.Addscore3_2ndQuestion.clear();
		this.Addscore3_2ndQuestion.sendKeys(Addscore3_2ndQuestion);
	}
	//Method to  write score4 in 2nd question
	public void score4_2ndQuestion(String Addscore4_2ndQuestion) {
		this.Addscore4_2ndQuestion.clear();
		this.Addscore4_2ndQuestion.sendKeys(Addscore4_2ndQuestion);
	}
	//Method to  click on radio button
	public void clickRadioButton() {
		this.Radiobutton.click();
	}
	//Method to  click preview icon
	public void clickPreviewIcon() {
		this.clickPreviewIcon.click();
	}
	//Method to  click sub Question
	public void clickSub_Ques1() {
		this.clicksub_question1.click();
	}
	//Method to check for assertion
	public void ClickAssertion54() {
		String Expected54 = "2 questions, for a total score (all questions) of 2.";
		String Actualtext54 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[4]")).getText();
		Assert.assertEquals(Actualtext54, Expected54);
		System.out.println(Actualtext54);
	}
	//Method to click start test button
	public void clickStartTest() {
		this.clickStartTest.click();
	}
	//Method to click on selenium
	public void clickSelenium() {
		this.clickSelenium.click();
	}
	//Method to click on next button
	public void clicknextQuesbutton() {
		this.clickNextQuesbutton.click();
	}
	//Method to click on java radio button
	public void clickJava() {
		this.clickJava.click();
	}
	//Method to click end test
	public void clickEndTest() {
		this.clickEndTest.click();
	}
	//Method to click assertion.
	public void ClickAssertion58() {
		String Expected58= "Score for the test: 2 / 2";
		String Actualtext58 = driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[5]/div/div/h3")).getText();
		Assert.assertEquals(Actualtext58, Expected58);
		System.out.println(Actualtext58);
	}
	

}
