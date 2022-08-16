package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Back {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement order_Back;
	@FindBy(xpath = "//span[.='Order history']")
	private WebElement scroll;
	public Order_Back(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getScroll() {
		return scroll;
	}
	
	public WebElement getOrder_Back() {
		return order_Back;
	}
	

}
