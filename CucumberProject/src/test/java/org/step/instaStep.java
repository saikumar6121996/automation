package org.step;

import java.io.IOException;

import org.base.InstaPojo;
import org.base.Reusable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class instaStep extends Reusable {


@Given("To launch Browser and pass valid amazom url")
public void toLaunchBrowserAndPassValidAmazomUrl() {
 edgebrowserconfiguration();
   geturl("https://www.instagram.com/accounts/login/#");
	maximise();
	waits(10);
	
}

@When("To user enter valid amazon username and password")
public void toUserEnterValidAmazonUsernameAndPassword() throws IOException {
  
	InstaPojo i = new InstaPojo();
	driver.findElement(By.xpath("//input[@aria-required='true'])[1]")).sendKeys("sai");
	
//    WebElement email = i.getEmail();
//    
//    String excelData = excelData("C:\\Users\\welcome\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\excel\\Book58.xlsx", "Sheet1", 0, 0);
//	fillTextBox(email, excelData);
	
//	WebElement password = i.getPassword();
//	String excelData2 = excelData("C:\\Users\\welcome\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\excel\\Book58.xlsx","Sheet1", 0, 1);
//	fillTextBox(password, excelData2);
//	
//	
}
@Then("To click login")
public void toClickLogin() {
   
	InstaPojo i = new InstaPojo();
	WebElement login = i.getLogin();
	buttonclick(login);
}


	
}
