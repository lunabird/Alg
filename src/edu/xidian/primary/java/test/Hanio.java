/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-17
 */
package edu.xidian.primary.java.test;

/**
 * @author Administrator
 *
 */
public class Hanio {
	
	//汉诺塔
	//问题：从A柱移动到C柱，以B柱作为中转柱
	//n=1，直接转移。1步
	//n=2，把第一个移动到B，把第二个盘移动到C，把第一个盘移动到C。3步
	//n=3，把前两个盘移动到B，把第三个盘移动到C，把前两个盘移动到C。3+1+3=7步
	static int count=0;
	public static void hanio(int n,String A,String B,String C){
		count++;
		if(n==1){
			System.out.println(n+":"+A+"-->"+C);
		}else{
			hanio(n-1,A,C,B);
			System.out.println(n+":"+A+"-->"+C);
			hanio(n-1,B,A,C);
		}
	}
	
	public static void main(String[] args){
		hanio(3,"A","B","C");
		System.out.println(count);
	}
	
}
