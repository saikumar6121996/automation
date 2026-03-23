package org.step;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pojo.PojoFB;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fbook extends Reusableclass {

	//WebDriver driver;
	
@Given("to user open browser")
public void to_user_open_browser() {
	browserconfiguration();

    // driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
}

@When("to user enter valid emain and password")
public void to_user_enter_valid_emain_and_password() throws Throwable {
//   WebElement email = driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
//   WebElement password = driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
//   email.sendKeys("pavan");
//   password.sendKeys("kumar");
	
	String Actual = driver.getTitle();
	String expected = "Faceboo";
	Assert.assertEquals("expected","Actual");
   
   PojoFB fb = new PojoFB();
   WebElement email = fb.getEmail();
  fillTextBox(email, excelData("src\\test\\resources\\excel\\hr.num.xlsx", "Sheet1", 0, 0));
   
   WebElement password = fb.getPassword();
  fillTextBox(password, "kumar");
  // password.sendKeys("kumar");
   
  
   
}


@Then("to user click login")
public void to_user_click_login() {
    
	WebElement login = driver.findElement(By.xpath("//span[text()='Log in']"));
	login.click();
	//driver.quit();
}

}
