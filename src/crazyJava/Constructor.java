/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-23
 */
package crazyJava;

/**
 * @author Administrator
 * 不能通过编译
 * The constructor Square() is not visible
 */
public class Constructor {
	
	public static void main(String[] args){
//		Square s1 = new Square();
//		int area = s1.area(10);
//		System.out.println(area);
		
		
//		int y=100;
//		System.out.println(y>>3);
//		System.out.println(y>>>3);
		
//		String a=new String("aaa");
//		String b =new String("aaa");
//		System.out.println(a==b);
		
//		Number n = new Number();
//		n.x = 10;
//		n.store(n);
//		System.out.println(n.x);
		
//		int m=0;
//		loop1:for(int i=0;i<10;i++)
//			loop2:for(int j=0;j<10;j++)
//				loop3:for(int k=0;k<10;k++){
//					System.out.println(++m);
//					if((k%10)==0)
//						continue loop2;
//				}
		
		
		try{
			double x=0.0;
			throw(new Exception("Thrown"));
//			return;
		}catch(Exception e){
			System.out.println("Exception caught");
			return;
		}finally{
			System.out.println("finally");
		}
		
		
		
		
		
	}

}

class Number{
	int x;
	void store(Number num){
		num.x++;
	}
}

 
class Square{
	private Square(){
		
	}
	int area(int side){
		return (side*side);
	}
}