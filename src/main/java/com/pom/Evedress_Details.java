package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evedress_Details {
	public WebDriver driver;
@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']")
private WebElement dress;
@FindBy(xpath = "//ul[@class='submenu-container clearfix first-in-line-xs']/li/a[.='Evening Dresses']")
private WebElement eve_Dress;
@FindBy(xpath = "//input[@id='layered_id_attribute_group_3']")
private WebElement size;
@FindBy(xpath ="//img[@title='Printed Dress']")
private WebElement image;
@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
private WebElement frame;
@FindBy(xpath = "//input[@id='quantity_wanted']")
private WebElement quantity;
@FindBy(xpath = "//select[@class='form-control attribute_select no-print']")
private WebElement sizes;
@FindBy(xpath = "//a[@name='Beige']")
private WebElement beige;
@FindBy(xpath = "//a[@class='color_pick']")
private WebElement color;
@FindBy(xpath = "//span[.='Add to cart']")
private WebElement add_Cart;

public Evedress_Details(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
public WebElement getDress() {
	return dress;
	
}
public WebElement getEve_Dress() {
	return eve_Dress;
}
public WebElement getSize() {
	return size;
}
public WebElement getImage() {
	return image;
}
public WebElement getFrame() {
	return frame;
}
public WebElement getQuantity() {
	return quantity;
}
public WebElement getSizes() {
	return sizes;
}
public WebElement getBeige() {
	return beige;
}
public WebElement getColor() {
	return color;
}
public WebElement getAdd_Cart() {
	return add_Cart;

}
}
