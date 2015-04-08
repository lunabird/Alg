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
	
	public static void qsort1(int[] array, int len)
	{
	    int value, start, end;
	    if (len <= 1) 
	        return; 
	    value = array[0]; 
	    start = 0; 
	    end = len - 1; 
	    while (start < end) { 
	        for (; start < end; --end) { 
	            if (array[end] < value) { 
//	                1  
	            	array[start++]=array[end];
	                break; 
	            } 
	        } 
	        for (; start < end; ++start) { 
	            if (array[start] > value)
	            {
//	                2 
	            	array[end--]=array[start];
	                break;
	            }
	        }
	    }
//	    3 
	    
	    array[start]=value;
    	
	    qsort1(array,end-1);
	    qsort1(array,len-end+1);
	}

	public static void main(String[] args){
		int[] a = {7,8,4,13,1,5,9};
		qsort1(a ,7);
		System.out.println(a);
	}
	
	
}
