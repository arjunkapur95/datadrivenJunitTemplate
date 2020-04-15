package org.test.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends Baseclass {

	public Booking() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement fname;
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lname;
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement billadd;
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement cardno;
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cardtype;
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expmonth;
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expyear;
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement btnbook;
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement orderno;
	
	public WebElement getBtnbook() {
		return btnbook;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getBilladd() {
		return billadd;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getOrderno() {
		return orderno;
	}
	

	
}
