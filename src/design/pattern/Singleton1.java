/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-31
 */
package design.pattern;

/**
 * @author Administrator
 * ����ʽ������.�����ʼ��ʱ���Ѿ�����ʵ����   
 */
public class Singleton1 {
	
	int i;
	
	//˽�е�Ĭ�Ϲ��캯��
	private Singleton1(){
		i++;
	}
	
	//�Ѿ�����ʵ����
	private static final Singleton1 single = new Singleton1();
	
	//��̬��������
	public static Singleton1 getInstance(){
		return single;
	}
	
	public static void main(String[] args){
		Singleton1 s = Singleton1.getInstance();
		System.out.println(s.i);
		s.i++;
		System.out.println(s.i);
	}
	
}

/**
 * 
 * @author Administrator
 *����ʽ������.�ڵ�һ�ε��õ�ʱ��ʵ����   
 */
class Singleton2{
	//˽�е�Ĭ�Ϲ��캯��
	private Singleton2(){
		
	}
	
	//ע�⣬����û��final
	private static Singleton2 single = null;
	
	//��̬��������
	public synchronized static Singleton2 getInstance(){
		if(single == null){
			single = new Singleton2();
		}
		return single;	
	}
	
}

//java.lang.StackOverflowError
//public class Singleton4{
//	
//	int name;
//	
//
//	private static Singleton4 single = null;
//
//	private Singleton4(){
//		name = 1;
//		if(single == null){
//			single = new Singleton4();
//		}
//	}
//     
//	public static void main(String[] args){
//		Singleton4 s = new Singleton4();
//		System.out.println(s.name);
//		
//		
//		Singleton4 s1 = new Singleton4();
//		s1.name++;
//		System.out.println(s.name+","+s1.name);
//	}
//	
//}