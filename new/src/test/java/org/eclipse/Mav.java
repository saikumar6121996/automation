package org.eclipse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Mav {
public static void main(String[] args) throws AWTException, Throwable {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchbar.sendKeys("iphone17");
	
	WebElement serch = driver.findElement(By.cssSelector("#nav-search-submit-button"));
	serch.click();
	

	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	WebElement iphone17 = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
	
	js.executeScript("arguments[0].click()",iphone17);
	String title1 = driver.getTitle();
	System.out.println(title1);
	
	String parent = driver.getWindowHandle();
//	Set<String> allwindows = driver.getWindowHandles();
//	for (String tabs : allwindows) {
//		if(!tabs.equals(parent)) {
//			driver.switchTo().window(tabs);
//		}
//	}
	
	Set<String> allwindows = driver.getWindowHandles();

	List<String> windowList = new ArrayList<>(allwindows);

	driver.switchTo().window(windowList.get(1));
	
	WebElement addcart = driver.findElement(By.id("add-to-cart-button"));
	
	js.executeScript("arguments[0].click()", addcart);
	driver.quit();
}
}
