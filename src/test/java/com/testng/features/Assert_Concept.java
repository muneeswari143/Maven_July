package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {
	@Test
	private void demo_A() {
String db_Username="starc";
String actual="starc";
Assert.assertEquals(actual, db_Username);
System.out.println("validation successfully");
	}
	@Test
	private void demo_B() {
String db_Password="smith@123";
String actual="Smith@123";
Assert.assertEquals(actual, db_Password);
System.out.println("validation successfully");
	}

}
