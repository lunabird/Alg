package TEST;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * ��Ŀ������������

����

���������������͹��ɵ��ַ�����ʹ�ÿո��������ǰ�߳��Ժ��ߵ�������

���������ʽҪ��

�����ÿ���ַ�����󳤶�Ϊ100���ַ������Ϊ����ֵ���������쳣���NULL

����

���룺123456789 23456789 
�����6172844
 * @author Administrator
 *
 */

public class HuaWei3 {
	
	public static void method(){
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine().toString();
		System.out.println("inputStr="+inputStr);
		String[] str = inputStr.split(" ");
		System.out.println(str.length);
		
		System.out.println(str[0]+","+str[1]);
		
		
		BigInteger b1 = new BigInteger(str[0]);
		BigInteger b2 = new BigInteger(str[1]);
		
		System.out.println(b1.mod(b2));
	}

	public static void main(String[] args){
		method();
	}
	
}
