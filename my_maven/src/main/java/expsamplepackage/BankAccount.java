package expsamplepackage;

public class BankAccount {
	
	public void payment(int salary) throws SalaryException
	{
		if (salary < 5000) {
			throw new SalaryException("Salary is low");
		}else {
			System.out.println("Payment Processed");
		}
	}

	public static void main(String[] args) throws SalaryException{
		// TODO Auto-generated method stub
		BankAccount obj=new BankAccount();
		obj.payment(2500);

	}

}
