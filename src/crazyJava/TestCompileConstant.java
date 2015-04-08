package crazyJava;

/**
 *
 * @brief     当某个静态属性使用final进行修饰，而且它的值可以在编译时得到
 *        那么程序其他地方使用该静态属性时，实际上并不会使用其静态属性，
 *        而是相当于使用常量。
 *            反之，如果final类型的静态属性的值不能在编译时得到，将会导
 *        致该类被初始化。
 * @author huangpeng
 * @version 
 * @date 2015-3-25 下午4:37:34 
 * 
 */
public class TestCompileConstant {
	public static void main(String[] args){
		//访问，输出MyTest中的CompileConstant属性
		System.out.println(MyTestA.compileConstant);
	}
}

class MyTestA{
	static {
		System.out.println("静态初始化块......");
	}
	//使用一个字符串直接量为static final属性赋值
//	static final String compileConstant = "宁夏枸杞";
	static final String compileConstant = System.currentTimeMillis()+"";
}
