/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-23
 */
package design.pattern.Factory;

/**
 * @author Administrator
 *
 */
public class YellowHuman implements Human {
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǻ�ɫ�ģ�");
	}
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ��˵�Ķ���˫�ֽڡ�");
	}
}