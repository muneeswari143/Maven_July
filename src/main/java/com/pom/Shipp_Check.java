package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipp_Check {
	public WebDriver driver;
	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
private WebElement shipp;
	@FindBy(xpath = "//a[@title='Pay by check.']")
	private WebElement cheque;
	@FindBy(xpath = "//span[.='I confirm my order']")
	private WebElement confirm;
	public void setCheque(WebElement cheque) {
		this.cheque = cheque;
	}
	public Shipp_Check(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver2, this);

	}
	public WebElement getConfirm() {
		return confirm;
	}
	public WebElement getShipp() {
		return shipp;

	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCheque() {
		return cheque;
}
}