package groups;

import org.testng.annotations.Test;

public class dependson {


	@Test(dependsOnMethods="day2")
	public void day1() {
		System.out.println("Monday");
	}
	@Test(groups ="smoke")
	public void day2() {
		System.out.println("Tuesday");
	}
	@Test(groups ="regression")
	public void day3() {
		System.out.println("wednessday");
	}
	@Test(groups ="smoke")
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
