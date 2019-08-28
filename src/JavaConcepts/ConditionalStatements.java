package JavaConcepts;

public class ConditionalStatements {

	public static void main(String[] args) {

		int a = 50;
		int b = 60;
		int c = 40;
		
		if(a>b && a>c)
		{
			System.out.println("A is bigger");
		}
		else if (b>a && b>c)
		{
			System.out.println("B is bigger");
		}
		else
		{
			System.out.println("C is bigger");
		}

	}

}
