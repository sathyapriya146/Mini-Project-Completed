package com.selenium;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sele_KeyBoard {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Java Task\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		WebElement mobile = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']"));
		a.contextClick(mobile).build().perform();
		Robot r = new Robot();

		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);

		WebElement best_Sellers = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
		a.contextClick(best_Sellers).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement electronics = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']"));
		a.contextClick(electronics).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
