package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_IframeConcept {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Java Task\\driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		WebElement single = driver.findElement(By.id("singleframe"));

		driver.switchTo().frame(single);
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("SingleFrame");

		driver.switchTo().defaultContent();
		
		Dimension d = new Dimension(1000, 1000);
		driver.manage().window().setSize(d);
		
		WebElement multi = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multi.click();
		WebElement multi1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(multi1);
		WebElement multi2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(multi2);
		WebElement text2 = driver.findElement(By.xpath("//input[@type='text']"));
		text2.sendKeys("MultipleFrames");
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("E:\\Sathyapriya\\Selenium\\screenshot\\frame.png");
		FileUtils.copyFile(Source, Destination);
		
		

	}

}
