package com.selenium_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Day_2_Q_4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Sathyapriya\\Java Task\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver j=new ChromeDriver();
		j.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		
		j.manage().window().maximize();
		
		//right click is disabled
	}

}
