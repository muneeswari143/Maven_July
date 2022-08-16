package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert_Demo {
	@Test
	private void demo_A() {
String db_Username="Starc";
String actual="starc";
SoftAssert soft=new SoftAssert();
soft.assertEquals(actual, db_Username);
soft.assertAll();
System.out.println("verification successfully");

}
}