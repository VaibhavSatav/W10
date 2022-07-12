package Constructor;

public class UserDefaultConstructor {
	{//user defined with zero parameter constructor
		System.out.println("hi i am default constructor without run object");//global variable
		int a=10; int b=20;//value initialize as well as declared
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
	public UserDefaultConstructor()
	{
		//local variable
	}
     

	public static void main(String[] args) {
		UserDefaultConstructor C1 = new UserDefaultConstructor();
		C1.test();

	}
	  public void test()
	    {
	    	System.out.println("hi i am constructor");
	    }
	
}
