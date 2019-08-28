package TestNGConcepts;

import org.testng.annotations.Test;

public class ExceptionHandling {
	
	@Test (expectedExceptions = Exception.class)
	public void test1()
	{
		int i = 8/0;
		System.out.println(i);
	}

	@Test (expectedExceptions = Exception.class)
	public void test2()
	{
		String x = "100A";
		int j = Integer.parseInt(x);
		System.out.println(j);
	}
}
