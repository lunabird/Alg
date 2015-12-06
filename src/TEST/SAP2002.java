/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-11-17
 */
package TEST;

import java.util.Scanner;
public class SAP2002 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a;
		while(sc.hasNextDouble()){
			a = sc.nextDouble();
			System.out.format("%.3f",3.1415927*a*a*a*4/3);
            System.out.println();
		}
	}
	
}
