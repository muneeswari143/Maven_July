package com.adactin.pageomanager;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pom.Adactin_Page_Object_Manager;
import com.utilityfiles.Utility_Files;

public class Adactin_TestNG extends Utility_Files {
	public static WebDriver driver;
	public static Logger log=Logger.getLogger(Adactin_TestNG.class);
	public static Adactin_Page_Object_Manager obj;
	public static Workbook work;
	
	@BeforeSuite(description = "Browser launch")
	private void browser_launch() throws IOException {
driver=Utility_Files.browser_Launch("chrome");
PropertyConfigurator.configure("log4j.properties");
obj=new Adactin_Page_Object_Manager(driver);
work=get_Workbook("D:\\Maven_July22\\adactin testcase.xlsx");
log.info("chrome browser launch");
implicit_Timeout(20);
	}
@BeforeTest(description = "URL Launch")
private void launch_Url() throws InterruptedException {
get("https:adactinhotelapp.com/index.php");
log.info("URL launched");
implicit_Timeout(20);
}
@BeforeClass(description = "Adactin login page")
private void login_Page() throws IOException {
sendkeys(obj.getLogin().getLoginid(),particular_Cell(work,0,1,5));
sendkeys(obj.getLogin().getPass(),particular_Cell(work,0,2,5));
click_Element(obj.getLogin().getLogin()); 
}
@BeforeMethod
private void rooms_Details() {
	dropdown(obj.getBooking().getTrooms(), "byValue", "3");
	dropdown(obj.getBooking().getAdults(), "byValue", "2");
	dropdown(obj.getBooking().getChild(), "byText", "2 - Two");
}
@Test
private void booking() throws IOException {
	dropdown(obj.getBooking().getLocation(), "byText", "London");
	dropdown(obj.getBooking().getHotel(), "byText", "Hotel Sunshine");
	dropdown(obj.getBooking().getRoomtype(), "byText", "Double");
	String checkin= particular_Cell(work,0,8,5);
	sendkeys(obj.getBooking().getCheckin(),checkin);
	String checkout=particular_Cell(work,0,9,5);
	sendkeys(obj.getBooking().getCheckin(),checkout);
	log.info("booking hotel");
}
@AfterMethod(description = "select and continue")
private void select() {
	click_Element(obj.getBooking().getSearch());
	implicit_Timeout(10);
	click_Element(obj.getSelect().getRadio_Btn());
	click_Element(obj.getSelect().getCont());
	implicit_Timeout(10);
	}
@AfterClass
private void personal_Details() throws IOException {
String firstname=particular_Cell(work,0,17,5);
sendkeys(obj.getDetails().getFirst_Name(),firstname);
String lastname=particular_Cell(work,0,18,5);
sendkeys(obj.getDetails().getLast_Name(),lastname);
String address=particular_Cell(work,0,19,5);
sendkeys(obj.getDetails().getAddress(),address);
String cardno=particular_Cell(work,0,20,5);
sendkeys(obj.getDetails().getCredit_No(),cardno);
String cardtype=particular_Cell(work,0,21,5);
dropdown(obj.getDetails().getCard_Type(), "byText", cardtype);
String expmonth=particular_Cell(work,0,22,5);
dropdown(obj.getDetails().getExp_Mnth(), "byValue", expmonth);
String expyear=particular_Cell(work,0,23,5);
dropdown(obj.getDetails().getExp_Year(), "byValue", expyear);
String cvvno=particular_Cell(work,0,24,5);
sendkeys(obj.getDetails().getCvv_No(),cvvno);
click_Element(obj.getDetails().getBook_Now());
click_Element(obj.getDetails().getItinerary());
}
}
