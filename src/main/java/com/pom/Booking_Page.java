package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {
	public WebDriver driver;
	@FindBy(xpath = "//span[@id='location_span']//preceding::select[@name='location']")
private WebElement location;
	@FindBy(xpath = "//span[@id='hotel_span']//preceding-sibling::select[@id='hotels']")
private WebElement hotel;
	@FindBy(xpath = "//span[@id='hotel_span']//following::select[@id='room_type']")
private WebElement roomtype;
	@FindBy(xpath = "//span[@id='room_type_span']//following::select[@id='room_nos']")
private WebElement trooms;
	@FindBy(xpath = "//input[@id='datepick_in']")
private WebElement checkin;
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkout;
	@FindBy(xpath = "//select[@id='adult_room']")
private WebElement adults;
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement child;
	@FindBy(xpath = "//input[@type='hidden']//preceding-sibling::input[@type='submit']")
private WebElement search;
	public Booking_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getTrooms() {
		return trooms;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearch() {
		return search;
	}
	 
	




}
