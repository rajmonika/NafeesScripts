package JavaConcepts;

public class IntClassUSA implements InterfaceHSBCBank, InterfaceICICIBank {

	public static void main(String[] args) {
		
		IntClassUSA a = new IntClassUSA();
		a.withdraw();
		a.deposit();
		a.transfer();
		a.loans();
		a.min_bal();
		a.educationLoan();
		a.FixedDeposits();
	}

	public void withdraw() {
     System.out.println("HSBC --- withdraw");
		
	}

	public void deposit() {

		System.out.println("HSBC ----deposit");		
	}

	public void transfer() {
     System.out.println("HSBC ------transfer");
		
	}
	
	public void min_bal()
	{
		System.out.println("Global bank ----min bal");
	}
	
	public void loans()
	{
		System.out.println("Global bank ---- Loans");
	}

	public void educationLoan() {
     System.out.println("ICICI bank ---- Education Loan");
		
	}

	public void FixedDeposits() {
     System.out.println("ICICI bank ---- Fixed Deposits");
		
	}

}
