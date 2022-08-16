package com.testng.features;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilityfiles.Utility_Files;

public class Invocation_Browser extends Utility_Files{
	public static WebDriver driver;
	@Test(invocationCount = 3,invocationTimeOut = 20000)
	private void browser_Launch() {
		System.out.println("browser launch");
driver=browser_Launch("chrome");
driver.get("https://www.facebook.com");
	}

}
