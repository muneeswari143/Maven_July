package com.adactin.readdata;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.pom.Adactin_Page_Object_Manager;
import com.utilityfiles.Utility_Files;

public class Adactin_Datadriven extends Utility_Files {
	public static WebDriver driver=Utility_Files.browser_Launch("chrome");
	public static Adactin_Page_Object_Manager obj=new Adactin_Page_Object_Manager(driver);

public static void main(String[] args) throws InterruptedException, IOException {
	get("https:adactinhotelapp.com/index.php");
Thread.sleep(7000);
	String Username=particular_Cell("D:\\Maven_July22\\adactin testcase.xlsx",0,1,5);
	sendkeys(obj.getLogin().getLoginid(),Username);
	Thread.sleep(2000);
	String Password=particular_Cell("‪D:\\Maven_July22\\adactin testcase.xlsx",0,2,5);
	sendkeys(obj.getLogin().getPass(),Password);
	click_Element(obj.getLogin().getLogin());  
	implicit_Timeout(10);
	dropdown(obj.getBooking().getLocation(), "byText", "London");
	dropdown(obj.getBooking().getHotel(), "byText", "Hotel Sunshine");
	dropdown(obj.getBooking().getRoomtype(), "byText", "Double");
	dropdown(obj.getBooking().getTrooms(), "byValue", "3");
	String checkin=particular_Cell("D:\\Maven_July22\\adactin testcase.xlsx",0,8,5);
	sendkeys(obj.getBooking().getCheckin(),checkin);
	String checkout=particular_Cell("D:\\Maven_July22\\adactin testcase.xlsx",0,9,5);
	sendkeys(obj.getBooking().getCheckin(),checkout);
	dropdown(obj.getBooking().getAdults(), "byValue", "2");
	dropdown(obj.getBooking().getChild(), "byText", "2 - Two");
	click_Element(obj.getBooking().getSearch());
	implicit_Timeout(10);
	click_Element(obj.getSelect().getRadio_Btn());
	click_Element(obj.getSelect().getCont());
	implicit_Timeout(10);
	String firstname=particular_Cell("‪D:\\Maven_July22\\adactin testcase.xlsx",0,17,5);
	sendkeys(obj.getDetails().getFirst_Name(),firstname);
	String lastname=particular_Cell("D:\\Maven_July22\\adactin testcase.xlsx",0,18,5);
	sendkeys(obj.getDetails().getLast_Name(),lastname);
	String address=particular_Cell("D:\\Maven_July22\\adactin testcase.xlsx",0,19,5);
	sendkeys(obj.getDetails().getAddress(),address);
	String cardno=particular_Cell("D:\\Maven_July22\\adactin testcase.xlsx",0,20,5);
	sendkeys(obj.getDetails().getCredit_No(),cardno);
	String cardtype=particular_Cell("‪D:\\Maven_July22\\adactin testcase.xlsx",0,21,5);
	dropdown(obj.getDetails().getCard_Type(), "byText", cardtype);
	String expmonth=particular_Cell("‪D:\\Maven_July22\\adactin testcase.xlsx",0,22,5);
	dropdown(obj.getDetails().getExp_Mnth(), "byValue", expmonth);
	String expyear=particular_Cell("D:\\Maven_July22\\adactin testcase.xlsx",0,23,5);
	dropdown(obj.getDetails().getExp_Year(), "byValue", expyear);
	String cvvno=particular_Cell("‪D:\\Maven_July22\\adactin testcase.xlsx",0,24,5);
	sendkeys(obj.getDetails().getCvv_No(),cvvno);
	click_Element(obj.getDetails().getBook_Now());
	click_Element(obj.getDetails().getItinerary());
	
	
	
}

}
