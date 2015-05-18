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
		
		
		temp = a[left]; // temp中存的就是基准数
		i = left;
		j = right;
		while (i != j) {
			// 顺序很重要，要先从右往左找
			while (a[j] >= temp && i < j)
				j--;
			// 再从左往右找
			while (a[i] <= temp && i < j)
				i++;
			// 交换两个数在数组中的位置
			if (i < j)// 当哨兵i和哨兵j没有相遇时
			{
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		// 最终将基准数归位
		a[left] = a[i];
		a[i] = temp;
		quicksort(a,left, i - 1);// 继续处理左边的，这里是一个递归的过程
		quicksort(a,i + 1, right);// 继续处理右边的，这里是一个递归的过程
	}
	public static void main(String[] args){
		int[] a = {46,79,56,38,40,84};
		quicksort(a ,0,5);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	
	
}
