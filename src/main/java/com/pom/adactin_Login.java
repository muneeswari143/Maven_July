package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class adactin_Login {
	public WebDriver driver;
@FindBy(xpath = "//form[@name='login_form']//following::input[@type='text']")
	private WebElement loginid;
@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;
@FindBy(xpath = "//input[@id='login']")
	private WebElement login;
	public adactin_Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLoginid() {
		return loginid;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	}
	


