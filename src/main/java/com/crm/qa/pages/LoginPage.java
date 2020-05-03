package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath="//*[@id='regularEmail']")
	WebElement username;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='loginBtn']")
	WebElement lgnBtn;
	
	@FindBy(xpath="//*[@id=\"headerbox\"]/div[2]/a/img")
	WebElement MedScapeLogo;


public  LoginPage() {
	PageFactory.initElements(driver, this);
	
}
public String validateLoginPage() {
	return driver.getTitle();
	
	
}
public boolean  validateLOGINpGE() {
	return MedScapeLogo.isDisplayed();
}
public HomePage login(String un, String pwd) {
	username.sendKeys(un);
	password.sendKeys(pwd);
	lgnBtn.click();
	
	return new HomePage();
}

}
