package org.test.hotel;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Adactin extends Baseclass{

	 
	 @BeforeClass
	 public static void luanchBrowser() {
//		System.setProperty("webdriver.chrome.driver", "E:\\FrameWork\\Junit\\Junit\\Driver\\chromedriver.exe");
//		driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "E:\\FrameWork\\Junit\\Junit\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver(); 
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
	}
	@AfterClass
	 public static void closeBrowser() {
		//driver.close();
	}
	
	@Test
	public void page1() {
		LoginPojo lp = new LoginPojo();
		fill(lp.getUsername(), "SurendranM");
		String uname = lp.getUsername().getAttribute("value");
		Assert.assertEquals("Username", "SurendranM", uname);
		fill(lp.getPassword(), "Sweetsure@25");
		String pwd = lp.getPassword().getAttribute("value");
		Assert.assertEquals("Password", "Sweetsure@25", pwd);
		buttonclick(lp.getBtnlogin());
	}
	 
	@Test
	public void page2() {
		Searchhotel sh = new Searchhotel();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		selectbyIndex(sh.getLocation(),2);
		selectbyValue(sh.getHotel(), "Hotel Creek");
		selectbyVisible(sh.getRoomtype(), "Double");
		selectbyIndex(sh.getNoofroom(), 4);
		selectbyValue(sh.getAdults(), "2");
		selectbyValue(sh.getChildren(), "2");
		buttonclick(sh.getBtnsearch());
	}
	@Test
	public void page3() {
		SelectHotel s = new SelectHotel();
		buttonclick(s.getSelecthotel());
		buttonclick(s.getBtncontinue());
	}
	@Test
	public void page4() {
		 Booking b = new Booking();
		 fill(b.getFname(), "Surendran");
		 fill(b.getLname(), "Manikandan");
		 fill(b.getBilladd(), "Udumalipet");
		 fill(b.getCardno(), "1234567890123456");
		 selectbyIndex(b.getCardtype(), 3);
		 selectbyIndex(b.getExpmonth(), 6);
		 selectbyVisible(b.getExpyear(), "2022");
		 fill(b.getCvv(), "234");
		 buttonclick(b.getBtnbook());
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
