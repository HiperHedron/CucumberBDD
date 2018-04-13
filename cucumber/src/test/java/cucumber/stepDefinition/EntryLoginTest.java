package cucumber.stepDefinition;

import org.openqa.selenium.By;

import core.Core;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EntryLoginTest extends Core{
	
	@Given("^Przegladarka zostala uruchomiona$")
	public void przegladarka_zostala_uruchomiona() throws Throwable {
	   launchUrl("https://kasyarkagdyniadevel.sportdata.pl/");
	}

	@When("^wpisuje login firmy companylogin$")
	public void wpisuje_login_firmy_companylogin() throws Throwable {
	    driver.findElement(By.id("loginform_company_login")).sendKeys("sportdata");
	}

	@When("^wpisuje login uzytkownika userlogin$")
	public void wpisuje_login_uzytkownika_userlogin() throws Throwable {
		driver.findElement(By.id("loginform_login")).sendKeys("bileter");
	}

	@When("^wpisuje haslo uzytkownika userpassword$")
	public void wpisuje_haslo_uzytkownika_userpassword() throws Throwable {
		driver.findElement(By.id("loginform_password")).sendKeys("K0rni$z0Nxx");
		
	}

	@When("^klikam przycisk zaloguj$")
	public void klikam_przycisk_zaloguj() throws Throwable {
	   driver.findElement(By.id("loginform_button1")).click();
	}

	@Then("^klikam wyloguj$")
	public void klikam_wyloguj() throws Throwable {
		driver.findElement(By.id("userLogin")).click();
		driver.findElement(By.xpath("//*[@id='fluidMenuContent']/header/div/p[3]/a[ . = 'Wyloguj']")).click();
		driver.quit();
	}

}
