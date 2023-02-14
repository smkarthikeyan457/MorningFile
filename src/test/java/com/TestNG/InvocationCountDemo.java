package com.TestNG;

import org.testng.annotations.Test;

public class InvocationCountDemo {
	
	
	@Test(priority = 2, invocationCount = 3)
	private void testA() {
		
		System.out.println("selenium");

	}
	
	@Test(invocationCount = 5)
	private void testB() {
		
		System.out.println("java");
	}
	
	

}
