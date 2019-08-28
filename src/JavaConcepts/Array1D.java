package JavaConcepts;

public class Array1D {

	public static void main(String[] args) {

		int a[] = new int[7];
		
		//lowest bound index = 0
		//upper bound index = 6
		
		a[0]=12;
		a[1]=30;
		a[2]=50;
		a[3]=80;
		a[4]=100;
		a[5]=150;
		a[6]=180;
		
		System.out.println("The value stored at index 2 :"+a[2]);
		//System.out.println(a[7]);
		
		System.out.println("Size of the Array "+a.length);
		System.out.println("Array values: ");
		
		//To print all the values of the Array
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

	
	
	/* double d[] = new double[4];
	String s[] = new String[5];
	char c[] = new char[3];
	boolean b[] = new boolean[6]; */
	
	
	}
}
