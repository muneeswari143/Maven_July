package com.testng.features;

import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut=8000)
	private void demo() throws InterruptedException {
Thread.sleep(2000);
System.out.println("browser launch");
Thread.sleep(2000);
System.out.println("url");
Thread.sleep(3000);
System.out.println("credentials entered");
	}

}
