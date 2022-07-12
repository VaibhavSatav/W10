package generalisation;

public class JioImplements implements TraiSuperClass {

	@Override
	public void call() {
		System.out.println("i am incomplete call from trai but now complete in JioImplement");
	}

	@Override
	public void message() {
		System.out.println("i am incomplete call from trai but now complete in JioImplement");
		
	}

	@Override
	public void data() {
		System.out.println("i am incomplete call from trai but now complete in JioImplement");
		
	}

	public static void newMethod()
	{
		System.out.println("i am the only one own property of new method from jioimplements");
	}
}
