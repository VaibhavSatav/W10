package LogcalRevNum;

public class RevNumWithoutStr {

	public static void main(String[] args) {
		int num=123;
		int REVNUM=0;
		
		for(int i=num;i>0;i=i/10)//123,12,1
		{
			int rem=i%10;//=3,2,1
			REVNUM=REVNUM*10+rem;
			//0+3=3;
			//3*10+2=30+2=32;
			//32*10+1
			
			}
	
	
		System.out.println("original no is "+num);
		System.out.println("reverse num is "+REVNUM);
			

}
}
