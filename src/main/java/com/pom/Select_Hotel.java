package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public WebDriver driver;
	@FindBy(xpath = "//td[@bgcolor='#FFFFFF']//child::input[@type='radio']")
	private WebElement radio_Btn;
	@FindBy(xpath = "//td[@align='center']//child::input[@id='continue']")
	private WebElement cont;
	public Select_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getRadio_Btn() {
		return radio_Btn;
	}
	public WebElement getCont() {
		return cont;
	}
	
	
	

}
