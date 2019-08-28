package JavaConcepts;

public class BaccessModifier extends AaccessModifier {
	
	public void Bdisplay()
	{
		System.out.println(x);
	}

	public static void main(String[] args) {

		BaccessModifier b = new BaccessModifier();
		System.out.println(b.x);
		b.Adisplay();
		
		AaccessModifier a = new AaccessModifier();
		System.out.println(a.x);
		a.Adisplay();

	}

}
