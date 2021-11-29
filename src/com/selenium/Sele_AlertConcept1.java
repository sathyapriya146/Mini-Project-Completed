package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_AlertConcept1 {
	public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver",
			"E:\\Sathyapriya\\Java Task\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver alert = new ChromeDriver();
	alert.get("http://demo.automationtesting.in/Alerts.html");
	alert.manage().window().maximize();
	
	WebElement simple = alert.findElement(By.xpath("//button[@class='btn btn-danger']"));
	simple.click();
	
	alert.switchTo().alert().accept();
	Dimension d = new Dimension(1000, 1000);
	alert.manage().window().setSize(d);
	
	WebElement confirm_button = alert.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	confirm_button.click();
	
	WebElement confirm = alert.findElement(By.xpath("//button[@class='btn btn-primary']"));
	confirm.click();
		
	alert.switchTo().alert().dismiss();

	WebElement prompt_button = alert.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	prompt_button.click();
	
	WebElement prompt = alert.findElement(By.xpath("//button[@class='btn btn-info']"));
	prompt.click();
	
	String text = alert.switchTo().alert().getText();
	System.out.println(text);
	
	alert.switchTo().alert().sendKeys("priya");
	alert.switchTo().alert().accept();
	
//	WebElement text1 = alert.findElement(By.xpath("//p[@id='demo1']"));
//	System.out.println(text1.getText());

	


}
}
