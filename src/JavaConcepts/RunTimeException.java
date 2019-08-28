package JavaConcepts;

public class RunTimeException {
	
	public static void main(String[] args) {
		
		/*int a =2;
		int b = 0;
		
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
			System.out.println("Program Execution Completed");
			
		}*/
		
		String s = null;
		try {
			System.out.println(s.length());
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
			
		}
		finally
		{
			System.out.println("Finally --- Last statement");
		}
	}

}
