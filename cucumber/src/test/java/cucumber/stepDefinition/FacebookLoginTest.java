package cucumber.stepDefinition;

import core.Core;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLoginTest extends Core{
	
	@Given("^Uzywam nieprawidlowego loginu$")
	public void uzywam_nieprawidlowego_loginu() throws Throwable {
		launchUrl("https://facebook.com");
	}

	@Given("^oraz hasla$")
	public void oraz_hasla() throws Throwable {
	   
	}

	@When("^klikne na zaloguj$")
	public void klikne_na_zaloguj() throws Throwable {
	   
	}

	@Then("^chce poczekac pare sekund$")
	public void chce_poczekac_pare_sekund() throws Throwable {
	   
	}

}
