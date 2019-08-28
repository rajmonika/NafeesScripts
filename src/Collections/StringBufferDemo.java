package Collections;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("GeeksForGeeks");
		System.out.println("Length of S: "+s.length());
		System.out.println("Capacity of S: "+s.capacity());

		s.append("TEST");
		System.out.println("Updated s: "+s);
		
		s.insert(0, "Hello");
		System.out.println("Updated s: "+s);
		
		s.reverse();
		System.out.println("Reverse of S is: "+s);
		
		s.delete(0, 4);
		System.out.println("Updated s: "+s);
		
		s.deleteCharAt(4);
		System.out.println("Updated s: "+s);
		
		s.replace(0, 6, "Selenium");
		System.out.println("Updated s: "+s);
		
		System.out.println(s.substring(3, 7));
		
		
		
	}

}
