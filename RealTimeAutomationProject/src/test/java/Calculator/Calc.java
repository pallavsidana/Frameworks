package Calculator;

import org.testng.annotations.Test;

public class Calc {
	@Test(description="Addition")
	public void add() {
		int a=10;
		int b=90;
		int c= a+b;
		System.out.println("addition value of c is ::::"+ c);
	}
	
	@Test(description="Substraction")
	public void Sub() {
		int a=100;
		int b=90;
		int c= a-b;
		System.out.println("subtrction value of c is ::::"+ c);
	}
	@Test(description="Multiplication")
	public void Mul() {
		int a=12000;
		int b=90;
		int c= a*b;
		System.out.println("multiply value of c is ::::"+ c);
	}
	@Test(description="Division")
	public void DIV() {
		int a=7000;
		int b=90;
		int c= a/b;
		System.out.println("Division value of c is ::::"+ c);
	}
	@Test(description="Precentage")
	public void Percentage() {
		int a=5000;
		int b=90;
		int c= (a*b)/100;
		System.out.println("Percentage value of c is ::::"+ c);
	}
}
