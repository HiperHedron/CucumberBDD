package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import core.model.BrowserTypes;

public class Core {
	
	public static WebDriver driver;
	private static boolean grid = true;
	
	public Core() {
		//DriverFactory.setUseGridHub("http://192.168.1.118:4444/wd/hub");
		DriverFactory.setUseGridHub("http://10.10.10.173:4444/wd/hub");
		DriverFactory.setBrowser(BrowserTypes.CHROME);
		
	}
	
	public static void launchUrl(String url) {
		driver = DriverFactory.createDriver(grid);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.get(url);
	}
	

}
