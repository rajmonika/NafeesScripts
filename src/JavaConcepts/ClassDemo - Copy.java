package JavaConcepts;

public class ClassDemo {
	
	public void talk()
	{
		System.out.println("Talking");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping");
	}

	public static void main(String[] args) {
		
		ClassDemo cd = new ClassDemo();
		
		cd.talk();
		cd.sleep();
		


	}

}
