package com.face.stepDefinitions;

import org.junit.Assert;


import com.face.pageFactory.SalesForceLoginPage;

import core.generic.Utilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
/**
 * @ScriptName    : SuiteSteps
 * @Description   : This class contains   
 * @Author: Digvijay Dusane(Aress) @Creation Date : 08 Jan 2018   @Modified Date:                    
 */
public class SalesForce 
{
	// Local variables

	private Utilities objUtilities = new Utilities();
	private SalesForceLoginPage objSalesForceLoginPage = new SalesForceLoginPage();

	//Login
	@Given("^Enter SalesForce UserName(.*)$")
	public void enterUserName(String userName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.setUserName(userName));

	}

	@Then("^Enter SalesForce password (.*)$")
	public void enterPassword(String password)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.setUserPassword(password));
	}

	@Then("^Click on SalesForce Login button$")
	public void clickOnLoginButton()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickLoginButton());
	}

	@Then("^Click on Survey launcher$")
	public void clickonSurveylauncher() throws InterruptedException  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickSurveyLauncherLabel());
		System.out.println("Found");
	}

	@Then("^Click on Manage Survey$")
	public void clickOnManageSurvey() throws InterruptedException  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickManageSurveyLabel());
	}

	@Then("^Click on Create New Tab$")
	public void ClickonCreateNewTab() throws InterruptedException  
	{
//		objUtilities.waitForPageLoad();
		Thread.sleep(3000);
		Assert.assertTrue(objSalesForceLoginPage.clickOnCreateNewTab());
	}

	@Then("^Enter title for the survey(.*)$")
	public void EntertitleForTheSurvey(String surveyTitle)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.enterTitleSurvey(surveyTitle));

	}

	@Then("^Enter description(.*)$")
	public void EnterDescription(String surveyDescription)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.enterDescription(surveyDescription));

	}

	@Then("^Enter expiration days(.*)$")
	public void EnterExpirationDays(String surveyDays)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.enterExpirationDays(surveyDays));

	}

	@Then("^Select date$")
	public void SelectDate()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickOnSelectdate());
	}

	@Then("^Click on Next button$")
	public void ClickonNextButton()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickOnNextButton());
	}

	@Then("^Click on select questions from library$")
	public void ClickonSelectQuestionsFromLibrary()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.selectQuestionsFromLibrary());
	}

	@Then("^Enter text to search the question from library(.*)$")
	public void  EnterTextToSearchTheQuestion(String questionSearch)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.enterTextToSearchQuestion(questionSearch));

	}

	@Then("^Click on filter$")
	public void ClickonFilter()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickOnFilterButton());
	}

	@Then("^Select first question$")
	public void SelectFirstQuestion()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.selectFirstQuestion());
	}

	@Then("^Select second question$")
	public void SelectSecondQuestion()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.selectSecondQuestion());
	}

	@Then("^Select third question$")
	public void SelectThirdQuestion()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.selectThirdQuestion());
	}

	@Then("^Click on assign question$")
	public void ClickonAssignQuestion()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickOnAssignButton());
	}

	@Then("^Click on Create new question$")
	public void ClickonCreatenewQuestion()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickOnCreateNewQuestion());
	}

	@Then("^Enter question title(.*)$")
	public void  EnterQuestionTitle(String questionTitle)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.enterQuestionTitle(questionTitle));

	}

	@Then("^Select type of question multiselect$")
	public void SelectTypeOfQuestionMultiSelect()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickOnQuestionMultiSelect());
	}

	@Then("^Select weightage of question from dropdown(.*)$")
	public void  SelectWeightageOfQuestionFromDropdown(String dropdownWeightage)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.SelectWeightageDropdown(dropdownWeightage));

	}

	@Then("^Click on add options$")
	public void  ClickOnAddOptions()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickOnAddOption());
	}

	@Then("^Enter option name(.*)$")
	public void  EnterOptionName(String optionName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.enterOptionName(optionName));

	}

	@Then("^Select weightage of option(.*)$")
	public void  SelectWeightageOfOption(String dropdownWeightageOption)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.SelectWeightageOption(dropdownWeightageOption));

	}

	@Then("^Click on create question$")
	public void  ClickOnCreateQuestion()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickOnCreateQuestion());
	}

	@Then("^Click on Back to Survey question List$")
	public void  ClickOnBackToSurveyQuestionList()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickOnBackToSurveyList());
	}

	@Then("^Click on Next button to navigate to manage Recipients$")
	public void  ClickOnNextButtonToNavigateToManageRecipients() throws InterruptedException  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickOnnavigateToManageRecipients());
	}

	@Then("^Navigate to custom email tab$")
	public void  NavigateToCustomEmailTab() throws InterruptedException  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickOnNavigateEmail());
	}

	@Then("^Enter email ID(.*)$")
	public void  EnterEmailID(String customEmailID) throws InterruptedException  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.enterEmailID(customEmailID));

	}

	@Then("^Click on Next to send survey page$")
	public void  ClickonNexttoSendSurveypage()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickNextSendSurvey());
	}

	@Then("^Click on send survey button$")
	public void  ClickOnSendSurveyButton() throws InterruptedException  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceLoginPage.clickOnSendSurveyButton());
	}

	@Then("^verify the success response$")
	public void  verifyTheSuccessResponse()  
	{

		System.out.println("Email Send Successful");	

	}

}
