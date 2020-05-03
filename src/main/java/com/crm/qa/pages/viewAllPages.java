package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;

public class viewAllPages extends TestBase{
	@FindBy(xpath="//h1[@class='title']")
	WebElement latestCoronaVirusNews;
	
	
	@FindBy(xpath="//a[@href=\"//www.medscape.com/viewarticle/929607\"]")
	WebElement PreventableDeaths;
	
	//a[@href="//www.medscape.com/viewarticle/929547"]
	
	public  viewAllPages() {
		PageFactory.initElements(driver, this);
		
	}
	public String validateviewAllPages() {
		return driver.getTitle();
		
		
	}
	public COVID19TherapyPage TitleValidation() {
		PreventableDeaths.click();
		return new COVID19TherapyPage();
	}
	
}
