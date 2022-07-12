package Control_Statement;

public class Switch_months {

	public static void main(String[] args) {
		// switch practice 4 for months
		//jan to dec-festival
		
	String month = "jan";
	
	switch (month) {
	case "jan":System.out.println("Makar Sankrant , Republic day");
		break;
	case "feb":System.out.println("ShivJayanti");
	    break;
	case "mar":System.out.println("Mahashivratri, Holi");
	    break;
	case "apr":System.out.println("GudhiPadhva, RamNavmi, HanumanJayanti");
	    break;
	case "may":System.out.println("Maharashtra Din , Akshay Tutriya, ");
        break;
	case "june":System.out.println("Vat Paurnima");
	    break;
	case "july":System.out.println("Devshayani Ashadhi Ekadashi, Guru Paurnima");
	    break;
	case "aug":System.out.println("NagPanchmi, RakshaBandhan, Independance Day, Shri Krishn Janmashtami");
	    break;
	case "sep":System.out.println("Ganesh Chaturthi");
	    break;
	case "oct":System.out.println("Navratri, Dasra, ");
	    break;
	case "nov":System.out.println("Diwali, Tulsi Vivah");
	    break;
	case "dec":System.out.println("Navak Day ,Datt Jayanti");
	    break;
	    
	default:System.out.println("no such month in calender");
		break;
	}
	
	

	}

}
