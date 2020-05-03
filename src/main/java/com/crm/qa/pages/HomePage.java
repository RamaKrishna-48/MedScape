package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//a[@href='/resource/coronavirus']")
	WebElement NovalCoronaVirus;
	
	@FindBy(xpath="//a[@href='/residents']")
	WebElement residents;
	
	public HomePage() {
		PageFactory.initElements(driver, this);}
	
	public novalCoronaPage clickNovalCoronaVirus() {
		NovalCoronaVirus.click();
		return new novalCoronaPage();
		
		
	}
	public void residentsPage() {
		residents.click();
	}
	
	
}
