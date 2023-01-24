package com.bankingproject.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bankingproject.base.BaseClass;

public class LoginPagePom extends BaseClass{
	

		public LoginPagePom() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//input[@name='uid']")
		WebElement userID;
		
		@FindBy(xpath = "//input[@name='password']")
		WebElement password;
		
		@FindBy(xpath ="//input[@name='btnLogin']")
		WebElement loginbutton;
		
		@FindBy(xpath = "//input[@name='btnReset']")
		WebElement resetbutton;
		
		@FindBy(xpath = "//a[text()='here']")
		WebElement getCredentialLink;
		
		public void clickOnLoginButton() {
			loginbutton.click();
		}
		
		public BankHomePagePom clickOnGetCredential() {
			getCredentialLink.click();
			return new BankHomePagePom();
		}
}
