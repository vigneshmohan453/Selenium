package TestNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = "Alpha")
	public void a() {
		System.out.println("A");
	}

	@Test(groups = "Alpha")
	public void b() {
		System.out.println("B");
	}

	@Test(groups = "num")
	public void num1() {
		System.out.println("1");
	}

	@Test(groups = "num")
	public void num2() {
		System.out.println("2");
	}

}
