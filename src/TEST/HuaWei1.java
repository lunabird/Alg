package TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HuaWei1 {

	
	public static void main(String[] args) {
		String a = "BaAb";
		char[] str = a.toCharArray();
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
	}
}



class sss{
	public static void method5(){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] temp = new char[s.length()];
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122)){
				
			}
		}
	}
	
	
	public static void method4(){
		Scanner sc =  new Scanner(System.in);
		String s = sc.nextLine();
		String t = s.substring(2, s.length());
		int sum = 0;
		
		for(int i=t.length()-1;i>=0;i--){
			int num = 0;
			if(48<=t.charAt(i)&&t.charAt(i)<=57){
				num = Integer.parseInt(t.charAt(i)+"");
			}else if(t.charAt(i)>=65&&t.charAt(i)<=69){
				num = t.charAt(i)-55;
			}else if(t.charAt(i)>=97&&t.charAt(i)<=101){
				num = t.charAt(i)-87;
			}
			sum += num*Math.pow(16, t.length()-1-i);
		}
		System.out.println(sum);
	}
	
	
	public static void method3(){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] str1 = str.split(" +");
		String a = str1[0];
		String b = str1[1];
		
		int count = 0,max = 0;
		
		for(int i=0;i<a.length();i++){
			for(int j=0;j<b.length();j++){
				if(a.charAt(i)==b.charAt(j)){
					int m=i+1,n=j+1;
					count = 1;
					while(m<a.length()&&n<b.length()&&a.charAt(m++)==b.charAt(n++)) count++;
					max = Math.max(max, count);
				}
			}
			
		}
		System.out.println(max);
		
	}
	
	public static  void splitStr() {
		Scanner sc = new Scanner(System.in);
		String inputStr = null;
		if (sc.hasNext()) {
			inputStr = sc.next();
		}
		if (inputStr != null) {
			char split = inputStr.charAt(inputStr.length() - 2);
			char index = inputStr.charAt(inputStr.length() - 1);
			int index1 = Integer.parseInt(index + "");

			System.out.println("split="+split);
			
			
			inputStr = inputStr.substring(0, inputStr.length() - 2);
			System.out.println("inputStr="+inputStr);
			char[] input = inputStr.toCharArray();
			ArrayList<String> result = new ArrayList<String>();
			int i = 0;
			
			
			while (i < input.length) {
				if (input[i] == split) {
					i++;
					continue;
				}else{
					StringBuffer sb = new StringBuffer();
					while (input[i] != split) {
						sb.append(input[i]);
						i++;
					}
					result.add(sb.toString());
				}

			}
//			System.out.println("result.size()="+result.size());
//			for (int j = 0; j < result.size(); j++)
//				System.out.println(result.get(j));
			
			System.out.println(result.get(index1));
		}

	}

	
	public static void method(){
		 Scanner sc = new Scanner(System.in);
		 String in = sc.nextLine();
		 System.out.println(in);
		 String[] split = in.trim().split(" ");
		 System.out.println(split[split.length-1].length());
	}
	
	
	public static void method2(){
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		
		char[] sq = in.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=sq.length-1;i>=0;i--){
			sb.append(sq[i]);
		}
		System.out.println(sb.toString());
		//System.out.println(Arrays.toString(res));
	}
	
}