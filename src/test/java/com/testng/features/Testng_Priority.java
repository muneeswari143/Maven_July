package com.testng.features;

import org.testng.annotations.Test;

public class Testng_Priority {
	@Test(priority=1)
private void hsc() {
System.out.println("HSC");
}
	@Test(priority=-1)
private void sslc() {
System.out.println("SSLC");
}
	@Test(priority=2)
private void ug() {
System.out.println("UG");
	}
	@Test(priority=3)
private void pg() {
System.out.println("PG");
	}
}
