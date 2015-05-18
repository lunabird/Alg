/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-23
 */
package design.pattern.Singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Administrator
 * 
 */
/*
 * public class Emperor { private static final Emperor emperor = new Emperor();
 * // ��ʼ��һ���ʵ�
 * 
 * private Emperor() { // ���׺͵���Լ���㣬Ŀ�ľ��ǲ�ϣ�������ڶ����ʵ� }
 * 
 * public static Emperor getInstance() { return emperor; }
 * 
 * // �ʵ۷����� 
 * public static void say() { System.out.println("�Ҿ��ǻʵ�ĳĳĳ...."); 
 * } }
 */




public class Emperor {
	// ��������ܲ�����ʵ������
	private static int maxNumOfEmperor = 2;
	// ÿ���ʵ۶������֣�ʹ��һ��ArrayList�����ɣ�ÿ�������˽������
	private static ArrayList<String> nameList = new ArrayList<String>();
	// ����һ���б��������еĻʵ�ʵ��
	private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
	// ��ǰ�ʵ����к�
	private static int countNumOfEmperor = 0;
	// �������еĶ���
	static {
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new Emperor("��" + (i + 1) + "��"));
		}
	}
	private Emperor() {
		// ���׺͵���Լ���㣬Ŀ�ľ��ǲ������ڶ����ʵ�
	}
	// ����ʵ����ƣ�����һ���ʵ۶���
	private Emperor(String name) {
		nameList.add(name);
	}
	// ������һ���ʵ۶���
	public static Emperor getInstance() {
		Random random = new Random();
		// �������һ���ʵۣ�ֻҪ�Ǹ���������ͳ�
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
	}
	// �ʵ۷�����
	public static void say() {
		System.out.println(nameList.get(countNumOfEmperor));
	}
}