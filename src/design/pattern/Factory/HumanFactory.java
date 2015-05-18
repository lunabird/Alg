/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-23
 */
package design.pattern.Factory;

/**
 * @author Administrator
 * ���ഴ������
 */
public class HumanFactory extends AbstractHumanFactory {
	public <T extends Human> T createHuman(Class<T> c) {
		// ����һ������������
		Human human = null;
		try {
			// ����һ������
			human = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("�������ɴ���");
		}
		return (T) human;
	}
}