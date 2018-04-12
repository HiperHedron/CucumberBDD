package test;

import org.testng.annotations.Test;

import core.Core;

public class WebDriverTest extends Core{
	
	
	@Test
	public void simpletest() {
		launchUrl("https://google.pl");
	}
	

}
