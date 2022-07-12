package Constructor;

import Methods.MethodPractice;

public class Test {
	 //REGULAR METHOD
	public static void main(String[] args) {
		myTest();
		myAnotherPractice();
		myPractice();
		MethodPractice.calculation();//from another class
		

	}
	//regular static method 
	public static void myTest()
	{
	  System.out.println("I try this program and I do it successfully and this is regular static method");
	}
	public static void myAnotherPractice()
	{
    	System.out.println("this is my another practice and i name it as 'myAnotherPractice.'2nd method i.e "
    			+ "myMethod2 which is done successfully");
	}
	public static void myPractice()
	{
		System.out.println("i try this program with lots of struggle");
	} 
}
