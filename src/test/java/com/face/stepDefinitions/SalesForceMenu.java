package com.face.stepDefinitions;

import org.junit.Assert;
import com.face.pageFactory.SalesForceMenuPage;
import core.generic.Utilities;
import cucumber.api.java.en.Then;
/**
 * @ScriptName    : SuiteSteps
 * @Description   : This class contains   
 * @Author: Digvijay Dusane(Aress) @Creation Date : 08 Jan 2018   @Modified Date:                    
 */
public class SalesForceMenu 
{
	// Local variables
	
	private Utilities objUtilities = new Utilities();
	private SalesForceMenuPage objSalesForceMenuPage = new SalesForceMenuPage();
	

	//-----------------------------------------Add New Tab--------------------------------------------------//
	@Then("^Navigate To All Tabs$")
	public void clickOnAllTab()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickAllTabs());
	}
	
		
	@Then("^Click On Add A Tab Link$")
	public void clickOnAddTab()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickAddTab());
	}
	
	@Then("^Select Custom App Value (.*)$")
	public void selectCustomAppValue(String dropSelectCustomApp)
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.selectCustomAppDropDown(dropSelectCustomApp));
	}
	
	@Then("^Select from Available Tabs (.*)$")
	public void selectFromAvailableTab(String selectTab)
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.selectAvailableTab(selectTab));
	}
	
	
	@Then("^Click On Add Button$")
	public void clickOnAddButton()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickButtonAddTab());
	}
	
	
	@Then("^Click On Save Button$")
	public void clickOnSaveButton()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickSaveAddedTabButton());
	}
	@Then("^Go To Selected Tabs (.*)$")
	public void SelectedTab(String selectTab)
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.SelectedTab(selectTab));
	}
	
	@Then("^Click On Remove Button$")
	public void clickOnRemoveButton()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickButtonRemoveTab());
	}
	
	
	
	//-----------------------------------------Create New Task--------------------------------------------------//
	@Then("^Click on Create New Menu$")
	public void clickOnCreateNew() 
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickCreateNewMenu());
	}

	@Then("^Enter Subject (.*)$")		
	public void enterSubjectTask(String subject)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.setSubjectTask(subject));
	}
	
	@Then("^Enter Due Date (.*)$")		
	public void enterDate(String date)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.setDate(date));
	}
	@Then("^Select Priority (.*)$")
	public void selectPriority(String priorityDropDown)
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.selectPriorityDropDown(priorityDropDown));
	}
	
	
	@Then("^Enter Comments (.*)$")		
	public void enterComments(String comments)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.setComments(comments));
	}
	
	@Then("^Select CheckBox For Reminder$")
	public void clickOnReminderCheckBox()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickReminderCheckBox());
	}
	
	@Then("^Click On Save$")
	public void clickOnSave()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickSaveButtonTask());
	}
	
	//-----------------------------------------Create Campaign--------------------------------------------------//

	@Then("^Click On Campaign Link$")
	public void clickOnCampaignLink()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickcampaignLink());
	}
	
	@Then("^Click On Create New View$")
	public void clickOnCreateNewView()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickcreateNewView());
	}
	
	@Then("^Enter View Name (.*)$")		
	public void enterViewName(String viewName)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.setViewName(viewName));
	}
	
	@Then("^Enter View Unique Name$")
	public void enterOnViewUniqueName()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickViewUniqueName());
	}
	
	@Then("^Select RadioButton To Specify Filter Criteria$")
	public void clickOnCampaignRadio()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickmyCampaignRadio());
	}
	
	@Then("^Select Field DropDown To Filter By Additional Details (.*)$")
	public void selectField(String fieldDropDown)
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.selectFieldDropDown(fieldDropDown));
	}
	
	@Then("^Select Operator DropDown (.*)$")
	public void selectOperator(String operatorDropDown)
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.selectOperatorDropDown(operatorDropDown));
	}
	
	@Then("^Enter Value (.*)$")		
	public void enterValue(String value)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.setValue(value));
	}
	
	@Then("^Select Field From Available Field (.*)$")
	public void selectAvailableList(String availableList)
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.selectlistAvailableField(availableList));
	}
	
	@Then("^Click On Add Button To Add The Field$")
	public void clickOnClickaddButtonAvailableField()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickaddButtonAvailableField());
	}
	
	@Then("^Select Field From Selected Field (.*)$")
	public void selectFromSelectedList(String availableList)
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.selectlistSelectedField(availableList));
	}
	
	@Then("^Click On Remove Button To remove added field$")
	public void clickOnRemoveButtonAvailableField()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickremoveButtonSelected());
	}
	@Then("^Select RadioButton To Restrict Visibility$")
	public void clickOnRadioButtonRestrict()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickradioButtonRestrict());
	}
	
	
	@Then("^Save The View$")
	public void clickOnSaveButtonCampaign()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clicksaveButtonCampaign());
	}
	//-------------------------------------------Create New Event-----------------------------------------------------------------//
	
	
	@Then("^Click on Create New$")
	public void clickcreatenew()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickCreateNew());
	}
	
	@Then ("^Enter a subject in Text Field (.*)$")
	public void enterSubject(String ComboValue)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.setSubject(ComboValue));	
	}
		
	@Then ("^Enter the Location (.*)$")
	public void enterLocation(String Location)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.setLocation(Location));	
	}
	

	@Then ("^Enter the Description (.*)$")
	public void enterDescription(String Description)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.setDescription(Description));
		
	}
	
	@Then("^Click on Start Date Text Field (.*)$")
	public void clickstartdate(String Startdate)
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickStartDate(Startdate));
		Assert.assertTrue(objSalesForceMenuPage.setStartDate(Startdate));
	}
	
	@Then("^Click on Start Time Text Field (.*)$")
	public void clickstarttime(String Starttime)
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickStartTime(Starttime));
		Assert.assertTrue(objSalesForceMenuPage.setStartTime(Starttime));
	}
	
	@Then("^Click on End Date Text Field (.*)$")
	public void clickenddate(String Enddate)
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickEndDate(Enddate));
		Assert.assertTrue(objSalesForceMenuPage.setEndDate(Enddate));
	}
	
	@Then("^Click on End Time Text Field (.*)$")
	public void clickendtime(String Endtime)
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickEndTime(Endtime));
		Assert.assertTrue(objSalesForceMenuPage.setEndTime(Endtime));
	}
	
	@Then ("^Select Drop Down Value (.*)$")
	public void selectdropdownvalue(String dropDownValue)
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.selectDropDownvalue(dropDownValue));
	}
	
	@Then("^Click on Sales Save Button$")
	public void clicksavebutton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickSaveButton());
	}
	
	
//------------------------------------------Chatter Tab Message-----------------------------------------------------------------------//
	@Then("^Click on Message Menu$")
	public void clickmessagemenubutton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickMessageMenuButton());
	}
	
	@Then("^Click on New Message$")
	public void clicknewmessagebutton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickNewMessageButton());
	}
	
	@Then ("^Enter the Mail id (.*)$")
	public void enterMailId(String To) throws InterruptedException  
	{
		try {
		      Thread.sleep(4000);
		     } catch (InterruptedException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		     }
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.setMailId(To));
		
	}
	
	@Then ("^Enter the Message (.*)$")
	public void enterMessage(String Message)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.setMessage(Message));
	}
	
	@Then("^Click on Cancel Button$")
	public void clickcancelbutton()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickCancelButton());
	}
	
	//-------------------------------------Chatter Tab Feed Link----------------------------------------------------//
	@Then("^Click on Feed Link$")
	public void clickfeedlink()
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickFeedLink());
	}

	@Then ("^Click on File Link$")
	public void clickfilelink()  
	{
		try {
		      Thread.sleep(4000);
		     } catch (InterruptedException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		     }
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickFileLink());
	}
	
	@Then ("^Click on Select a File from Sales Force link$")
	public void clickselectfilelink()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickSelectFileLink());
	}
	
	@Then ("^Enter search text (.*)$")
	public void enterSearchText(String text)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.setSearchText(text));	
	}
	
	@Then ("^Click on Search Button$")
	public void clicksearchbutton()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickSearchButton());
	}
	
	@Then ("^Click on Close Button$")
	public void clickclosebutton()  
	{
		try {
		      Thread.sleep(4000);
		     } catch (InterruptedException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		     }
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickCloseButton());
	}
	
	
	/** File Upload Link*/
	@Then ("^Click on Upload File$")
	public void clickuploadfilelink()  
	{
		try {
		      Thread.sleep(4000);
		     } catch (InterruptedException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		     }
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickUploadFilelink());
	}
	
	@Then("^Select file$")
	public void selectfile()  
	{
		try {
		      Thread.sleep(4000);
		     } catch (InterruptedException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		     }
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.uploadPhotoTo());
	}
	
	@Then ("^Click on Share Button$")
	public void clicksharebutton()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickShareButton());
	}	
	
  //-----------------------------------------Table Handling-----------------------------------------------------------//
	@Then("^Enter Search Content (.*)$")
	public void enterSearchContent(String search)  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.enterSearchContent(search));
	}
	
	
	@Then("^Click on Search Button Table$")
	public void clickOnSearchButton()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickSearchButtonTable());
	}

	@Then("^Click on Report$")
	public void clickOnReportButton()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickReportButton());
	}

	
	@Then("^Click on Checkbox Button$")
	public void clickOnCheckBox()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.clickCheckboxButton());
	}

	@Then("^Read Table Contents$")
	public void readTableContent()  
	{
		objUtilities.waitForPageLoad();
		Assert.assertTrue(objSalesForceMenuPage.viewTableContent(null));
	}
	
	
}
