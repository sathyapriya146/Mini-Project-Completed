package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Sele_Wait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"E:\\Sathyapriya\\Selenium\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	create.click();
//	WebElement fName = driver.findElement(By.name("firstname"));
//	fName.sendKeys("selenium");
	
//	WebDriverWait wait = new WebDriverWait(driver, 30);
//	wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname"))).sendKeys("java");
	
		
	@SuppressWarnings({ "deprecation" })
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(500,TimeUnit.SECONDS)
		.pollingEvery(2, TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
	WebElement wb = (WebElement) wait.until(new Function<WebDriver, WebElement>() {
		
		@Override
		public WebElement apply(WebDriver arg0) {
			WebElement fName = driver.findElement(By.name("firstname"));
			fName.sendKeys("king");
			return fName;
		}
	});

	
	
	


//private static FluentWait<WebDriver> withTimeout(int i, TimeUnit seconds) {
//	// TODO Auto-generated method stub
//	return null;
}
}
/*WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
public WebElement applyy(WebDriver driver) {
return driver.findElement(By.id("foo"));
}
});*/
/*//Declare and initialise a fluent wait
FluentWait wait = new FluentWait(driver);
//Specify the timout of the wait
wait.withTimeout(5000, TimeUnit.MILLISECONDS);
//Sepcify polling time
wait.pollingEvery(250, TimeUnit.MILLISECONDS);
//Specify what exceptions to ignore
wait.ignoring(NoSuchElementException.class)*/
























