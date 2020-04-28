package Calculator;

import org.testng.annotations.Test;

public class Calc {
	@Test
	public void add() {
		int a=10;
		int b=90;
		int c= a+b;
		System.out.println("addition value of c is ::::"+ c);
	}
	
	@Test
	public void Sub() {
		int a=1000;
		int b=90;
		int c= a-b;
		System.out.println("subtrction value of c is ::::"+ c);
	}
	@Test
	public void Mul() {
		int a=1000;
		int b=90;
		int c= a*b;
		System.out.println("multiply value of c is ::::"+ c);
	}

}
