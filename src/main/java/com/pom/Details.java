package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details {
	public WebDriver driver;
	@FindBy(xpath = "//label[@id='first_name_span']//preceding-sibling::input[@name='first_name']")
private WebElement first_Name;
	@FindBy(xpath = "//td//child::input[@name='last_name']")
	private WebElement last_Name;
	@FindBy(xpath = "//td//child::textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath = "//label[@id='cc_num_tip']//preceding-sibling::input[@name='cc_num']")
	private WebElement credit_No;
	@FindBy(xpath = "//td//child::select[@id='cc_type']")
	private WebElement card_Type;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement exp_Mnth;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement exp_Year;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv_No;
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book_Now;
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement itinerary;
	public Details (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getItinerary() {
		return itinerary;
	}
	public WebElement getFirst_Name() {
		return first_Name;
	}
	public WebElement getLast_Name() {
		return last_Name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCredit_No() {
		return credit_No;
	}
	public WebElement getCard_Type() {
		return card_Type;
	}
	public WebElement getExp_Mnth() {
		return exp_Mnth;
	}
	public WebElement getExp_Year() {
		return exp_Year;
	}
	public WebElement getCvv_No() {
		return cvv_No;
	}
	public WebElement getBook_Now() {
		return book_Now;
	}
	
}
