package automation.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestUtIll.TestRamUtill;

public class datadrivenFromExcellSheet {
	WebDriver driver;
	
	@BeforeMethod
	public void set() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\devi\\Desktop\\java\\selenium\\eclipse-epsilon-1.5-win32\\eclipse\\workspace\\CRM\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
	}
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData=TestRamUtill.getDataFromExcel();
		return testData.iterator();
	
	/*public Iterator<Object[]> getTestData(){
		ArrayList<Object[]> testData=TestUtility.getDataFromExcel();
		return testData.iterator();*/
	}
	@Test(dataProvider="getTestData")
	public void registrationTest(String firstname, String lastname, String address, String email,  String phone, String skill, String count, String year, String month, String day, String fp, String lp ) {
	
	
		driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]")).clear();
		driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).clear();
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys(lastname);
		
		
		
		driver.findElement(By.xpath("//textarea[@class=\"form-control ng-pristine ng-untouched ng-valid\"]")).clear();
		driver.findElement(By.xpath("//textarea[@class=\"form-control ng-pristine ng-untouched ng-valid\"]")).sendKeys(address);
		
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).clear();
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).clear();
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@name=\"radiooptions\"]"));
		driver.findElement(By.xpath("//input[@name=\"radiooptions\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Cricket\"]"));
		driver.findElement(By.xpath("//input[@value=\"Cricket\"]")).click();
		
		
		
		//div[@id="msdd"]
		
		/*Select select=new Select(driver.findElement(By.xpath("//*[@id=\"msdd\"]")));
		select.selectByVisibleText(languges);
		System.out.println(select.getOptions().size());*/
		
		
		Select skills=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		skills.selectByVisibleText(skill);
		System.out.println(skills.getOptions().size());
		
		
		Select country=new Select(driver.findElement(By.xpath("//select[@id=\"countries\"]")));
		country.selectByVisibleText(count);
		System.out.println(country.getOptions().size());
		
	
		WebElement ram = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
        ram.sendKeys(year);

        WebElement krishna = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));

       

        krishna.sendKeys(month);
        
        WebElement ra = driver.findElement(By.xpath("//select[@id=\"daybox\"]"));

       

        ra.sendKeys(day);
        

      
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(fp);
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(lp);
		
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
		
	}

}
