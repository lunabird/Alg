/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-23
 */
package design.pattern.Singleton;

/**
 * @author Administrator
 * 臣子类
 */
//public class Minister {
//	public static void main(String[] args) {
//		for (int day = 0; day < 3; day++) {
//			Emperor emperor = Emperor.getInstance();
//			emperor.say();
//		}
//		// 三天见的皇帝都是同一个人，荣幸吧！
//	}
//}

/**
 * 
 * @author Administrator
 * 多例模式下的臣子类
 */
public class Minister {
	public static void main(String[] args) {
		// 定义5个大臣
		int ministerNum = 5;
		for (int i = 0; i < ministerNum; i++) {
			Emperor emperor = Emperor.getInstance();
			System.out.print("第" + (i + 1) + "个大臣参拜的是：");
			emperor.say();
		}
	}
}