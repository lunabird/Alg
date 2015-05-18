/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-23
 */
package design.pattern.Factory;

/**
 * @author Administrator
 * 工厂模式--女娲造人
 */
public interface Human {
	// 每个人种的皮肤都有相应的颜色
	public void getColor();

	// 人类会说话
	public void talk();
}
