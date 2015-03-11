package crazyJava;

public class ThreadTest1 extends Thread{
	private int i;
	public void run(){
		for(;i<100;i++){
			System.out.println(getName()+" "+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
			
			if(i==20){
				Thread.currentThread().sleep(1);
				new ThreadTest1().start();
				new ThreadTest1().start();
			}
		}
	}
}
	
