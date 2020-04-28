package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewAccount {
	WebDriver driver;
	public CreateNewAccount(WebDriver driver) {
		this.driver=driver;
	}
	//click on Create an account link
	By createAccount = By.xpath("//*[@id=\"signin_info\"]/a[2]");
	//enter the Full name
	By fullname= By.xpath("//input[@name=\\\"nameed63158d\\\"]");
	//chose rediff 
	By redifId= By.xpath("//input[@name=\\\"logined63158d\\\"]");
	//check for availability button
	By checkAvalibility= By.xpath("btnchkavailed63158d");
	
	//Check for txt present after click on availability button
	By checkfortext=By.xpath("//div[@id='check_availability']/font/b");

	public WebElement Fullname() {
		return driver.findElement(fullname);
	}

	public WebElement RedifId() {
		return driver.findElement(redifId);
	}
	public WebElement CheckAvalibilityButton() {
		return driver.findElement(checkAvalibility);
	}


	public WebElement CreateNewAccount() {
		return driver.findElement(createAccount);
	}

	

	public WebElement CheckforText() {
		// TODO Auto-generated method stub
		return driver.findElement(checkfortext);
	}
	

}



