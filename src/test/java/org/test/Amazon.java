package org.test;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon extends Baseclass {
 
	static SearchPojo search;
	
	@BeforeClass
	public static void luanchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\FrameWork\\Junit\\Junit\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@AfterClass
	 public static void closeBrowser() {
		//driver.close();
	}
	
	@Test
	public void a() throws InterruptedException {
		search = new SearchPojo();
		fill(search.getSearch(), "iphone");
		Thread.sleep(1000);
		buttonclick(search.getSearchicon());
		Thread.sleep(1000);
	}
	
	@Test
	public   void b() throws InterruptedException {
		search = new SearchPojo();
		Thread.sleep(9000); 
		//List<WebElement> s1 = null;
		//gtext(search.getItemname());
		 
		//findelements(search.getItemname());
		
		String x = search.getItemname().getText();
		 
		for (int i = 0; i < x.length(); i++) {
			
			System.out.println(i);			  
			
		}
	
	}
		
//	private void findelements(WebElement itemname) {
//		 
//		
//	}
	@Before
	public void startTime() {
		 Date d = new Date();
		 System.out.println(d);
	}
	@After
	public void EndTime() {
		 Date d = new Date();
		 System.out.println(d);
	}
	
	
	
}
