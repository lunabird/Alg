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
public interface HumanFactory {
	// ����һ����ɫ����
	public Human createYellowHuman();

	// ����һ����ɫ����
	public Human createWhiteHuman();

	// ����һ����ɫ����
	public Human createBlackHuman();
}