package JavaConcepts;

public class WrapperClass {

	public static void main(String[] args) {
 
		//Data conversion: String to Int
		String x = "100";
		System.out.println(x+20);
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to double conversion
		String y = "12.34";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to Boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//Integer to String conversion
		int j = 200;
		System.out.println(j+20);
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		//If given string is alphanumeric
		String u = "100A";
		int z = Integer.parseInt(u);
		System.out.println(z);
	}

}
