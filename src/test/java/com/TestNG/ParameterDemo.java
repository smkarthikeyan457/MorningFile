package com.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class ParameterDemo {
	
	
	@Test
	private void userName(@Optional("Raja") String name) {
		
		System.out.println("name: "+name);
		
		
	}
	
	@Test
	private void password(@Optional("R123456") String pass) {
		
		System.out.println("Password: "+ pass);

	}
	

}
