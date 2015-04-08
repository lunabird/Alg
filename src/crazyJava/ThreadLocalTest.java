package crazyJava;

/**
 *
 * @brief 同步机制是为了同步多个线程对相同资源的并发访问，是多个线程之间
 * 	           通信的有效方式；而ThreadLocal是隔离多个线程的数据共享，从根本
 *        上避免了多个线程之间共享资源（变量），也就不需要对多个线程进行同步了
 * @author huangpeng
 * @version 
 * @date 2015-3-25 上午8:49:24 
 * 
 */
public class ThreadLocalTest {
	public static void main(String[] args){
		//启动两条线程，两条线程共享同一个Account
		Account at = new Account("初始名");
		/* 虽然两条线程共享同一个账户，即只有一个账户名
		 * 但由于账户名是ThreadLocal类型的，所以两条线程
		 * 将导致有同一个Account，但有两个账户名的副本，每条
		 * 线程都完全拥有各自账户名副本，所以从i==6之后，将看到
		 * 两条线程访问同一个帐户时看到不同的账户名
		 * */
		new MyTest(at,"线程甲").start();
		new MyTest(at,"线程乙").start();
	}
}
class Account{
	//定义一个线程局部变量，每个线程都会保留该变量的一个副本
	private ThreadLocal<String> name = new ThreadLocal<String>();
	//定义一个初始化name属性的构造器
	public Account(String str){
		this.name.set(str);
		//下面代码看到输出“初始名”
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
	//定义一个Account属性
	private Account account;
	public MyTest(Account account,String name){
		super(name);
		this.account = account;
	}
	public void run(){
		//循环10次
		for(int i=0;i<10;i++){
			//当i==6时输出将账户名替换成当前线程名
			if(i==6){
				account.setName(getName());
			}
			//输出同一个账户的账户名和循环变量
			System.out.println(account.getName()+"账户的i值："+i);
		}
	}
}