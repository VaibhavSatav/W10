package interfaceStudy;

public interface MyInterface2 {

	default void money()
	{
		System.out.println("i am money from myinterface2");
	}
	
	static void love()
	{
	System.out.println("i am static from my interface 2");	
	}
}
