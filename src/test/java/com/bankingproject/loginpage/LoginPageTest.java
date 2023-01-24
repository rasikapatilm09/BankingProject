package com.bankingproject.loginpage;

import org.openqa.selenium.WindowType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bankingproject.base.BaseClass;
import com.bankingproject.pom.LoginPagePom;

public class LoginPageTest extends BaseClass{

	LoginPagePom loginPagePom ;
	//WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		launchWebsite();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void testTitle() {
		String pageTitle = driver.getTitle();
		if(pageTitle.equalsIgnoreCase("GTPL Bank Home Page")) {
			System.out.println(" we are on correct page");
		}
		else {
			System.out.println("wrong page....");
		}
	}
	
	@Test
	public void testUrl() {
		String pageTitle = driver.getCurrentUrl();
		if(pageTitle.equalsIgnoreCase("https://demo.guru99.com/V1/index.php")) {
			System.out.println(" we are on current url");
		}
		else {
			System.out.println("wrong Url....");
		}
	}
	@Test
	public void clickOnLoginButton() throws InterruptedException {
		loginPagePom = new LoginPagePom();
		loginPagePom.clickOnLoginButton();
	}
	
	@Test
	public void clickOnGetCredential() throws InterruptedException {
		loginPagePom = new LoginPagePom();
		loginPagePom.clickOnGetCredential();
		Thread.sleep(15000);
	}

}

