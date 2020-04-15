package org.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends Baseclass {

	public SearchPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='field-keywords']")
	private WebElement search;
	@FindBy(xpath="//input[@value='Go']")
	private WebElement searchicon;
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private WebElement itemname;
	
	public WebElement getItemname() {
		return itemname;
		 
		 
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getSearchicon() {
		return searchicon;
	}
	
	
	
}
