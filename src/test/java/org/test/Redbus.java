package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Redbus {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "E:\\FrameWork\\Junit\\Junit\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void quitBrowser() {
		
	}
	
	@Before
	public void beforeRun() {
	  Date d = new Date();
	  System.out.println(d);
	  }
	
	@After
	public void afterRun() {
		Date d = new Date();
		System.out.println(d);
    }
	
	@Test
	public void login() throws InterruptedException {
		WebElement ssign = driver.findElement(By.id("select_box_sign"));
		 ssign.click();
		 WebElement signin = driver.findElement(By.id("signInLink"));
		 signin.click();
	}
	@Test
	public void signin() throws InterruptedException {
		Thread.sleep(3000); 
		WebElement mobile = driver.findElement(By.className("IP"));
		mobile.click();
		Thread.sleep(3000);
		mobile.sendKeys("9700989832");
		String mob = mobile.getAttribute("value");
		Assert.assertEquals("Verify mobile", "9700989832", mob);
	}
	
	
	

}
