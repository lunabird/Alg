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
public class FemaleFactory implements HumanFactory {
	// ����������Ů��
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	// ����������Ů��
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

	// ����������Ů��
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}
}
