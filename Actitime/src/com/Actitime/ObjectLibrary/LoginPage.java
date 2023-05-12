package com.Actitime.ObjectLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//Declaration
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwdtbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbtn;
	
//Initialization
	public LoginPage(WebDriver driver ) {
		PageFactory.initElements(driver, this);  //We can pass any reference variable at driver place
	}
	
//Utilization
	public WebElement getUntbx() {
		return untbx;
	}
	public WebElement getPwdtbx() {
		return pwdtbx;
	}
	public WebElement getLgbtn() {
		return lgbtn;
	}
	
}
