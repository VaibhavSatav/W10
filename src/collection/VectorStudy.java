package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add("velocity");
		v.add("velocity");
		v.add(null);
		v.add(null);
		v.add(123);
		v.add(true);
		v.add(12.25);
		v.add(false);
		v.add("hi");
		v.add("by");
		v.add(12.25);
		
		System.out.println(v);
		
		System.out.println(v.capacity());
		
		System.out.println(v.isEmpty());
		for ( int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("================");
		Iterator it = v.iterator();
				while(it.hasNext())			
				{
					System.out.println(it.next());
				}
			
				System.out.println("**********************************");
				
				System.out.println("listIterator- by directional");

				System.out.println();
				
				ListIterator lit = v.listIterator();
				
				while(lit.hasNext())
				{
					System.out.println(lit.next());
				}
				
				System.out.println("--------previous----------");
				while(lit.hasPrevious())
				{
					System.out.println(lit.previous());
				}
				
		        System.out.println("**********************************");
				
				System.out.println("for each loop");

				System.out.println();
				
				for(Object p:v)
				{
					System.out.println(p);
				}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
