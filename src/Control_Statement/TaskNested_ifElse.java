package Control_Statement;

public class TaskNested_ifElse {


	public static void main(String[] args) {
		//put greater no to the console screen
		
		int a=60,b=70,c=30,num;
		if(a>b)
		{
			if(a>c)
			{
				num = a;
				
			}
			else
			{
				num = c;
			}
		}
		else
		{
			if(b>c)
			{
				num =b;
			}
			else
			{
				num=c;
			}
		        System.out.println("the greater no is "+num);
		}
		
			
	}

}
