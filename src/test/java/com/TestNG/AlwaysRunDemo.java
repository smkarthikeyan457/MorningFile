package com.TestNG;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class AlwaysRunDemo {
	
	
	//	boolean alwaysRun() default false;
	//  to run change default as true

	@Test
	private void testA() {

		System.out.println("java");

	}

	@Test

	private void testB() {

		System.out.println("selenium");

		throw new NoSuchElementException("element not there");
	}

	@Test(dependsOnMethods = "testB", alwaysRun = true)
	private void testC() {

		System.out.println("TestNG test");
	}

}
