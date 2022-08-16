package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Second_Check {
public WebDriver driver;
@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
private WebElement checkout;

public Second_Check(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}

public WebElement getCheckout() {
	return checkout;
}


	}


