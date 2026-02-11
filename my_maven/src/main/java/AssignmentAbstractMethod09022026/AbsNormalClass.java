package AssignmentAbstractMethod09022026;

public class AbsNormalClass extends Shape {

	public void draw()//abstract method
	{
		System.out.println("draw triangle");//passed definition to abstract method
	}
	public static void main(String args[])
	{
		AbsNormalClass obj=new AbsNormalClass();
		obj.draw();
		obj.display();
	}
}
