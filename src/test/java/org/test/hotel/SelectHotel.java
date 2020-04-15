package org.test.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Baseclass {

	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement selecthotel;
	@FindBy(id="continue")
	private WebElement btncontinue;
	public WebElement getSelecthotel() {
		return selecthotel;
	}
	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	
}
