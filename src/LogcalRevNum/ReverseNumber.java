package LogcalRevNum;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=425;
		String strNum = Integer.toString(num);//int to string
		String rev="";
		
		for(int i =strNum.length()-1;i>=0;i--)
		{
			rev=rev+strNum.charAt(i);
		}
		int revNum = Integer.parseInt(rev);//string to int
		
		System.out.println("original no "+num);
		System.out.println("reverse num is "+revNum);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
