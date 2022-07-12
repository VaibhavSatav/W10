package string;

public class String_Study {

	public static void main(String[] args) {
		System.out.println("===================");
		String name= "LENGTH";
		System.out.println("length");
		/* Length method use-
		 * LENGTH = MaxIndex+1 i.e  5+1=6; //MaxIndex= length - 1 i.e 6-1=5
		 * Returns the length of this string.
		 * The length is equal to the number of Unicode code units in the string
		 * the length of the sequence of characters represented by this object
		 */
		System.out.println(name);
		System.out.println(name.length());
		//LENGTH = MaxIndex+1 i.e  5+1=6; //MaxIndex= length - 1 i.e 6-1=5
		
		int lenthOfString = name.length();//it create local variable
		System.out.println( lenthOfString);
		//Returns the length of this string.
		//The length is equal to the number of Unicode code units in the string
		//the length of the sequence of characters represented by this object
		
		
		System.out.println("===================");
		//ToUppercase Method
		/*Converts all of the characters in this String to uppercase 
		 * using the rules of the default locale.
		 *  This method is equivalent to toUpperCase(Locale.getDefault()).
		 */
		
		String name1 = "Ttouppercase";
		System.out.println("toUpperCase");
		System.out.println(name1);
		System.out.println("the upper case is show all letter in "
				+ "upper case only. Like for example -"+ name1.toUpperCase());
		/*Converts all of the characters in this String to uppercase 
		 * using the rules of the default locale.
		 *  This method is equivalent to toUpperCase(Locale.getDefault()).
		 */
		
		 String upper = name1.toUpperCase();
		 System.out.println(upper);//create local variable
		 
		 System.out.println("===================");
		 
		 //Tolowercase Method
		 /*Converts all of the characters in this 
		  * String to lowercase using the rules of the default locale. 
		  * This is equivalent to calling toLowerCase(Locale.getDefault()). 
		  */
		 String name2 = "TOLOWERCASE";
		 System.out.println("toLowerCase");
		 System.out.println(name2);
		 System.out.println(name2.toLowerCase());
		 /*Converts all of the characters in this 
		  * String to lowercase using the rules of the default locale. 
		  * This is equivalent to calling toLowerCase(Locale.getDefault()). 
		  */
		
		String lower = name2.toLowerCase();
		System.out.println(lower);
		
		System.out.println("-=-=-=-=-=-=-=-");
		
		String hi="India";
		System.out.println(hi.charAt(0));
		
		
		
		
		
		
		
		
		

	}

}
