package Inheritance;

public class SingleLavelInheritance {

	public static void main(String[] args) {
		// to call mothers non static
		
		Mother m = new Mother();//calling object of own non static
		
		Child c = new Child();
		c.mobile(); //calling non static method
		c.nature();  //calling static of sub class		
		
		Child.care();
		Child.laptop();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
