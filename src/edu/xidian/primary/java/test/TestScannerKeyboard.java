package edu.xidian.primary.java.test;

import java.util.Scanner;

/**
 *
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-12 ����9:26:32 
 * 
 */
public class TestScannerKeyboard {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println("��������������ǣ�"+sc.next());
		}
	}
}
