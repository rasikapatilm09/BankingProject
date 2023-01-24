package com.bankingproject.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bankingproject.base.BaseClass;

public class BankHomePagePom extends BaseClass{
	
	public BankHomePagePom(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='emailid'] ")
	WebElement emailID;
	
	@FindBy(xpath = "//input[@name='btnLogin']" )
	WebElement submitbutton;
	
	public void setEmailID() {
		emailID.sendKeys("adsulrasika@gmail.com");
	}
	public void clickOnSubmitButton() {
		submitbutton.click();
	}
}
