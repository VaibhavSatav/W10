package generalisation;

public class AirtelImplementation implements TraiSuperClass {

	@Override
	public void call() {
		System.out.println("i am incomplete call from trai but now complete in airtel");
		
	}

	@Override
	public void message() {
		System.out.println("i am incomplete message from trai but now complete in airtel");
		
	}

	@Override
	public void data() {
		System.out.println("i am incomplete data from trai but now complete in airtel");
		
	}
	public static void newMethod()
	{
		System.out.println("i am the only one own property of new method from airtell");
	}

}
