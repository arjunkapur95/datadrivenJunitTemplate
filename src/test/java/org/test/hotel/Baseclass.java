package org.test.hotel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	static WebDriver driver;
	static File f;
	static Workbook w;
	static Sheet s;
	static FileInputStream fin;
	static FileOutputStream fout;

	public static void cluanch() {
		System.setProperty("webdriver.chrome.driver", "E:\\FrameWork\\Junit\\Junit\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void fluanch() {
		 System.setProperty("webdriver.gecko.driver", "E:\\FrameWork\\Junit\\Junit\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver(); 
	}
	
	
	//get
	public static void luanchURL(String url) {
		driver.get(url);
	}
	//find element by id
	public static WebElement findid(WebElement w,String s) {
		return driver.findElement(By.id(s));
	}
	//find element by name
	public static WebElement findname(WebElement w,String s) {
		return driver.findElement(By.name(s));
	}
	//find element by name
	public static WebElement findclassname(WebElement w,String s) {
		return driver.findElement(By.className(s));
	}
	//xpath
	public static WebElement xpath(WebElement w,String s) {
		return driver.findElement(By.xpath(s));
	}
	//fill
	public static void fill(WebElement w,String v) {
		 w.sendKeys(v);
	}
	//button
	public static void buttonclick(WebElement btn) {
		btn.click();
	}
	//Quit
	public static void quitBrowser() {
		driver.quit();
	}
	//close
	public static void closeBrowser() {
		driver.quit();
	}
	//select by index
	public static void selectbyIndex(WebElement w,int x) {
		Select s = new Select(w);
		s.selectByIndex(x);
	}
	//select by value
	public static void selectbyValue(WebElement w,String v) {
		Select s = new Select(w);
		s.selectByValue(v);
	}
	//select by visible Text
	public static void selectbyVisible(WebElement w,String v) {
		Select s = new Select(w);
		s.selectByVisibleText(v);
	}
	//get attribute
	public static String getvalue(WebElement w) {
		 String value = w.getAttribute("value");
		 System.out.println(value);
		return value;	 
	}
	//Excel
	//BrowsePath
	public static void browseFile(String path) {
		   f = new File(path);
	}
	//Sheet Name
	 public  static void SheetName(String Sheetname) throws IOException {
		fin = new FileInputStream(f);
		w = new XSSFWorkbook(fin);
		s = w.getSheet(Sheetname);
	}
	//Read
	public static String excelRead(int row,int cell) throws IOException {
	
      String value = null;
	  Row r = s.getRow(row);
	  Cell c = r.getCell(cell);
	  //System.out.println(c);
	  int Type = c.getCellType();
	
	  if (Type==1) { //String
		  value = c.getStringCellValue();
	  }
	  else if (Type==0) {//Numeric or date
		  if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat();
			value = sdf.format(d);
		}
		  else {
			double numericCellValue = c.getNumericCellValue();
			long l = (long)numericCellValue;
			value = String.valueOf(l);
		}
	}
	return value;
	 
	}
	
	public static void writeExcel(int row, int cell,String x) throws IOException {
		fout = new FileOutputStream(f);
		Row r = s.getRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(x);
		w.write(fout);
		System.out.println("File Wrote Done");
		
	}
	
	
	
	
}
