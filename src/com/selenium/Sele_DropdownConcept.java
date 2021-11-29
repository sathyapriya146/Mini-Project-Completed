package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sele_DropdownConcept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Java Task\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver multi = new ChromeDriver();
		multi.get("http://www.leafground.com/pages/Dropdown.html");
		multi.manage().window().maximize();
		Thread.sleep(1000);

		WebElement x = multi.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(x);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByValue("2");
		s.selectByVisibleText("UFT/QTP");
			
		System.out.println("---------------------------------------");
		System.out.println("check if drop down is multiple : ");
		System.out.println("---------------------------------------");
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("select options in the drop down : ");
		System.out.println("---------------------------------------");
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("print the select options alone : ");
		System.out.println("---------------------------------------");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement1 : allSelectedOptions) {
			System.out.println(webElement1.getText());
		}
		System.out.println();
		System.out.println("---------------------------------------");
	
		System.out.println("The first selected option : ");
		System.out.println("---------------------------------------");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());

		s.deselectByVisibleText("Selenium");
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("print after deselect : ");
		System.out.println("---------------------------------------");
		List<WebElement> deselect = s.getAllSelectedOptions();
		for (WebElement webElement2 : deselect) {
			System.out.println(webElement2.getText());

		}
		
		
	}

}
