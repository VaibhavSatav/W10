package Control_Statement;

public class ElseIfStudy {

	public static void main(String[] args) {
		//if your marks are greater than 66-99 then you are with distinction
		//else if your marks are between 40-65 then you are in first class
		//else if your marks are between 35-39 then you are just pass
		//else you are failed
		
		int marks = 188;
		if(marks>=66 )
		{
			System.out.println(" distinction");
		}
		else if (marks>=40 & marks<=65) {System.out.println("first class");
			}
		else if (marks>=35 & marks<=39) {System.out.println("just pass");
			}
		else {
			System.out.println("fail");
		}
		
		int marked=62;
		if (marked >=90)
		{ System.out.println("then you pass with A class");}
       
		else if (marked>=60) {System.out.println("then you got B grade");}
		
		else if(marked>=40) {
			System.out.println("then you got grade c");
		}
		 
		else {
			System.out.println("you are mad");
		}
		

	}

}
