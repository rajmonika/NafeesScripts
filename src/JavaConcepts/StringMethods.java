package JavaConcepts;

public class StringMethods {

	public static void main(String[] args) {

		int a=10;
		int b=10;
		if(a==b)
		{
			System.out.println("a and b are equal");
		}
		
		String s1 = "INDIA";
		String s2 = "India";
		 
		//To compare two Strings
		System.out.println(s1.equals(s2));
		
		//To convert to lowercase
		System.out.println(s1.toLowerCase());
		
		//To convert to Uppercase
		System.out.println(s2.toUpperCase());
		
		//To get the size of the String
		System.out.println(s1.length());
		
		String s3 = "ManualAutomationJavaQTPManual";
		
		//To replace part of the String
		System.out.println(s3.replace("Manual", "Selenium"));
		
		//To replace the first occurrence of the character
		System.out.println(s3.replaceFirst("Manual", "Selenium"));
		
		//To retrieve char at a particular index
		System.out.println(s3.charAt(9)); //index always starts from zero
		
		//To retrieve index of a char in a String
		System.out.println(s3.indexOf("Q"));
		int index = s3.indexOf("Q");
		
		//To retrieve index of second char
		System.out.println(s3.indexOf("T", index+1));
		
		String s4 = "  Hello  ";
		System.out.println(s4);
		
		//To remove extra white spaces before and after the String
		System.out.println(s4.trim());
		
		String s5="Java    Selenium     Manual     Automation      Learning";
		System.out.println(s5);
		
		//Replacing space with no space
		System.out.println(s5.replace(" ", ""));

	}

}
