package JavaConcepts;

public class AbstractChild extends AbstractParent {
	
	int z = 5;

	public static void main(String[] args) {
		AbstractChild ac = new AbstractChild();
		System.out.println(ac.draw());

	}

	@Override
	public int draw() {
		sides = 4;
     area = sides * sides;
		return area;
	}
	
	public void display()
	{
		z = 10;
	}

}
