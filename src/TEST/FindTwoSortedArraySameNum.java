package TEST;

import java.util.ArrayList;

/**
 * 查找两个已排序的数组相同的元素
 * 保存A、B的当前元素的索引值indexA和indexB，都初始化为0
	比较A、B的当前元素
	如果相等，则是重复的，indexA和indexB都加1
	如果A[indexA]<B[indexB]，那么indexA加1
	如果A[indexA]>B[indexB]，那么indexB加1
	最后A或B的索引值超出范围时结束
	按照上面的流程，只需要遍历一次
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
