package AccessSpecifier;

public class Velocity extends PrivateUse {

	public static void main(String[] args) {
		PrivateUse pU = new PrivateUse();
		pU.test4();//calling public method
		
		
		Velocity v = new Velocity ();//created object of child class
		v.test3();//calling protected method from another package
		v.test4();//calling public class
		//v.test1();we cant call because it is within the class
		//v.test2();we cant call because it is for within package

	}

}
