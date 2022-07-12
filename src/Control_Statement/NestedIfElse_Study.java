package Control_Statement;

public class NestedIfElse_Study 
{

	public static void main(String[] args) 
	{
	//if username is correct -->please enter password
	//if password correct-->you login successfully
		//else -->enter correct password
	//else -->enter correct username
		  
		String Un = "Velocity";
		String pwd="Velocity@13";
          
		if(Un=="Velocity")
		{
			System.out.println("enter password");
			
			if (pwd=="Velocity@123")
			{
				System.out.println("login successful");
				
			}
			else
			{
				System.out.println("incorrect password");
			}
		}
		else
		{
			System.out.println("please enter correct username");
			
		}
	
	}
}	