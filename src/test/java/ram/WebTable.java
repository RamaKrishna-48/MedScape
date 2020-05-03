package ram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\devi\\Desktop\\java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://opensource.demo.orangehrmllive.com/");
		
		
		////*[@id="customers"]/tbody/tr[2]/td[1]
		
		
		/*String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		
		//tr is rows
		List <WebElement> rows = driver.findElement(By.xpath("//*[@id=\"customers\"]//tr"));
		
		System.out.println("total number of rows= "+ rows.size());
		int rowCount = rows.size();
		for(int i=2; i<=rowCount; i++) {
			String actualXpath = beforeXpath+i+afterXpath;
			
			String companeyName =driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(companeyName);*/
			
		
		

	}

	
}
