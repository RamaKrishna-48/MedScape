package com.crm.qa.WebTableHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalanderSelectTest {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devi\\Desktop\\java\\selenium\\eclipse-epsilon-1.5-win32\\eclipse\\workspace\\CRM\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		String date="23 April 2020";
		String dateArr[]=date.split("_");
		String day=dateArr[0];
		String month=dateArr[1];
		String year=dateArr[2];
		
		Select select=new Select(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date1\"]")));
		select.selectByVisibleText(date);

	}
	

}
