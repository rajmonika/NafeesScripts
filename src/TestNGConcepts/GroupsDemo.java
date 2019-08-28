package TestNGConcepts;

import org.testng.annotations.Test;

@Test(groups = "AllClassTests")
public class GroupsDemo {
	
	@Test (groups = {"Regression", "Unit"})
	public void test1()
	{
		System.out.println("This is Test1");
	}
	
	@Test (groups = "Smoke")
	public void test2()
	{
		System.out.println("This is Test2");
	}

	@Test (groups = "Regression")
	public void test3()
	{
		System.out.println("This is Test3");
	}

	@Test (groups = "Unit")
	public void test4()
	{
		System.out.println("This is Test4");
	}

	@Test (groups = {"Smoke", "Unit"})
	public void test5()
	{
		System.out.println("This is Test5");
	}

	@Test (groups = "Regression")
	public void test6()
	{
		System.out.println("This is Test6");
	}


}
