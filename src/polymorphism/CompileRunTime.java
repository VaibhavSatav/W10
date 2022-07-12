package polymorphism;

public class CompileRunTime {
	
	int pushpa;
	int rrr;
	int chapter2;
	int jersey;
	

	public static void main(String[] args) {
		
		
		
		
		
	}

	
	//method definition
	public void add()
	{
		System.out.println("zukega nahi sala");
	}
	
	public void add(int a)
	{
		pushpa = a;
		System.out.println("apan zukega nahi sala "+a);
	}
	
	public void add(int b,int c)
	{
		pushpa =b;
		rrr = c;
		System.out.println("iska ilaj to tumhare gore logo ke pass bhi nahi hai "+c+b);
	}
	public void add(int d,int e,int f)
	{
		pushpa = d;
		rrr = e;
		chapter2 = f;
		System.out.println("iss duniya me sabse bada yodhha maa hoti hai "+f+e+d);
	}
	public void add(int g,int h,int i,int k)
	{
		pushpa = g;
		rrr = h;
		chapter2 = i;
		jersey = k;
		System.out.println("hamare sapne kabhi sach ho nahi sakte we always have to sacrifies in our life "+k+i+h+g);
	}
	
}
