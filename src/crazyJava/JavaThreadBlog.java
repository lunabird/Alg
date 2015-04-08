package crazyJava;

/**
 *
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-19 上午11:23:05 
 * 
 */
public class JavaThreadBlog extends Thread{
	 	private String name; 
	 	
	    public JavaThreadBlog() { 
	  
	    } 
	  
	    public JavaThreadBlog(String name) { 
	        this.name = name; 
	    } 
	  
	    public void run() { 
	        for (int i = 0; i < 5; i++) { 
	            System.out.println(name + "运行     " + i); 
	        } 
	    } 
	  
	    public static void main(String[] args) { 
	    	JavaThreadBlog h1=new JavaThreadBlog("A"); 
	    	JavaThreadBlog h2=new JavaThreadBlog("B"); 
	    	//运行run方法是顺序执行的
//	        h1.run(); 
//	        h2.run(); 
	    	//运行start方法是按照jvm和计算机硬件分时间片运行的
	    	h1.start();
	    	h2.start();
	    } 
	  
	   
	
}
