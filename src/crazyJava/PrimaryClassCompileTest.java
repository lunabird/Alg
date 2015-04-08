/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-30
 */
package crazyJava;

/**
 * @author Administrator
 * java初始化基础知识
 */
public class PrimaryClassCompileTest {
	
	
	/**
	 * 一个类的所有基本类型数据成员都会保证获得一个初始值。
	 * 非基本类型，会初始化为null.
	 * 
	 * 注意，只会为类变量提供初始化，而局部变量不会。如果局部变量没有初始化，会收到一个出错信息 
	 */
	int a;
	char b;
	short s;
	float f;
	long lo;
	double dou;
	byte e;
	boolean flag;
//	Object obj;
	
	
	 int i;  
     Object obj; 
	
	/**
	 * 由此可见，不论是基本类型，还是其他的类。java默认的初始化是最先发生的，位于一切方法之前
	 */
	public PrimaryClassCompileTest() {
		System.out.println("before i=" + i + "  obj=" + obj);
		i = 1;
		obj = new Object();
		System.out.println("after i=" + i + " obj=" + obj);
	}

	public void print(){  
	    System.out.println("int a="+a+"\n char b="+b+" \n"+" short s="
	    		+s+"\n float f="+f+"\n long lo="+lo+"\n double dou="+dou
	    		+"\n byte e="+e+"\n boolean flag="+flag+"\n Object obj="+obj
	    		);  
	}  
	
	
	public static void main(String[] args){
//		int m;
//		System.out.println(m);//这句不能编译通过
		
//		PrimaryClassCompileTest init = new PrimaryClassCompileTest();
//		init.print();  
		
		Cupboard cup = new Cupboard();  
		cup = new Cupboard();  
	}
	
	
	/**
	 * 初始化顺序 在一个类中，无论变量的定义是在方法之前还是方法之后，都会在方法之前进行初始化的；
	 * 另外，static数据初始化位于非static数据初始化之前
	 */
	/**
	 * 静态块里的变量初始化顺序位于普通变量之前，和static变量相比，则是完全由定义的顺序来决定了。另外，静态块里的变量也是只初始化一次，
	 * 这点和static变量一致。示例如下
	 */
	
	
}




//class Cupboard {
//	/**
//	 * static数据只会在第一次进行初始化，之后就不会了
//	 */
//	static Bowl bowl = new Bowl();
//	public Cupboard() {
//		System.out.println("initialization Cupboard");
//	}
//}
//
//class Bowl {
//	public Bowl() {
//		System.out.println("init ing Bowl~");
//	}
//}