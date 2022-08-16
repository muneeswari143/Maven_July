package com.pom;

import org.openqa.selenium.WebDriver;

public class Adactin_Page_Object_Manager {
	
	public WebDriver driver;
	
	public Adactin_Page_Object_Manager(WebDriver driver2) {
	this.driver=driver2;
	}
	private adactin_Login login;
	public adactin_Login getLogin() {
		if (login==null) {
			login=new adactin_Login(driver);
			
		}
		return login;
	}
	private Booking_Page booking;
	public Booking_Page getBooking() {
		if (booking==null) {
			booking=new Booking_Page(driver);
			}
		return booking;
	}
	private Select_Hotel select;
	public Select_Hotel getSelect() {
		if (select==null) {
			select= new Select_Hotel(driver);
			
		}
		return select;
	}
	private Details details;
	public Details getDetails() {
		if (details==null) {
			details=new Details(driver);
		}
		return details;
			
		}
	
	}
	
	
	


