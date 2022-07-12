package Inheritance;

public class MultiLavelInheritance {

	public static void main(String[] args) {
		
		GrandMother gm = new GrandMother();//calling object of own class
			gm.receipe();//calling own property	
		
		Mother m = new Mother(); // calling object of sub class
		m.nature();//calling method of own class i.e non static of mother
		m.receipe();//calling method of sub class i.e non static of grand mother
		
		Mother.care();//static of own property
		Mother.stories();//static of sub class
		
		Child c = new Child();//object of own class
		c.mobile();//non static of own class
		c.nature();//non static of sub class
		c.receipe();//non static of submost class
		
		Child.laptop();//static of own
		Child.care();//static of sub class
		Child.stories();//static of submost class
		
		
		
		
		
		
		

	}

}
