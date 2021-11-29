package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Dynamic_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");
		driver.manage().window().maximize();

		List<WebElement> all_Products = driver
				.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));

		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < all_Products.size(); i++) {
			String replaceAll = all_Products.get(i).getText().replaceAll("Rs. ", "");
			int parseInt = Integer.parseInt(replaceAll);
			a.add(parseInt);
		}
		int size = a.size();
		System.out.println("Number of casualshirts : "+size);
		System.out.println("Minimum cost of Shirt : "+Collections.min(a));
		System.out.println("Maximum cost of Shirt : "+Collections.max(a));

	}

}
