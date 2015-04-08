package crazyJava;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-3-27 上午11:20:27 
 * 
 */
public class ActiveNetwork {
	
	public static void main(String[] args){
//		float a = 4f;
//		float b = 2f;
//		System.out.println(a%b);
		
//		byte[] val = new byte[1];
//		for(int i= 0;i<1;i++)
//			val[i]=1;
//		BigInteger firsttest= new BigInteger(val);
//		System.out.println("firsttest:"+firsttest);
		
		
//		int a=3;
//		BigInteger b=BigInteger.valueOf(a);
//		System.out.println(b);
		
		
//		BigInteger a=new BigInteger("23");
//		BigInteger b=new BigInteger("34");
//		System.out.println(a.compareTo(b));
		
		
		/**
		 * 3.subtract(); 相减 
		 * 4.multiply(); 相乘 
		 * 5.divide(); 相除取整 
		 * 6.remainder(); 取余
		 * 7.pow(); a.pow(b)=a^b 
		 * 8.gcd(); 最大公约数
		 * 9.abs(); 绝对值 
		 * 10.negate(); 取反数
		 * 11.mod(); a.mod(b)=a%b=a.remainder(b); 
		 * 12.max(); min(); 
		 * 13.punlic int comareTo();
		 *        -1, 0 or 1 as this BigInteger is numerically 
		 *        less than, equal to, or greater than val.
		 * 14.boolean equals(); 是否相等
		 */
		
		
		
		/**
		 * 15.BigInteger构造函数： 一般用到以下两种： 
		 * BigInteger(String val);
		 * 将指定字符串转换为十进制表示形式； 
		 * BigInteger(String val,int radix); 
		 * 将指定基数的 BigInteger
		 * 的字符串表示形式转换为 BigInteger
		 */
		
		
		/**
		 * Ⅲ.基本操作 1. 读入： 用Scanner类定义对象进行控制台读入,Scanner类在java.util.*包中 Scanner
		 * cin=new Scanner(System.in);// 读入 
		 * while(cin.hasNext()) //等同于!=EOF 
		 * {
		 * 		int n; 
		 * 		BigInteger m; 
		 * 		n=cin.nextInt(); //读入一个int;
		 * 		m=cin.BigInteger();//读入一个BigInteger; 
		 * 		System.out.print(m.toString());
		 * }
		 */
		
		
		Scanner cin = new Scanner(System.in);
		BigInteger a, b;
		int c;
		char op;
		String s;

		while (cin.hasNext()) {
			a = cin.nextBigInteger();
			s = cin.next();
			op = s.charAt(0);
			if (op == '+') {
				b = cin.nextBigInteger();
				System.out.println(a.add(b));
			} else if (op == '-') {
				b = cin.nextBigInteger();
				System.out.println(a.subtract(b));
			} else if (op == '*') {
				b = cin.nextBigInteger();
				System.out.println(a.multiply(b));
			} else {
				BigDecimal a1, b1, eps;
				String s1, s2, temp;
				s1 = a.toString();
				a1 = new BigDecimal(s1);
				b = cin.nextBigInteger();
				s2 = b.toString();
				b1 = new BigDecimal(s2);
				c = cin.nextInt();
				eps = a1.divide(b1, c, 4);
				// System.out.println(a + " " + b + " " + c);
				// System.out.println(a1.doubleValue() + " " + b1.doubleValue()
				// + " " + c);
				System.out.print(a.divide(b) + " " + a.mod(b) + " ");
				if (c != 0) {
					temp = "0.";
					for (int i = 0; i < c; i++)
						temp += "0";
					DecimalFormat gd = new DecimalFormat(temp);
					System.out.println(gd.format(eps));
				} else
					System.out.println(eps);
			}
		}
		   
		
		
		
		
	}
	
	
	
	
	//将byte[]转化十六进制的字符串
	public static String bytes2HexString(byte[] b) {
		String ret = "";
		for (int i = 0; i < b.length; i++) {
			String hex = Integer.toHexString(b[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			ret += hex.toUpperCase();
		}
		return ret;
	}
	
	
	
	
	
}
