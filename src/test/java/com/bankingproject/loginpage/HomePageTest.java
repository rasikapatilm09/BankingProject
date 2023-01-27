package com.bankingproject.loginpage;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bankingproject.base.BaseClass;
import com.bankingproject.pom.BankHomePagePom;
import com.bankingproject.pom.CredentialPom;
import com.bankingproject.pom.LoginPagePom;
import com.bankingproject.utility.Utility;

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
	public void testGetCredentials() throws InterruptedException, EncryptedDocumentException, IOException {
		LoginPagePom loginpage=new LoginPagePom();
		BankHomePagePom bankHomePagePom=loginpage.clickOnGetCredential();
		Thread.sleep(2000);
		Utility utility=new Utility();
		String email=(String) utility.getSingleCellDataFromExcel(1,0,"registrationemail");
		bankHomePagePom.setEmailID(email);
		Thread.sleep(2000);
		
		CredentialPom credentialPom=bankHomePagePom.clickOnSubmitButton();
		Thread.sleep(2000);
		credentialPom.saveCredentials();
		
	}
	
}
