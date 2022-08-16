package com.pom;

import org.openqa.selenium.WebDriver;

public class Automation_Pageobjectmanager {
	public WebDriver driver;
	private Home_Page home;
	private Login_Page login;
	private Evedress_Details details;
	private First_Check check1;
	private Second_Check check2;
	private Third_Check check3;
	private Fourth_Check check4;
	private Payment pay;
	private Confirm_Order confirm;
	private Order_Back order;
	
	public Automation_Pageobjectmanager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Home_Page getHome() {
		if (home==null) {
			home=new Home_Page(driver);
		}
		return home;
	}
	public Login_Page getLogin() {
		if (login==null) {
			login=new Login_Page(driver);
			
		}
		return login;
	}
	public Evedress_Details getDetails() {
		if (details==null) {
			details=new Evedress_Details(driver);
			
		}
		return details;
	}
	public First_Check getCheck1() {
		if (check1==null) {
			check1=new First_Check(driver);
			
		}
		return check1;
	}
	public Second_Check getCheck2() {
		if (check2==null) {
			check2=new Second_Check(driver);
			
		}
		return check2;
	}
	public Third_Check getCheck3() {
		if (check3==null) {
		check3=new Third_Check(driver);	
		}
		return check3;
	}
	public Fourth_Check getCheck4() {
		if (check4==null) {
			check4=new Fourth_Check(driver);
		}
		return check4;
	}
	public Payment getPay() {
		if (pay==null) {
			pay=new Payment(driver);
		}
		return pay;
	}
	public Confirm_Order getConfirm() {
		if (confirm==null) {
			confirm=new Confirm_Order(driver);
			
		}
		return confirm;
	}
	public Order_Back getOrder() {
		if (order==null) {
		order=new Order_Back(driver);	
		}
		return order;
	}
	

}
