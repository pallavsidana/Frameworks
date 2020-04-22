package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	By signinlink=By.xpath("//a[@class='signin']");
	By username=By.id("login1");
	By password=By.name("passwd");
	By singinbttn= By.xpath("//input[@class='signinbtn']");
	
	public WebElement SignLink() {
		return driver.findElement(signinlink);
	}
	public WebElement UserName() {
		return driver.findElement(username);
	}
	public WebElement Password() {
		return driver.findElement(password);
		}
	public WebElement SignButton() {
		return driver.findElement(singinbttn);
	}


}

