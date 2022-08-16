package com.testng.features;

import org.testng.annotations.Test;

public class Expected_Exception {
	@Test(expectedExceptions = ArithmeticException.class)
	private void demo() {
System.out.println(20/0);
	}
//	@Test
//	private void demo1() {
//System.out.println(20/1);
//	}

}

