package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	WebDriver driver;
	@BeforeTest(description ="this will execute before the test" )
		public void SetUp() {
			System.setProperty("webdriver.chrome.driver", "C:\\pallav\\Selenium\\chrome-80\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
	
			driver.manage().window().maximize();
		}
		
		@Parameters("URL")
		@Test
		public void openBrowser(String urlname) {
			
			driver.get(urlname);
			//Assert.assertTrue(false);
			Assert.assertTrue(true);			
		}
		
		
}

