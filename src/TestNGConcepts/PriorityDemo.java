package TestNGConcepts;

import org.testng.annotations.Test;

public class PriorityDemo {
	  
	  @Test(priority = 3)
	  public void Test2() {
		  System.out.println("Test case 2 - Validating Google Logo");
	  }
	  	  
	  @Test(priority = 1)
	  public void Test4() {
		  System.out.println("Test case 4 - Gmail");
	  }
	
	  @Test(priority = 2)
		public void Test1() {
			  System.out.println("Test case 1 - Validating Google title");
		  }
	  
	  @Test(priority = 4)
	  public void Test3() {
		  System.out.println("Test case 3 - Doing Google Search");
	  }

}
