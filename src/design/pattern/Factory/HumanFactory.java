/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-23
 */
package design.pattern.Factory;

/**
 * @author Administrator
 * 人类创建工厂
 */
public class HumanFactory extends AbstractHumanFactory {
	public <T extends Human> T createHuman(Class<T> c) {
		// 定义一个生产的人种
		Human human = null;
		try {
			// 产生一个人种
			human = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("人种生成错误！");
		}
		return (T) human;
	}
}