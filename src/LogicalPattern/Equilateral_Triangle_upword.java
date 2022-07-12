package LogicalPattern;

public class Equilateral_Triangle_upword {

	public static void main(String[] args) {
//		   * 
//		  * * 
//		 * * * 
//		* * * * 
//		
		//row =4
		//col 7
		
		int space=3;
		int star=1;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star=star+1;
			space--;
		}
		
		System.out.println("=========================");

            //	  *
			//  * * *
			// * * * * *
			//* * * * * * *
		
		int space1=4;
		int star1=1;

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star1=star1+2;
			space1--;
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
