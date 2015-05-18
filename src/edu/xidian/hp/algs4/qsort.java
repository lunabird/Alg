/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-1
 */
package edu.xidian.hp.algs4;

/**
 * @author Administrator
 *
 */
public class qsort {
	
	public static void quicksort(int[] a, int left, int right) {
		int i, j, t, temp;
		if (left > right)
			return;
		
		for(int m=0;m<a.length;m++)
			System.out.print(a[m]+" ");
		System.out.println();
		
		
		temp = a[left]; // temp�д�ľ��ǻ�׼��
		i = left;
		j = right;
		while (i != j) {
			// ˳�����Ҫ��Ҫ�ȴ���������
			while (a[j] >= temp && i < j)
				j--;
			// �ٴ���������
			while (a[i] <= temp && i < j)
				i++;
			// �����������������е�λ��
			if (i < j)// ���ڱ�i���ڱ�jû������ʱ
			{
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		// ���ս���׼����λ
		a[left] = a[i];
		a[i] = temp;
		quicksort(a,left, i - 1);// ����������ߵģ�������һ���ݹ�Ĺ���
		quicksort(a,i + 1, right);// ���������ұߵģ�������һ���ݹ�Ĺ���
	}
	public static void main(String[] args){
		int[] a = {46,79,56,38,40,84};
		quicksort(a ,0,5);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	
	
}
