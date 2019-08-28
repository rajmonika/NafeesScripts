package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		int a[] = new int[3]; //static array - size is fixed
		a[0]=10;
		
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(30);
		ar.add(50);
		ar.add(100);
		
		System.out.println("Size of ArrayList: "+ar.size());
		
		System.out.println("Element at index 3"+ar.get(3));
		
		ar.add(150);
		ar.add(200);
		ar.add("Hello");
		ar.add("Java");
		ar.add('A');
		ar.add(34.790);
		
		System.out.println("Size of ArrayList: "+ar.size());
		
		//To print all the values in the ArrayList
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<String> ar1 = new ArrayList<String>(); //Generic Array List
		ar1.add("Hello");
		ar1.add("Automation");
		ar1.add("Java");
		
		System.out.println(ar1.size());
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("TestNG");
		ar2.add("Maven");
		ar2.add("Jenkins");
		ar2.add("Automation");
		ar2.add("Java");
		
		ar1.addAll(ar2);
		
		//To print all the values in the ArrayList
		System.out.println("Elements of ar1 & ar2 together: ");
				for(int i=0; i<ar1.size();i++)
				{
					System.out.println(ar1.get(i));
				}
		
		ar1.removeAll(ar2);
		System.out.println("Remaining elements in ar1: ");
		for(int i=0; i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		System.out.println("Retaining elements in ar1: ");
		
		ar1.retainAll(ar2);
		for(int i=0; i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
	}

}
