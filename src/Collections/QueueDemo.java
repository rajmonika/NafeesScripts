package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<String> q = new PriorityQueue<String>();
		
		q.add("Test1");
		q.add("Test2");
		q.add("Test3");
		q.add("Test4");
		
		System.out.println("Contents of the Queue: "+q);
		
		System.out.println("head element: "+q.element()); //retrieves the head element and no value is returned
		
		q.remove(); //removes the head element and no value is returned
		System.out.println("Updated Contents of the Queue: "+q);
		
		System.out.println("Printing Queue elements using Iterator method:");
		Iterator itr = q.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		q.clear(); //clears out the entire queue
		System.out.println(q);
		
		System.out.println("Head Element remaining: "+q.poll()); //poll removes head element and returns null if q is empty
		
		System.out.println("Head element: "+q.peek()); //peek retrieves head element and returns null if q is empty

	}

}
