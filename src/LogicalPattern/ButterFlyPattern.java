package LogicalPattern;

public class ButterFlyPattern {

	public static void main(String[] args) {
		
		 //*         *
		 //**       **
		 //***     ***
		 //****   ****
		 //***** *****
		 //****   ****
		 //***     ***
		 //**       **
		 //*         *
		
		//row 9
		
		int star=1;
		int star1=1;
		int space=5;
		int space1=3;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=4)
			{
				star++;
				space--;
				space1--;
				star1++;
			}
			else
			{
				star--;
				space++;
				star1--;
				space1++;
			}
		}
		
	}

}
