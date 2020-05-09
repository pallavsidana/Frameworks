package propertyusage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenBrowser {

	WebDriver driver;
	static String path = System.getProperty("user.dir");
	Properties prop = new Properties();

	// public static String browsername=null;
	@Test
	public void openBroser() {

		try {

			InputStream input = new FileInputStream(path + "/src/test/java/conf/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			System.out.println(1);
			String url = prop.getProperty("url");
			if (browser.equalsIgnoreCase("chrome")) {

				System.out.println(2);
				System.setProperty("webdriver.chrome.driver",
						"C:\\pallav\\Selenium\\chrome-80\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println(3);
				System.out.println(url);
				System.out.println(4);
				driver.manage().window().maximize();
				driver.get(url);

			} else if (browser.equalsIgnoreCase("firefox")) {
				System.out.println(2);
				System.setProperty("webdriver.chrome.driver",
						"C:\\pallav\\Selenium\\chrome-80\\chromedriver_win32\\firefoxdriver.exe");
				driver = new FirefoxDriver();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
