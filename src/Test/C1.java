package Test;

public class C1 {

	public static void main(String[] args) {
		C12.c1();
		a1();
		C2.b1();
		C1 obj = new C1();
		obj.a2();
		C2 obj2 = new C2();
		obj2.b2();

	}

	public static void a1() {
		System.out.println("hi this is a1 method");
	}

	public void a2() {
		System.out.println("hi this is a2 method");
	}

}
