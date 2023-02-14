package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreDemo {
	
	@Ignore
	@Test
	
	private void testA() {

		System.out.println("testing A");
		
	}
	
	
	@Test
//	@Ignore
	private void testB() {
	
		System.out.println("testing B");

	}

}
