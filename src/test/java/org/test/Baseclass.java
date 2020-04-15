package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baseclass {

	static WebDriver driver;
		//get
		public static void luanchURL(String url) {
			driver.get(url);
		}
		//find element by id
		public static WebElement findid(String s) {
			return driver.findElement(By.id(s));
		}
		//find element by name
		public static WebElement findname( String s) {
			return driver.findElement(By.name(s));
		}
		//find element by name
		public static WebElement findclassname(String s) {
			return driver.findElement(By.className(s));
		}
		//xpath
		public static WebElement xpath( String s) {
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
		
		public static List<WebElement> findelements(String x) {
			 
			List<WebElement>  s11 = driver.findElements(By.xpath(x));
			   int size = s11.size();
			   System.out.println(size);
			return s11;
		}
		
		 
		//gettext
		public static void gtext(WebElement w) {
		    String s = w.getText();
		    System.out.println(s);
	
		}
		
		
		
}
