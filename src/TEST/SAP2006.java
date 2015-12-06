/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-11-17
 */
package TEST;

import java.util.Scanner;
public class SAP2006 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int count = sc.nextInt();
			int[] arr = new int[count];
			int sum = 1;
			for(int i=0;i<count;i++){
				arr[i] = sc.nextInt();
				if(arr[i]%2 != 0){
					sum *= arr[i];
				}
			}
			System.out.println(sum);
		}
	}
}


//3 1 2 3
//4 2 3 4 5