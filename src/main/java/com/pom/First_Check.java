package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_Check {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement check;
	

	public First_Check(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
	}


	public WebElement getCheck() {
		return check;
	}

}
