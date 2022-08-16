package com.utilityfiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Utility_Files {
	public static WebDriver driver;
public static WebDriver browser_Launch(String name ) {
if (name.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	}
else if (name.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver",
			System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();	
	}
driver.manage().window().maximize();
return driver;
}
public static void get(String url) throws InterruptedException {
driver.get(url);

}
public static void Navigate_To(String url) {
	driver.navigate().to(url);
}
public static void close() {
	driver.close();
}
public static void quit() {
	driver.quit();
}

public static String get_Title() {
	String title=driver.getTitle();
	return title;
}
public static String current_Url() {
	String currentUrl=driver.getCurrentUrl();
	return currentUrl;	
}
// take screenshot
public static void take_Screenshot(String destination)throws IOException{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(destination);
	FileUtils.copyFile(source, dest);
	}
//navigate command
public static void Navigate_Back() {
	driver.navigate().back();
}
public static void Navigate_Forward() {
	driver.navigate().forward();
}
public static void Navigate_Refresh() {
	driver.navigate().refresh();
}
public static void navigate_To(String Url) {
	driver.navigate().to(Url);
}
//WebElement methods
public static void click_Element(WebElement e) {
	e.click();
	}
public static void sendkeys(WebElement e,String value) {
	e.sendKeys(value);
}
public static String get_Attribute(WebElement e,String name) {
	String attribute=e.getAttribute(name);
	return attribute;
}
public static String get_Text(WebElement e) {
	String text=e.getText();
	return text;
}
public static boolean is_Displayed(WebElement e) {
	boolean displayed=e.isDisplayed();
	return displayed;
}
public static boolean is_Enabled(WebElement e) {
	boolean enabled=e.isEnabled();
	return enabled;
	}
public static boolean is_Selected(WebElement e) {
	boolean selected=e.isSelected();
	return selected;
}
public static void clear(WebElement e) {
	e.clear();
}
public static Dimension getsize(WebElement e) {
	Dimension size = e.getSize();
	return size;
}
public static String font_Size(WebElement e,String text) {
	String fsize = e.getCssValue(text);
	return fsize;
	}
//mouse Actions
public static void Actions_Mouse (WebElement e) {
	Actions a=new Actions(driver);
	a.moveToElement(e).build().perform();
	}
public static void Actions_Click(WebElement e) {
	Actions a=new Actions(driver);
	a.click(e).build().perform();
}
public static void release() {
	Actions a=new Actions(driver);
	a.release().build().perform();

		
	}
public static void action_Rightclick(WebElement e) {
	Actions a=new Actions(driver);
	a.contextClick(e).build().perform();
}
// JavascriptExecutor
public static void js_Script(WebElement e) {
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView()", e);

}
public static void js_Click(WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",e);
}
public static void js_Sendkey(String name, WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].value=name", e);
}
public static void Chrome_Options(String name) {
ChromeOptions ops=new ChromeOptions();
ops.addArguments("name");
driver=new ChromeDriver(ops);
}
public static void set_Size() {
	Dimension d=new Dimension(800, 450);
	driver.manage().window().setSize(d);

}
//Frame
public static WebDriver switch_Frame(WebElement e) {
	WebDriver frame=driver.switchTo().frame(e);
	return frame;
	
}

public static WebDriver switch_DefaultContent() {
	WebDriver defaultContent =driver.switchTo().defaultContent();
return defaultContent;
}
// Timeouts
public static void implicit_Timeout(int Sec) {
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Sec));
}
public static void pageload_Waits(int sec) {
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
}
public static Set<String> get_WindowHandles(){
Set<String> windowHandles = driver.getWindowHandles();
	return windowHandles;
}

public static String particular_Cell(Workbook work,int sheet,int rownum,int cellnum)throws IOException {
//	File f = new File(location);
//	FileInputStream fis = new FileInputStream(f);
//	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = work.getSheetAt(sheet);
	Row row = s.getRow(rownum);
	Cell c = row.getCell(cellnum);
	CellType type=c.getCellType();
	String value= null;
	if (type.equals(CellType.STRING)) {
		value = c.getStringCellValue();
		
	}
	else if (type.equals(CellType.NUMERIC)) {
		double numericCellValue = c.getNumericCellValue();
		//int a=(int) numericCellValue;
		value = String.valueOf(numericCellValue);
		}
	work.close();
	return value;
}
//Select and deSelect methods
public static void dropdown (WebElement e,String type,String data) {
	Select s=new Select(e);
	if (type.equalsIgnoreCase("byValue")) {
		s.selectByValue(data);
	}
	else if (type.equalsIgnoreCase("byText")) {
		s.selectByVisibleText(data);
	}
	else if (type.equalsIgnoreCase("byIndex")) {
		int val=Integer.parseInt(data);
		s.selectByIndex(val);
	}
}
public static Workbook get_Workbook(String excel_path) throws IOException {
		File f=new File(excel_path);
		FileInputStream fis=new FileInputStream(f);
		Workbook work=new XSSFWorkbook(fis);
		return work;
	}
public static String particular_Cell(String location,int sheet_I,int rownum,int cellnum)throws IOException {
	File fi = new File(location);
	FileInputStream fis = new FileInputStream(fi);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.getSheetAt(sheet_I);
	Row row = s.getRow(rownum);
	Cell c = row.getCell(cellnum);
	CellType type=c.getCellType();
	String value= null;
	if (type.equals(CellType.STRING)) {
		value = c.getStringCellValue();
		
	}
	else if (type.equals(CellType.NUMERIC)) {
		double numericCellValue = c.getNumericCellValue();
		//int a=(int) numericCellValue;
		value = String.valueOf(numericCellValue);
		}
	wb.close();
	return value;


}
public static void down_And_Enter() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}		
}