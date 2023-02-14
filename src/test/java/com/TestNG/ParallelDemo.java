package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelDemo {

	@Test
	private void facebook() {

		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\Karthikeyan M\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());

	}
	
	@Test
	private void adactin() {
		
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\Karthikeyan M\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		System.out.println(driver.getTitle());
		

	}

}
