package JavaConcepts;

public class CallByRefValue {
	
	int p, q;
	
	public int Sum(int a, int b)
	{
		a = 30;
		b = 40;
		int c = a+b;
		System.out.println("Value of Method Sum is: "+c);
		return c;
	}
	
	public void swap(CallByRefValue t)
	{
		int temp;
		temp = t.p; //temp = 50
		t.p = t.q; // p = 60
		t.q = temp; //q = 50
	}

	public static void main(String[] args) {

		CallByRefValue obj = new CallByRefValue();
		obj.Sum(10, 20); //Call by Value
		
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		System.out.println("P value after swap is: "+obj.p);
		System.out.println("Q value after swap is: "+obj.q);
		

	}

}
