package com.selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sele_Day_3_Q_2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"E:\\Sathyapriya\\Selenium\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	Actions a = new Actions(driver);
		
	WebElement sign_In = driver.findElement(By.xpath("//div[@class='accountInner']"));
	a.click(sign_In).build().perform();
	Thread.sleep(1000);
	
	
	
}
}
