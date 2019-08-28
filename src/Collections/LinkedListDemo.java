package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {


		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("Test1");
		ll.add("Test2");
		ll.add("Test3");
		ll.add("Test4");
		
		System.out.println("Contents of the List are: "+ll);
		
		//addFirst
		ll.addFirst("Tom");
		System.out.println("Contents of the List are: "+ll);
		
		//addLast
		ll.addLast("Jerry");
		System.out.println("Contents of the List are: "+ll);
		
		System.out.println("Value at index 0 : "+ll.get(0));
		
		ll.set(2, "Test 2 REPLACED");
		System.out.println("Contents of the List are: "+ll);
		
		ll.removeFirst();
		System.out.println("Contents of the List are: "+ll);
		
		ll.removeLast();
		System.out.println("Contents of the List are: "+ll);
		
		ll.remove(1);
		System.out.println("Contents of the List are: "+ll);
		
		//How to print values of Linked List:
		
		//for Loop method
		System.out.println("*******Printing using For Loop*********");
		for(int i=0; i<ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}
		
		//for each Loop
		System.out.println("*******Printing using For Each Loop*********");
		for(String l : ll)
		{ 
			System.out.println(l);
		}
		
		//Iterator
		System.out.println("*******Printing using Iterator*********");
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//While Loop
		System.out.println("*******Printing using While Loop*********");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
		
		

	}

}
