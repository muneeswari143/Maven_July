package com.testng.features;

import org.testng.annotations.Test;

public class Invocation_Concept {
	
	@Test(priority=-1)
	private void spotify() {
System.out.println("spotify");
	}
	@Test(invocationCount = 2,invocationTimeOut = 2000)
	private void facebook() {
System.out.println("facebook");
	}
@Test
private void watsup() {
System.out.println("watsup");
}
}
