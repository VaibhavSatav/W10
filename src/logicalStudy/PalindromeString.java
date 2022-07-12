package logicalStudy;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("put original string");
		String a = sc.next();
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			 b = b+a.charAt(i);
		}
		System.out.println("reverse string is "+b);
		if(b.equals(a))
		{
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("original string is '"+a+"' reverse string is '"+b+"' hence it is not 'palindrom' ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
