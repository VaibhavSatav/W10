package Constructor;

public class CC2 {
int a; int b;
	
	public CC2()
	{
		a=10 ; b= 20;
	}
	
	public CC2(int x)//user defined with single parameter
	{
		a=x;
	}
	
	public CC2(int x,int y)//user defined with 2 parameter
	{
		a=x;b=y;
	}
	public static void main(String[] args) {
		CC2 C2 = new CC2();
		C2.add();
		
		CC2 C11 = new CC2(800);
		C11.add();
		
		CC2 C12 =new CC2(800,900);
		C12.add();
			
	}
	 public void add()
     {
    	 int sum=a+b;
    	 System.out.println("sum is "+ sum);
     }
}
