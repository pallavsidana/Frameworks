package groups;

import org.testng.annotations.Test;
//enabled=false means if in case this has defect then it wont execute the test 
public class Enable {

	@Test(dependsOnMethods="day2")
	public void day1() {
		System.out.println("Monday");
	}
	@Test(groups ="smoke")
	public void day2() {
		System.out.println("Tuesday");
	}
	@Test(enabled=false)
	public void day3() {
		System.out.println("wednessday");
	}
	@Test(timeOut=4000)
	public void day4() {
		System.out.println("thrusay");
	}
	@Test(groups = {"regression","smoke"})
	public void day5() {
		System.out.println("friday");
	}
	@Test(groups ="regression")
	public void day6() {
		System.out.println("satday");
	}@Test(groups ="smoke")
	public void day7() {
		System.out.println("sunday");
	}
}
