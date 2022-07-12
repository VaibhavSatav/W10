package Constructor;

public class Hr_Portal {

	public static void main(String[] args) {
		EmployeeConstructor obj = new EmployeeConstructor();
		 
		obj.name="Anisha";
		obj.emp_id=123;
		obj.emp_dept="computer";
		obj.grade='A';
		
		
		obj.emp_info();
		
		
		EmployeeConstructor obj2 = new EmployeeConstructor();
		
		obj2.name="abcdafd";
		obj2.emp_id=5655;
		obj2.emp_dept="jfksjfd";
		obj2.grade='b';
		
		obj2.emp_info();
		
	}

}
