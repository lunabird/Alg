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
	
	//��ŵ��
	//���⣺��A���ƶ���C������B����Ϊ��ת��
	//n=1��ֱ��ת�ơ�1��
	//n=2���ѵ�һ���ƶ���B���ѵڶ������ƶ���C���ѵ�һ�����ƶ���C��3��
	//n=3����ǰ�������ƶ���B���ѵ��������ƶ���C����ǰ�������ƶ���C��3+1+3=7��
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
