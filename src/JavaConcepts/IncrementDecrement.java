package JavaConcepts;

public class IncrementDecrement {

	public static void main(String[] args) {

		//PostIncrement Operator
		int i=1;
		int j = i++; //j=1 ---> i = i+1=2
		System.out.println(i); //2
		System.out.println(j);//1

		System.out.println("****************");
		
		//PreIncrement Operator
		int a=1;
		int b=++a; //b=2 a=2
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("****************");
		
		//PostDecrement Operator
		int m=2;
		int n=m--; //n=2 //m=1
		System.out.println(m);
		System.out.println(n);
		
		System.out.println("****************");
		
		//PreDecrement Operator
		int p=2;
		int q=--p;
		System.out.println(p);
		System.out.println(q);
	}

}
