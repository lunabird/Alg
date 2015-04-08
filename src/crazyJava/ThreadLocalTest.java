package crazyJava;

/**
 *
 * @brief ͬ��������Ϊ��ͬ������̶߳���ͬ��Դ�Ĳ������ʣ��Ƕ���߳�֮��
 * 	           ͨ�ŵ���Ч��ʽ����ThreadLocal�Ǹ������̵߳����ݹ����Ӹ���
 *        �ϱ����˶���߳�֮�乲����Դ����������Ҳ�Ͳ���Ҫ�Զ���߳̽���ͬ����
 * @author huangpeng
 * @version 
 * @date 2015-3-25 ����8:49:24 
 * 
 */
public class ThreadLocalTest {
	public static void main(String[] args){
		//���������̣߳������̹߳���ͬһ��Account
		Account at = new Account("��ʼ��");
		/* ��Ȼ�����̹߳���ͬһ���˻�����ֻ��һ���˻���
		 * �������˻�����ThreadLocal���͵ģ����������߳�
		 * ��������ͬһ��Account�����������˻����ĸ�����ÿ��
		 * �̶߳���ȫӵ�и����˻������������Դ�i==6֮�󣬽�����
		 * �����̷߳���ͬһ���ʻ�ʱ������ͬ���˻���
		 * */
		new MyTest(at,"�̼߳�").start();
		new MyTest(at,"�߳���").start();
	}
}
class Account{
	//����һ���ֲ߳̾�������ÿ���̶߳��ᱣ���ñ�����һ������
	private ThreadLocal<String> name = new ThreadLocal<String>();
	//����һ����ʼ��name���ԵĹ�����
	public Account(String str){
		this.name.set(str);
		//������뿴���������ʼ����
		System.out.println("-------"+this.name.get());
	}
	public String getName(){
		return name.get();
	}
	public void setName(String str){
		this.name.set(str);
	}
}
class MyTest extends Thread{
	//����һ��Account����
	private Account account;
	public MyTest(Account account,String name){
		super(name);
		this.account = account;
	}
	public void run(){
		//ѭ��10��
		for(int i=0;i<10;i++){
			//��i==6ʱ������˻����滻�ɵ�ǰ�߳���
			if(i==6){
				account.setName(getName());
			}
			//���ͬһ���˻����˻�����ѭ������
			System.out.println(account.getName()+"�˻���iֵ��"+i);
		}
	}
}