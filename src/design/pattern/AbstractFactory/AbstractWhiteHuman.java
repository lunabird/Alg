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
public abstract class AbstractWhiteHuman implements Human {
	// ��ɫ���ֵ�Ƥ����ɫ�ǰ�ɫ��
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǰ�ɫ�ģ�");
	}

	// ��ɫ���ֽ���
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ��˵�Ķ��ǵ��ֽڡ�");
	}
}