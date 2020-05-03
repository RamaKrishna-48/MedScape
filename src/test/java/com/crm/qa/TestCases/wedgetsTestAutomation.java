package com.crm.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import automation.pages.wedgets;

public class wedgetsTestAutomation extends TestBase {
	wedgets wet;

	public wedgetsTestAutomation() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialazation();
	}
	
	
	
	@Test
	public void loginTest() {
	wet.clicwedgets();
	
	System.out.println(driver.switchTo().alert().getText());
	wet.enterTxt();	
	}
		@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
}
