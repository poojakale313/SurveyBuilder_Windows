Feature: Verification of SalesForce Manage Survey

  @ManageSurvey
  Scenario Outline: Salesforce Manage survey module
    Given Enter SalesForce UserName <username>
    Then Enter SalesForce password <password>
    Then Click on SalesForce Login button
    Then Click on Home
    Then Click on Survey launcher
    Then Click on Manage Survey
    Then Click on Create New Tab
    Then Enter title for the survey <surveytitle>
    Then Enter description <surveydescription>
    Then Enter expiration days <surveydays>
    Then Select date
    Then Click on Next button
    Then Click on select questions from library
    Then Enter text to search the question from library <questionsearch>
    Then Click on filter
    Then Select first question
    Then Select second question
    Then Select third question
    Then Click on assign question
    Then Click on Create new question
    Then Enter question title <questiontitle>
    Then Select type of question multiselect
    Then Click on add options
    Then Enter option name <optionname>
    Then Select Score as 4 from dropdown <score1>
    Then Click on create question
    Then Click on Back to Survey question List
    Then Click on Next button
    Then Navigate to custom email tab
    Then Enter email ID <customemailid>
    Then Click on Next to send survey page    
    Then Click on send survey button
    Then verify the success response

    Examples: 
      | username                | password    | surveytitle | surveydescription | surveydays | questionsearch | questiontitle  | dropdownweightage | optionname | dropdownweightageoption | customemailid                  |score1   |                       
      | pritam.survey@aress.com | Aress12345$ | Testing     | qwertyuiui        |          1 | rate your      | rate your year |                 1 | GOOD       |                       3 | rutuja.gaikwad@aressindia.net  |3        |
