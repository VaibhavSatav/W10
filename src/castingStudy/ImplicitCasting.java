package castingStudy;

public class ImplicitCasting {

	public static void main(String[] args) {
		
		int a = 50;
		System.out.println(a);
		
		
		double b=a;
		System.out.println(b);
		
		
		long c=a;
		System.out.println(c);

		
		//Explicite casting
		double d=30.4d;
		System.out.println(d);
		
		
		int e= (int) d;
		System.out.println(e);
		
		double g=20.26d;
		
		byte f=  (byte) g;
		System.out.println(f);
	
		
		/*byte=-127 to 128
		 * short=-32687 to 32686
		 * int
		 * long
		 */
		
		
	}

}
