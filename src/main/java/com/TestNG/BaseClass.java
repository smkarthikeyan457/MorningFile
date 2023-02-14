package com.TestNG;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver; // null

	public static WebDriver browserLaunch(String browser) {

//Browser Setup:	

		if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Karthikeyan M\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "//pathfor firefox");
			driver = new FirefoxDriver();

		}

		else {
			System.out.println("Check the browser name");
		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		return driver;

	}

// Element Methods:

	public static void clickOnElement(WebElement ele) {

		ele.click();

	}

	public static void sendInputValues(WebElement ele, String str) {

		ele.sendKeys(str);

	}

	public static void clearTextOnElement(WebElement ele) {

		ele.clear();

	}

	public static void getTextOnElement(WebElement ele) {

		String text = ele.getText();
		System.out.println(text);

	}

	public static void isElementDisplayed(WebElement ele) {

		boolean displayed = ele.isDisplayed();

		System.out.println(displayed);

	}

	public static void isElementSelected(WebElement ele) {
		boolean selected = ele.isSelected();
		System.out.println(selected);

	}

	public static void isElementEnabled(WebElement ele) {

		boolean enabled = ele.isEnabled();
		System.out.println(enabled);
	}

	public static void gettingSize(WebElement ele) {

		Dimension size = ele.getSize();

		System.out.println(size);

	}

	public static void submitOnElement(WebElement ele) {

		ele.submit();

	}

//Driver Methods:

	public static void openURL(String url) {

		driver.get(url);

	}

	public static void closeThePage() {

		driver.close();

	}

	public static void quitAllBrowsers() {

		driver.quit();

	}

	public static void maximize() {

		driver.manage().window().maximize();
	}

//Wait commands:

//Implicit Wait:

	public static void implicitlyWaitOfSeconds(int seconds) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

	}

	public static void implicitlyWaitOfMinutes(int minutes) {

		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(minutes));

	}

	public static void implicitlyWaitOfHours(int hours) {

		driver.manage().timeouts().implicitlyWait(Duration.ofHours(hours));

	}

	public static void implicitlyWaitOfDays(int days) {

		driver.manage().timeouts().implicitlyWait(Duration.ofDays(days));

	}

	public static void implicitlyWaitOfMillis(int millis) {

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(millis));

	}

	public static void implicitlyWaitOfNanos(int nanos) {

		driver.manage().timeouts().implicitlyWait(Duration.ofNanos(nanos));

	}

//Explicit Wait:

	public static void explicitWait(WebElement element, long seconds) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

//Actions Class/Mouse Functions:

	public static void rightClick(WebElement ele) {

		Actions ac = new Actions(driver);
		ac.contextClick(ele).build().perform();

	}

	public static void mouseHover(WebElement ele) {

		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();

	}

	public static void dragAndDrop(WebElement dragEle, WebElement dropEle) {

		Actions ac = new Actions(driver);
		ac.dragAndDrop(dragEle, dropEle).build().perform();

	}

	public static void doubleClick(WebElement ele) {

		Actions ac = new Actions(driver);
		ac.doubleClick(ele).build().perform();

	}

//Robot Class/KeyBoard Functions:	

	public static void downArrowKey() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void upArrowKey() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}

	public static void pageUpKey() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);

	}

	public static void pageDownKey() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

	}

	public static void tabKey() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	public static void enterKey() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

//Select Class:

	public static void selectByIndex(WebElement ele, int index) {

		Select s = new Select(ele);

		s.selectByIndex(index);

	}

	public static void selectByValue(WebElement ele, String value) {

		Select s = new Select(ele);

		s.selectByValue(value);

	}

	public static void selectByVisibleText(WebElement ele, String text) {

		Select s = new Select(ele);

		s.selectByVisibleText(text);

	}

//Alerts:	

	public static void alertWithOk() {

		Alert simpAlert = driver.switchTo().alert();
		simpAlert.accept();

	}

	public static void alertWithCancel() {

		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();

	}
	
	public static void alertWithTextbox(String keysToSend) {
		
		Alert promptAlert = driver.switchTo().alert();
		
		promptAlert.sendKeys(keysToSend);
		
		promptAlert.accept();
		

	}
	
	
	public static void alertWithGetText() {
		
		Alert promptAlert = driver.switchTo().alert();
		
		String text = promptAlert.getText();
		
		System.out.println(text);
		

	}

}
