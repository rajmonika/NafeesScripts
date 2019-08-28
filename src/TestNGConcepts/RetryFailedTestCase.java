package TestNGConcepts;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGConcepts.TestNGListeners.class)
public class RetryFailedTestCase {
	
	@Test
	public void test1()
	{
		System.out.println("test method 1");
	}
	
	@Test (retryAnalyzer = TestNGConcepts.RetryAnalyzer.class)
	public void test2()
	{
		System.out.println("test method 2");	
		Assert.assertTrue(false);
	}

	@Test
	public void test3()
	{
		System.out.println("test method 3");
	}

	@Test
	public void test4()
	{
		System.out.println("test method 4");
	}

}
