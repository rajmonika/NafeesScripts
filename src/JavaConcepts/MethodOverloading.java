package JavaConcepts;

public class MethodOverloading {
	
	public void Sum(int a, int b)
	{
		int c = a+b;
		System.out.println("Sum method 1: "+c);
	}
		
	public void Sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("Sum method 2: "+d);
	}
	
	public void Sum(String a)
	{
		System.out.println("Sum method 3: "+a);
	}
	

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();
		m.Sum(10, 20, 30);
		m.Sum("Hello");
		m.Sum(100,20);

	}

}
