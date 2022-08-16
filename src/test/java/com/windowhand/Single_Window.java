package com.windowhand;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilityfiles.Utility_Files;

public class Single_Window  extends Utility_Files{
public static WebDriver driver;

	public static void main(String[] args) throws AWTException {
driver=browser_Launch("chrome");
driver.get("https://www.google.com/");
WebElement gmail = driver.findElement(By.xpath("//a[.='Images']//preceding::a"));
action_Rightclick(gmail);
down_And_Enter();
String google_Id = driver.getWindowHandle();
Set<String> all_Id = driver.getWindowHandles();
for (String id : all_Id) {
	if (id.equals(google_Id)) {
		continue;
		
	}
	else {
		driver.switchTo().window(id);
		System.out.println("title:"+driver.getTitle());
		System.out.println("url:"+driver.getCurrentUrl());
	}
}
	
	}

}
