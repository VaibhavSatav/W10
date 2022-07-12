package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		//it gives output on the basis of abcd

		TreeSet TS = new TreeSet<>();
		TS.add("class");
		TS.add("velocity");
		TS.add("ram");
		TS.add("kon");
		TS.add("hi");
		TS.add("java");
		TS.add("a");
		TS.add("raj");
		TS.add("kamv");
		TS.add("god");
		
		System.out.println(TS);
		
		System.out.println(TS.size());
		
		System.out.println(TS.isEmpty());
		
		System.out.println("-=-=-=-=-=-=-=-=-=");
		
		Iterator ts = TS.iterator();
		
		while(ts.hasNext())
		{
			System.out.println(ts.next());
		}
		
		for(Object Ts:TS)
		{
			System.out.println(Ts);
		}
		
		
		
		
		
		
		
		
		

	}

}
