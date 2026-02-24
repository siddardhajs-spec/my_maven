package expsamplepackage;

public class ExceptionHandling {
	
	public void print()
	{
		int a=10;
		try {
		int b=a/0;
		System.out.println(b);
		}
		
			catch(Exception e)
		{
				System.out.println("exception handled");
				System.out.println(e);
		}
		    finally {
		    	System.out.println("Finally Block");
		    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling obj=new ExceptionHandling();
		obj.print();

	}

}
