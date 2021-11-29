   package com.selenium;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {
	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);

		WebElement closelogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closelogin.click();

		WebElement topoffers = driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));
		a.contextClick(topoffers).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement grocery = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
		a.contextClick(grocery).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobile = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		a.contextClick(mobile).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Set<String> handles = driver.getWindowHandles();
		for (String s : handles) {
			System.out.println(driver.switchTo().window(s).getTitle());
		}
		String grocery_Tab = "Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
		for (String s1 : handles) {
			if (driver.switchTo().window(s1).getTitle().equalsIgnoreCase(grocery_Tab)) {
				break;
			}
					
		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sShot = ts.getScreenshotAs(OutputType.FILE);
		File photo = new File("E:\\Sathyapriya\\Selenium\\screenshot\\handle.png");
		FileUtils.copyFile(sShot, photo);
		

	}

}
