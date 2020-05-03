package com.crm.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.residentsPage;

public class ResidencyPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homePage;
	residentsPage residency;
public ResidencyPageTest() {
	super();
}

@BeforeMethod
public void SetUp(){
	initialazation();
	homePage=new HomePage();
	loginpage=new LoginPage();
	homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	residency=new residentsPage();
	homePage.residentsPage();

}
@Test(priority=1)
public void SpecialCoverageCovid19() {
	residency.clickSpecialCoverageCovid19();
}
@Test(priority=2)
public void MapforCoronavirus() {
	residency.clickSpecialCoverageCovid19();
	residency.MapforCoronavirusSpread();
	
	
}


@AfterMethod
public void TesrDown(){
	driver.quit();
	
}





}
