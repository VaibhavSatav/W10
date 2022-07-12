package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		
		LinkedHashSet LH= new LinkedHashSet<>();
		LH.add(true);
		LH.add("velocity");
		LH.add(103);
		LH.add(450.65);
		LH.add("hi");
		LH.add("java");
		LH.add('a');
		LH.add(null);
		LH.add(null);
		LH.add(98.63);
		
		System.out.println(LH);
		
		System.out.println(LH.size());
		
		System.out.println(LH.isEmpty());
		
		System.out.println("=============");
		 Iterator lh = LH.iterator();
		
		 while(lh.hasNext())
		 {
			 System.out.println(lh.next());
		 }
		 
		 System.out.println("======for each=======");
		 
		 for(Object Lh:LH)
		 {
			 System.out.println(Lh);
		 }
			 
			 System.out.println("-----------");
			 
			 System.out.println(LH.clone());
			 

			 System.out.println("-----------");
			 
			 LH.clear();
			 
			 
			 
			 
			 
			 
		
		
		
		
		
		
		
		
		
		

	}

}
