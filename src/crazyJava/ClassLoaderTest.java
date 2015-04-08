package crazyJava;

/**
 *
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-25 下午4:48:52 
 * 
 */
class Tester{
	static{
		System.out.println("Tester 类的静态初始化......");
	}
}
public class ClassLoaderTest {
	public static void main(String[] args) throws ClassNotFoundException{
		/*
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		//下面的语句仅仅是加载Tester类
		cl.loadClass("crazyJava.Tester");
		System.out.println("系统加载Tester类");
		//下面语句才会初始化Tester类
		Class.forName("crazyJava.Tester");
		*/
		
		char x = '我';
		char c = 54;
		System.out.println(x+","+c);
	}
}
