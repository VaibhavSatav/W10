package Methods;

public class MathOperation {

	public static void main(String[] args)
	{
	 MathOperation obj =new MathOperation();//creat object for same class
	 obj.add();//non static for same class 
	 
	 sub();//static method for same class
	 
	 MathOperationOtherMethod obj2 = new MathOperationOtherMethod();//object of non static from another class
	 obj2.multi();//non static from another class
	 
	 MathOperationOtherMethod.div();//static from another class
		
		
	}

	public  void add()//without parameter 
	{
		int a=100;
		int b=200;
		int addition=a+b;
		System.out.println("addition is "+ addition);
		}
	public static void sub()
	{
		int a =100;
		int b=50;
		int sub = a-b;
		System.out.println("substraction is "+ sub);
	}
	
}
