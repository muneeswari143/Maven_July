package com.automation.pageomanage;

import org.openqa.selenium.WebDriver;

import com.pom.Automation_Pageobjectmanager;
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

public class Automation_Pom extends Utility_Files {
	public static WebDriver driver=Utility_Files.browser_Launch("chrome");
	public  static Automation_Pageobjectmanager page=new Automation_Pageobjectmanager(driver);
//	public static Home_Page home=new Home_Page(driver);
//	public static Login_Page login=new Login_Page(driver);
//	public static Evedress_Details details=new Evedress_Details(driver);
//	public static First_Check check1=new First_Check(driver);
//	public static Second_Check check2= new Second_Check(driver);
//	public static Third_Check check3=new Third_Check(driver);
//	public static Fourth_Check check4= new Fourth_Check(driver);
//	public static Payment pay=new Payment(driver);
//	public static Confirm_Order confirm=new Confirm_Order(driver);
//	public static Order_Back order=new Order_Back(driver);
	
	public static void main(String[] args) throws InterruptedException {
get("http://automationpractice.com/index.php");
Thread.sleep(5000);
click_Element(page.getHome().getSignin());
Thread.sleep(5000);
sendkeys(page.getLogin().getEmail(), "star423@gmail.com");
System.out.println("email size:"+getsize(page.getLogin().getEmail()));
sendkeys(page.getLogin().getPass(), "muthu@123456");
System.out.println("font size of pass:"+font_Size(page.getLogin().getEmail(), "font-size"));
click_Element(page.getLogin().getSignin_Btn());
Thread.sleep(5000);
Actions_Mouse(page.getDetails().getDress());
Actions_Mouse(page.getDetails().getEve_Dress());
click_Element(page.getDetails().getEve_Dress());
click_Element(page.getDetails().getSize());
click_Element(page.getDetails().getImage());
switch_Frame(page.getDetails().getFrame());
implicit_Timeout(15);
Actions_Click(page.getDetails().getQuantity());
dropdown(page.getDetails().getSizes(), "byValue", "3");
Actions_Mouse(page.getDetails().getBeige());
Actions_Mouse(page.getDetails().getColor());
Actions_Click(page.getDetails().getColor());
click_Element(page.getDetails().getAdd_Cart());
switch_DefaultContent();
implicit_Timeout(10);
click_Element(page.getCheck1().getCheck());
implicit_Timeout(15);
click_Element(page.getCheck2().getCheckout());
click_Element(page.getCheck3().getCheckout());
click_Element(page.getCheck4().getCheckbox());
click_Element(page.getCheck4().getCheckout());
click_Element(page.getPay().getPay());
click_Element(page.getConfirm().getConfirm_Btn());
click_Element(page.getOrder().getOrder_Back());
js_Script(page.getOrder().getScroll());
	
	}
}
