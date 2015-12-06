package TEST;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 题目三：大数求余

描述

输入两个超长整型构成的字符串，使用空格隔开，求前者除以后者的余数。

输入输出格式要求

输入的每个字符串最大长度为100个字符，输出为余数值，如果结果异常输出NULL

样例

输入：123456789 23456789 
输出：6172844
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
