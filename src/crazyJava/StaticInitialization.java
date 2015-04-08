/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-31
 */
package crazyJava;

/**
 * @author Administrator
 * 
 */
// : initialization/StaticInitialization.java
// Specifying initial values in a class definition.

// 无论创建多少对象, 静态数据都只占用一份存储区域
// 初始化的顺序是先静态对象(如果它们尚未因前面的对象创建过程而被初始化), 而后是"非静态"对象
// 载入.class文件(这将创建Class对象),有关静态初始化的所有动作执行.
// 静态初始化只在Class对象首次加载的时候进行一次
class Bowl {
	Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
	}
	void f1(int marker) {
		System.out.println("f1(" + marker + ")");
	}
}

class Table {
	static Bowl bowl1 = new Bowl(1);

	Table() {
		System.out.println("Table()");
		bowl2.f1(1);
	}

	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}

	static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);

	Cupboard() {
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}

	void f3(int marker) {
		System.out.println("f3(" + marker + ")");
	}

	static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
//		Creating new Cupboard() in main
//		Bowl(3)
//		Cupboard()
//		f1(2)
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
//		Creating new Cupboard() in main
//		Bowl(3)
//		Cupboard()
//		f1(2)
		table.f2(1);
//		f2(1)
		cupboard.f3(1);
//		f3(1)
	}

	static Table table = new Table();
//  Bowl(1)
//	Bowl(2)
//	Table()
//	f1(1)
	static Cupboard cupboard = new Cupboard();
//	Bowl(4)
//	Bowl(5)
//	Bowl(3)
//	Cupboard()
//	f1(2)
}