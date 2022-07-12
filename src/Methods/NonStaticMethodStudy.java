package Methods;

public class NonStaticMethodStudy {

	public static void main(String[] args) 
	{
	//classname objename = new classname();//object
	//to non static method-->objename.methodname();
	NonStaticMethodStudy nonStatic= new NonStaticMethodStudy();
	nonStatic.display();
	NonStaticWithoutPublicStatic withoutPublic = new NonStaticWithoutPublicStatic ();	
	withoutPublic.method();
	
	}

	public void display()
	{
	System.out.println("hi this is non static method from same class");		
	}	
	}
