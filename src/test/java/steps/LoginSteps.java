package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory2;

public class LoginSteps {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory2.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}

	@Given("^user is on the techfios login page$")
	public void user_is_on_the_techfios_login_page() throws Throwable {
		driver.get("https://www.techfios.com/billing/?ng=admin/");

	}
	 @When("^user enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_enters_username_something_and_password_something(String username, String password) throws Throwable {
		 loginPage.enterUserName(username);
		 loginPage.enterPassword(password);
         Thread.sleep(2000); 
		 
	 }
	 @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enters_username_and_password(String username, String password) throws Throwable {
		 loginPage.enterUserName(username);
		 loginPage.enterPassword(password);
    Thread.sleep(2000);
	}

	@And("^user clicks on signin button$")
    public void user_clicks_on_signin_button() throws Throwable {
    loginPage.clickOnSigninButton();
    Thread.sleep(2000);
	}
	
    @Then("^user should land on Dashboard page$")
    public void user_should_land_on_dashboard_page() throws Throwable {
    loginPage.getPageTitle();
	dashboardPage.takeScreenShotAtEndOfTest(driver);
    }

	@After
	public void afterRun( ) {
		loginPage.close();
	}
    }


