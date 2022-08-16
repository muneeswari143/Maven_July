package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fourth_Check {
	public WebDriver driver;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement checkout;
	

	public Fourth_Check(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	
	}


	public WebElement getCheckout() {
		return checkout;
	}


	public WebElement getCheckbox() {
		return checkout;
	}
	

}
