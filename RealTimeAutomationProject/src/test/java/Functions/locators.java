package Functions;

import org.openqa.selenium.WebDriver;

public class locators {
	WebDriver driver;
	public locators(WebDriver driver) {
		this.driver=driver;
	}
	
	public void NavigateBack() {
		driver.navigate().back();
	}

}
