package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Cursor {

	public static void main(String[] args) {

		ArrayList al = new ArrayList<>();
		al.add("velocity");
		al.add("velocity");
		al.add(null);
		al.add(null);
		al.add(123);
		al.add(true);
		al.add(12.25);
		al.add(false);
		al.add("hi");
		al.add("bye");
		al.add(50);
		
		System.out.println(al);
		
		
		System.out.println(al.size());
		System.out.println(al.clone());

		
		System.out.println(al.get(5));
		
		
		
		System.out.println(al.isEmpty());
		
		for ( int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("================");
		Iterator it = al.iterator();
				while(it.hasNext())			
				{
					System.out.println(it.next());
				}
			
				System.out.println("**********************************");
				
				System.out.println("listIterator- by directional");

				System.out.println();
				
				ListIterator lit = al.listIterator();
				
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
				
				for(Object p:al)
				{
					System.out.println(p);
				}
	
		
	}

}
