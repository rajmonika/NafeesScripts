package Collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Apple");
		h1.put(2, "Orange");
		h1.put(3, "Grapes");
		System.out.println("Values of H1: "+h1);
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2 = (Hashtable<Integer, String>) h1.clone();
		System.out.println("Values of H2 is: "+h2);
		
		if(h1.equals(h2))
		{
			System.out.println("Both the Hashtables are equal");
		}
		
		System.out.println("Value of Key2 is: "+h1.get(2));
		
		System.out.println(h1.contains("Apple"));
		
		System.out.println("Hashcode of h1 is: "+h1.hashCode());
		
		h2.clear();
		System.out.println("Values of H2 is: "+h2);

	}

}
