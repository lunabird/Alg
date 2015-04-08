package crazyJava;

import java.util.Date;

public class ThreadTest1 extends Thread{
	private int i;
	public void run(){
		for(;i<5;i++){
			System.out.println(getName()+" "+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
//		for(int i=0;i<100;i++){
//			System.out.println(Thread.currentThread().getName()+" "+i);
//			if(i==20){
//				Thread.currentThread().sleep(1000);
//				new ThreadTest1().start();
//				new ThreadTest1().start();
//			}
//		}
		/**
		 * 测试sleep方法
		 */
		for(int i=0;i<10;i++){
			System.out.println("当前时间："+new Date());
			Thread.sleep(5000);
		}
	}
	
}
