package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Absolute_Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"E:\\Sathyapriya\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.javatpoint.com/");
	driver.manage().window().maximize();
	
	WebElement java_Tutorial = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/ul/li[3]/a"));
	System.out.println(java_Tutorial.getText());
	java_Tutorial.click();
	
	
	
}
}
