package com.TestNG;

import org.testng.annotations.Test;

public class GroupsDemo {

	@Test(groups = "sanity test")
	private void projA() {

		System.out.println("A");

	}

	@Test(groups = "sanity test")
	private void projB() {

		System.out.println("B");

	}

	@Test(groups = "smoke test", dependsOnGroups = "sanity test")
	private void testA() {

		System.out.println("AA");

	}

	@Test(groups = "smoke test")
	private void testB() {

		System.out.println("BB");
	}

	@Test(groups = "regression test")
	private void mockA() {

		System.out.println("AAA");
	}

	@Test(groups = "regression test")
	private void mockB() {

		System.out.println("BBB");
	}

}
