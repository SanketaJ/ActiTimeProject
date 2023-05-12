package com.Actitime.ObjectLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newCustomer;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement CustomerName;
	
	@FindBy(xpath="//textarea[@placehoder='Enter Customer Description']")
	private WebElement CustoDescr;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcust;
	
	@FindBy(xpath="//div=[@class='grayButton cancelBtn']")
	private WebElement cancelbtn;
	

//initialization
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//utilization
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getCustomerName() {
		return CustomerName;
	}

	public WebElement getCustoDescr() {
		return CustoDescr;
	}

	public WebElement getCreatecust() {
		return createcust;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
	
}
