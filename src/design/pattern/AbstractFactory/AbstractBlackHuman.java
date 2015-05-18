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
	// 黑色人种的皮肤颜色是黑色的
	public void getColor() {
		System.out.println("黑色人种的皮肤颜色是黑色的！");
	}

	// 黑色人种讲话
	public void talk() {
		System.out.println("黑色人种会说话，一般说的都听不懂。");
	}
}
