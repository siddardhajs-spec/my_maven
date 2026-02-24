package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList(); //non generic
		
		al.add("Hello");
		al.add(45);
		al.add('k');
		al.add(45.6f);
		
		System.out.println(al);
		
		ArrayList <String> al1=new ArrayList(); //generic
		al1.add("Hello");
		al1.add("Violet");
		al1.add("Red");
		al1.add("White");
		
		System.out.println(al1);
		
		ArrayList <String> al2=new ArrayList(); //generic
		al2.add("Hi");
		al2.add("Blue");
		al2.add("Green");
		System.out.println(al2);
		
		al2.remove(1);
		System.out.println(al2);
		
		al2.addAll(al1);
		System.out.println(al2);
		
		al.removeAll(al);
		System.out.println(al);
		
		//al2.get(1);
		System.out.println(al2.get(1));
		
		System.out.println(al2.size());
		
		boolean s= al2.contains("Green");
		System.out.println(s);
		
		boolean s1= al2.contains("Link");
		System.out.println(s1);
		
		Iterator it= al2.iterator();
		while (it.hasNext())
		   {
			  System.out.println(it.next());
		   }
		
		it.remove();
		System.out.println(al2);

	}

}
