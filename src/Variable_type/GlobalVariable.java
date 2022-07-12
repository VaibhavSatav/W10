package Variable_type;

public class GlobalVariable {
     int a=10;//non static global variable
     static int b=20;//static global variable
     
	public static void main(String[] args) {
		GlobalVariable obj = new GlobalVariable();//calling non static from same class
		obj.practice();
	    System.out.println("sum is "+obj.a);//calling non static global variable
	    
		practice2();//calling static method from same class
		System.out.println("add of b is "+b);//calling static global variable
	    
		Sample obj2 = new Sample();//here we call non static global variable from another class
		System.out.println("sum of other class is "+ obj2.p);
	    
		System.out.println("sum of other static class is "+Sample.q);//here we call static variable from another class
		
	    int sub=800-obj.a;//calling non static method with non static global variable from same class
	    System.out.println("sub is "+sub);
	   
	    int add=900+b;//calling static method with static global variable from same class
	    System.out.println("addition of b is "+ add);
		
	    int mult =9*obj2.p;
	    System.out.println("multiplication is "+mult);
	    
	    int div =9/Sample.q;
	    System.out.println("divison is "+div);
	    
	   
	}
    public void practice()
	{
		int sum =a+40;//here we call non static global variable
		int sub = b-10;//here we call static global variable
		System.out.println("sum is "+sum);
	}
	public static void practice2()
	{
		//int add=a+30;//because static method doesn't take non static global varible
		int add=b+40;//here we call static global variable
		System.out.println("sum of b is "+add);
	}	
}
