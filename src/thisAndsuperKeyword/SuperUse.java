package thisAndsuperKeyword;

public class SuperUse extends ThisUse {
    
	int b=60;
	
	public static void main(String[] args) {
		
		SuperUse su = new SuperUse();
		su.sub();
		su.add();
		
		
		

	}

	public void sub()
	{
		int b=40;
		int sub=b-20;
		System.out.println("sub is "+sub);
		
		int a=10;
		int sub1=a+20;
		System.out.println("sub 1 "+sub1);
		
		int sub2 = super.a+20;
		System.out.println("sub 2 "+sub2);
		
	}
	
	
	
	
	
	
	
	
	
}
