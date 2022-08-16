package com.testng.features;

import org.testng.annotations.Test;

public class Depends_Demo {
	@Test
	private void Zebronics() {
System.out.println("Zebronics");
	}
	@Test(dependsOnMethods="zebronics")
	private void offer() {
System.out.println("offer");
	}
	@Test
	private void mobile() {
System.out.println("mobile");
	}

}
