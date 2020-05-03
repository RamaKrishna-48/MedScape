package com.crm.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
		HomePage homePage;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp(){
		initialazation();
		homePage=new HomePage();
		loginpage=new LoginPage();
		homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	@Test(priority=1)
	public void VerifyHomePageTitleTest() {
		String homepageTitle=driver.getTitle();
		Assert.assertEquals(homepageTitle, "Medscape Log In");
	}
	@Test(priority=2)
	public void novalCoranaPage() {
		homePage.clickNovalCoronaVirus();
		
		
	}
	/*@Test(priority=3)
	public void residencypage() {
		homePage.clickresidentslink();
	}*/
	
	
	@AfterMethod
	public void TesrDown(){
		driver.quit();
		
	}


	
	
	
}
