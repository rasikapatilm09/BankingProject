package com.bankingproject.loginpage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bankingproject.base.BaseClass;

public class LoginPageTest extends BaseClass{

	@BeforeClass
	public void setUp() {
		launchWebsite();
	}
	
	@AfterMethod
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
}
