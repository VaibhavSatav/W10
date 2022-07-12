package generalisation;

public class Generalisation {

	public static void main(String[] args) {
		
		AirtelImplementation a = new AirtelImplementation();
		a.call();
		a.message();
		a.data();
		a.newMethod();//with the help of object
		AirtelImplementation.newMethod();
		System.out.println();
			
		VodafoneImplement v = new VodafoneImplement();
		v.call();
		v.message();
		v.data();
		v.newMethod();//with the help of object
		VodafoneImplement.newMethod();
		System.out.println();
		
		JioImplements j = new JioImplements();
		j.call();
		j.message();
		j.data();
		j.newMethod();//with the help of object
	    JioImplements.newMethod();
		System.out.println();
		

	}

}
