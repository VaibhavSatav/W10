package arrayStudy;

public class ArrayStudy {

	public static void main(String[] args) {
		String state[] = new String[4];//length is 4
		 state[0] = "Maharashtra";
		state[1] = "karnataka";
		state[2] = "AP";
		state[3] = "J & K";
		
		System.out.println(state[0]);
		System.out.println(state[1]);
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		for(int s=0;s<=3;s++)//static coding size increase still it work on its condition
		{
			System.out.println(state[s]);
		}
		System.out.println("===================");
		for(int t=0;t<=state.length-1;t++)//dynamic coding
		{
			System.out.println(state[t]);
		}
		System.out.println("===================");
		for(int u=3;u>=0;u--)//reverse for loops
		{
			System.out.println(state[u]);
		}
		
		System.out.println("==========END===========");
		
        System.out.println("Split method");
		String afrin = "how are you anisha";
		String[] s = afrin.split(" ");
		for(int i =0;i<=s.length-1;i++)
		{
			System.out.println(s[i]+"_");
		}
		
		
		String nation="i_love_my_India";
		String[] n= nation.split("_");
		for(int j =0;j<=n.length-1;j++)
		{
			System.out.println(n[j]);
		}
		
		String t= "I : stay : in : pune";
		String sp=":";
		String [] required=t.split(sp);
		System.out.println(required[0]);
		System.out.println(required[1]);
		System.out.println(required[2]);
		System.out.println(required[3]);
		
		
		
		
		
		
		
		
		

	}

}
