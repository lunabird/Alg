package TEST;

public class StringPool {
	
//	public static void main(String[] args){
//		String a = "hello";
//		String b = new String("hello");
//		System.out.println(a==b);//false
//		
//	}
	
	public static void main(String[] args){
		new B();
	}
	/** output:
	 * 	C
		BBB
		B constructor without param
	 */
	
}

class A{
	C c = new C();
	public A(){
		System.out.println("A constructor without param");
	}
	public A(String str){
		System.out.println(str);
	}
}

class B extends A{
	
	public B(){
		super("BBB");
		System.out.println("B constructor without param");
	}
}
class C{
	{System.out.println("C");}
}