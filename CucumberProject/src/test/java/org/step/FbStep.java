package org.step;

import org.base.PojoFB;
import org.base.Reusable;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbStep extends Reusable {	

	
@Given("To launch Browser and pass valid url")
public void toLaunchBrowserAndPassValidUrl() {
	browserconfiguration();
	   geturl("https://www.facebook.com/");
	   maximise();
}

@When("To user enter valid username and password")
public void toUserEnterValidUsernameAndPassword() {
   waits(10);
}

@When("To user enter {string} and {string}")
public void toUserEnterAnd(String username, String password) {
	 PojoFB p = new PojoFB();
	    WebElement email = p.getEmail();
	    fillTextBox(email, username);
	    
	    WebElement pass = p.getPassword();
	    fillTextBox(pass, password);
	    
	    WebElement login = p.getLogin();
	    buttonclick(login);
	    
	    
}
@Then("To closeit")
public void toCloseit() {
   driver.close();
}


	    
}