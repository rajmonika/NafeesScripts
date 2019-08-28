package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set ts = new TreeSet();
		ts.add(123);
		ts.add(456);
		ts.add(100);
		ts.add(19);
		ts.add(50);
		ts.add(250);
		ts.add(95);
		ts.add(5000);
		
		//ts.add("abc"); //Class Cast Exception
		
		System.out.println("Contents of Tree Set are: "+ts);
		
		System.out.println(ts.size());

	}

}
