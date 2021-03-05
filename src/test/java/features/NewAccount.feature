@AddNewAccount
Feature: techfios Bank & Cash New Account functionality


Scenario Outline: user should be able to open a new account 
Given user already logged in as "demo@techfios.com" and "abc123"
When  user is able to see Dashboard 
Then  user navigates to Bank and Cash 
Then  user clicks on New Account 
Then  user completes the form entering "<accountTitle>"and"<description>"and"<initialBalance>"and"<accountNumber>"and"<contactPerson>"and"<phone>"and"<InternetBankingUrl>"  
Then user clicks on submit button
Then  created account should be posted
    
 Examples:
|username          |password |accountTitle      | description | intialBalance | accountNumber | contactPerson | phone       | InternetBankingUrl |
| demo@techfios.com|abc123   |Account receivable| business |  | 1000000000 |  | 987654321     |    Natallia D | 18880002345| http://www.nbanking.com/business |
    