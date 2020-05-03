package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static WebEventListener eventListener;
	public static EventFiringWebDriver eventdriver;
	
	public TestBase() {
		
		try {
			prop=new Properties();
			FileInputStream file=new FileInputStream("C:\\Users\\devi\\Desktop\\java\\selenium\\eclipse-epsilon-1.5-win32\\eclipse\\workspace\\CRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(file);
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
public static void initialazation() {
	String browsername=prop.getProperty("browser");
	if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devi\\Desktop\\java\\selenium\\eclipse-epsilon-1.5-win32\\eclipse\\workspace\\CRM\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}else
		if(browsername.equals("ff")) {
			System.setProperty("webdriver.gecho.driver", "");
			driver= new FirefoxDriver();
			
		}
	eventdriver=new EventFiringWebDriver(driver);
	eventListener= new WebEventListener();
	eventdriver.register(eventListener);
	driver=eventdriver;
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	driver.findElement(By.xpath("//a[@class='login-link']")).click();
}
}
