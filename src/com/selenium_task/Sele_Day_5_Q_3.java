package com.selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sele_Day_5_Q_3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"E:\\Sathyapriya\\Selenium\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/womens-footwear/pr?sid=osp,"
			+ "iko&fm=neo%2Fmerchandising&iid=M_64cef7aa-e5ce-4e03-a798-419074a81707_1_372UD5BXDFYS_MC.DN868DQ1FHU3&otracker=hp_rich_navigation_6_1.navigationCard.RICH_NAVIGATION_Fashion~Women%2BFootwear_DN868DQ1FHU3&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_6_L1_view-all&cid=DN868DQ1FHU3");
	driver.manage().window().maximize();
	Actions a = new Actions(driver);
//	WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//	close.click();
//	WebElement home = driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
//	a.contextClick(home).build().perform();
	
//	WebElement fashion = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[4]"));
//	a.click(fashion).build().perform();
	
	WebElement flat = driver.findElement(By.xpath("//a[@class='_2SqgSY']"));
	a.click(flat).perform();
	
}
}
