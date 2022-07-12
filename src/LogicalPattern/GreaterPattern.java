package LogicalPattern;

public class GreaterPattern {

	public static void main(String[] args) {
		 //*
		 //**
		 //***
		 //****
		 //***
		 //**
		 //*
		
		//row 7
		//col 4
		
		int star=1;
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			if(i<4)
			{
				star++;
			}
			else
			{
				star--;
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
