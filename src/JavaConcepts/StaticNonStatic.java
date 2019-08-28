package JavaConcepts;

public class StaticNonStatic {
	
	String name = "Tom";
	
	static int age = 25;

	public void sum()
	{
		int a= 100;
		int b = 50;
		int c = a+b;
		System.out.println("Value of Sum method is: "+c);
	}
	
	public static void divide()
	{
		int p = 600;
		int q = 20;
		int r = p/q;
		System.out.println("Value of Divide method is: "+r);
	}
	
	public static void main(String[] args) {
		
		StaticNonStatic obj = new StaticNonStatic();
		System.out.println("Name: "+obj.name);
		
		System.out.println("Age: "+age);
		
		obj.sum();
		divide();

		

	}

}
