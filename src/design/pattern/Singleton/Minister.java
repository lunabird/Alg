/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-23
 */
package design.pattern.Singleton;

/**
 * @author Administrator
 * ������
 */
//public class Minister {
//	public static void main(String[] args) {
//		for (int day = 0; day < 3; day++) {
//			Emperor emperor = Emperor.getInstance();
//			emperor.say();
//		}
//		// ������Ļʵ۶���ͬһ���ˣ����Ұɣ�
//	}
//}

/**
 * 
 * @author Administrator
 * ����ģʽ�µĳ�����
 */
public class Minister {
	public static void main(String[] args) {
		// ����5����
		int ministerNum = 5;
		for (int i = 0; i < ministerNum; i++) {
			Emperor emperor = Emperor.getInstance();
			System.out.print("��" + (i + 1) + "���󳼲ΰݵ��ǣ�");
			emperor.say();
		}
	}
}