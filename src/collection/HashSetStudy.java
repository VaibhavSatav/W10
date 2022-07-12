package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
	
		HashSet HS = new HashSet<>();
		HS.add(true);
		HS.add("velocity");
		HS.add(103);
		HS.add(450.65);
		HS.add("hi");
		HS.add("java");
		HS.add('a');
		HS.add(null);
		HS.add(null);
		HS.add(98.63);
		
		System.out.println(HS);
		
		System.out.println(HS.size());
		
		System.out.println(HS.isEmpty());
		
		System.out.println(HS.contains(HS));
		
		System.out.println("==========");
		
		Iterator hs = HS.iterator();
		while(hs.hasNext())
		{
			System.out.println(hs.next());
		}
		

		System.out.println("==========");
		
		for(Object b:HS)
		{
			System.out.println(b);
		}
		
		System.out.println("==============");
		HS.clear();
		

		System.out.println("==========");
		
		System.out.println(HS);
		
		
		
		
		
		

	}

}
