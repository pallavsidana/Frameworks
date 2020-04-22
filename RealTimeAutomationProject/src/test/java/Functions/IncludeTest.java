package Functions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class IncludeTest {

	@BeforeClass
	public void beforeClass() {
		System.out.println("this will execute before class...");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("this will execute after class...");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" i will run before suite");
	}
	@Test(description = " this is for including the test in testng")
	public void includeTest() {
		System.out.println("including this ....includeTest");
	}
	@Test(description = " this is for including the test in testng")
	public void includeTest2() {
		System.out.println("including this ....includeTest2");
	}
	@Test(description = " this is for including the test in testng")
	public void includeTest3() {
		System.out.println("including this ....includeTest3");
	}
	@Test(description = " this is for including the test in testng")
	public void includeTest4() {
		System.out.println("including this ....includeTest4");
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

	@AfterSuite
	public void afterSuite() {
		System.out.println(" will be executing after suite execution completed");
	}

}

