package castingStudy;

public class UpCasting_MainMethod {

	public static void main(String[] args) {
		UpCasting_SuperClass sup = new UpCasting_SuperClass();
		UpCasting_SubCLass sub = new UpCasting_SubCLass();
		sub.print();
		sub.show();
		sub.love();
		sup.print();
		sup.show();
		
		UpCasting_SuperClass method = new UpCasting_SubCLass();
		method.print();
		method.show();
		
	//	UpCasting_SubCLass method1 = new UpCasting_SuperClass();
	//	method1.print();
	//	method1.show();
		
		
		
		
	}

}
