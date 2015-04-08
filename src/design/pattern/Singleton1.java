/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-31
 */
package design.pattern;

/**
 * @author Administrator
 * 饿汉式单例类.在类初始化时，已经自行实例化   
 */
public class Singleton1 {
	
	int i;
	
	//私有的默认构造函数
	private Singleton1(){
		i++;
	}
	
	//已经自行实例化
	private static final Singleton1 single = new Singleton1();
	
	//静态工厂方法
	public static Singleton1 getInstance(){
		return single;
	}
	
	public static void main(String[] args){
		Singleton1 s = Singleton1.getInstance();
		System.out.println(s.i);
		s.i++;
		System.out.println(s.i);
	}
	
}

/**
 * 
 * @author Administrator
 *懒汉式单例类.在第一次调用的时候实例化   
 */
class Singleton2{
	//私有的默认构造函数
	private Singleton2(){
		
	}
	
	//注意，这里没有final
	private static Singleton2 single = null;
	
	//静态工厂方法
	public synchronized static Singleton2 getInstance(){
		if(single == null){
			single = new Singleton2();
		}
		return single;	
	}
	
}

//java.lang.StackOverflowError
//public class Singleton4{
//	
//	int name;
//	
//
//	private static Singleton4 single = null;
//
//	private Singleton4(){
//		name = 1;
//		if(single == null){
//			single = new Singleton4();
//		}
//	}
//     
//	public static void main(String[] args){
//		Singleton4 s = new Singleton4();
//		System.out.println(s.name);
//		
//		
//		Singleton4 s1 = new Singleton4();
//		s1.name++;
//		System.out.println(s.name+","+s1.name);
//	}
//	
//}