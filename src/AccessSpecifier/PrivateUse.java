package AccessSpecifier;

public class PrivateUse {

	public static void main(String[] args) {
		PrivateUse pu = new PrivateUse();
		pu.test1();
		pu.test2();
		pu.test3();
		pu.test4();
		
		
	
		
	
	}

	private void test1()//within class. cant access in another class
	{
		System.out.println("this is private class test 1");
	}
	
	void test2()//remains within package
	{
		System.out.println("this is default class test2");
	}
	
	protected void test3()//within package. inheritance for outside class
	{
		System.out.println("this is protected class test3");
	}
	
	public void test4()//throught project
	{
		System.out.println("this is public class test 4");
	}
	
}
