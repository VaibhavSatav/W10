package LogicalProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
	//Fibonacci Series
	
	int n=10;	
	int a =0; int b=1;
	int c;
	System.out.print(" "+a+" "+b);
	for(int i=0; i<n ; i++)
	{ c=a+b; //0+1//1+=2//1+2=3//2+3=5
	  a=b;//1//1//2
	  b=c;//1//2//3
	
	  System.out.print(" "+c+" ");
	}
	
	//Output --> 0 1 1 2 3 5 8 13 21 34 55 
	

	}

}
