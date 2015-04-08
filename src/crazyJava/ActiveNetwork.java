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
 * @date 2015-3-27 ����11:20:27 
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
		 * 3.subtract(); ��� 
		 * 4.multiply(); ��� 
		 * 5.divide(); ���ȡ�� 
		 * 6.remainder(); ȡ��
		 * 7.pow(); a.pow(b)=a^b 
		 * 8.gcd(); ���Լ��
		 * 9.abs(); ����ֵ 
		 * 10.negate(); ȡ����
		 * 11.mod(); a.mod(b)=a%b=a.remainder(b); 
		 * 12.max(); min(); 
		 * 13.punlic int comareTo();
		 *        -1, 0 or 1 as this BigInteger is numerically 
		 *        less than, equal to, or greater than val.
		 * 14.boolean equals(); �Ƿ����
		 */
		
		
		
		/**
		 * 15.BigInteger���캯���� һ���õ��������֣� 
		 * BigInteger(String val);
		 * ��ָ���ַ���ת��Ϊʮ���Ʊ�ʾ��ʽ�� 
		 * BigInteger(String val,int radix); 
		 * ��ָ�������� BigInteger
		 * ���ַ�����ʾ��ʽת��Ϊ BigInteger
		 */
		
		
		/**
		 * ��.�������� 1. ���룺 ��Scanner�ඨ�������п���̨����,Scanner����java.util.*���� Scanner
		 * cin=new Scanner(System.in);// ���� 
		 * while(cin.hasNext()) //��ͬ��!=EOF 
		 * {
		 * 		int n; 
		 * 		BigInteger m; 
		 * 		n=cin.nextInt(); //����һ��int;
		 * 		m=cin.BigInteger();//����һ��BigInteger; 
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
	
	
	
	
	//��byte[]ת��ʮ�����Ƶ��ַ���
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
