package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set ls = new LinkedHashSet();
		ls.add("ABC");
		ls.add("ABC");
		ls.add("ABC");
		ls.add("DEF");
		ls.add(456);
		ls.add(456);
		ls.add("xyz");
		ls.add("xyz");
		ls.add(123);
		ls.add(34.098);
		
		System.out.println("Contents of Linked HashSet are: "+ls);
		
		ls.clear();
		System.out.println(ls);
		
	 System.out.println(ls.isEmpty());
	 
	 

	}

}
