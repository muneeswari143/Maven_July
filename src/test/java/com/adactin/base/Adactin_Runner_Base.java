package com.adactin.base;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.utilityfiles.Utility_Files;
public class Adactin_Runner_Base extends Utility_Files {

public static WebDriver driver;
public static void main(String[] args) throws InterruptedException, IOException {
driver=browser_Launch("chrome");
get("https://adactinhotelapp.com/");
set_Size();
WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
sendkeys(username,"muneeswariasm");
WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
sendkeys(pass,"Muthusm@2015");
WebElement login_Btn = driver.findElement(By.xpath("//input[@id='login']"));
System.out.println("font size of button:"+font_Size(pass, "font-size"));
System.out.println("backround color button:"+font_Size(pass, "color"));
click_Element(login_Btn);
Thread.sleep(2000);
WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
Select s=new Select(location);
s.selectByValue("Paris");
WebElement hotel= driver.findElement(By.xpath("//select[@id='hotels']"));
Select s1=new Select(hotel);
s1.selectByIndex(2);
boolean selected = hotel.isSelected();
System.out.println("hotel selected or not:"+selected);
WebElement rm_Type = driver.findElement(By.xpath("//select[@id='room_type']"));
Select s2=new Select(rm_Type);
s2.selectByVisibleText("Double");
WebElement room_num = driver.findElement(By.xpath("//select[@id='room_nos']"));
Select s3=new Select(room_num);
s3.selectByValue("3");
WebElement check_In = driver.findElement(By.xpath("//input[@id='datepick_in']"));
check_In.sendKeys("12/09/2022");
WebElement check_Out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
check_Out.sendKeys("15/09/2022");
WebElement adult_Rm = driver.findElement(By.xpath("//select[@id='adult_room']"));
Select s4=new Select(adult_Rm);
s4.selectByValue("2");
boolean multiple = s4.isMultiple();
System.out.println("multiple or not:"+multiple);
WebElement child_Rm = driver.findElement(By.xpath("//select[@id='child_room']"));
Select s5=new Select(child_Rm);
s5.selectByValue("1");
WebElement search_Btn = driver.findElement(By.xpath("//input[@id='Submit']"));
Point loc = search_Btn.getLocation();
System.out.println("location:"+loc);
TakesScreenshot ts=(TakesScreenshot)driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File destination=new File("C:\\jar files\\workspace\\selenium\\Snap\\hotel book.png");
FileUtils.copyFile(source, destination);
search_Btn.click();
Thread.sleep(2000);
WebElement hotel_option = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
hotel_option.click();
WebElement con_Btn = driver.findElement(By.xpath("//input[@id='continue']"));
Dimension size = con_Btn.getSize();
System.out.println("con btn size:"+size);
con_Btn.click();
Thread.sleep(2000);
WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
firstname.sendKeys("munees");
WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
lastname.sendKeys("muthu");
WebElement bill_address = driver.findElement(By.xpath("//textarea[@name='address']"));
bill_address.sendKeys("chennai");
WebElement credit_Num = driver.findElement(By.xpath("//input[@id='cc_num']"));
credit_Num.sendKeys("6542387920144532");
WebElement credit_Type = driver.findElement(By.xpath("//select[@id='cc_type']"));
Select s6=new Select(credit_Type);
s6.selectByValue("VISA");
WebElement cc_Expire = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
Select s7=new Select(cc_Expire);
s7.selectByValue("11");
WebElement cc_Year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
Select s8=new Select(cc_Year);
s8.selectByVisibleText("2022");
WebElement cc_cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
cc_cvv.sendKeys("001");
WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
book.click();
Thread.sleep(5000);
WebElement itinerary_Btn = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
itinerary_Btn.click();
Thread.sleep(3000);
WebElement search = driver.findElement(By.xpath("//a[.='Search Hotel']"));
search.click();
WebElement locat = driver.findElement(By.xpath("//select[@id='location']"));
Select a=new Select(locat);
a.selectByValue("Brisbane");
WebElement hotel_name = driver.findElement(By.xpath("//select[@id='hotels']"));
Select a1=new Select(hotel_name);
a1.selectByValue("Hotel Cornice");
WebElement rm_type = driver.findElement(By.xpath("//select[@id='room_type']"));
Select a2=new Select(rm_type);
a2.selectByValue("Standard");
//WebElement num = driver.findElement(By.xpath("//select[@id='room_nos']"));
//Select a3=new Select(num);
//a3.selectByValue("2");
//WebElement date_In = driver.findElement(By.xpath("//input[@id='datepick_in']"));
//date_In.sendKeys("13/09/2022");
//WebElement date_Out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
//date_Out.sendKeys("15/09/2022");
//WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
//Select b=new Select(adult);
//b.selectByValue("1");
//WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
//Select b1=new Select(child);
//b1.selectByValue("1");
//WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
//submit.click();
//WebElement button = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
//button.click();
//WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
//cont.click();
//WebElement fname = driver.findElement(By.xpath("//input[@id='first_name']"));
//fname.sendKeys("munees");
//WebElement lname = driver.findElement(By.xpath("//input[@id='last_name']"));
//lname.sendKeys("wari");
//WebElement add = driver.findElement(By.xpath("//textarea[@id='address']"));
//add.sendKeys("madurai");
//WebElement ccno = driver.findElement(By.xpath("//input[@id='cc_num']"));
//ccno.sendKeys("2356987412895463");
//WebElement card = driver.findElement(By.xpath("//select[@id='cc_type']"));
//Select b2=new Select(card);
//b2.selectByValue("MAST");
//WebElement exp = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
//Select b3=new Select(exp);
//b3.selectByValue("10");
//WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
//Select b4=new Select(year);
//b4.selectByValue("2022");
//WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
//cvv.sendKeys("042");
//WebElement booknow = driver.findElement(By.xpath("//input[@id='book_now']"));
//booknow.click();

	
}
}
















































