package interfaceStudy;

public interface MyInterface {

	void discipline();
	default void money()
	{
		System.out.println("i am money from myinterface");
	}
	
	
}
