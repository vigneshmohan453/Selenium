package TestNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginScenario {

	@BeforeTest
	public void beforetest()
	{
		System.out.println("1");
	}
	@AfterTest
	public void aftrtest()
	{
		System.out.println("2");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("3");
	}
	@AfterMethod
	public void aftrMetthod()
	{
		System.out.println("4");
	}

	@BeforeClass
	public void beforecls()
	{
		System.out.println("5");
	}
	@AfterClass
	public void aftrcls()
	{
		System.out.println("6");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("7");
	}
	@AfterSuite
	public void aftrSuite()
	{
		System.out.println("8");
	}

	@Test
	public void a()
	{
		System.out.println("Hello");
	}
}

