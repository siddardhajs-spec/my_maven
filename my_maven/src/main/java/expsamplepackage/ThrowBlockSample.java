package expsamplepackage;

public class ThrowBlockSample {
	
	public static void display(int age) throws LicenseException
	{
		if (age<18)
		{
			throw new LicenseException("Not eligible");
		}else 
		{
			System.out.println("eligible for license");
		}	
	}

	public static void main(String[] args) throws LicenseException {
		// TODO Auto-generated method stub
		
			ThrowBlockSample.display(20);
	 }

	}


