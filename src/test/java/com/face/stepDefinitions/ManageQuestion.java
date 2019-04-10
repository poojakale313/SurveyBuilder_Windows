package com.face.stepDefinitions;

import org.junit.Assert;
import com.face.pageFactory.ManageQuestionPage;
import core.generic.Utilities;
import cucumber.api.java.en.Then;

public class ManageQuestion {

	private Utilities objUtilities = new Utilities();
	private ManageQuestionPage objManageQuestionPage = new ManageQuestionPage();
	
	@Then("^Click on Home$")
	public void click_Home()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.clickOnHomeMenu());
	}
	
		
	@Then("^Click on Submenu Home$")
	public void click_Submenu_Home()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.clickSubMenuHome());
	}
	
	@Then("^Click on Manage questions$")
	public void click_Manage_questions() throws InterruptedException  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.clickManageQuestions());
	}
	
	@Then("^Click on Create new$")
	public void click_Create_new() throws InterruptedException  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.clickCreateNew());
	}
	
	@Then("^Enter New Question for FreeText type (.*)$")
	public void enter_New_Question_FreeText_Type(String question1)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.enterQuestionForFreeTextType(question1));
	}
	
	@Then("^Select Required checkbox$")
	public void select_Required_Checkbox()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.selectRequiredCheckbox());
	}
	
	@Then("^Click on Save button to save the question$")
	public void click_On_Save_Button_To_Save_The_Question()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.clickSaveButtonForQuestions());
	}
	
	//Question2
	
	@Then("^Enter New Question for Radio type (.*)$")
	public void enter_New_Question_Radio_Type(String question2)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.enterQuestionForRadioType(question2));
	}
	
	@Then("^Select Type of Question as Radio$")
	public void select_Type_Of_Question_As_Radio()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.clickOnRadioType());
	}
	
	@Then("^Select Weightage value as 2 from dropdown (.*)$")
	public void select_Weightage_Value_As_2_From_Dropdown(String selectWeightValue)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.selectWeightageDropDown(selectWeightValue));
	}
	
	@Then("^Click on Add Options$")
	public void click_On_Add_Options()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.clickOnAddOptions());
	}
	
	@Then("^Set option name1 as good (.*)$")
	public void enter_Option_Name1_As_Good(String option1)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.enterFirstOptionName(option1));
	}
	
	@Then("^Select Score as 4 from dropdown (.*)$")
	public void Select_Score_As_4_From_Dropdown(String score1)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.selectFirstScoreDropDown(score1));
	}
	
	
	
	@Then("^Set option name2 as better (.*)$")
	public void enter_Option_Name2_As_Better(String option2)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.enterSecondOptionName(option2));
	}
	
	@Then("^Select Score as 5 from dropdown (.*)$")
	public void Select_Score_As_5_From_Dropdown(String score2)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.selectSecondScoreDropDown(score2));
	}
	
	
	//Question3
	
	@Then("^Enter New Question as Slider (.*)$")
	public void enter_New_Question_Slider_Type(String question3)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.enterQuestionForSliderType(question3));
	}
	
	@Then("^Select Type of Question as Slider$")
	public void select_Type_Of_Question_As_Slider()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objManageQuestionPage.clickOnSliderType());
	}
}
