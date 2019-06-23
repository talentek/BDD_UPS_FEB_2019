package ups.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsDriverSetup {
	public static WebDriver driver;

	public static void getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void tearDown() {
		driver.quit();
	}

}
