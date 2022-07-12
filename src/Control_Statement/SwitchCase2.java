package Control_Statement;

public class SwitchCase2 {

	public static void main(String[] args) {
		//switch case practice 2 with string
		//PNQ ==>welcome pune
		//BOM ==>welcome mumbai
		//NGP ==>welcome Nagpur
		//Hyd ==>welcome Hyderabad
		
		String city = "BOM";
		switch (city) {
		case "PNQ":System.out.println("We Welcome you all in Pune");
			break;

		case "BOM":System.out.println("We Welcome you all in Mumbai");	
			break;
		case "NGP":System.out.println("We Welcome you all in Nagpur");	
			break;
		case "HYD":System.out.println("We Welcome you all in Hyderabad");	
			break;
				
		default:System.out.println("You are not in India");
			break;
		}
		
		
		
		
		
		
		

	}

}
