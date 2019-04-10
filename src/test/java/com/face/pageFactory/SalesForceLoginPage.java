package com.face.pageFactory;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;

import core.generic.StepBase;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import junit.framework.Assert;

public class SalesForceLoginPage extends StepBase
{
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private StepBase objStepBase = new StepBase();
	//Login
	By inpUserName = By.xpath("//input[@class='input r4 wide mb16 mt8 username']");
	By inpUserPassword = By.xpath("//input[@class='input r4 wide mb16 mt8 password']");
	By btnLogin = By.xpath("//input[@class='button r4 wide primary']");

	//Survey Launcher
	By surveylauncher = By.linkText("Survey Launcher");

	//Manage Survey
	By managesurvey = By.xpath("//*[text()='Manage Survey']");
	By createnew = By.xpath("//input[@value=' Create New']");
	By titleofsurvey = By.xpath("//input[@placeholder='Enter Title for the survey']");
	By description = By.xpath("//textarea[@placeholder='Description']");
	By expirationperiod = By.xpath("//input[@placeholder='Enter days']");
	By selectsenddate = By.xpath("//label[text()='Select send date ']/..//*[@name='j_id0:theForm:j_id118']");
	By nextbutton = By.xpath("//input[@value='Next']");

	//Select Questions
	By selectquestions = By.xpath("(//*[@class='add_more_button'])[2]");
	By textfilter = By.xpath("//input[@class='optionText']");
	By filtersearch = By.xpath("//input[@value='Filter']");
	By selectfirstQuestion = By.xpath("//td[text()='Aishwarya test ']/..//*[@name='thePage:theForm:j_id177:lib:0:j_id180']");
	By selectsecondQuestion = By.xpath("//td[text()='rate your day ']/..//*[@name='thePage:theForm:j_id177:lib:1:j_id180']");
	By selectthirdQuestion = By.xpath("//td[text()='dS ']/..//*[@name='thePage:theForm:j_id177:lib:2:j_id180']");
	By assignquestion = By.xpath("//input[@value='Assign Questions']");

	//Create Question
	By createnewquestion = By.xpath("//a[text()='Create New Question']");
	By enterquestion = By.xpath("//label[text()='Question']/..//*[@name='thePage:theForm:theFieldInput']");
	By multiselect = By.xpath("//*[text()='Multiselect']"); 
	By dropdownweightagequestion = By.xpath("//*[text()='Weightage']/..//*[@class='requiredInput']");
	By addoption = By.xpath("(//*[text()='Add Options'])[1]");
	By optionnamee = By.xpath("//*[@id='option1']");
	By weightageoption = By.id("scores1");


	By createquestion = By.xpath("//*[@value='Create Question']");
	By backtosurveylist = By.xpath("//*[text()='Back to Survey question List']");
	By nextbuttonnavigation = By.xpath("//*[@value='Next'");
	By customemail = By.xpath("//*[text()='Custom Email']");
	By emailid = By.xpath("//*[@class='txtCustomeEmail']");
	By nextsendsurvey = By.xpath("(//*[@value='Next'])[5]");
	By surveybutton = By.xpath("//*[@id=\"j_id0:j_id55:j_id59\"]//*[@class='green-btn']");
	By successresponse = By.xpath("//*[@class='messageText']");


	//Login ---------------------------------------------------------------------------------------
	public boolean setUserName(String userName){
		return objWrapperFunctions.setText(inpUserName, userName);
	}

	/** Set SalesForce password*/
	public boolean setUserPassword(String password){
		return objWrapperFunctions.setText(inpUserPassword, password);
	}

	/** Click Login button*/
	public boolean clickLoginButton(){
		return objWrapperFunctions.click(btnLogin);	
	}

	//Survey Launcher ----------------------------------------------------------------------------
	public boolean clickSurveyLauncherLabel(){
		return objWrapperFunctions.click(surveylauncher);	

	}



	public boolean enterDescription(String surveyDescription){
		return objWrapperFunctions.setText(description, surveyDescription);
	}

	public boolean enterExpirationDays(String surveyDays){
		return objWrapperFunctions.setText(expirationperiod, surveyDays);
	}

	public boolean clickOnSelectdate(){
		return objWrapperFunctions.click(selectsenddate);	
	}

	public boolean clickOnNextButton(){
		return objWrapperFunctions.click(nextbutton);	
	}


	public boolean enterTextToSearchQuestion(String surveyDays){
		return objWrapperFunctions.setText(textfilter, surveyDays);
	}

	public boolean clickOnFilterButton(){
		return objWrapperFunctions.click(filtersearch);	
	}

	public boolean selectFirstQuestion(){
		return objWrapperFunctions.click(selectfirstQuestion);	
	}

	public boolean selectSecondQuestion(){
		return objWrapperFunctions.click(selectsecondQuestion);	
	}

	public boolean selectThirdQuestion(){
		return objWrapperFunctions.click(selectthirdQuestion);	
	}

	public boolean clickOnAssignButton(){
		return objWrapperFunctions.click(assignquestion);	
	}

	//Create Question -----------------------------------------------------------------------------
	public boolean clickOnCreateNewQuestion(){
		return objWrapperFunctions.click(createnewquestion);	
	}

	public boolean enterQuestionTitle(String questionTitle){
		return objWrapperFunctions.setText(enterquestion, questionTitle);
	}

	public boolean clickOnQuestionMultiSelect(){
		return objWrapperFunctions.click(multiselect);	
	}


	public boolean clickOnAddOption(){
		return objWrapperFunctions.click(addoption);	
	}

	public boolean enterOptionName(String optionName){
		return objWrapperFunctions.setText(optionnamee, optionName);
	}

	public boolean SelectWeightageOption(String dropdownWeightageOption){
		try {
			objWrapperFunctions.selectDropDownOption(weightageoption, dropdownWeightageOption,"Value");
		}catch (Exception e) {
			System.out.println("Test Failed- Unable To Select Weightage DropDown value");
		}
		return true;

	}

	public boolean clickOnCreateQuestion(){
		return objWrapperFunctions.click(createquestion);	
	}

	public boolean clickOnBackToSurveyList(){
		return objWrapperFunctions.click(backtosurveylist);	
	}

	public boolean clickOnnavigateToManageRecipients() throws InterruptedException{

		objWrapperFunctions.waitForElement(3);
		try {
			objWrapperFunctions.click(nextbuttonnavigation);	
		} catch (Exception e) {
			System.out.println("Unable to click on Next Button");
		}
		return true;
	}

	public boolean clickOnNavigateEmail() throws InterruptedException{
		objWrapperFunctions.waitForElement(3);
		objStepBase.getDriver().switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen='true']")));
		return objWrapperFunctions.click(customemail);	
	}

	public boolean enterEmailID(String customEmailID) throws InterruptedException{
		objWrapperFunctions.waitForElement(3);
		return objWrapperFunctions.setText(emailid, customEmailID);
	}

	public boolean clickNextSendSurvey(){
		return objWrapperFunctions.click(nextsendsurvey);	
	}

	public boolean clickOnSendSurveyButton() throws InterruptedException{
		objWrapperFunctions.waitForElement(3); 
		objStepBase.getDriver().switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen='true']")));
		return objWrapperFunctions.click(surveybutton);	
	}

	//Manage Survey -------------------------------------------------------------------------------
	public boolean clickManageSurveyLabel(){
		objStepBase.getDriver().switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen='true']")));

		return objWrapperFunctions.click(managesurvey);	
	}

	public boolean clickOnCreateNewTab(){
		objStepBase.getDriver().switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen='true']")));
		return objWrapperFunctions.click(createnew);	
	}

	public boolean enterTitleSurvey(String surveyTitle){
		objStepBase.getDriver().switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen='true']")));
		return objWrapperFunctions.setText(titleofsurvey, surveyTitle);
	}

	//Select Questions -------------------------------------------------------------------------
	public boolean selectQuestionsFromLibrary(){
		objStepBase.getDriver().switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen='true']")));
		return objWrapperFunctions.click(selectquestions);	
	}

	public boolean SelectWeightageDropdown(String dropdownWeightage){
		return objWrapperFunctions.selectDropDownOption(dropdownweightagequestion, dropdownWeightage,"Value");
	}

	@SuppressWarnings("deprecation")
	public void verifySuccessResponse(){
		String expectedResult = "Success:"+"\n"+"Email Send Successfully";
		String actualResult = null;
		actualResult = objStepBase.getDriver().findElement(successresponse).getText();
		System.out.println("Expected: "+expectedResult);
		System.out.println("Actual: "+actualResult);
		Assert.assertEquals(expectedResult, actualResult);

	}

}
