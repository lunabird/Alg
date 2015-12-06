package TEST;

import java.util.Scanner;

/**
 * 题目一：字符串格式化输出

AAABBBBCC–>A3B4C2 
将字符串按照字符+连续重复数格式化输出
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
