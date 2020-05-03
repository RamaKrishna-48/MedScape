package com.crm.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.novalCoronaPage;
import com.crm.qa.pages.viewAllPages;

public class ViewAllPagesTest extends TestBase {
	LoginPage login;
	HomePage homePage;
	novalCoronaPage noval;
	viewAllPages allpage;
public ViewAllPagesTest() {
	super();
}

@BeforeMethod
public void SetUp(){
	initialazation();
	login=new LoginPage();
	homePage=login.login(prop.getProperty("username"), prop.getProperty("password"));
	noval= new novalCoronaPage();
	noval=homePage.clickNovalCoronaVirus();
	allpage=new viewAllPages();
	allpage=noval.clickViewLatestNews();
/*	initialazation();
	login=new LoginPage();
	homePage=new HomePage();
	homePage=login.login(prop.getProperty("username"), prop.getProperty("password"));
	noval= new novalCoronaPage();
	noval=homePage.clickNovalCoronaVirus();
	allpage=new viewAllPages();
	allpage=noval.ViewLatestNews();*/
}
@Test(priority=1)
public void  validateviewAllPages() {
	String title=allpage.validateviewAllPages();
	Assert.assertEquals(title, "Latest Coronavirus News - Index");
	
	
	//Assert.assertEquals(noval.validateHomePage(), "Medical Students - Medscape");
	//String NovalCoronaViruspageTitle=noval.validateHomePage();
	//Assert.assertEquals(NovalCoronaViruspageTitle, "Novel Coronavirus (COVID-19) News &amp; Resources | Medscape");
}

@Test(priority=2)
public void TitleValidation() {
	allpage.TitleValidation();
	
}


@AfterMethod
public void TesrDown(){
	driver.quit();
}


}
