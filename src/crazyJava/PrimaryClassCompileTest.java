/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-30
 */
package crazyJava;

/**
 * @author Administrator
 * java��ʼ������֪ʶ
 */
public class PrimaryClassCompileTest {
	
	
	/**
	 * һ��������л����������ݳ�Ա���ᱣ֤���һ����ʼֵ��
	 * �ǻ������ͣ����ʼ��Ϊnull.
	 * 
	 * ע�⣬ֻ��Ϊ������ṩ��ʼ�������ֲ��������ᡣ����ֲ�����û�г�ʼ�������յ�һ��������Ϣ 
	 */
	int a;
	char b;
	short s;
	float f;
	long lo;
	double dou;
	byte e;
	boolean flag;
//	Object obj;
	
	
	 int i;  
     Object obj; 
	
	/**
	 * �ɴ˿ɼ��������ǻ������ͣ������������ࡣjavaĬ�ϵĳ�ʼ�������ȷ����ģ�λ��һ�з���֮ǰ
	 */
	public PrimaryClassCompileTest() {
		System.out.println("before i=" + i + "  obj=" + obj);
		i = 1;
		obj = new Object();
		System.out.println("after i=" + i + " obj=" + obj);
	}

	public void print(){  
	    System.out.println("int a="+a+"\n char b="+b+" \n"+" short s="
	    		+s+"\n float f="+f+"\n long lo="+lo+"\n double dou="+dou
	    		+"\n byte e="+e+"\n boolean flag="+flag+"\n Object obj="+obj
	    		);  
	}  
	
	
	public static void main(String[] args){
//		int m;
//		System.out.println(m);//��䲻�ܱ���ͨ��
		
//		PrimaryClassCompileTest init = new PrimaryClassCompileTest();
//		init.print();  
		
		Cupboard cup = new Cupboard();  
		cup = new Cupboard();  
	}
	
	
	/**
	 * ��ʼ��˳�� ��һ�����У����۱����Ķ������ڷ���֮ǰ���Ƿ���֮�󣬶����ڷ���֮ǰ���г�ʼ���ģ�
	 * ���⣬static���ݳ�ʼ��λ�ڷ�static���ݳ�ʼ��֮ǰ
	 */
	/**
	 * ��̬����ı�����ʼ��˳��λ����ͨ����֮ǰ����static������ȣ�������ȫ�ɶ����˳���������ˡ����⣬��̬����ı���Ҳ��ֻ��ʼ��һ�Σ�
	 * ����static����һ�¡�ʾ������
	 */
	
	
}




//class Cupboard {
//	/**
//	 * static����ֻ���ڵ�һ�ν��г�ʼ����֮��Ͳ�����
//	 */
//	static Bowl bowl = new Bowl();
//	public Cupboard() {
//		System.out.println("initialization Cupboard");
//	}
//}
//
//class Bowl {
//	public Bowl() {
//		System.out.println("init ing Bowl~");
//	}
//}