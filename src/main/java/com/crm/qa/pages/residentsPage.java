package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class residentsPage extends TestBase {
	
	
	@FindBy(xpath="//a[@href=\"https://www.medscape.com/resource/coronavirus\"]")
	WebElement SpecialCoverageCovid19;

	
	@FindBy(xpath="//img[@alt=\"See A Map for Coronavirus Spread, Latest Updates\"]")
	WebElement MapforCoronavirusSpread;
	//img[@alt="See A Map for Coronavirus Spread, Latest Updates"]

	public residentsPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickSpecialCoverageCovid19() {
		SpecialCoverageCovid19.click();
		
	}
	public void MapforCoronavirusSpread() {
		MapforCoronavirusSpread.isDisplayed();
		
	}
}

