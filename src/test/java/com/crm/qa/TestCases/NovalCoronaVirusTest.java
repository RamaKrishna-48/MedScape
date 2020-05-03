package com.crm.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.novalCoronaPage;

public class NovalCoronaVirusTest extends TestBase{
	
	
	LoginPage login;
	HomePage homePage;
	novalCoronaPage noval;
public NovalCoronaVirusTest() {
	super();
}

@BeforeMethod
public void SetUp(){
	initialazation();
	login=new LoginPage();
	homePage=login.login(prop.getProperty("username"), prop.getProperty("password"));
	noval= new novalCoronaPage();
	noval=homePage.clickNovalCoronaVirus();
}
@Test(priority=1)
public void VerifyNovalCoronaViruspage() {
	String title=noval.validateHomePage();
	Assert.assertEquals(title, "Novel Coronavirus (COVID-19) News & Resources | Medscape");
	
	
	//Assert.assertEquals(noval.validateHomePage(), "Medical Students - Medscape");
	//String NovalCoronaViruspageTitle=noval.validateHomePage();
	//Assert.assertEquals(NovalCoronaViruspageTitle, "Novel Coronavirus (COVID-19) News &amp; Resources | Medscape");
}

@Test(priority=2)
public void ViewAllPages() {
	noval.clickViewLatestNews();
}

@Test(priority=3)
public void ViewImage() {
	noval.Covid19PandamicImage();
}
@AfterMethod
public void TesrDown(){
	driver.quit();
}

}
