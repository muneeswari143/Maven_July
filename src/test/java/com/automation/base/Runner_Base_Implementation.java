package com.automation.base;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.pom.Confirm_Order;
import com.pom.Evedress_Details;
import com.pom.First_Check;
import com.pom.Fourth_Check;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.Order_Back;
import com.pom.Payment;
import com.pom.Second_Check;
import com.pom.Third_Check;
import com.utilityfiles.Utility_Files;

public class Runner_Base_Implementation extends Utility_Files{
	public static WebDriver driver=Utility_Files.browser_Launch("chrome");
	public static Home_Page home=new Home_Page(driver);
	public static Login_Page login=new Login_Page(driver);
	public static Evedress_Details details=new Evedress_Details(driver);
	public static First_Check check1=new First_Check(driver);
	public static Second_Check check2= new Second_Check(driver);
	public static Third_Check check3=new Third_Check(driver);
	public static Fourth_Check check4= new Fourth_Check(driver);
	public static Payment pay=new Payment(driver);
	public static Confirm_Order confirm=new Confirm_Order(driver);
	public static Order_Back order=new Order_Back(driver);
	
	public static void main(String[] args) throws InterruptedException {
get("http://automationpractice.com/index.php");
Thread.sleep(5000);
click_Element(home.getSignin());
Thread.sleep(5000);
sendkeys(login.getEmail(), "star423@gmail.com");
System.out.println("email size:"+getsize(login.getEmail()));
sendkeys(login.getPass(), "muthu@123456");
System.out.println("font size of pass:"+font_Size(login.getEmail(), "font-size"));
click_Element(login.getSignin_Btn());
Thread.sleep(5000);
Actions_Mouse(details.getDress());
Actions_Mouse(details.getEve_Dress());
click_Element(details.getEve_Dress());
click_Element(details.getSize());
click_Element(details.getImage());
switch_Frame(details.getFrame());
Actions_Click(details.getQuantity());
dropdown(details.getSize(), "byText", "L");
Actions_Mouse(details.getBeige());
Actions_Mouse(details.getColor());
Actions_Click(details.getColor());
click_Element(details.getAdd_Cart());
switch_DefaultContent();
implicit_Timeout(10);
click_Element(check1.getCheck());
click_Element(check2.getCheckout());
click_Element(check3.getCheckout());
click_Element(check4.getCheckbox());
click_Element(check4.getCheckout());
click_Element(pay.getPay());
click_Element(confirm.getConfirm_Btn());
click_Element(order.getOrder_Back());
js_Script(order.getScroll());
	
	}

		
	}

