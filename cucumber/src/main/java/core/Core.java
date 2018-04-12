package core;

import org.openqa.selenium.WebDriver;

import core.model.BrowserName;

public class Core {
	
	public static WebDriver driver;
	private static boolean grid = true;
	
	public Core() {
		DriverFactory.setUseGridHub("http://192.168.1.118:4444/wd/hub");
		DriverFactory.setBrowser(BrowserName.CHROME);
		driver = DriverFactory.createDriver(grid);
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	

}