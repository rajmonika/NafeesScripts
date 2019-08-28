package TestNGConcepts;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void LoginTest()
	{
		System.out.println("Login Test");
	}

	@Test (dependsOnMethods = "LoginTest")
	public void HomePageTest()
	{
		System.out.println("Home Page Test");
		int i = 7/0;
	}

	@Test
	public void SearchPage()
	{
		System.out.println("Search Page Test");
	}

	@Test (dependsOnMethods = "HomePageTest")
	public void CartPage()
	{
		System.out.println("Cart Page Test");
	}

}
