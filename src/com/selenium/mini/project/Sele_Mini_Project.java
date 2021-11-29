package com.selenium.mini.project;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sele_Mini_Project {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement google = driver.findElement(By.xpath("//input[@type='text']"));
		google.sendKeys("automation practice");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement automation = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		automation.click();
		Actions a = new Actions(driver);
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		a.moveToElement(women).build().perform();
		
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		dresses.click();
		WebElement casual_Dresses = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_category=9&controller=category'])[3]"));
		casual_Dresses.click();
		WebElement in_stoke = driver.findElement(By.xpath("//span[@class='available-now']"));
		a.moveToElement(in_stoke).build().perform();
		
		WebElement add_To_Cart = driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']"));
		add_To_Cart.click();
		
		WebElement p_CheckOut = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		a.moveToElement(p_CheckOut).build().perform();
		
//		WebElement qty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
//		qty.click();
//		
		
	}

}
