package com.bankingproject.pom;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bankingproject.base.BaseClass;

public class CredentialPom extends BaseClass{
	
	public CredentialPom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//table[@border='1']/tbody/tr[4]/td[2]")
	WebElement userId;
	
	@FindBy(xpath = "//table[@border='1']/tbody/tr[5]/td[2]")
	WebElement password;
	
	public void saveCredentials() {
		String userID=userId.getText();
		String Password=password.getText();
		System.out.println(userID +",     "+Password);
	}
	
	
}
