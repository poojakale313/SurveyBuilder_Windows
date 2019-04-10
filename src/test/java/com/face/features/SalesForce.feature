Feature: SalesForceLogin
   
 	
@Testfgbhf
Scenario Outline: Add New Tab
	
	Given Enter SalesForce UserName <username>
	Then  Enter SalesForce password <password>
	Then  Click on SalesForce Login button
#	Then  Navigate to HomeTab
	Then  Navigate To All Tabs
	Then  Click On Add A Tab Link
	Then  Select Custom App Value <dropSelectCustomApp>
	Then  Select from Available Tabs <selectTab>
	Then  Click On Add Button
	Then  Click On Save Button
	Then  Click On Add A Tab Link
	Then  Go To Selected Tabs <selectTab>
	Then  Click On Remove Button
	Then  Click On Save Button
	
Examples:
	| username	                  | password   | dropSelectTask  | dropSelectCustomApp   | selectTab  |                                                
	| digvijay.dusane@aress1.com   | Aressqa123 | 2				 | Site.com              | Ideas      |
	
@Testdfgdfgg
Scenario Outline: Create New Task
	
	Given Enter SalesForce UserName <username>
	Then  Enter SalesForce password <password>
	Then  Click on SalesForce Login button
#	Then  Navigate to HomeTab
	Then  Click on Create New Menu
	Then  Enter Subject <subject>
	Then  Enter Due Date <date>
	Then  Select Priority <priorityDropDown>
	Then  Enter Comments <comments>
	Then  Select CheckBox For Reminder
	Then  Click On Save
Examples:
	| username	                  | password   | subject | date      | priorityDropDown | comments  |                                            
	| digvijay.dusane@aress1.com   | Aressqa123 | Email   | 4/10/2018 | Normal           | Test123   |
	
@Testdfgdg
Scenario Outline: Create Campaign
	
	Given Enter SalesForce UserName <username>
	Then  Enter SalesForce password <password>
	Then  Click on SalesForce Login button
#	Then  Navigate to HomeTab
	Then  Navigate To All Tabs
	Then  Click On Campaign Link
	Then  Click On Create New View
	Then  Enter View Name <viewName>
	Then  Enter View Unique Name
	Then  Select RadioButton To Specify Filter Criteria
	Then  Select Field DropDown To Filter By Additional Details <fieldDropDown>
	Then  Select Operator DropDown <operatorDropDown>
	Then  Enter Value <valueText>
	Then  Select Field From Available Field <availableList>
	Then  Click On Add Button To Add The Field
	Then  Select Field From Selected Field <availableList>
	Then  Click On Remove Button To remove added field
	Then  Select RadioButton To Restrict Visibility
	Then  Save The View 
	
	
Examples:
	| username	                  | password   | viewName | fieldDropDown  | operatorDropDown | valueText       | availableList   |                                             
	| digvijay.dusane@aress1.com   | Aressqa123 | Test123  | Campaign Name  | contains         | Social Work     | Parent Campaign |
	



@Testsdfsd
Scenario Outline: Create New Event

 	Given Enter SalesForce UserName <username>
 	Then  Enter SalesForce password <password>
 	Then  Click on SalesForce Login button
 #	Then  Navigate to HomeTab
 	Then  Click on Create New 
 	Then  Enter a subject in Text Field <ComboValue>
	Then  Enter the Location <Location>
	Then  Click on Start Date Text Field <Startdate>
	Then  Click on Start Time Text Field <Starttime>
	Then  Click on End Date Text Field <Enddate>
	Then  Click on End Time Text Field <Endtime>
	Then  Enter the Description <Description>
	Then  Select Drop Down Value <dropDownValue>
	Then  Click on Sales Save Button
 
 
 Examples:
 	| username                   | password   | ComboValue    | Startdate      | Starttime | Enddate    | Endtime | Location | Description                                                                            | dropDownValue |                                    
 	| digvijay.dusane@aress1.com  | Aressqa123 | Email         | 3/10/2019      | 12:10 AM  | 10/10/2019 | 5:30 PM | Pune     | asykswfdjfgfsdgytrbsdrfgybhretbrgurbvyib yunb4456yti4bny 5yiunb4i5y5 4o5byn5hkv5trjkhg | 5 hours       | 
 

@Test1gfhnfnj
Scenario Outline: Chatter Tab Messages 

	Given Enter SalesForce UserName <username>
	Then  Enter SalesForce password <password>
	Then  Click on SalesForce Login button
#	Then  Navigate to ChatterTab
	Then Click on Message Menu
	Then Click on New Message
	Then Enter the Mail id <To>
	Then Enter the Message <Message>
	Then Click on Cancel Button

Examples:
    | username	                | password   | To                         | Message                               |                                           
	| digvijay.dusane@aress1.com | Aressqa123 | nikita.malunjkar@aress.com | dgfakresjdhbvguytgjrehfdrdtgyj cdghyt |
 
@Test1fsdaa
Scenario Outline:  Chatter Tab Feed Link

	Given Enter SalesForce UserName <username>
	Then  Enter SalesForce password <password>
	Then  Click on SalesForce Login button
#	Then  Navigate to ChatterTab
	Then Click on Feed Link
	Then Click on File Link
	Then Click on Select a File from Sales Force link
	Then Enter search text <text>
	Then Click on Search Button
	Then Click on Close Button
	Then Click on Upload File
	Then Select file 
	Then Click on Share Button

 Examples:
    | username	                | password   | text    |                                                 
	| digvijay.dusane@aress1.com | Aressqa123 | zdfjhys | 
 
@Test1dfgfn
Scenario Outline: Table Handling
	
	Given Enter SalesForce UserName <username>
	Then Enter SalesForce password <password>
	Then Click on SalesForce Login button
#	Then  Navigate to HomeTab
	Then Enter Search Content <search>
	Then Click on Search Button Table
	Then Click on Report
	Then Click on Checkbox Button
	Then Read Table Contents
	
Examples:
	| username	                   | password    | search                 |                                     
	| digvijay.dusane@aress1.com   | Aressqa123  | Opportunities In Month | 
 

