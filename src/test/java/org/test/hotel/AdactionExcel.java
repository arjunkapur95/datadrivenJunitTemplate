package org.test.hotel;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdactionExcel extends Baseclass {
	  
	@BeforeClass
	public static void luanchBrowser() {
	
		System.setProperty("webdriver.chrome.driver", "./chromedriveer.exe");
		driver = new ChromeDriver();
		
		//----un comment the below to run on firefox
		
		//System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		//driver = new FirefoxDriver(); 
		
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void closeBrowser() {
		 
	}
	
	@Test
	public void page1() throws IOException {
		LoginPojo lp = new LoginPojo();
		browseFile("./hotel.xlsx");
		SheetName("login");
		fill(lp.getUsername(),excelRead(1, 0));
		fill(lp.getPassword(),excelRead(1, 1));
		buttonclick(lp.getBtnlogin());
	}
 
	@Test
	public  void page2() throws IOException {
		Searchhotel sh = new Searchhotel();
		browseFile("./hotel.xlsx");
		SheetName("sh");
		selectbyValue(sh.getLocation(), excelRead(1, 0));
		selectbyValue(sh.getHotel(), excelRead(1, 1));
		selectbyValue(sh.getRoomtype(), excelRead(1, 2));
	    selectbyValue(sh.getNoofroom(), excelRead(1, 3));
		selectbyValue(sh.getAdults(), excelRead(1, 4));
		selectbyValue(sh.getChildren(), excelRead(1, 5));
	    buttonclick(sh.getBtnsearch());
	}
	
	@Test
	public void page3() {
		SelectHotel s = new SelectHotel();
		buttonclick(s.getSelecthotel());
		buttonclick(s.getBtncontinue());
	}
	@Test
	public void page4() throws IOException {
		 Booking b = new Booking();
		 browseFile("./hotel.xlsx");
		 SheetName("book");
		 fill(b.getFname(), excelRead(1, 0));
		 fill(b.getLname(), excelRead(1, 1));
		 fill(b.getBilladd(), excelRead(1, 2));
		 fill(b.getCardno(), excelRead(1, 3));
		 fill(b.getCardtype(), excelRead(1, 4));
		 selectbyValue(b.getExpmonth(), excelRead(1, 5));
		 selectbyValue(b.getExpyear(), excelRead(1, 6));
		 fill(b.getCvv(), excelRead(1, 7));
		 buttonclick(b.getBtnbook());
		 driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		 
	
		writeExcel(1, 8, getvalue(b.getOrderno()));
		 
		 getvalue(b.getOrderno());
	}
	
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
