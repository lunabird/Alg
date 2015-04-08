/**
 * @brief 
 * @author huangpeng
 * @version 
 * @date 2015-4-2
 */
package crazyJava;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 *
 */
public class Tets {
	
	 
		public static int[] randomCommon(int min, int max, int n){
			if (n > (max - min + 1) || max < min) {
	            return null;
	        }
			int[] result = new int[n];
			int count = 0;
			while(count < n) {
				int num = (int) (Math.random() * (max - min)) + min;
				boolean flag = true;
				for (int j = 0; j < n; j++) {
					if(num == result[j]){
						flag = false;
						break;
					}
				}
				if(flag){
					result[count] = num;
					count++;
				}
			}
			return result;
		} 
	    
	    public static void main(String[] args){
//	    	int[] a = randomCommon(1,1000,900);
//	    	for(int i=0;i<a.length;i++){
//	    		System.out.println(i+":"+ a[i]);
//	    	}
	    	
	    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	    	System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
	    	
	    	if(df.format(new Date()).equals("2015-11-11 00:00:00")){
	    		System.out.println("ok");
	    	}
	    	
	    	
	    }
	
}
