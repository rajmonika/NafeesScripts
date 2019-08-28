package JavaConcepts;

public class InhChild extends InhParent{
	
	double d = 12.89;
	char c = 'A';
	
	public void Pchild()
	{
		System.out.println("Child Method");
	}
	
	public void Pmethod()
	{
		super.Pmethod(); //call parent method --original copy --not modified
		System.out.println("Parent method ---- modified in child class"); ///modified method
	}
	
	public void GPmethod()
	{
		super.GPmethod();
		System.out.println("Grand Parent method --- modified in child class");
	}

	public static void main(String[] args) {

		InhChild cobj = new InhChild();
		System.out.println("Child variable 1: "+cobj.d);
		System.out.println("Child variable 2: "+cobj.c);
		
		cobj.Pchild();
		
		System.out.println("Parent variable 1: "+cobj.a);
		System.out.println("Parent variable 2: "+cobj.x);
		cobj.Pmethod();
		
		System.out.println("Grand Parent variable 1: "+cobj.z);
		System.out.println("Grand Parent variable 2: "+cobj.s);
		cobj.GPmethod();
		
		

	}

}
