package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Javascript1 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver",
			"E:\\Sathyapriya\\Selenium\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement mailId = driver.findElement(By.id("email"));
	js.executeScript("arguments[0].value='priyaaa456@gmail.com';", mailId);
	WebElement passWord = driver.findElement(By.id("pass"));
	js.executeScript("arguments[0].value='priya456';", passWord);
	WebElement logIn = driver.findElement(By.name("login"));
	js.executeScript("arguments[0].click();", logIn);
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File get = ts.getScreenshotAs(OutputType.FILE);
	File des = new File("E:\\Sathyapriya\\Selenium\\screenshot\\Javascript.png");
	FileUtils.copyFile(get, des);
}
}
