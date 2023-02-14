package com.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo2 {

	@Test
	@Parameters({ "name" })
	private void userName(String name) {

		System.out.println("name: " + name);

	}

	@Test
	@Parameters({ "password" })
	private void password(String password) {

		System.out.println("Password: " + password);

	}

}
