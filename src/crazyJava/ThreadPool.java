package crazyJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-24 下午3:57:16 
 * 
 */
public class ThreadPool {
	public static void main(String[] args){
		//创建一个具有固定线程数6的线程池
		ExecutorService pool = Executors.newFixedThreadPool(6);
		//向线程池中提交两个线程
		pool.submit(new TestThread());
		pool.submit(new TestThread());
		//关闭线程池
		pool.shutdown();
	}
}

class TestThread implements Runnable{

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"的i值为"+i);
		}
	}
	
}
