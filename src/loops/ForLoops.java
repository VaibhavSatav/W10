package loops;

public class ForLoops {

	public static void main(String[] args) {
		
		//we put 1 for 5 times
		for(int i=1; i<=5; i++)                       //increment
		{
			System.out.println(i);
		}
        System.out.println();
        
		//put 5 to 1 in reverse form
		for(int a=5; a>=1; a--)                       //decrement reverse
		{
			System.out.println(a);
		}
		System.out.println();
		
		//put a for 5 times
		char k='a';
		for(int j=1; j<=5; j++)                          //increment
		{
		    System.out.println(k);	
		}
		System.out.println();
		
		//put 3 table reverse
		for(int m=30; m>=3; m=m-3)                           //decrement reverse
		{
			System.out.println(m);
		}
		System.out.println();
		
		//2 table
		for(int n=2;n<=20;n=n+2)
		{
			System.out.println(n);
		}
		System.out.println("==========");
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
			sum=sum+i;	
			}
		
		}
		System.out.println("Sum of all even from 1 to 10 is:" + sum);
		System.out.println("===========");
		int row=7;
		for(int i=0; i<row; i++)   
		{   
		for(int j=0; j<=i; j++)   
		{   
		System.out.print("  * ");   
		}   
		System.out.println(); 
		
	}

	}
}

