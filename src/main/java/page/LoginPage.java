package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
    this.driver = driver;
	}
	// Element Library
	 @FindBy(how = How.XPATH, using = "//input[@id='username']")
	 WebElement user_name;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='password']")
	 WebElement Password;
	 
	@FindBy(how = How.XPATH, using = "//button[@name= 'login']")
	WebElement signIn;

	// Interactive methods

	public void enterUserName(String username) {
		user_name.sendKeys(username);
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);

	}

	public void clickSigninButton() {
		signIn.click();
	}

	public void enterCredentials(String username, String password) {
		user_name.sendKeys(username);
		Password.sendKeys(password);
	}

	public String getLoginPageTitle() {
		return driver.getTitle();

	}
	public void clickOnSigninButton() {
		signIn.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currrentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currrentDir + "/screenshots/" + label + ".png"));
	}
	
	public void close() {
		driver.close();
		driver.quit();
	}
}
