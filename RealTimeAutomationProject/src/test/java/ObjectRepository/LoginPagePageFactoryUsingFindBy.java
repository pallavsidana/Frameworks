package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePageFactoryUsingFindBy {

	
	WebDriver driver;
	public LoginPagePageFactoryUsingFindBy(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	/*
	 * By signinlink=By.xpath("//a[@class='signin']"); 
	 * By username=By.id("login1");
	 * By password=By.name("passwd"); By singinbttn=
	 * By.xpath("//input[@class='signinbtn']");
	 */	

	@FindBy(xpath="//*[@id=\"signin_info\"]/a[1]")
	WebElement signinlink;
	
	@FindBy(name="passwd")
	WebElement passwords;
	
	@FindBy(id="login1")
	WebElement username;
	
	@FindBy (xpath="//input[@class='signinbtn']")
	WebElement button;
	
	public WebElement SignLink() {
		return signinlink;
	}
	public WebElement UserName() {
		return username;
	}
	public WebElement Password() {
		return passwords;
	}
	
	public WebElement SignButton() {
		return button;
	}


}

