package com.selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Day_2_Q_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Java Task\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver g = new ChromeDriver();
		g.get("https://www.redbus.in/");
		g.manage().window().maximize();
		
		WebElement busticket = g.findElement(By.id("redBus"));
		busticket.click();
		
		WebElement from = g.findElement(By.xpath("//input[@placeholder='FROM']"));
		from.sendKeys("Salem");
		Thread.sleep(1000);
		WebElement from_accurate = g.findElement(By.xpath("(//li[@class='C120_slist-item'])[7]"));
		from_accurate.click();
		Thread.sleep(1000);
		WebElement to = g.findElement(By.xpath("//input[@placeholder='TO']"));
		to.sendKeys("chennai");
		
		Thread.sleep(1000);
		WebElement to_accurate = g.findElement(By.xpath("//li[@data-ind='1']"));
		to_accurate.click();
	}

}
