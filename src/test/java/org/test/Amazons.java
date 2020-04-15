package org.test;
 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\FrameWork\\Junit\\Junit\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebElement search = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		search.sendKeys("iphone");
		WebElement btngo = driver.findElement(By.xpath("//input[@value='Go']"));
		btngo.click();
		List<WebElement> itemname = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement x : itemname) {
			String t = x.getText();
			if(t.contains("Apple iPhone")) {
			System.out.println(t);
		}
	
//		List<WebElement> iname = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone')]"));
//		for (int i = 1; i <  iname.size(); i++) {
//			WebElement element =  iname.get(i);
//			String text = element.getText();
//			System.out.println(text);	 
//		}
        }
	
	}
}

