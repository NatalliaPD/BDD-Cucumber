@LoginRegression
Feature: validate techfios login functionality

Background:
 Given user is on the techfios login page
 
 Scenario: user should be able to login with valid credentials
     When user enters username "demo@techfios.com" and password "abc123"
     And user clicks on signin button
     Then user should land on Dashboard page
     
 Scenario Outline: user should be able to login with valid credentials
     When user enters "<userName>" and "<password>"
     And user clicks on signin button
     Then user should land on Dashboard page
     
Examples:
|userName         | password |
|demo@techfios.com| abc123    |