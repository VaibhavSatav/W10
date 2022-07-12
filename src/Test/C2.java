package Test;

public class C2 {

	public static void main(String[] args) {
		C12.c1();
		C1.a1();
		b1();
		C1 obj = new C1();
		obj.a2();
		C2 obj2 = new C2();
		obj2.b2();

	}

	public static void b1() {
		System.out.println("hi this is b1");
	}

	public void b2() {
		System.out.println("hi this is b2");
	}
}
