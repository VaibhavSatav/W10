package LogicalProgram;

import java.util.Arrays;

public class StringToChar {

	public static void main(String[] args) {
		
		//Convert the given String into sequence of Characters
		
		String str = "Java Programming";
		
		char[] a = str.toCharArray();
		//Converts this string to a new character array

		System.out.println(Arrays.toString(a));
		
		//Output --> [J, a, v, a, , P, r, o, g, r, a, m, m, i, n, g]

	}

}
