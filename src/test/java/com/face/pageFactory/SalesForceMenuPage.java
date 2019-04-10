package com.face.pageFactory;



import org.openqa.selenium.By;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath.Step;

import core.generic.StepBase;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class SalesForceMenuPage
{
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
		
	  
	   
	  	//for New Tab
	  	By allTabs =By.xpath("//a[@href='/home/showAllTabs.jsp']");
	  	By addNewTab = By.xpath("//a[text()='add a tab']");
	  	By customAppDropDown =By.xpath("//select[@name='p4']");
	  	By availableTab =By.xpath("//select[@name='duel_select_0']");
	  	By selectedTabs =By.xpath("//select[@name='duel_select_1']");
	  	By buttonAddTab =By.xpath("//img[@class='rightArrowIcon']");
	  	By buttonRemoveTab =By.xpath("//img[@class='leftArrowIcon']");
	  	By saveAddedTabButton =By.xpath("//input[@value=' Save ']");
	  
	  	//Create New Menu
	    By createNew =By.xpath("//span[text()='Create New...']");
	  	By taskOption =By.xpath("//a[text()='Task']");    
	    // TextBOx
	    By subjectField =By.xpath("//input[@name='tsk5']");	
	    By dueDate =By.xpath("//input[@name='tsk4']");
	    By priority=By .xpath("//select[@name='tsk13']");
	    By commentsTexBox = By.xpath("//textarea[@name='tsk6']");
	    By reminderCheckBox =By.xpath("//input[@name='IsReminderSet']");
	    By saveButton =By.xpath("//input[@tabindex='11']");
	    
	    //For Campaign
	    By campaignLink = By.xpath("//a[text()='Campaigns']");
	    By createNewView = By.xpath("//a[text()='Create New View']");
	    By enterViewName = By.xpath("//input[@name='fname']");
	    By enterViewUniqueName = By.xpath("//input[@name='devname']");
	    By myCampaignRadio = By.xpath("//input[@name='fscope'][2]");
	    By fieldDropDownSelect = By.xpath("//select[@name='fcol1']");
	    By operatorDropDownSelect = By.xpath("//select[@name='fop1']");
	    By valueTextBox = By.xpath("//input[@name='fval1']");
	    By listAvailableField = By.xpath("//select[@name='colselector_select_0']");
	    By listSelectedField = By.xpath("//select[@name='colselector_select_1']");
	    By addButtonAvailableField =By.xpath("(//img[@class='rightArrowIcon'])[1]");
	    By removeButtonSelected =By.xpath("(//img[@class='leftArrowIcon'])[1]");
	    By radioButtonRestrict = By.xpath("(//input[@name='fshare'])[2]");
	    By saveButtonCampaign =By.xpath("(//input[@class='btn primary'])[2]");
	     
	  //----------------------------------New Event---------------------------------------------------------//
	    By event = By.xpath("//a[@class='menuButtonMenuLink firstMenuItem eventMru']");
	    By inpStartDate = By.xpath("//input[@name='StartDateTime']");
	    By inpStartTime = By.xpath("//input[@name='StartDateTime_time']");
	    By inpEndDate = By.xpath("//input[@name='EndDateTime']");
	    By inpEndTime = By.xpath("//input[@name='EndDateTime_time']");
	    By textLocation = By.xpath("//input[@name='evt12']"); 
	    By textDescription = By.xpath("//textarea[@name='evt6']");
	    By textSubject= By.xpath("//input[@name='evt5']");
	    By dropPicklist = By.xpath("//select[@name='ReminderDateTime']");
	  //-------------------------------------------------------------------------------------------//	
	    By btnMessageMenuButton = By.xpath("//a[@class='trigger']");
	    By btnNewMessageButton = By.xpath("//input[@class='openPrivateMessageDialog zen-btn']");
	 // By sendamessage = By.xpath("//*[contains(@class,'composeInput')]/div[1]");
	    By sendamessage = By.xpath("//*[@id='recipientInputBox']");
	    By textArea = By.xpath("//textarea[@name='message']");
	    By btnCancelButton = By.xpath("//input[@title='Cancel']");
	    By FrameSendMessage = By.id("conversationComposeDialogTitle");
	    
	  //--------------------------------------------------------------------------------------------//
	    By feedLink = By.xpath("//a[@title='Feed']");
		By fileLink = By.xpath("//a[@title='File']");
		By btnclosebutton = By.xpath("//a[@title='Close']");
		By searchText =By.xpath("//input[@title='Search All Files...']");
		By fileSelectLink = By.xpath("//a[@title='Select a file from Salesforce']");
		By fileUploadLink = By.xpath("//a[@title='Upload a file from your computer']");
		By btnChooseButton = By.xpath("//input[@name='chatterFile']");
		By btnSearchButton = By.xpath("//a[text()='Search']");
		By postText = By.xpath("//body[text()='Share an update, @mention someone...']");
		By btnShareButton = By.xpath("//input[@name='publishersharebutton']");
	    
	    //-------------------------------------------------------------------------------------------------//
		By btnSearch = By.xpath("//*[contains(@id,'phSearchButton')]");
		By btnReport = By.xpath("//*[contains(text(),'Opportunities In Month')]");
		By checkBox = By.xpath("(//*[contains(@class,'drilldown')])[1]");
		By searchtab = By.xpath("//*[contains(@title,'Search...')]");
		By tablecontent = By.xpath("//*[contains(@class,'reportOutput')]");
		
		
		//--------------------------------Add New Tab-----------------------------------------------------//
		public boolean clickAllTabs(){			
			return objWrapperFunctions.click(allTabs);
		}
		public boolean clickAddTab(){			
			return objWrapperFunctions.click(addNewTab);
		}
		public boolean selectCustomAppDropDown(String dropDownValue){	
			return objWrapperFunctions.selectDropDownOption(customAppDropDown,dropDownValue,"Text");
		}
		
		public boolean selectAvailableTab(String selectValue){	
			try {
				objWrapperFunctions.selectDropDownOption(availableTab,selectValue,"Text");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Test Failed- Unable To Select Tab");
			}
			return true;
		}
		
		public boolean SelectedTab(String selectValue){	
			try {
				 objWrapperFunctions.selectDropDownOption(selectedTabs,selectValue,"Text");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Test Failed- Unable To Remove Tab");
			}
			return true;
		}
		public boolean clickButtonAddTab(){			
			return objWrapperFunctions.click(buttonAddTab);
			
		}
		public boolean clickSaveAddedTabButton(){			
			return objWrapperFunctions.click(saveAddedTabButton);
			
		}
		public boolean clickButtonRemoveTab(){			
			return objWrapperFunctions.click(buttonRemoveTab);
			
		}
		
		
	//--------------------------------Create New Task-----------------------------------------------------//
		public boolean clickCreateNewMenu(){	
			 objWrapperFunctions.click(createNew);
			 return objWrapperFunctions.click(taskOption);
		}
			
	
		public boolean setSubjectTask(String subject){			
			return objWrapperFunctions.setText(subjectField,subject);
		}
		
		public boolean setDate(String date){			
			return objWrapperFunctions.setText(dueDate,date);
		}
		
		public boolean selectPriorityDropDown(String priorityDropDown){	
			return objWrapperFunctions.selectDropDownOption(priority,priorityDropDown,"Text");
		}
		
		public boolean setComments(String comments){			
			return objWrapperFunctions.setText(commentsTexBox,comments);
		}
		
		public boolean clickReminderCheckBox(){			
			return objWrapperFunctions.click(reminderCheckBox);
			
		}
		
		public boolean clickSaveButtonTask(){			
			return objWrapperFunctions.click(reminderCheckBox);
			
		}
		//--------------------------------Create Campaign-----------------------------------------------------//
		
		public boolean clickcampaignLink(){			
			return objWrapperFunctions.click(campaignLink);
		}
		
		public boolean clickcreateNewView(){			
			return objWrapperFunctions.click(createNewView);
		}
		
		public boolean setViewName(String viewName){			
			return objWrapperFunctions.setText(enterViewName,viewName);
		}
		
		public boolean clickViewUniqueName(){			
			return objWrapperFunctions.click(enterViewUniqueName);
		}
		
		
		public boolean clickmyCampaignRadio(){			
			return objWrapperFunctions.click(myCampaignRadio);
		}

		
		public boolean selectFieldDropDown(String fieldDropDown){	
			return objWrapperFunctions.selectDropDownOption(fieldDropDownSelect,fieldDropDown,"Text");
		}
		
		public boolean selectOperatorDropDown(String operatorDropDown){	
			return objWrapperFunctions.selectDropDownOption(operatorDropDownSelect,operatorDropDown,"Text");
		}
		
		public boolean setValue(String value){			
			return objWrapperFunctions.setText(valueTextBox,value);
		}
		
		
		public boolean selectlistAvailableField(String availableList){	
			return objWrapperFunctions.selectDropDownOption(listAvailableField,availableList,"Text");
		}
		
		public boolean clickaddButtonAvailableField(){			
			return objWrapperFunctions.click(addButtonAvailableField);
		}
		
		public boolean selectlistSelectedField(String availableList){	
			return objWrapperFunctions.selectDropDownOption(listSelectedField,availableList,"Text");
		}
		public boolean clickremoveButtonSelected(){			
			return objWrapperFunctions.click(removeButtonSelected);
		}
		
		public boolean clickradioButtonRestrict(){			
			return objWrapperFunctions.click(radioButtonRestrict);
		}
		
		public boolean clicksaveButtonCampaign(){			
			return objWrapperFunctions.click(saveButtonCampaign);
		}
		
		//--------------------------------New Event-----------------------------------------------------//
		
		/** click Create New Button*/
		public boolean clickCreateNew(){
			 objWrapperFunctions.click(createNew);
		     return objWrapperFunctions.click(event);
		}
		
		/**Enter the Subject*/
		public boolean setSubject(String ComboValue){
			return objWrapperFunctions.setText(textSubject, ComboValue);	
		}
		
		/**Enter the Location*/
		public boolean setLocation(String Location){
			return objWrapperFunctions.setText(textLocation, Location);	
		}
		
		/**Enter the Description*/
		public boolean setDescription(String Description){
			return objWrapperFunctions.setText(textDescription, Description);	
		}
		
		/** Enter Start & End Date & Time*/
		public boolean clickStartDate(String Startdate){
			return objWrapperFunctions.setText(inpStartDate, Startdate);
		}
		
		public boolean clickStartTime(String Starttime){
			return objWrapperFunctions.setText(inpStartTime, Starttime);
		}
		
		public boolean clickEndDate(String Enddate){
			return objWrapperFunctions.setText(inpEndDate, Enddate);
		}
		
		public boolean clickEndTime(String Endtime){
			return objWrapperFunctions.setText(inpEndTime, Endtime);
		}
		
		/** Set Start Date Text Field*/
		public boolean setStartDate(String Startdate){
			return objWrapperFunctions.setText(inpStartDate, Startdate);	
		}
		
		public boolean setStartTime(String Starttime){
			return objWrapperFunctions.setText(inpStartTime, Starttime);	
		}
		
		public boolean setEndDate(String Enddate){
			return objWrapperFunctions.setText(inpEndDate, Enddate);	
		}
		
		public boolean setEndTime(String Enddate){
			return objWrapperFunctions.setText(inpEndTime, Enddate);	
		}
	
		public boolean selectDropDownvalue(String dropDownValue){
			return objWrapperFunctions.selectDropDownOption(dropPicklist, dropDownValue, "Text");
		}
		
		public boolean clickSaveButton(){   
		    return objWrapperFunctions.click(saveButton);
		}
	//----------------------------Chatter Tab Message--------------------------------------------------------------------//
		public boolean clickMessageMenuButton(){
		    return objWrapperFunctions.click(btnMessageMenuButton);	
		}

		public boolean clickNewMessageButton(){
		   return objWrapperFunctions.click(btnNewMessageButton);	
		}
		
		public boolean setMailId(String To) throws InterruptedException{
			try {
			      Thread.sleep(5000);
			     } catch (InterruptedException e) {
			      // TODO Auto-generated catch block
			      e.printStackTrace();
			     }
			try {
				objWrapperFunctions.checkElementExistence(FrameSendMessage, 10);
				StepBase.driver.switchTo().frame("conversationComposeDialogContentId");
				objWrapperFunctions.checkElementExistence(sendamessage, 10);
				objWrapperFunctions.setText(sendamessage, To);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Step Failed - Unable To Set Mail Id");
			}	
			
			return true;
		}
		
		public boolean setMessage(String Message){
			return objWrapperFunctions.setText(textArea, Message); 
		}
		
		public boolean clickCancelButton(){
		     try {
				objWrapperFunctions.click(btnCancelButton);	
				 StepBase.driver.switchTo().parentFrame();
				 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Step Failed - Unable To click Cancel button");
			}
		     return true;
		}
		
	//----------------------------------------Chatter Tab Feed Link-------------------------------------------------------------//
		public boolean clickFeedLink(){
			   return objWrapperFunctions.click(feedLink);	
			}
		
		public boolean clickFileLink(){
			   return objWrapperFunctions.click(fileLink);	
			}
		
		public boolean clickCloseButton(){
			   return objWrapperFunctions.click(btnclosebutton);	
			}
		
		public boolean clickSelectFileLink(){
			   return objWrapperFunctions.click(fileSelectLink);	
			}
		
		public boolean setSearchText(String text){
			try {
				StepBase.driver.switchTo().frame("chatterFindExistingContentContentId");
				objWrapperFunctions.setText(searchText, text);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Step Failed - Unable To Search Text");
			} 
			return true;
		}
		
		public boolean clickSearchButton(){
			   try {
				objWrapperFunctions.click(btnSearchButton);	
				   StepBase.driver.switchTo().parentFrame();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Step Failed - Unable To click Search button");
			}
			   return true;
			}
		
		/** File Upload Link*/
		public boolean clickUploadFilelink(){
			  return objWrapperFunctions.click(fileUploadLink);	
			}
		
		public boolean uploadPhotoTo() {
			 try {
				String	filePath=null;
				 objWrapperFunctions.click(btnChooseButton);
				 objWrapperFunctions.uploadPhoto(btnChooseButton, filePath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Step Failed - Unable To Upload Image");
			}
			 return true;
		}
		
		public boolean clickShareButton(){
			   return objWrapperFunctions.click(btnShareButton);	
			}	
	//---------------------------------------------Table Handling----------------------------------------------//
		/** Enter search content*/ 
		public boolean enterSearchContent(String search){ 
			return objWrapperFunctions.setText(searchtab, search);
		}
		
		/** click on search button*/
		public boolean clickSearchButtonTable(){
			objUtilities.waitForPageLoad();
			return objWrapperFunctions.click(btnSearch);
		}
		
		/** click on report button*/
		public boolean clickReportButton(){
			objUtilities.waitForPageLoad();
			return objWrapperFunctions.click(btnReport);
		}
		

		public boolean viewTableContent(By locator) 
		{
			return objWrapperFunctions.viewTableContent(tablecontent);
			
		}
		
		public boolean clickCheckboxButton(){
			objUtilities.waitForPageLoad();
			return objWrapperFunctions.click(checkBox);
		}
		
}
