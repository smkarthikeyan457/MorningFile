package com.TestNG;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class ProjectTestNG extends BaseClass {

	public static WebDriver driver;
	public static POM pom;

	@Test(priority = 1)
	private void getURL() {

		driver = browserLaunch("chrome");
		openURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		pom = new POM(driver);

	}

	@Test(priority = 2)
	private void login() {

		sendInputValues(pom.getUserName(), "Admin");

		sendInputValues(pom.getPassword(), "admin123");

		clickOnElement(pom.getLogin());

	}

	@Test(priority = 3)
	private void closeBrowser() throws InterruptedException {

		Thread.sleep(3000);
		closeThePage();

	}

}
