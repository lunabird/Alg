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
public class MaleFactory implements HumanFactory {
	// 生产出黑人男性
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

	// 生产出白人男性
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	// 生产出黄人男性
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}
}