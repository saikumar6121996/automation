package org.selnium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testg {
	
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeMethod
	private void precondition() {
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}
	

@Test(invocationCount=3)
@Parameters({"username","pass"})
private void tc1(String username,String pass) {
	
	WebElement username1 = driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
	username1.sendKeys(username);
	WebElement pass1 = driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
	pass1.sendKeys(pass);
	driver.findElement(By.xpath("//div[@aria-label='Log in']")).click();
	

}

@AfterMethod
private void postcondition() {
	//driver.quit();

}


//@DataProvider(name="loginData")
//private Object[][] getlogindata() {
//	return new Object[][] {
//		{"sai","pavan"},{"kumar","valleti"}
//	};

//}
}
