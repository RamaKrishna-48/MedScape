package com.crm.qa.WebTableHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devi\\Desktop\\java\\selenium\\eclipse-epsilon-1.5-win32\\eclipse\\workspace\\CRM\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//alert with ok cancel link
		
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id="customers"]/tbody/tr[1]/th[1]
		
		//*[@id="customers"]/tbody/tr[7]/td[1]
		//*[@id="customers"]/tbody/tr[2]/td[1]
		
		
	
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		int rowCount=rows.size();
		System.out.println("Total rows in webTable: +");
		
		
		String beforeXpath= "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath= "]/td[1]";
		
		for(int i=2; i<=rowCount; i++) {
			String actualXpath=beforeXpath+i+afterXpath;
		WebElement element=	driver.findElement(By.xpath(actualXpath));
		System.out.println(element.getText());
		
		if(element.getText().equals("Island Trading")) {
			System.out.println("Companey name : "+ element.getText() + "is found" + "at position : "+(i-1));
		break;
		}
		}
		System.out.println("*********");
	
	String ofterxpathContact="]/td[2]";
	for(int i=2; i<=rowCount; i++) {
		String acatualXpath=beforeXpath+i+ofterxpathContact;
		WebElement element=	driver.findElement(By.xpath(acatualXpath));
		System.out.println(element.getText());
		
		
	}
	System.out.println("***********");
	
	
	
	
	String ofterxpathContacts="]/td[3]";
	for(int i=2; i<=rowCount; i++) {
		String acatualXpath=beforeXpath+i+ofterxpathContacts;
		WebElement element=	driver.findElement(By.xpath(acatualXpath));
		System.out.println(element.getText());

}
//handle webtable columns	
	//*[@id="customers"]/tbody/tr[1]/th[1]
	
	String colBeforeXpath="//*[@id=\"customers\"]/tbody/tr[1]/th[";
	String colAfterxpath="]";
	List<WebElement> col=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th"));
	int colCount=col.size();
	System.out.println("Total numburs of col counts are: "+ colCount);
	
	for(int i=1; i<=colCount;i++) {
		WebElement element=	driver.findElement(By.xpath(colBeforeXpath+i+colAfterxpath));
		
		String colText=element.getText();
		System.out.println("Columns values are: ");
		System.out.println(colText);

		
	}
	
	}

}
