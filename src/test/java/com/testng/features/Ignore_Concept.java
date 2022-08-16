package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	@Test
	private void spotify() {
System.out.println("spotify");
	}
	@Ignore
	@Test
	private void wynk() {
System.out.println("wynk");

	}
@Test
private void reddit() {
System.out.println("reddit");
}
@Test(enabled=false)
private void facebook() {
System.out.println("facebook");
}
@Test
private void watsup() {
System.out.println("watsup");
}

}
