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
	// ��������������
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

	// ��������������
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	// ��������������
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}
}