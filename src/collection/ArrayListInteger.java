package collection;

import java.util.ArrayList;

public class ArrayListInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========arraylist with integer==============");
		System.out.println();
		ArrayList<Integer> ab = new ArrayList<>();
		
		//The Integer class wraps a value of the primitive type int in an object. 
		//An object of type Integercontains a single field whose type is int. 
		//In addition, this class provides several methods for convertingan int to a String 
		//and a String to an int, as well as other constants and methods 
		//useful whendealing with an int

		ab.add(null);
		ab.add(1);
		ab.add(4);
		ab.add(8);
		ab.add(9);
		ab.add(7);
		
		System.out.println(ab);
		for(Integer b:ab)
		{
			System.out.println(b);
		}
		
		//ArrayList<character> Char = new ArrayList<>();
		
		
		
		
		
		
		
		
	}

}
