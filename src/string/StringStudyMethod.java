package string;

public class StringStudyMethod {

	public static void main(String[] args) {
				System.out.println("=======length============");
				String name= "LENGTH";
				System.out.println(name.length());
				//LENGTH = MaxIndex+1 i.e  5+1=6; //MaxIndex= length - 1 i.e 6-1=5
				
				int lenthOfString = name.length();//it create local variable
				System.out.println( lenthOfString);
				//Returns the length of this string.
				//The length is equal to the number of Unicode code units in the string
				//the length of the sequence of characters represented by this object
				
				System.out.println("=======to upper case============");
				//ToUppercase Method
								
				String name1 = "touppercase";
				System.out.println("the upper case is show all letter in "
						+ "upper case only. Like for example -"+ name1.toUpperCase());
				/*Converts all of the characters in this String to uppercase 
				 * using the rules of the default locale.
				 *  This method is equivalent to toUpperCase(Locale.getDefault()).
				 */
				 String upper = name1.toUpperCase();
				 System.out.println(upper);//create local variable
				 
				 System.out.println("=======to lower case============");
				 
				 //Tolowercase Method
				 /*Converts all of the characters in this 
				  * String to lowercase using the rules of the default locale. 
				  * This is equivalent to calling toLowerCase(Locale.getDefault()). 
				  */
				 String name2 = "TOLOWERCASE";
				 System.out.println(name2.toLowerCase());
				 /*Converts all of the characters in this 
				  * String to lowercase using the rules of the default locale. 
				  * This is equivalent to calling toLowerCase(Locale.getDefault()). 
				  */
				
				String lower = name2.toLowerCase();
				System.out.println(lower);
				
				 System.out.println("=======equal============");
				 
				 //equal method use
				 String name3 = "equal";
				 String name4 = "equal"; 
				 String name5 = new String("Equal");
				 String name6 = new String("Equal");
				 //memory of name5 & name6 is different because of new keyword
				 
				 System.out.println(name3==name4);//same memory because no new keyword
				 System.out.println(name5==name6); //different memory because of new keyword
				System.out.println(name3==name5); 
				
				System.out.println(name3.equals(name4));
				System.out.println(name3.equals(name5));
				System.out.println(name3.equals(name6));//because of case sensetiveness
				System.out.println(name4.equals(name5));
				System.out.println(name4.equals(name6));
				System.out.println(name5.equals(name6));//because of case sensetiveness
				/* Compares this string to the specified object.
				 * The result is true if and only if the argument is not null and 
				 * is a String object that represents the same sequence of characters as this object
				 */
				
				boolean nameEqu = name3.equals(name4);
                System.out.println(nameEqu);
                boolean nameEqu1 = name4.equals(name6);
                System.out.println(nameEqu1);
                boolean nameEqu2 = name5.equals(name6);
                System.out.println(nameEqu2);
                
                System.out.println("=======equal ignore============");
                
                //equals ignore case method
               String name7="equal ignore case method";//check sequence of character only
               String name8 = "equal";
			   String name9 = "equal"; 
			   String name10 = new String("Equal");
		       String name11 = new String("Equal");
               /* Compares this String to another String, ignoring case considerations. 
                * Two strings are considered equal ignoring case if they are of the same length and 
                * corresponding characters in the two strings are equal ignoring case. 
                * Note that this method does not take locale into account,
                *  and will result in unsatisfactory results for certain locales.
                *  The java.text.Collator class provides locale-sensitive comparison.
                */
		       
		       System.out.println(name8.equalsIgnoreCase(name11));//true
		       System.out.println(name8.equalsIgnoreCase(name9));//true
		       System.out.println(name7.equalsIgnoreCase(name10)); //false
                
		       System.out.println("=======contain============");
                //contains method use
		       String name12= "Eclipse";
		       // Returns true if and only if this string contains the specified sequence of char values
		       System.out.println(name12.contains("ec"));//false
		       System.out.println(name12.contains("Ec")); //true
		       System.out.println(name12.contains("pse")); //true 
		       System.out.println(name12.contains("es")); //false
		       
		       System.out.println("=======is empty============");
		       //isEmpty method use
		       //length() is 0
		       String name13 = "is Empty";
		       String name14 = "";
		       String  name15 = " ";
		       String name16=null;
		       //Returns true if, and only if, length() is 0
		       System.out.println(name13.isEmpty());//false
               System.out.println(name14.isEmpty());//true 
               System.out.println(name15.isEmpty()); //false 
               System.out.println(name15.length());//1
               //System.out.println(name16.isEmpty());//null operator is excemption for programming
               
               System.out.println("=======is blank============");
               //isBlank method use
               //Returns true if the string is empty or contains only white space codepoints,otherwise false
		       System.out.println(name13.isBlank());//false
               System.out.println(name14.isBlank());//true 
               System.out.println(name15.isBlank()); //true
               //System.out.println(name16.isBlank());//null operator is excemption for programming
               
               System.out.println("======char at============"); 
               //CharAt method use
               String name17 = "CharAt"; 
               /* Returns the char value at the specified index. 
                * An index ranges from 0 to length() - 1.
                * The first char value of the sequenceis at index 0, 
                * the next at index 1,and so on, as for array indexing 
                */
               System.out.println(name17.charAt(0)); //C
               System.out.println(name17.charAt(3)); //r
              // System.out.println(name17.charAt(-1));//String index out of range: -1
               //System.out.println(name17.charAt(5)); //StringIndexOutOfBoundsExceptio
                
                char Char = name17.charAt(0);
                System.out.println(Char);//C
                char Char1 = name17.charAt(1);
                System.out.println(Char1);//h
                System.out.println("=======end with============");
                //ends with- last character sequence
                String name19 = " End with";
                //Tests if this string ends with the specified suffix
                System.out.println(name19.endsWith("th"));//true
                System.out.println(name19.endsWith("end"));//false 
                System.out.println(name19.endsWith("wi"));//false
                System.out.println(name19.endsWith("with"));//true
                
                //Tests if this string ends with the specified suffix
                
                System.out.println("=======start with============");
                //starts with - begining sequence
                String name20= "starts with ";
                //Tests if this string starts with the specified prefix
                System.out.println(name20.startsWith("st"));//true
                System.out.println(name20.startsWith("start"));//true
                System.out.println(name20.startsWith("ts"));//false
                
                System.out.println(name20.startsWith("t", 1));//true
                System.out.println(name20.startsWith("w", 7));//true
                System.out.println(name20.startsWith("s", 6));//false
                
                System.out.println("=======sub string============");
                //substring method use
                String name21 = "sub string method use";
                //Returns a string that is a substring of this string. 
                //Thesubstring begins with the character at the specified index 
                //and extends to the end of this string
                System.out.println(name21.substring(4));//starting method use
                System.out.println(name21.substring(9));//g method use
                
                String substring = name21.substring(6);
                System.out.println(substring);//ring method use
                
                System.out.println("=======index of============");
              //indexof
        		String a="index ieofe";
        		System.out.println(a.indexOf('e'));//3//show index of character
        		System.out.println(a.indexOf('e'));//3
        		System.out.println(a.indexOf('i'));//0
        		
        		System.out.println(a.indexOf('e',6));//if in one string we have multiple same character//7
        		System.out.println(a.indexOf('e',8));
        		
        		 System.out.println("=======last index of============");
        		//lastindexof
	        		String b="laste index ofe";
	        		System.out.println(b.lastIndexOf('e'));//9-it show last index of character, if double character are there then 
        		//it took last character only
        		
        		System.out.println(b.lastIndexOf('i'));//6
        		System.out.println(b.lastIndexOf('e'));//14
        		
        		 System.out.println("=======replace with============");
        		//replace with
        		String c= "replace with";
        		System.out.println(c.replace('r', 'w'));//weplace with
        		
        		System.out.println(c.replace("e","A"));//rAplacA with
        		
        		System.out.println(c.replaceAll(" ", "c"));//remove space-replacecwith
        		
        		 System.out.println("=======concat============");
        		//concat
        		String d="anisha ";//combine string
        		String e= "kale";
        		System.out.println(d.concat(e));//anisha kale
        		System.out.println(d.concat(" yedi aahe"));//anisha  yedi aahe
        		
        		
        		}


	}


