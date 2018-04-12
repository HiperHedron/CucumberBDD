package core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import core.model.BrowserTypes;

public class DriverFactory {

	private static WebDriver driver;
	private static ChromeOptions options = null;
	private static DesiredCapabilities cap = null;
	private static String useGridHub;
	private static BrowserTypes browser;

	public static WebDriver createDriver(boolean grid) {
		// GRID or LOCAL
		if (grid) {
			
			// GRID SWITCH
			switch (browser.getName()) {
			
			case "chrome":
				cap = DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
				break;

			case "firefox":
				cap = DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.WINDOWS);
				break;

			case "edge":
				cap = DesiredCapabilities.edge();
				cap.setBrowserName(cap.getBrowserName());
				cap.setCapability("acceptSslCerts", "true");
				cap.setPlatform(Platform.WINDOWS);
				break;
				
			}

			try {
				driver = new RemoteWebDriver(new URL(useGridHub), cap);
			} catch (MalformedURLException e) {
				System.out.println(e.getMessage());
			}

		} else {
			// NON-GRID SWITCH
			switch (browser.getName()) {
			case "chrome":
				options = new ChromeOptions();
				options.addArguments("--disable-infobars");
				options.addArguments("--disable-logging");
				options.addArguments("--start-maximized");
				driver = new ChromeDriver(options);
				break;

			case "firefox":
				driver = new FirefoxDriver();
				break;

			case "edge":
				driver = new EdgeDriver();
				break;

			}
		}

		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		DriverFactory.driver = driver;
	}

	public static ChromeOptions getOptions() {
		return options;
	}

	public static void setOptions(ChromeOptions options) {
		DriverFactory.options = options;
	}

	public static DesiredCapabilities getCap() {
		return cap;
	}

	public static void setCap(DesiredCapabilities cap) {
		DriverFactory.cap = cap;
	}

	public static String getUseGridHub() {
		return useGridHub;
	}

	public static void setUseGridHub(String useGridHub) {
		DriverFactory.useGridHub = useGridHub;
	}

	public static BrowserTypes getBrowser() {
		return browser;
	}

	public static void setBrowser(BrowserTypes browser) {
		DriverFactory.browser = browser;
	}

}
