package JavaConcepts;

public class ParameterConstructor {
	
	String empName, empId, empDesg, empSalary;
	
	public ParameterConstructor(String empName, String empId, String empDesg, String empSalary)
	{
		this.empName = empName;
		this.empId = empId;
		this.empDesg = empDesg;
		this.empSalary = empSalary;
	}
	

	public static void main(String[] args) {

		ParameterConstructor e1 = new ParameterConstructor("Tom","101","Manager","$8000");
		System.out.println("Employee 1 Details:");
		System.out.println(e1.empName);
		System.out.println(e1.empId);
		System.out.println(e1.empDesg);
		System.out.println(e1.empSalary);
		
		
		ParameterConstructor e2 = new ParameterConstructor("John","102","Admin","$9000");
		System.out.println("Employee 2 Details:");
		System.out.println(e2.empName);
		System.out.println(e2.empId);
		System.out.println(e2.empDesg);
		System.out.println(e2.empSalary);
		

	}

}
