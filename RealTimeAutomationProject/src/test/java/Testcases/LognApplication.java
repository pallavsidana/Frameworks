package Testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Functions.locators;
import ObjectRepository.CreateNewAccount;
import ObjectRepository.CreateNewAccountusingFindBy;
import ObjectRepository.LoginPage;
import ObjectRepository.LoginPagePageFactoryUsingFindBy;

public class LognApplication {
	WebDriver driver;

	public String ExpectedResult="Yippie! The ID you've chosen is available.";

	//@BeforeTest(description ="this will execute before the test" )
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\pallav\\Selenium\\chrome-80\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	}

	@Test()
	public void SetUpDependsOn() {
		System.setProperty("webdriver.chrome.driver", "C:\\pallav\\Selenium\\chrome-80\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	}
	@Test (description = "Login to the rediff Application", priority = 0,dependsOnMethods="SetUpDependsOn")
	public void LoginTest() {


		try {
		/*	LoginPage objLoginPage= new LoginPage(driver);
			objLoginPage.SignLink().click();
			objLoginPage.UserName().sendKeys("pallavsidana");
			objLoginPage.Password().sendKeys("pallav");
			objLoginPage.SignButton().click();
			*/
			
			LoginPagePageFactoryUsingFindBy objLgnPage = new LoginPagePageFactoryUsingFindBy(driver);
			System.out.println(1);
				objLgnPage.SignLink().click();
				System.out.println(2);
				objLgnPage.UserName().sendKeys("pallavsidana");
			objLgnPage.Password().sendKeys("pallav");
			objLgnPage.SignButton().click();
			locators objLocator=new locators(driver);
			Thread.sleep(5000);
			objLocator.NavigateBack();
			//driver.navigate().back();
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//@Test(description = "Create a new Account",priority = 1)
	public void CreateNewAccount() {
		try {
			//CreateNewAccount objCreateAccount = new ObjectRepository.CreateNewAccount(driver);
			CreateNewAccountusingFindBy objCrtAccount = new CreateNewAccountusingFindBy(driver);
			objCrtAccount.CreateNewAccount().click();
			//objCreateAccount.CreateNewAccount().click();
			Thread.sleep(10000);
			//objCreateAccount.Fullname().sendKeys("kashvisidana");
			objCrtAccount.Fullname().sendKeys("kashvisidana");
		//	objCreateAccount.RedifId().sendKeys("kashvisidana");
			objCrtAccount.RedifId().sendKeys("kashvisidana");
			//objCreateAccount.CheckAvalibilityButton().click();
			objCrtAccount.CheckAvalibilityButton().click();
			//check the the text visible is displayed with assertion
			Thread.sleep(10000);
			String actual =objCrtAccount.CheckforText().getText();
			System.out.println(actual);
			assertEquals(actual, ExpectedResult);
		}	 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
