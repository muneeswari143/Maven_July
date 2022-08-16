package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Third_Check {
	public WebDriver driver;
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement checkout;
	
	public Third_Check(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	
	}

	public WebElement getCheckout() {
		return checkout;
	}
	

}
