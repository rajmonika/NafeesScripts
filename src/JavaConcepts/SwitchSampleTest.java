package JavaConcepts;

public class SwitchSampleTest {

	public static void main(String[] args) {

		char grade = 'B';
		
		switch(grade)
		{
		case 'A':
			System.out.println("Result is Excellent");
			break;
		
		case 'B':
			System.out.println("Well Done");
			break;
			
		case 'C':
			System.out.println("Good");
			break;
			
		case 'D':
			System.out.println("You Passed");
			break;
			
		case 'E':
			System.out.println("Better try again");
			break;
			
			default:
				System.out.println("Invalid Grade");
		}
		System.out.println("Your grade is: "+grade);

	}

}
