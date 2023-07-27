package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.logging.log4j.*;
public class BaseTestCase {
	
	protected WebDriver driver;
	
	private Logger log = LogManager.getLogger("BaseTestCase");
	
	
	
	public void Setup() {
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		
		 driver.manage().window().maximize();
		
	}
	
	public void search() {
		
		driver.findElement(By.id("APjFqb")).sendKeys("Hello");
		
		log.info("This is info");
	}
}