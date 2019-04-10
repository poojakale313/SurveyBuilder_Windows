package com.face.pageFactory;

import org.openqa.selenium.By;

import core.generic.StepBase;
import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class ManageQuestionPage extends StepBase{

	// Local variables
		private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
		private Utilities objUtilities = new Utilities();
		private StepBase objStepBase = new StepBase();
	
	// Manage Questions
		By homeMenu = By.xpath("//*[@href='/lightning/page/home']");
		By surveyLauncherMenu = By.xpath("//*[text()='Survey Launcher']");
		By manageQuestions = By.xpath("//*[(@href='/apex/surveybuilder__manageQuestions')]");
	
	// Create New Question
		By submenuHome = By.xpath("//*[@id='myTopnav']/ul/li[1]/a");
		By createNew = By.xpath("//input[@value=' Create New']");
		By enterQuestion = By.xpath("//*[@id='thePage:theForm:theFieldInput']");
		By checkboxRequired = By.xpath("//*[contains(@name,'thePage:theForm:j_id77')]");
		By btnSaveQuestion = By.xpath("//*[contains(@name,'thePage:theForm:j_id87')]");
		By radioType = By.xpath("//*[text()=' Slider']/preceding::input[1]/preceding::input[1]");
		By sliderType = By.xpath("//*[text()=' Multiselect']/preceding::input[1]/preceding::input[1]");
		By weightageDropDown = By.xpath("//*[contains(@class,'weightageValue')]");
		By addOptions = By.xpath("//*[@id='thePage:theForm']/div[6]/div/p[2]");
		By optionName1 = By.id("option1");
		By optionName2 = By.id("option2");
		By scoreForOptionName1 = By.id("scores1");
		By scoreForOptionName2 = By.id("scores2");
	    By txtfieldSearchQuestion = By.xpath("//*[contains(@class,'optionText question-field')]");
		By btnFilterManageQuestion = By.xpath("//*[contains(@value,'Filter')]");

		
		public boolean clickOnHomeMenu(){
			try
			{
				objWrapperFunctions.acceptDefult();
			}
			catch(Exception e) {
				
			}
		return objWrapperFunctions.click(homeMenu);
		}
		
		
		public boolean clickSubMenuHome(){
			return objWrapperFunctions.click(submenuHome);
		}
		
		
		public boolean clickManageQuestions() throws InterruptedException{
			Thread.sleep(3000);
			
			objStepBase.getDriver().switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen='true']")));
		
			return objWrapperFunctions.click(manageQuestions);
		}
		
		public boolean clickCreateNew() throws InterruptedException{
			Thread.sleep(3000);
			objStepBase.getDriver().switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen='true']")));
			return objWrapperFunctions.click(createNew);
		}
		
		public boolean enterQuestionForFreeTextType(String question1){
			objStepBase.getDriver().switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen='true']")));
			return objWrapperFunctions.setText(enterQuestion, question1);
		}
		
		public boolean selectRequiredCheckbox(){
			
			return objWrapperFunctions.click(checkboxRequired);
		}
		
		public boolean clickSaveButtonForQuestions(){
			
			return objWrapperFunctions.click(btnSaveQuestion);
		}
		
		public boolean clickOnRadioType(){
			return objWrapperFunctions.click(radioType);
		}
		
		public boolean clickOnSliderType(){
			return objWrapperFunctions.click(sliderType);
		}
		
		public boolean selectWeightageDropDown(String selectWeightValue){	
			
			return objWrapperFunctions.selectDropDownOption(weightageDropDown,selectWeightValue,"Value");
			 
		}
		
		public boolean clickOnAddOptions(){
			return objWrapperFunctions.click(addOptions);
		}
		
		public boolean enterFirstOptionName(String option1){
			return objWrapperFunctions.setText(optionName1, option1);
		}
		
		public boolean enterSecondOptionName(String option2){
			return objWrapperFunctions.setText(optionName2, option2);
		}
		
		public boolean selectFirstScoreDropDown(String score1){	
			try {
				objWrapperFunctions.selectDropDownOption(scoreForOptionName1,score1,"Value");
			} catch (Exception e) {
				System.out.println("Test Failed- Unable To Select Score DropDown value");
			}
			return true;
		}
		
		public boolean selectSecondScoreDropDown(String score2){	
			try {
				objWrapperFunctions.selectDropDownOption(scoreForOptionName2,score2,"Value");
			} catch (Exception e) {
				System.out.println("Test Failed- Unable To Select Score DropDown value");
			}
			return true;
		}
		
		//Question2
		public boolean enterQuestionForRadioType(String question2){
			objStepBase.getDriver().switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen='true']")));
			return objWrapperFunctions.setText(enterQuestion, question2);
		}
		
		//Question3
		public boolean enterQuestionForSliderType(String question3){
			
			
			objStepBase.getDriver().switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen='true']")));
			return objWrapperFunctions.setText(enterQuestion, question3);
		}

}
