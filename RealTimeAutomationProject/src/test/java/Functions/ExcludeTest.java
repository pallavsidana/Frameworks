package Functions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcludeTest {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println(" i am executing before test methds before execution starts");
	}
	@Test(description = " this is for exclude the test in testng")
	public void excludeTest() {
		System.out.println("exclude this ..excludeTest");
	}
	@Test(description = " this is for exclude the test in testng")
	public void excludeTest2() {
		System.out.println("exclude this ..excludeTest2");
	}
	@Test(description = " this is for exclude the test in testng")
	public void excludeTest3() {
		System.out.println("exclude this ....excludeTest3");
	}
	@Test(description = " this is for exclude the test in testng")
	public void excludeTest4() {
		System.out.println("exclude this ....excludeTest4");
	}
	@AfterTest
	public void afterTest() {
		System.out.println(" i am executing after test methds execution ends");
	}
	

	@AfterMethod
	public void afterMEthod() {
		System.out.println("i will execute after each method execute");
	}
	
	@BeforeMethod
	public void beforeMEthod() {
		System.out.println("i will execute before each method execute");
	}
}
