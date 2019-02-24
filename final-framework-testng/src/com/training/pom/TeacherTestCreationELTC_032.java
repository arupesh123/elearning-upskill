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

public class TeacherTestCreationELTC_032 {
	private static final String DropdownCategory = null;

	private WebDriver driver;

	public TeacherTestCreationELTC_032(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h4[@class='course-items-title']/a")
	private WebElement clickcourse;

	@FindBy(xpath = "//div[@class='big_icon']/a/img[@title='Tests']")
	private WebElement clickTests;

	@FindBy(xpath = "//div[@class='controls']/a")
	private WebElement clickbtnCreNewTest;

	@FindBy(id = "exercise_title")
	private WebElement clickTestName;

	@FindBy(how = How.ID, using = "advanced_params")
	private WebElement adv_Setting;

	// Identifying the frame
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, exerciseDescription']")
	private WebElement AddFrame;

	// Writing text inside the frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrame1;

	// For choosing the checkbox
	@FindBy(xpath = "//label[contains(text(),'Enable start time')]")
	private WebElement checkBox;

	// For selecting the datefield
	@FindBy(xpath = "//div[@class='input-group']/span/img[@title='Select date']")
	private WebElement dateImage;

	@FindBy(xpath = "//div[@class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']//div//following::div[8]/button[1]")
	private WebElement clickNow;

	@FindBy(xpath = "//div[@class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']//div//following::div[8]/button[2]")
	private WebElement clickDone;

	@FindBy(id = "pass_percentage")
	private WebElement passPercent;

	@FindBy(how = How.NAME, using = "submitExercise")
	private WebElement btn_submitExercise;

	@FindBy(xpath = "//div[@class='well']/ul/li//div/a/img")
	private WebElement clickMultipleChoice;

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

	// Writing text inside the frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrameii2;

	// Identifying the frame3
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[3]']")
	private WebElement AddFrameiii;

	// Writing text inside the frame
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement AddFrameii3;

	// Identifying the frame4
	@FindBy(xpath = "//iframe[@title='Rich Text Editor, answer[4]']")
	private WebElement AddFrameiiii;

	// Writing text inside the frame
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

	// Writing score beside frame3 of quizQuestion 1st
	@FindBy(name = "weighting[4]")
	private WebElement Addscore4_1stQuestion;

	// for clicking the button
	@FindBy(how = How.ID, using = "submit-question")
	private WebElement clicksub_question;

	@FindBy(xpath = "//div[@class='well']/ul/li//div/a/img")
	private WebElement clickMultipleChoice1;

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

	// Writing score beside frame3 of quizQuestion 2nd
	@FindBy(name = "weighting[4]")
	private WebElement Addscore4_2ndQuestion;

	// For choosing the Radiobutton
	@FindBy(xpath = "//tbody/tr[2]/td[2]//input[@name='correct']")
	private WebElement Radiobutton;

	// for clicking the button ( "Add this Question to test")
	@FindBy(how = How.ID, using = "submit-question")
	private WebElement clicksub_question1;

	// Clicking on preview icon
	@FindBy(xpath = "//div[@class='actions']/a//following::a/img")
	private WebElement clickPreviewIcon;

	// Clicking on preview icon
	@FindBy(xpath = "//div[@class='exercise_overview_options col-md-12']/a")
	private WebElement clickStartTest;

	// Clicking on Selenium radio button
	@FindBy(xpath = "//div[@class='main-question ']//following::div[@class='question_options']/child::label[1]/input")
	// div[@class='question_options']/child::label[1]/input
	private WebElement clickSelenium;

	// Clicking on Selenium next Question button
	@FindBy(xpath = "//div[@class='form-actions']/button")
	private WebElement clickNextQuesbutton;

	// Clicking on Selenium radio button
	@FindBy(xpath = "//div[@class='question_options']/child::label[2]/input")
	private WebElement clickJava;

	// Clicking on Selenium End test button
	@FindBy(xpath = "//div[@class='form-actions']//button[@class='btn btn-warning question-validate-btn']")
	private WebElement clickEndTest;

	// ==============================================================================

	public void clickCourse() {
		this.clickcourse.click();

	}

	public void clickTests() {
		this.clickTests.click();
	}

	public void clickCreateaNewTest() {
		this.clickbtnCreNewTest.click();
	}

	public void sendTestName(String clickTestName) {
		this.clickTestName.clear();
		this.clickTestName.sendKeys(clickTestName);
	}

	public void clickAdvSetting() {
		this.adv_Setting.click();
	}

	public void Frame() {

		driver.switchTo().frame(AddFrame);
	}

	public void sendTestNameDesc(String AddFrame1) {
		this.AddFrame1.clear();
		this.AddFrame1.sendKeys(AddFrame1);
	}

	// to come out of frame
	public void Frame2() {

		driver.switchTo().defaultContent();
	}

	public void clickCheckBox() {
		this.checkBox.click();
	}

	public void clickDateImage() {
		this.dateImage.click();
	}

	public void clickNow() {
		this.clickNow.click();
	}

	public void clickDone() {
		this.clickDone.click();
	}

	public void clickPassPercent(String passPercent) {
		this.passPercent.clear();
		this.passPercent.sendKeys(passPercent);
	}

	public void btnsubmitExercise() {
		this.btn_submitExercise.click();
	}

	public void clickMultipleChoice() {
		this.clickMultipleChoice.click();
	}

	public void sendQuestionText(String question) {
		this.question.clear();
		this.question.sendKeys(question);
	}

	public void Framei() {

		driver.switchTo().frame(AddFramei);
	}

	public void send1text(String AddFramei1) {
		this.AddFramei1.clear();
		this.AddFramei1.sendKeys(AddFramei1);
	}

	// to come out of frame
	public void Frame1out() {

		driver.switchTo().defaultContent();
	}

	public void Framei2() {

		driver.switchTo().frame(AddFrameii);
	}

	public void send2text(String AddFrameii2) {
		this.AddFrameii2.clear();
		this.AddFrameii2.sendKeys(AddFrameii2);
	}

	// to come out of frame
	public void Frame2out() {

		driver.switchTo().defaultContent();
	}

	public void Framei3() {

		driver.switchTo().frame(AddFrameiii);
	}

	public void send3text(String AddFrameii3) {
		this.AddFrameii3.clear();
		this.AddFrameii3.sendKeys(AddFrameii3);
	}

	// to come out of frame
	public void Frame3out() {

		driver.switchTo().defaultContent();
	}

	public void Framei4() {

		driver.switchTo().frame(AddFrameiiii);
	}

	public void send4text(String AddFrameii4) {
		this.AddFrameii4.clear();
		this.AddFrameii4.sendKeys(AddFrameii4);
	}

	// to come out of frame
	public void Frame4out() {

		driver.switchTo().defaultContent();
	}

	public void score1_1stQuestion(String Addscore1_1stQuestion) {
		this.Addscore1_1stQuestion.clear();
		this.Addscore1_1stQuestion.sendKeys(Addscore1_1stQuestion);
	}

	public void score2_1stQuestion(String Addscore2_1stQuestion) {
		this.Addscore2_1stQuestion.clear();
		this.Addscore2_1stQuestion.sendKeys(Addscore2_1stQuestion);
	}

	public void score3_1stQuestion(String Addscore3_1stQuestion) {
		this.Addscore3_1stQuestion.clear();
		this.Addscore3_1stQuestion.sendKeys(Addscore3_1stQuestion);
	}

	public void score4_1stQuestion(String Addscore4_1stQuestion) {
		this.Addscore4_1stQuestion.clear();
		this.Addscore4_1stQuestion.sendKeys(Addscore4_1stQuestion);
	}

	public void btnsubQuestion() {
		this.clicksub_question.click();
	}

	public void MultipleChoice1() {
		this.clickMultipleChoice1.click();
	}

	public void clickMulChoiceQues2(String clickMulChoice2ndQues) {
		this.clickMulChoice2ndQues.clear();
		this.clickMulChoice2ndQues.sendKeys(clickMulChoice2ndQues);
	}

	public void Frame1_2ndQuestion1() {

		driver.switchTo().frame(AddFrame1_2ndQuestion1);
	}

	public void send1Text2ndQuestion(String AddFrame1_2ndQuestion1Text) {
		this.AddFrame1_2ndQuestion1Text.clear();
		this.AddFrame1_2ndQuestion1Text.sendKeys(AddFrame1_2ndQuestion1Text);
	}

	// to come out of frame1
	public void Frame1out2ndQuestion() {

		driver.switchTo().defaultContent();
	}

	public void Frame2_2ndQuestion2() {

		driver.switchTo().frame(AddFrame2_2ndQuestion2);
	}

	public void send2Text2ndQuestion(String AddFrame2_2ndQuestion2Text) {
		this.AddFrame2_2ndQuestion2Text.clear();
		this.AddFrame2_2ndQuestion2Text.sendKeys(AddFrame2_2ndQuestion2Text);
	}

	// to come out of frame
	public void Frame2out2ndQuestion() {

		driver.switchTo().defaultContent();
	}

	public void Frame3_2ndQuestion3() {

		driver.switchTo().frame(AddFrame3_2ndQuestion3);
	}

	public void send3Text2ndQuestion(String AddFrame3_2ndQuestion3Text) {
		this.AddFrame3_2ndQuestion3Text.clear();
		this.AddFrame3_2ndQuestion3Text.sendKeys(AddFrame3_2ndQuestion3Text);
	}

	// to come out of frame3 2nd Question
	public void Frame3out2ndQuestion() {

		driver.switchTo().defaultContent();
	}

	public void Frame4_2ndQuestion4() {

		driver.switchTo().frame(AddFrame4_2ndQuestion4);
	}

	public void send4Text2ndQuestion(String AddFrame4_2ndQuestion4Text) {
		this.AddFrame4_2ndQuestion4Text.clear();
		this.AddFrame4_2ndQuestion4Text.sendKeys(AddFrame4_2ndQuestion4Text);
	}

	// to come out of frame4 2nd Question
	public void Frame4out2ndQuestion() {

		driver.switchTo().defaultContent();
	}

	public void score1_2ndQuestion(String Addscore1_2ndQuestion) {
		this.Addscore1_2ndQuestion.clear();
		this.Addscore1_2ndQuestion.sendKeys(Addscore1_2ndQuestion);
	}

	public void score2_2ndQuestion(String Addscore2_2ndQuestion) {
		this.Addscore2_2ndQuestion.clear();
		this.Addscore2_2ndQuestion.sendKeys(Addscore2_2ndQuestion);
	}

	public void score3_2ndQuestion(String Addscore3_2ndQuestion) {
		this.Addscore3_2ndQuestion.clear();
		this.Addscore3_2ndQuestion.sendKeys(Addscore3_2ndQuestion);
	}

	public void score4_2ndQuestion(String Addscore4_2ndQuestion) {
		this.Addscore4_2ndQuestion.clear();
		this.Addscore4_2ndQuestion.sendKeys(Addscore4_2ndQuestion);
	}

	public void clickRadioButton() {
		this.Radiobutton.click();
	}

	public void clickPreviewIcon() {
		this.clickPreviewIcon.click();
	}

	public void clickSub_Ques1() {
		this.clicksub_question1.click();
	}

	public void clickStartTest() {
		this.clickStartTest.click();
	}

	public void clickSelenium() {
		this.clickSelenium.click();
	}

	public void clicknextQuesbutton() {
		this.clickNextQuesbutton.click();
	}

	public void clickJava() {
		this.clickJava.click();
	}

	public void clickEndTest() {
		this.clickEndTest.click();
	}

}
