package crazyJava;

/**
 *
 * @brief     ��ĳ����̬����ʹ��final�������Σ���������ֵ�����ڱ���ʱ�õ�
 *        ��ô���������ط�ʹ�øþ�̬����ʱ��ʵ���ϲ�����ʹ���侲̬���ԣ�
 *        �����൱��ʹ�ó�����
 *            ��֮�����final���͵ľ�̬���Ե�ֵ�����ڱ���ʱ�õ������ᵼ
 *        �¸��౻��ʼ����
 * @author huangpeng
 * @version 
 * @date 2015-3-25 ����4:37:34 
 * 
 */
public class TestCompileConstant {
	public static void main(String[] args){
		//���ʣ����MyTest�е�CompileConstant����
		System.out.println(MyTestA.compileConstant);
	}
}

class MyTestA{
	static {
		System.out.println("��̬��ʼ����......");
	}
	//ʹ��һ���ַ���ֱ����Ϊstatic final���Ը�ֵ
//	static final String compileConstant = "�������";
	static final String compileConstant = System.currentTimeMillis()+"";
}
