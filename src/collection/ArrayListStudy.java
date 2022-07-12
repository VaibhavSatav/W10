package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		//arraylist
		ArrayList al = new ArrayList();
		al.add("Nashik- Pune university");
		al.add(null);
		al.add("graduation");
		al.add(null);
		al.add("graduation");
		al.add("postgraduation");
		al.add('A');
		al.add(23);
		al.add(true);
		al.add(83.80);
		al.add(12456378965l);
    	
		 
		System.out.println(al);
		//output-[Nashik- Pune university, null, graduation, null, graduation, postgraduation, A, 23, true, 83.8, 12456378965]
		
		//to find size
		System.out.println(al.size());//11
		
		System.out.println(al.isEmpty());//false
		
		System.out.println(al.contains("velocity"));//false
		System.out.println(al.contains('A'));//true
		
		System.out.println(al.get(2));
		
		System.out.println(al.indexOf("graduation"));//2
		
		System.out.println(al.remove(3));//null
		
		System.out.println(al);
		//[Nashik- Pune university, null, graduation, graduation, postgraduation, A, 23, true, 83.8, 12456378965]
		
		al.add(0, "university");
		
		System.out.println(al);
		//[university, Nashik- Pune university, null, graduation, graduation, postgraduation, A, 23, true, 83.8, 12456378965]

		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
//		university
//		Nashik- Pune university
//		null
//		graduation
//		graduation
//		postgraduation
//		A
//		23
//		true
//		83.8
//		12456378965
		
		System.out.println("================================");
		
		System.out.println("Iterator- unidirectional");
		System.out.println();
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
			//Returns true if the iteration has more elements.
			//In other words, returns true if next wouldreturn an element rather than 
			//throwing an exception
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
