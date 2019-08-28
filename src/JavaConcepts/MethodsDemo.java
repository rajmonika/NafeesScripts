package JavaConcepts;

public class MethodsDemo {
	
	int x = 180;
	String s = "java";
	
	public void sum()
	{
		int a, b, c; //Local variable
		a = 10;
		b = 30;
		c = a+b;
		System.out.println("Sum method: "+c);
		System.out.println("Value of x is: "+x);
	}
	
	public void subtract()
	{
		int m,n,o;
		m = 100;
		n = 50;
		o = m-n;
		System.out.println("Subtract method: "+o);
		System.out.println("Value of s is: "+s);
		
	}
	
	public int multiply(int x, int y)
	{
		int z;
		z = x * y;
		System.out.println("Multiply Method: "+z);
		return z;
	}

	public static void main(String[] args) {

		MethodsDemo m = new MethodsDemo();
		m.sum();
		
		m.subtract();
		System.out.println("Calling global variable from Main method: "+m.s);
		
		m.multiply(10, 20);

	}

}
