package crazyJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-24 ����3:57:16 
 * 
 */
public class ThreadPool {
	public static void main(String[] args){
		//����һ�����й̶��߳���6���̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(6);
		//���̳߳����ύ�����߳�
		pool.submit(new TestThread());
		pool.submit(new TestThread());
		//�ر��̳߳�
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
			System.out.println(Thread.currentThread().getName()+"��iֵΪ"+i);
		}
	}
	
}
