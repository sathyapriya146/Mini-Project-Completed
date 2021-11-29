package com.selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Day_2_Q_8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Java Task\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver task = new ChromeDriver();
		task.get("https://www.swiggy.com/");

		task.manage().window().maximize();


		WebElement name = task.findElement(By.name("location"));
		name.sendKeys("Salem,Tamilnadu,India");
		
		Thread.sleep(1000);
		WebElement location = task.findElement(By.xpath("(//span[@class='_2W-T9'])[4]"));
		location.click();
	}
}
