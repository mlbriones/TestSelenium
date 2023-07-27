package base;

import org.openqa.selenium.WebDriver;

public class BaseObject {
	
	protected WebDriver driver;
	
	public BaseObject(WebDriver driver){
		this.driver = driver;
	}

}
