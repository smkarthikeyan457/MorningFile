package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	
	public WebDriver driver;

	public POM(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
	}
	
	
	@FindBy(name = "username")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}
	
	@FindBy(name = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	




	

	
	
}
