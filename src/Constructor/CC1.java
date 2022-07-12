package Constructor;

public class CC1 {
	 int a;int b;//global variable
	    
		
		public CC1()//user define zero parameter
		{
			a=200;b=100;
		
		}
		

	public static void main(String[] args) {
		CC1 C2 = new CC1();
		C2.addition();
		C2.substraction();

	}
	public void addition()
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
		
	}
	 public void substraction()
	 {
		 int sub = a-b;
		 System.out.println("substraction is "+sub);
		 
	 }

}
