package Control_Statement;

public class WeekendIf_Else {

	public static void main(String[] args) {
         //display the weekday as per date
		
		int date = 20;
		
		if(date==10)
		{
			System.out.println("sunday");
		}
		else if(date==11)
		{
			System.out.println("monday");
		}

		else if(date==12)
		{
			System.out.println("tuesday");
		}
		else if(date==13)
		{
			System.out.println("wednesday");
		}
		else if(date==14)
		{
			System.out.println("thursday");
		}
		else if(date==15)
		{
			System.out.println("friday");
		}
		else if(date==16)
		{
			System.out.println("saturday");
		}
		else 
		{
			System.out.println("wrong input");
		}
	}

}
