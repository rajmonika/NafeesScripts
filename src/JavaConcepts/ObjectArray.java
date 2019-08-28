package JavaConcepts;

public class ObjectArray {

	public static void main(String[] args) {

		//OBJECT ARRAY - STORES DIFFERENT DATATYPE VALUES
		
		Object obj[] = new Object[4];
		obj[0]=101; //int
		obj[1]="John"; //String
		obj[2]='M'; //char
		obj[3]=7000.65; //double
		
		System.out.println("The value at index 1: "+obj[1]);
		
		System.out.println("Size of obj array: "+obj.length);
		
		System.out.println("All the values in the Object Array: ");
		
		for (int i=0; i<obj.length; i++)
		{
			System.out.println(obj[i]);
		}

	}

}
