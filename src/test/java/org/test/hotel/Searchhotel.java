package org.test.hotel;

import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;

public class Searchhotel extends Baseclass {

	public Searchhotel() {
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement noofroom;
	@FindBy(id="adult_room")
	private WebElement adults;
	@FindBy(id="child_room")
	private WebElement children;
	@FindBy(id="Submit")
	private WebElement btnsearch;
	 
	public WebElement getLocation() {
		return location;
     }
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNoofroom() {
		return noofroom;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getChildren() {
		return children;
	}
	public WebElement getBtnsearch() {
		return btnsearch;
	} 
	
	
	
	
}
