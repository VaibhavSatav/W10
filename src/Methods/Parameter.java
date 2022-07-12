package Methods;

public class Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      method(17,"anisha",'A',80.20f);
      Parameter obj = new Parameter();
      obj.add(10, 20 );
		
	}
   public static void method(int a,String name,char grade,float marks)//parameter
   {
	  System.out.println("my number is " + a);
	  System.out.println("my name is  "+name);
	   System.out.println("i got grade "+grade);
	   System.out.println("i got percentege in my graduation is "+marks);
      
   }
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("addition is  "+c);
		
	}


}
