package LogcalRevNum;

public class ArmNum {

	public static void main(String[] args) {
		
		int num=153;
		int armNum=0;
		
		for(int i=num;i>0;i=i/10)//153,15,1
		{
			int rem=i%10;//3,5,1
			armNum=armNum+(rem*rem*rem);
			//0+3*3*3=0+27=27
			//27+5*5*5=27+125=152
			//152+1*1*1=152+1=153
		}
		System.out.println("original num is "+num);
		System.out.println("arm string is "+armNum);
		System.out.println();
		
		
		
		if(num==armNum)
		{
			System.out.println("no is arm strong no");
		}
		else {
			System.out.println("no is not arm strong no");
		}
		
		
		
		
		
		

	}

}
