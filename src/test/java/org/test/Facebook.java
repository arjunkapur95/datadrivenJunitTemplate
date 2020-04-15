package org.test;
 

import static org.junit.Assert.assertEquals;

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

public class Facebook {

	static WebDriver driver;
	
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "E:\\FrameWork\\Junit\\Junit\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void quitBrowser() {
		driver.quit();
	}
	
	@Test
	public void loginTest() {
		 WebElement email = driver.findElement(By.id("email"));
		 email.sendKeys("Surendran");
		 String ea = email.getAttribute("value");
		 Assert.assertEquals("Verify email", "Surendran", ea);
		 WebElement pwd = driver.findElement(By.id("pass"));
		 pwd.sendKeys("Surendran@25");
		 String pass = pwd.getAttribute("value");
		 Assert.assertEquals("Verify password", "Surendran25", pass);
	}
	@Test
	public void buttonClick() {
		 WebElement btnlogin = driver.findElement(By.id("loginbutton"));
		 btnlogin.click();
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
	
	
	
}
