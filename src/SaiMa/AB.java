/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-11-16
 */
package SaiMa;

import java.util.Scanner;

public class AB {
	
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int a, b;

		while (cin.hasNextInt()) {
			a = cin.nextInt();
			b = cin.nextInt();
			System.out.println(a + b);
		}
	}
}
