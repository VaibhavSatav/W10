package collection;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("velocity");
		ll.add("velocity");
		ll.add(null);
		ll.add(null);
		ll.add(123);
		ll.add(true);
		ll.add(12.25);
		ll.add(false);
		ll.add("hi");
		ll.add("by");
		ll.add(12.25);
		
		System.out.println(ll);
		
		System.out.println(ll.size());
		
		System.out.println(ll.peek());
		
		System.out.println(ll);
		
		System.out.println(ll.poll());

		System.out.println(ll);
		
		System.out.println(ll.isEmpty());
		
		
		
	}

}
