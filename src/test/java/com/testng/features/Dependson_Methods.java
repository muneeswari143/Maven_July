package com.testng.features;

import org.testng.annotations.Test;

public class Dependson_Methods {
	@Test(priority = 1)
	private void zebronics() {
System.out.println("zebronics");
	}
	@Test(priority = -1,dependsOnMethods = "zebronics")
	private void offer() {
System.out.println("offer");
	}
	@Test(priority = -2)
	private void lenova() {
System.out.println("lenova");
	}

}
