package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class wedgets extends TestBase {
	
	
	@FindBy(xpath="//a[@data-toggle=\"dropdown\"]")
	WebElement wedgetsPage;
	
	@FindBy(xpath="//a[@class=\"dropdown-toggle\"]")
	WebElement automationPage;


	public wedgets() {
	PageFactory.initElements(driver, this);}
	

   public WebElement clicwedgets() {
	wedgetsPage.click();
	return wedgetsPage;
	
	
}
public void enterTxt() {
	automationPage.click();
}

}