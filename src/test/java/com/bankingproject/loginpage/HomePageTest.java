package com.bankingproject.loginpage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bankingproject.base.BaseClass;
import com.bankingproject.pom.BankHomePagePom;

public class HomePageTest extends BaseClass{

	BankHomePagePom bankHomePagePom;
	
	@BeforeClass
	public void setUp() {
		launchWebsite();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	@Test	
	public void setEmailID() {
		bankHomePagePom= new BankHomePagePom();
		bankHomePagePom.setEmailID();
		}
	
	@Test
	public void clickOnSubmitButton() {
		bankHomePagePom= new BankHomePagePom();
		bankHomePagePom.clickOnSubmitButton();
	}
	
}
