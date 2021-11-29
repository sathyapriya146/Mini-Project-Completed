package com.selenium;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slenium_Concept0 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Java Task\\driver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // upCasting

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Dimension d = new Dimension(600, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		
		Point p =  new Point(200, 200);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		Thread.sleep(5000);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		
		
}
	
}

