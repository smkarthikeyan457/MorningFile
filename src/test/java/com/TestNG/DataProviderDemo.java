package com.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
//	data provider
//	multiple set of data
//	return type = object 2d array ===> Object [][]

	@Test(dataProvider = "data")
	private void userLogin(String name, String password) {

		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\Karthikeyan M\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys(name);

		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(password);

		WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		login.click();

	}

	@DataProvider(name = "data")

	private Object[][] myData() {

		return new Object[][] { {"Admin", "admin123"}, {"karthi", "smk@123"} };

		
	}

}
