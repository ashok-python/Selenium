Feature: Reset functionality on login page of Application
Scenario: Verification of Reset button 

Given I am on Facebook login page
Given Open the Chrome and launch the application			


When Enter the Username and Password			


Then Reset the credential	
Then Close the Browser

@SmokeTest 
Scenario: Add a product to bag
Given This is a blank test

@RegressionTest
Scenario Outline: Add Test data through Excel file
When a user enters "<filename>" and "<sheetname>"
Examples:
    | filename   | sheetname |
    | C:\\Sejars\\TestData.xlsx | Sheet1 |

