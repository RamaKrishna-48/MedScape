package com.crm.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
LoginPage login;
	HomePage homepage=new HomePage();
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialazation();
		login=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title=login.validateLoginPage();
		Assert.assertEquals(title, "Medscape Log In");
	}
	@Test(priority=2)
	public void medscapelogoTest() {
		boolean flag=login.validateLOGINpGE();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	public void loginTest() {
		homepage=login.login(prop.getProperty("username"), prop.getProperty("password"));
	
		
	}
		@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
}
