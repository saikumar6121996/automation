package org.selnium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.findElement(By.id("datepicker")).click();
	driver.findElement(By.xpath("//a[text()='20']")).click();
	
	WebElement country = driver.findElement(By.id("country"));
	country.click();
	Select s = new Select(country);
	//driver.findElement(By.xpath("//option[text()='canada']")).click();
	s.selectByVisibleText(" Germany ");
	//s.deselectByVisibleText(" Germany ");
	//driver.findElements(By.tagName("iframe")).size();
	//driver.close();
	
}
}
