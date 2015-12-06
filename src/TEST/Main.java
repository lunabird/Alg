/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-11-16
 */
package TEST;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			
			int begin = sc.nextInt();
			int end = sc.nextInt();
			
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int j=begin;j<=end;j++){
				if(isShuiXianHua(j)){
					al.add(j);
				}
			}
			if(al.size()==0){
				System.out.println("no");
			}else{
				for(int k=0;k<al.size();k++){
					if(k== al.size()-1){
						System.out.print(al.get(k));
					}else{
						System.out.print(al.get(k)+" ");
					}
				}
				System.out.println();
			}
			
		}

	}
	public static boolean isShuiXianHua(int num){
		int baiwei = num/100;
		int shiwei = num%100/10;
		int gewei = num%100%10;
		if(num==baiwei*baiwei*baiwei+shiwei*shiwei*shiwei+gewei*gewei*gewei){
			return true;
		}
		return false;
	}
}




//100 120
//300 380

/**
 * @author hadoop
 *“水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，比如：153=1^3+5^3+3^3。
	现在要求输出所有在m和n范围内的水仙花数。
	Input
输入数据有多组，每组占一行，包括两个整数m和n（100<=m<=n<=999）。
Output
对于每个测试实例，要求输出所有在给定范围内的水仙花数，就是说，输出的水仙花数必须大于等于m,并且小于等于n，如果有多个，则要求从小到大排列在一行内输出，之间用一个空格隔开;
如果给定的范围内不存在水仙花数，则输出no;
每个测试实例的输出占一行。
 */

/**
 * 
 * while(sc.hasNextInt()){
			int begin = sc.nextInt();
			int end = sc.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int j=begin;j<=end;j++){
				if(isShuiXianHua(j)){
					al.add(j);
				}
			}
			if(al.size()==0){
				System.out.println("no");
			}else{
				for(int i=0;i<al.size();i++){
					if(i== al.size()-1){
						System.out.print(al.get(i));
					}else{
						System.out.print(al.get(i)+" ");
					}
					System.out.println();
				}
			}
		}
 */
//public static void main(String[] args){
//	Scanner sc = new Scanner(System.in);
////	ArrayList<Integer> input = new ArrayList<Integer>();
//	while(sc.hasNextInt()){
//		int begin = sc.nextInt();
//		int end = sc.nextInt();
//		int flag = 0;
//		for(int j=begin;j<=end;j++){
//			if(isShuiXianHua(j)){
//				flag=1;
//				System.out.print(j+" ");
//			}
//		}
//		if(flag==0){
//			System.out.println("no");
//		}
////		if(line.equals("")){
////			break;
////		}
////		String[] strarr = line.split(" ");
////		input.add(Integer.parseInt(strarr[0]));
////		input.add(Integer.parseInt(strarr[1]));
//	}
//
////	for(int i=0;i<input.size();i+=2){
////		int begin = input.get(i);
////		int end = input.get(i+1);
////		int flag = 0;
////		for(int j=begin;j<=end;j++){
////			if(isShuiXianHua(j)){
////				flag=1;
////				System.out.print(j+" ");
////			}
////		}
////		if(flag==0){
////			System.out.println("no");
////		}
////	}