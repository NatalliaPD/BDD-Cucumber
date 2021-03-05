package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory2 {

	// global, so all methods can use
	static WebDriver driver;

	public static WebDriver startBrowser() {

		// set Chrome Driver properties
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		// Create ChromeDriver object and launch chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://techfios.com/billing/?ng=admin/");
		return driver;
	}
}
