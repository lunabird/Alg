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
public abstract class AbstractBlackHuman implements Human{
	// ��ɫ���ֵ�Ƥ����ɫ�Ǻ�ɫ��
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�Ǻ�ɫ�ģ�");
	}

	// ��ɫ���ֽ���
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ��˵�Ķ���������");
	}
}
