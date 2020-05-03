package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class novalCoronaPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"bodypadding\"]/main/section[2]/h2/span/a")
	WebElement LatestNewsViewAll;
	//*[@id="bodypadding"]/main/section[2]/h2/span/a
	
	//*[@id="bodypadding"]/main/section[2]/h2/span/a
	
	@FindBy(xpath="//img[@alt='How is the COVID-19 Pandemic Affecting You?']")
	WebElement DisplayCovid19Pandmic;
	//img[@alt="How is the COVID-19 Pandemic Affecting You?"]
	
	public novalCoronaPage() {
		PageFactory.initElements(driver, this);}

	public String validateHomePage() {
		return driver.getTitle();}

public viewAllPages clickViewLatestNews() {
	LatestNewsViewAll.click();
	return new viewAllPages();
	
	
}
public boolean Covid19PandamicImage() {
	return DisplayCovid19Pandmic.isDisplayed();
}
}
