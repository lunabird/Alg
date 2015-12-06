package TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HuaWei2 {
	
	public static void printMod(){
		Scanner sc = new Scanner(System.in);

		String inputString = sc.next().toString();
		String stringArray[] = inputString.split(",");
		int num[] = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			num[i] = Integer.parseInt(stringArray[i]);
		}
		
		System.out.println(Arrays.toString(num));
		
		if(num.length<=1){
			return;
		}
		
		//Í°ÅÅÐò
//		int[] a = new int[1000];
//		for(int i=0;i<num.length;i++){
//			a[num[i]] = 1;
//		}
//		for(int i=1,j=0;i<1000&&j<num.length;i++){
//			if(a[i]==1){
//				num[j] = i;
//				j++;
//			}
//		}
//		System.out.println(Arrays.toString(num));
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[j]%num[i]==0&&(!res.contains(num[j]))){
					res.add(num[j]);
				}
			}
		}
		
		System.out.println(Arrays.toString(res.toArray()));

	}
	
	public static void main(String[] args){
		printMod();
	}

}
