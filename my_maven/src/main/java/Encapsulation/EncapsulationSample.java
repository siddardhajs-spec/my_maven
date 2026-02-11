package Encapsulation;

public class EncapsulationSample {
	private int salary = 3000;
	private String name= "DEEPAK";
	
	public void setter(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
		
	}
	public void getter()
	{
		System.out.println(name);
		int incentive = 900;
		salary=incentive+salary;
		System.out.println(salary);
	}
	

}
