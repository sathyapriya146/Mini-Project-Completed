package com.selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Day_2_Q_5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Java Task\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver k = new ChromeDriver();
	 k.get("https://infinity.icicibank.com/corp/Login.jsp");
	 k.manage().window().maximize();
	 
	 WebElement username = k.findElement(By.name("DUMMY1"));
	 username.sendKeys("ganesh@gmail.com");
	 Thread.sleep(1000);
	 WebElement arrow = k.findElement(By.xpath("//img[@onclick='goUserId();']"));
	 arrow.click();
	 Thread.sleep(1000);
	 WebElement username1 = k.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
	 username1.sendKeys("gasoling@gmail.com");
	 
	 Thread.sleep(1000);
	 WebElement pass = k.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	 pass.sendKeys("abcd123456");
	 
}
}
