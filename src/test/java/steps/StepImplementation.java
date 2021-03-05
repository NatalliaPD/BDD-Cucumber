package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.AddNewAccount;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory2;

public class StepImplementation {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AddNewAccount addnewaccountPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory2.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		addnewaccountPage = PageFactory.initElements(driver, AddNewAccount.class);

	}
	
	@Given("^user already logged in as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_already_logged_in_as_something_and_something(String username, String password) throws Throwable {
     loginPage.enterCredentials(username, password);
     loginPage.clickOnSigninButton();
      dashboardPage.waitForPage();
    }
	

	@When("^user is able to see Dashboard$")
	public void user_is_be_able_to_see_dashboard() throws Throwable {
		
		Assert.assertEquals("Dashboard- iBilling", driver.getTitle());
		addnewaccountPage.takeScreenShotAtEndOfTest(driver);
	}

	 @Then("^user navigates to Bank and Cash$")
	    public void user_navigates_to_bank_and_cash() throws Throwable {
		addnewaccountPage.clickOnBankandCash();
	}

	@Then("^user clicks on New Account$")
	public void user_clicks_on_new_account() throws Throwable {
		addnewaccountPage.clickOnNewAccount();
	}

	 @Then("^user completes the form entering \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"$")
 public void user_completes_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String accountTitle, String description, String initialBalance, String accountNumber, String contactPerson, String phone, String InternetBankingUrl) throws Throwable {
	 {
		 addnewaccountPage.enterAccount(accountTitle);
		 addnewaccountPage.enterDescr(description);
		 addnewaccountPage.enterBalance(initialBalance);
		 addnewaccountPage.enterAccNumber(accountNumber);
		 addnewaccountPage.enterContactPerson(contactPerson);
		 addnewaccountPage.enterPhone(phone);
		 addnewaccountPage.enterBankUrl(InternetBankingUrl);
	 }
	 }
	 
	 @Then("^user clicks on submit button$")
	    public void user_clicks_on_submit_button() throws Throwable {
	    addnewaccountPage.clickOnSubmit();
	    Thread.sleep(2000);
	} 
 @Then("^created account should be posted$")
 public void created_account_should_be_posted() throws InterruptedException, IOException {
	 addnewaccountPage.takeScreenShotAtEndOfTest(driver);
	 Thread.sleep(2000);
 }
 
	
@After
public void teardown() {
	driver.close();
	driver.quit();
}

 }

	

