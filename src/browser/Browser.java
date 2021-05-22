package browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	private static ChromeDriver browser;
	
	public static ChromeDriver getBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-driver\\chromedriver_win32\\chromedriver.exe");
		if (browser == null) {
			browser = new ChromeDriver();
		}
		browser.manage().window().maximize();

		return browser;
	}
}
