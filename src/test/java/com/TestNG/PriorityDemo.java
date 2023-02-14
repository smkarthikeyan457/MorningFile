package com.TestNG;

import org.testng.annotations.Test;

public class PriorityDemo {

	@Test(priority = 1)
	private void userName() {
		
		System.out.println("type username");
	}

	@Test(priority = 2)
	private void password() {

		System.out.println("type password");
	}

	@Test(priority = 3)
	private void login() {

		System.out.println("click login");
	}

}
