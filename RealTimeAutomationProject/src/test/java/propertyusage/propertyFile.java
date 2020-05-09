package propertyusage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class propertyFile {

	WebDriver driver;
	static String projectPath=System.getProperty("user.dir");
	Properties prop= new Properties();

	@Test
	public void getPropertyTest() throws FileNotFoundException {

		try {
			InputStream inputstream = new FileInputStream(projectPath+"/src/test/java/conf/config.properties");
			prop.load(inputstream);
			String url=prop.getProperty("url");
			System.out.println(url);
			System.setProperty("webdriver.chrome.driver", "C:\\pallav\\Selenium\\chrome-80\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void setValueInPropertyFile() {
		//set the value back to the property file
		try {
			OutputStream output = new FileOutputStream(projectPath+"/src/test/java/conf/config.properties");
			prop.setProperty("url", "www.amazon.in");
			prop.store(output, null);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
