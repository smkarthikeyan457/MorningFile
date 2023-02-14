package com.TestNG;

import org.testng.annotations.Test;

public class EnabledDemo {
	
	
//	boolean enabled() default true;
//  to remove method, change enabled = false;
	
	@Test
	private void projectA() {


		System.out.println("project A");

	}
	
	@Test(enabled = false )
	private void projectB() {
		
		System.out.println("project B");
	}

}
