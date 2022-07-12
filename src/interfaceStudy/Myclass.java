package interfaceStudy;

public class Myclass implements MyInterface, MyInterface2 {

	public static void main(String[] args)
	{

		Myclass mi = new Myclass();
		mi.discipline();
		mi.money();
		MyInterface2.love();

	}


	public void discipline() 
	{
		System.out.println("i am from incomplete method");

	}


	public void money() 
	{
		MyInterface2.super.money();
		MyInterface.super.money();
	}

}
