package com.adactin.pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.Booking_Page;
import com.pom.Details;
import com.pom.Select_Hotel;
import com.pom.adactin_Login;
import com.utilityfiles.Utility_Files;

public class Adactin_Base extends Utility_Files {
	public static WebDriver driver=Utility_Files.browser_Launch("chrome");
public static adactin_Login login=new adactin_Login(driver);
public static Booking_Page booking= new Booking_Page(driver);
public static Select_Hotel select=new Select_Hotel(driver);
public static Details details=new Details(driver);
public static void main(String[] args) throws InterruptedException {
	get("https:adactinhotelapp.com/index.php");
	sendkeys(login.getLoginid(),"muneeswariasm");
	sendkeys(login.getPass(),"Muthusm@2015");
	click_Element(login.getLogin());
	implicit_Timeout(10);
	dropdown(booking.getLocation(), "byText", "London");
	dropdown(booking.getHotel(), "byText", "Hotel Sunshine");
	dropdown(booking.getRoomtype(), "byText", "Super Deluxe");
	dropdown(booking.getTrooms(), "byValue", "3");
	sendkeys(booking.getCheckin(),"08/07/2022");
	sendkeys(booking.getCheckin(),"09/07/2022");
	dropdown(booking.getAdults(), "byValue", "2");
	dropdown(booking.getChild(), "byText", "1 - One");
	click_Element(booking.getSearch());
	implicit_Timeout(10);
	click_Element(select.getRadio_Btn());
	click_Element(select.getCont());
	implicit_Timeout(10);
	sendkeys(details.getFirst_Name(),"munees");
	sendkeys(details.getLast_Name(),"wari");
	sendkeys(details.getAddress(),"madurai");
	sendkeys(details.getCredit_No(),"2356987412895463");
	dropdown(details.getCard_Type(), "byText", "Master Card");
	dropdown(details.getExp_Mnth(), "byValue", "11");
	dropdown(details.getExp_Year(), "byValue", "2022");
	sendkeys(details.getCvv_No(),"004");
	click_Element(details.getBook_Now());
	click_Element(details.getItinerary());
	
	
	
}
	}
