package com.adactin.pageomanager;

import org.openqa.selenium.WebDriver;

import com.pom.Booking_Page;
import com.pom.Details;
import com.pom.Adactin_Page_Object_Manager;
import com.pom.Select_Hotel;
import com.pom.adactin_Login;
import com.utilityfiles.Utility_Files;

public class Adactin_Page extends Utility_Files {
	public static WebDriver driver=Utility_Files.browser_Launch("chrome");
	public static Adactin_Page_Object_Manager obj=new Adactin_Page_Object_Manager(driver);

public static void main(String[] args) throws InterruptedException {
	get("https://adactinhotelapp.com/index.php");
	sendkeys(obj.getLogin().getLoginid(),"muneeswariasm");
	sendkeys(obj.getLogin().getPass(),"Muthusm@2015");
	click_Element(obj.getLogin().getLogin());
	implicit_Timeout(10);
	dropdown(obj.getBooking().getLocation(), "byText", "London");
	dropdown(obj.getBooking().getHotel(), "byText", "Hotel Sunshine");
	dropdown(obj.getBooking().getRoomtype(), "byText", "Double");
	dropdown(obj.getBooking().getTrooms(), "byValue", "3");
	sendkeys(obj.getBooking().getCheckin(),"08/07/2022");
	sendkeys(obj.getBooking().getCheckout(),"09/07/2022");
	dropdown(obj.getBooking().getAdults(), "byValue", "2");
	dropdown(obj.getBooking().getChild(), "byText", "2 - Two");
	click_Element(obj.getBooking().getSearch());
	implicit_Timeout(10);
	click_Element(obj.getSelect().getRadio_Btn());
	click_Element(obj.getSelect().getCont());
	implicit_Timeout(10);
	sendkeys(obj.getDetails().getFirst_Name(),"munees");
	sendkeys(obj.getDetails().getLast_Name(),"muthu");
	sendkeys(obj.getDetails().getAddress(),"Srivilliputhur");
	sendkeys(obj.getDetails().getCredit_No(),"2356987412895463");
	dropdown(obj.getDetails().getCard_Type(), "byText", "VISA");
	dropdown(obj.getDetails().getExp_Mnth(), "byValue", "11");
	dropdown(obj.getDetails().getExp_Year(), "byValue", "2022");
	sendkeys(obj.getDetails().getCvv_No(),"104");
	click_Element(obj.getDetails().getBook_Now());
	click_Element(obj.getDetails().getItinerary());
	
	
	
}
	}


