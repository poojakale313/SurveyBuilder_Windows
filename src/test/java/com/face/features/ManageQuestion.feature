Feature: Verification of SalesForce Manage Question

  @ManageQuestion
  Scenario Outline: Salesforce Manage question 
    Given Enter SalesForce UserName <username>
    Then Enter SalesForce password <password>
    Then Click on SalesForce Login button
    Then Click on Home
    Then Click on Survey launcher
    Then Click on Manage questions
    Then Click on Create New Tab
    Then Enter New Question for FreeText type <question1>
    Then Select Required checkbox
    Then Click on Save button to save the question   
    Then Click on Create new
    Then Enter New Question for Radio type <question2>
    Then Select Type of Question as Radio
    Then Select Required checkbox
    Then Select Weightage value as 2 from dropdown <selectWeightValue>
    Then Click on Add Options
    Then Set option name1 as good <option1>
    Then Select Score as 4 from dropdown <score1>
    Then Click on Add Options
    Then Set option name2 as better <option2>
    Then Select Score as 5 from dropdown <score2>
    Then Click on Save button to save the question     
    Then Click on Create new
    Then Enter New Question as Slider <question3>
    Then Select Type of Question as Slider
    Then Select Weightage value as 2 from dropdown <selectWeightValue>
    Then Click on Save button to save the question
  
    Examples: 
      | username                   | password    | question1           | question2         | option1 | option2 | question3       | selectWeightValue | score1 | score2 |
      | pritam.survey@aress.com    | Aress12345$ | rate your day       | rate your week    | Good    | Better  | rate your month | 2                 | 4      | 5      |
      
 