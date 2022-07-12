package Control_Statement;

public class Switch_weekdays {

	public static void main(String[] args) {
		// Switch practice 3 week days with char
		// a-g==>weekdays
		
		String mon="Monday";
		String tue="Tuesday";
		String wed="Wednesday";
		String thurs="Thursday";
		String fri="Friday";
		String sat="Saturday";
		String sun="Sunday";
		
		
		char date = 'f';
		
		switch (date) {
		case 'a':System.out.println("day of lord Shiva i.e "+mon);
			break;
		case 'b':System.out.println("it is day of lord Ganesh and Aai Tulja Bhavani i.e "+ tue);
		    break;
		case 'c':System.out.println("it is day of lord king Krushna i.e "+wed);
            break;
		case 'd':System.out.println("it is day of lord Datta and Mahalaxmi i.e "+thurs);
		    break;
		case 'e':System.out.println("it is day of favourite lord who is husband of Mahalaxmi is Lord Balaji i.e "+fri);
		    break;
		case 'f':System.out.println("it is day of lord Shani & Lord Hanuman i.e "+sat);
		    break;
		case 'g':System.out.println("it is day of lord Sun i.e "+sun);
		    break;
		    
		default:System.out.println("not valid day");
			break;
		}
		
		

	}

}
