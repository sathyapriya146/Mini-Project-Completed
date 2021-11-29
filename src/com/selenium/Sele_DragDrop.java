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
import org.openqa.selenium.interactions.Actions;

public class Sele_DragDrop {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Java Task\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver dd = new ChromeDriver();
		dd.get("http://leafground.com/pages/drop.html");

	dd.manage().window().maximize();
		Actions dragDrop = new Actions(dd);

//	WebElement dragDrag = dd.findElement(By.id("draggable"));
//	WebElement dropDrop = dd.findElement(By.id("droppable"));
//	dragDrop.dragAndDrop(dragDrag, dropDrop).build().perform();

		WebElement dragDrag = dd.findElement(By.id("draggable"));
		dragDrop.clickAndHold(dragDrag).build().perform();
		WebElement dropDrop = dd.findElement(By.id("droppable"));
		dragDrop.moveToElement(dropDrop).build().perform();
		dragDrop.click(dropDrop).build().perform();

//	TakesScreenshot ts = (TakesScreenshot)dd;
//	File g = ts.getScreenshotAs(OutputType.FILE);
//	File t = new File("E:\\Sathyapriya\\Selenium\\screenshot\\dragdrop.png");
//	FileUtils.copyFile(g, t);

	}

}
