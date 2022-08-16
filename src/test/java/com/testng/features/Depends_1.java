package com.testng.features;

import org.testng.annotations.Test;

public class Depends_1 {
	@Test
	private void Zebronics() {
System.out.println("zebronics");
	}
@Test(dependsOnMethods = "Zebronics",priority = -1)
private void offer() {
System.out.println("offer");
}
@Test(priority = 1)
private void mobile() {
System.out.println("mobile");
}
}
