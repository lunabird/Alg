package TEST;

import java.util.Scanner;

/**
 * ��Ŀһ���ַ�����ʽ�����

AAABBBBCC�C>A3B4C2 
���ַ��������ַ�+�����ظ�����ʽ�����
 * @author Administrator
 *
 */
public class HuaWei4 {
	
	public static void method(){
		Scanner sc =  new Scanner(System.in);
		String str = sc.nextLine().toString();
		sc.close();
		System.out.println("str="+str);
		char[] a = str.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		int count =1;
		int i=0;
		for(i=0;i<a.length-1;i++){			
			
			if(a[i+1]==a[i]){
				count++;
			}else{
				sb.append(a[i]);
				sb.append(count);
				count=1;
			}
		}
		sb.append(a[i]);
		sb.append(count);
		System.out.println(sb.toString());
	}

	public static void main(String[] args){
		method();
	}
}
