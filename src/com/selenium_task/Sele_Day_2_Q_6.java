package com.selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Day_2_Q_6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Java Task\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver l = new ChromeDriver();
		l.get("https://twitter.com/login");
		l.manage().window().maximize();
		Thread.sleep(1000);
		WebElement username = l.findElement(By.name("username"));
		username.sendKeys("david@gmail.com");
	}
}
