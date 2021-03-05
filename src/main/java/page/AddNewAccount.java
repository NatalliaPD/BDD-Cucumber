package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewAccount extends BasePage {
   WebDriver driver;
   
   public AddNewAccount(WebDriver driver) {
   this.driver = driver;
   }
   
   //Element library
   
   @FindBy(how = How.XPATH, using = "//input[@id='username']")
	 WebElement user_name;
	 
	 @FindBy (how = How.XPATH, using = "//input[@id='password']")
	 WebElement Password_Field;
	 
	 @FindBy (how = How.XPATH, using = "//button[@name = 'login']")
	 WebElement SignIn;
	 
	 @FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	 WebElement bank_cash;
	 
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	 WebElement new_account;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='account']")
	 WebElement account_title;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='description']")
	 WebElement description_field;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='balance']")
	 WebElement initial_balance;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	 WebElement account_number;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	 WebElement contact_person;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	 WebElement phone_number;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	 WebElement Internet_Banking_Url;
	 
	 @FindBy(how = How.XPATH, using = "//button[@type = 'submit' and @class = 'btn btn-search']")
	 WebElement submit_button;
	 
	 //Interactive methods
	 
	 public void enterUser_name(String username) {
	 user_name.sendKeys(username);
	 }
	 
	 public void enterPassword(String passWord) {
	 Password_Field.sendKeys(passWord);
	 }
	 
	 public void clickOnSignIn() {
		 SignIn.click();
	 }
	 
	 public void clickOnBankandCash() {
		 bank_cash.click();
	 }
	 
	 public void clickOnNewAccount() {
		 new_account.click();
	 }
	 
	 public void enterAccount(String AccountTitle) {
	 account_title.sendKeys(AccountTitle + new Random().nextInt(999));
	 }
	 
	 public void enterDescr(String description) {
	 description_field.sendKeys(description);
	 }
	 
	 public void enterBalance(String balance) {
	 initial_balance.sendKeys(balance);
	 }
	 
	 public void enterAccNumber(String accountNum) {
	 account_number.sendKeys(accountNum);
	 }
	 
	 public void enterContactPerson(String contactPerson) {
	 contact_person.sendKeys(contactPerson);	 
	 }
	 
	 public void enterPhone(String phoneNumber) {
	 phone_number.sendKeys(phoneNumber);
	 }
	 
	 public void enterBankUrl(String bankingUrl) {
	 Internet_Banking_Url.sendKeys(bankingUrl);
	 }
	 
	 public void clickOnSubmit() {
	 submit_button.click();
	 }
	 
	 public void validateAccount() {
	 driver.getTitle();
	 }
}
