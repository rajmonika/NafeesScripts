package JavaConcepts;

public class InhGrandParent {
	
	int z = 100;
	String s = "Java";
	
	public void GPmethod()
	{
		System.out.println("Grand Parent method");
	}

	public static void main(String[] args) {

		InhGrandParent gpobj = new InhGrandParent();
		
		System.out.println("Grand Parent variale 1: "+gpobj.z);
		System.out.println("Grand Parent variale 2: "+gpobj.s);
		
		gpobj.GPmethod();

	}

}
