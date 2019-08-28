package TestNGConcepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreDemo {
	
	 @Test
	  public void Test2() {
		  System.out.println("Test case 2 - Validating Google Logo");
	  }
	  
	 @Ignore
	  @Test
	  public void Test4() {
		  System.out.println("Test case 4 - Gmail");
	  }
	
	  @Test
		public void Test1() {
			  System.out.println("Test case 1 - Validating Google title");
		  }
	  
	  @Ignore
	  @Test
	  public void Test3() {
		  System.out.println("Test case 3 - Doing Google Search");
	  }


}
