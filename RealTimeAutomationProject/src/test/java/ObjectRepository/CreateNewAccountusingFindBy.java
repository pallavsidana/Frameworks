package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountusingFindBy {
	WebDriver driver;

	public CreateNewAccountusingFindBy(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// click on Create an account link
	// By createAccount = By.xpath("//a[contains(text(),'Create Account')]");

	@FindBy(xpath = "//*[@id=\"signin_info\"]/a[2]")
	WebElement createAccount;

	// enter the Full name
	// By fullname= By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input");

	@FindBy(xpath = "//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")
	WebElement fullname;

	// chose rediff id
	// By redifId= By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]");

	@FindBy(xpath = "//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")
	WebElement redifId;

	// check for availability button
	// By checkAvalibility=
	// By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]");
	@FindBy(xpath = "//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")
	WebElement checkAvalibility;

	// Check for txt present after click on availability button
	// By checkfortext=By.xpath("//div[@id='check_availability']/font/b");
	@FindBy(xpath = "//div[@id='check_availability']/font/b")
	WebElement checkfortext;

	public WebElement Fullname() {
		return fullname;
	}

	public WebElement RedifId() {
		return redifId;
	}

	public WebElement CheckAvalibilityButton() {
		return checkAvalibility;
	}

	public WebElement CreateNewAccount() {
		return createAccount;
	}

	public WebElement CheckforText() {
		// TODO Auto-generated method stub
		return checkfortext;
	}

}
