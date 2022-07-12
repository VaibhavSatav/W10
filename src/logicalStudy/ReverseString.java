package logicalStudy;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("original string is" );
				String org = sc.next();
				System.out.println("original string is " + org);
				String rev = "";
				
				
				for(int i= org.length()-1;i >=0;i--)
				{
					 rev = rev+org.charAt(i);
				}
				System.out.println("reverse string is "+rev);
				
				
				
				
				
				
				
				
				
				
	}

}
