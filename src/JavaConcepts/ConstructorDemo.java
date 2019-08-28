package JavaConcepts;

public class ConstructorDemo {
	
	String name, color;
	
	public ConstructorDemo()
	{
		name = "mango";
		color = "yellow";
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Color: "+color);
	}
	

	public static void main(String[] args) {
		
		ConstructorDemo cd = new ConstructorDemo();
		cd.display();


	}

}
