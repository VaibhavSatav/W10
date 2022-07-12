package thisAndsuperKeyword;

public class ThisUse {
	
	int a = 200;//global variable
	
	public static void main (String []args) {
		
		ThisUse tu = new ThisUse();//non static calling object
		tu.add();//method run
		
		
		
		
		
		
		
	}
	
	public void add()
	{
		int a=20;//intialize , local variable
		int sum=a+30;
		System.out.println("sum is "+ sum);
		
		int sum1=this.a+40;//global variable call 
		System.out.println("sum 1 "+sum1);
		
		int sum2=this.a+80;//global variable call
		System.out.println("sum 2 "+sum2);
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
