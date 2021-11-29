package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Concept {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Java Task\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		wb.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement cna = wb.findElement(By.xpath("(//a[@role='button'])[2]"));
		cna.click();
		Thread.sleep(2000);
		WebElement fname = wb.findElement(By.name("firstname"));
		fname.sendKeys("priya");
		WebElement lname = wb.findElement(By.name("lastname"));
		lname.sendKeys("T");
		Thread.sleep(1000);
		WebElement pmail = wb.findElement(By.xpath("//input[@name='reg_email__']"));
		pmail.sendKeys("priya784@gmail.com");
		Thread.sleep(1000);
		WebElement re_enter = wb.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		re_enter.sendKeys("priya784@gmail.com");
		WebElement password = wb.findElement(By.xpath("//input[@id='password_step_input']"));
		password.sendKeys("98765priya");
		WebElement gender = wb.findElement(By.name("sex"));
		gender.click();
//
//		TakesScreenshot ts = (TakesScreenshot) wb;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("E:\\Sathyapriya\\Selenium\\screenshot\\erroe.png");
//		FileUtils.copyFile(source, destination);

		WebElement date = wb.findElement(By.id("day"));
		Select s = new Select(date);
		s.selectByValue("15");
		WebElement month = wb.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(5);
		WebElement year = wb.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1988");
		WebElement signup = wb.findElement(By.name("websubmit"));
		signup.click();
		
		TakesScreenshot ss1 = (TakesScreenshot) wb;
		File source = ss1.getScreenshotAs(OutputType.FILE);
	    File destination = new File("E:\\Sathyapriya\\Selenium\\screenshot\\error1.png");
		FileUtils.copyFile(source, destination);
		
		

//		TakesScreenshot ss = (TakesScreenshot) wb;
//		File source = ss.getScreenshotAs(OutputType.FILE);
//		File destination = new File("E:\\Sathyapriya\\Selenium\\screenshot\\error.png");
//		FileUtils.copyFile(source, destination);
	}
}
