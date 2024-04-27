package TestNG;

import org.testng.annotations.Test;

public class ByUsingInvocationCount
{
	@Test(invocationCount=10)
	public void Register()
	{
		System.out.println("Successfully register");
	}


	@Test(priority=2)
	public void login()
	{
		System.out.println("Successfully login");
	}



	@Test(priority=3)
	public void addToCart()
	{
		System.out.println("Successfully added to cart");
	}


	@Test(priority=4)
	public void logOut()
	{
		System.out.println("Successfully LogOut");
	}


	
}
