package Interface;

public class MultipleChildClass implements InterParent1, InterParent2{
	
	public void show()
	{
		System.out.println("Method Of Child CLass");
	}
	
	public void display()
	{
		System.out.println(a+b);
	}
	public void print() 
	{
		System.out.println("Parent 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChildClass obj=new MultipleChildClass();
		obj.display();
		obj.print();
		obj.show();

		
	}

}
