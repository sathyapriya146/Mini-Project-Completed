package com.selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Day_2_Q_3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Java Task\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver h = new ChromeDriver();
	h.get("https://www.google.com/");
	
	h.manage().window().maximize();
	
	WebElement search = h.findElement(By.name("q"));
	search.sendKeys("GreensTechnology");
	
	Thread.sleep(1000);
	WebElement search_accurate = h.findElement(By.xpath("(//div[@class='wM6W7d'])[1]"));
	search_accurate.click();
	
}
}
