package Methods;

public class UniversityResult {

	public static void main(String[] args) {
		
		UniversityResult object = new UniversityResult();//calling object of non static from same class
		object.StudentInfo();//calling non static from same class
		
	myInfo("anisha",13,'B',79.18);
	 
		

	}
	//non static method
	public void StudentInfo()//without parameter
	{
		//name,rollnum,grade,marks
		String StudentName = "Anisha";
		int RollNum = 16;
		char grade = 'A';
		float marks = 71.14f;
		
		System.out.println("===============================================================");
	    System.out.println("student name is "+StudentName);
	    System.out.println("student roll no is "+RollNum);
	    System.out.println("student grade is "+ grade);
	    System.out.println("student marks are "+marks);
	    System.out.println("===============================================================");
	}
	//static method with using parameter
	 public static void myInfo(String StudentName, int RollNo, char grade, double marks)//with parameter//declaration
	 {
		//name,rollnum,grade,marks
		 System.out.println("student name is "+StudentName);//usage
		 System.out.println("student roll no is "+ RollNo);
		 System.out.println("student grade is "+grade);
		 System.out.println("students marks are "+ marks);
	 }
	

}
