package crazyJava;

/**
 *
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-19 ����11:23:05 
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
	            System.out.println(name + "����     " + i); 
	        } 
	    } 
	  
	    public static void main(String[] args) { 
	    	JavaThreadBlog h1=new JavaThreadBlog("A"); 
	    	JavaThreadBlog h2=new JavaThreadBlog("B"); 
	    	//����run������˳��ִ�е�
//	        h1.run(); 
//	        h2.run(); 
	    	//����start�����ǰ���jvm�ͼ����Ӳ����ʱ��Ƭ���е�
	    	h1.start();
	    	h2.start();
	    } 
	  
	   
	
}
