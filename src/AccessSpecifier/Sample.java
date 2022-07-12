package AccessSpecifier;

public class Sample {

	public static void main(String[] args) {
	           PrivateUse Pu = new PrivateUse();
	           //Pu.test1(); // we cant call private because it is only within the class
	           Pu.test2();//within package default class
	           Pu.test3();//within package protect
	           Pu.test4();//public class
	           
	           
	           

	}

}
