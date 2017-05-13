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
		String s1 = "ab123" ;  
        String s2 = new String( "ab123" ) ;  
        System.out.println( s1 == s2 );   
        String s3 = s2.intern() ;   
        System.out.println( s1 == s3 ) ;   
	}
	
	
	public static void e1(String[] args){
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
 *��ˮ�ɻ�������ָһ����λ�������ĸ�λ���ֵ������͵����䱾�����磺153=1^3+5^3+3^3��
	����Ҫ�����������m��n��Χ�ڵ�ˮ�ɻ�����
	Input
���������ж��飬ÿ��ռһ�У�������������m��n��100<=m<=n<=999����
Output
����ÿ������ʵ����Ҫ����������ڸ�����Χ�ڵ�ˮ�ɻ���������˵�������ˮ�ɻ���������ڵ���m,����С�ڵ���n������ж������Ҫ���С����������һ���������֮����һ���ո����;
��������ķ�Χ�ڲ�����ˮ�ɻ����������no;
ÿ������ʵ�������ռһ�С�
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