package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Javascript {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"E:\\Sathyapriya\\Selenium\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-500)", "");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,1)", "");
	WebElement mobile = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']"));
	js.executeScript("arguments[0].click();",mobile);
}
}
