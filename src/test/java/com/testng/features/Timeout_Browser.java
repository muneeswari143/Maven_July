package com.testng.features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilityfiles.Utility_Files;

public class Timeout_Browser extends Utility_Files{
	public static WebDriver driver;
	@Test(timeOut = 35000)
	private void timeout_Demo() throws InterruptedException {
		driver=browser_Launch("chrome");
		get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.findElement(By.id("ema")).sendKeys("abc");
driver.findElement(By.id("pas")).sendKeys("a");
	}
	

}
