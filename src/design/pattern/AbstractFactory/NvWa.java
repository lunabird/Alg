/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-23
 */
package design.pattern.AbstractFactory;

/**
 * @author Administrator
 *
 */
public class NvWa {
	public static void main(String[] args) {
		// ��һ�������ߣ�����������
		HumanFactory maleHumanFactory = new MaleFactory();
		// �ڶ��������ߣ�Ů��������
		HumanFactory femaleHumanFactory = new FemaleFactory();
		// �����߽�����ϣ���ʼ��������:
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		System.out.println("---����һ����ɫŮ��---");
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
		System.out.println("\n---����һ����ɫ����---");
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();
		/*
		 * ...... �����������
		 */
	}
}
