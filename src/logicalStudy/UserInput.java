package logicalStudy;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("put value of a");
		int a = sc.nextInt();
		
		System.out.println("put value of b");
		int b = sc.nextInt();
		
		int c= a+b;
		System.out.println("sum is "+c);
		
		int d=a-b;
		System.out.println("substraction is "+d);
		

	}

}
