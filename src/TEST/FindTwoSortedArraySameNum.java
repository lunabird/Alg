package TEST;

import java.util.ArrayList;

/**
 * ���������������������ͬ��Ԫ��
 * ����A��B�ĵ�ǰԪ�ص�����ֵindexA��indexB������ʼ��Ϊ0
	�Ƚ�A��B�ĵ�ǰԪ��
	�����ȣ������ظ��ģ�indexA��indexB����1
	���A[indexA]<B[indexB]����ôindexA��1
	���A[indexA]>B[indexB]����ôindexB��1
	���A��B������ֵ������Χʱ����
	������������̣�ֻ��Ҫ����һ��
 * @author Administrator
 *
 */
public class FindTwoSortedArraySameNum {
	
	public static ArrayList find(int[] a,int[] b){
		
		int indexA = 0;
		int indexB = 0;
		ArrayList list = new ArrayList();
		
		while(indexA<a.length && indexB<b.length){
			if(a[indexA]==b[indexB]){
				list.add(a[indexA]);
				indexA++;
				indexB++;
			}
			else if(a[indexA]<b[indexB]){
				indexA++;
			}else{
				indexB++;
			}
		}
		return list;
		
	}
	public static void main(String[] args){
		
	}

}
