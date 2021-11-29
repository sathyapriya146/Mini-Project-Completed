package com.selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Day_3_Q_1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"E:\\Sathyapriya\\Selenium\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	WebElement contact_Us = driver.findElement(By.xpath("//a[@href='contact.php']"));
	contact_Us.click();
}
}
