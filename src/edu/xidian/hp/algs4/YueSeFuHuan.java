/**
 * @brief 约瑟夫环
 * @author huangpeng
 * @version 
 * @date 2015-4-3
 */
package edu.xidian.hp.algs4;

public class YueSeFuHuan {
	static final int N = 41;
	static final int M = 3;
	
	public static void main(String[] args){
		int[] man = new int[N];	//保存出列的序号，为0表示未出列
		int count = 1; //出列计数器
		int i=0; //报数计数器
		int pos = -1; //位置计数器

		
		while(count<=N){
			do{
				pos = (pos+1)%N; //求余，进行环状处理
				if(man[pos]==0){ //若编号pos还未出列
					i++;
				}
				if(i==M){
					i=0; //初始化计数器，又从1开始报数
					break;
				}
				
			}while(true);
			man[pos] = count; //保存出列序号
			count++;
		}
		System.out.println("约瑟夫排列（最初位置-->约瑟夫环位置）：");
		for(i=0;i<N;i++){
			System.out.println((i+1)+"-->"+man[i]);
		}
		
		
		for(i=0;i<N;i++){
			if(man[i]>N-1)
				System.out.println("初始序号："+(i+1)+","+"约瑟夫环序号："+man[i]);
		}
		
	}
	
}
