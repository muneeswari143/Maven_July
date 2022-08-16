package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNG_Demo {
	@BeforeSuite
public void set_Property() {
		System.out.println("set property");
}
	@BeforeTest
public void browser_launch() {
		System.out.println("Browser launch");
	}
	@BeforeClass
private void url() {
		System.out.println("url");
	}
	@Test
public void laptop() {
	System.out.println("laptop");
}
	@BeforeMethod
private void  login() {
	System.out.println("login");
	}
	@AfterMethod
private void logout() {
	System.out.println("logout");
}
	@Test
public void mobile() {
	System.out.println("mobile");
}
	@Test
public void headphones() {
	System.out.println("headphones");
}
	@AfterClass
private void Home_Page() {
	System.out.println("verify home page");
}
	@AfterTest
private void close() {
	System.out.println("close");
}
	@AfterSuite
public void deleteAll_Cookies() {
	System.out.println("delete All cookies");
}
}
