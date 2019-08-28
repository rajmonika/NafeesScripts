package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Selenium");
		hm.put(2, "Java");
		hm.put(3, "TestNG");
		
		System.out.println(hm.get(3));
		
		for(Entry<Integer, String> m: hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println(hm);
		
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee(101, "John",'M');
		Employee e2 = new Employee(102, "Rita", 'F');
		
		emp.put(1, e1);
		emp.put(2, e2);
		
		for(Entry<Integer, Employee> p: emp.entrySet())
		{
			int key = p.getKey();
			Employee e = p.getValue();
			
			System.out.println(key +" "+e.EmpID +" "+ e.name +" "+ e.gender);
		}
		
		

	}

}
