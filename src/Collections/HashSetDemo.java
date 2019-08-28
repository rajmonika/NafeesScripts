package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set s = new HashSet();
		
		s.add("ABC");
		s.add("ABC");
		s.add("ABC");
		s.add("abc");
		s.add(123);
		s.add(123);
		s.add("xyz");
		s.add("xyz");
		
		System.out.println("Contents of the set1 are: "+s);
		
       Set s1 = new HashSet();
		
		s1.add("ABC");
		s1.add("ABC");
		s1.add("DEF");
		s1.add("abc");
		
		System.out.println("Contents of the set2 are: "+s1);
		
		s.addAll(s1);
		System.out.println("Updated contents of Set1 are: "+s);
		
		System.out.println(s.size());
		
		System.out.println(s.isEmpty());
		

	}

}
