package JavaConcepts;

public class WhileLoop {

	public static void main(String[] args) {

		/*while(condition)
		{
			statements;
		}*/
		
		//Display numbers from 1 to 10
		
		int i = 1; //initialisation
		
		while(i<=10) //condition
		{
			System.out.println(i); //1 //2 //3 ...........//9 //10
			i = i+1; //incrementing
		}
		
		System.out.println("******************************");

		//Display numbers from 1 to 20
		
		/*do
		{
			statement;
		}while(condition) */
		
		int j=1;
		do
		{
			System.out.println(j);
			j = j+1;
		}while (j<=20);
	}

}
