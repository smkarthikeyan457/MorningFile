package com.TestNG;

import org.testng.annotations.Test;

public class ExceptionDemo {

	@Test
	private void projectA() {

		System.out.println(10 / 5);

	}

	@Test(expectedExceptions = Exception.class)
	private void projectB() {

		System.out.println(10 / 0);

	}

}
