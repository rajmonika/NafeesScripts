package JavaConcepts;

public class InhParent extends InhGrandParent{
	
	int a=10;
	String x = "Java";
	
	public void Pmethod()
	{
		System.out.println("Parent Method");
	}
	
	public void GPmethod()
	{
		super.GPmethod();
		System.out.println("Grand Parent method --- modified in Parent class");
	}

	public static void main(String[] args) {

		InhParent pobj = new InhParent();
		System.out.println("Parent variable 1: "+pobj.a);
		System.out.println("Parent variable 2: "+pobj.x);
		
		pobj.Pmethod();
		
		pobj.GPmethod();

	}

}
