/**
 * @brief Լɪ��
 * @author huangpeng
 * @version 
 * @date 2015-4-3
 */
package edu.xidian.hp.algs4;

public class YueSeFuHuan {
	static final int N = 41;
	static final int M = 3;
	
	public static void main(String[] args){
		int[] man = new int[N];	//������е���ţ�Ϊ0��ʾδ����
		int count = 1; //���м�����
		int i=0; //����������
		int pos = -1; //λ�ü�����

		
		while(count<=N){
			do{
				pos = (pos+1)%N; //���࣬���л�״����
				if(man[pos]==0){ //�����pos��δ����
					i++;
				}
				if(i==M){
					i=0; //��ʼ�����������ִ�1��ʼ����
					break;
				}
				
			}while(true);
			man[pos] = count; //����������
			count++;
		}
		System.out.println("Լɪ�����У����λ��-->Լɪ��λ�ã���");
		for(i=0;i<N;i++){
			System.out.println((i+1)+"-->"+man[i]);
		}
		
		
		for(i=0;i<N;i++){
			if(man[i]>N-1)
				System.out.println("��ʼ��ţ�"+(i+1)+","+"Լɪ����ţ�"+man[i]);
		}
		
	}
	
}
